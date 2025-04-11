package dev.fizzar.linkpagebackend.api;

import dev.fizzar.linkpagebackend.domain.App;
import dev.fizzar.linkpagebackend.service.AppService;
import dev.fizzar.linkpagebackend.service.dto.AppDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:4200")
public record RestAPI(AppService appService) {

    private static AppDTO apply(App app) {
        return new AppDTO(app.getName(), app.getUrl(), app.getImage());
    }

    @PostMapping("createApp")
    public ResponseEntity<AppDTO> createApp(
            @RequestParam("name") String name,
            @RequestParam("url") String url,
            @RequestParam("image") MultipartFile image) throws IOException {

        if (name == null || name.isEmpty() || url == null || url.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        byte[] imageBytes = image != null && !image.isEmpty() ? image.getBytes() : null;

        App app = new App(null, name, url, imageBytes);
        App saved = appService.save(app);
        AppDTO toReturn = apply(saved);

        return ResponseEntity.ok(toReturn);
    }

    @GetMapping("apps")
    public ResponseEntity<List<AppDTO>> getApps() {
        return ResponseEntity.ok(appService.getAllApps().stream().map(RestAPI::apply).toList());
    }

}
