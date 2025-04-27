package dev.fizzar.linkpagebackend.api;

import dev.fizzar.linkpagebackend.domain.App;
import dev.fizzar.linkpagebackend.domain.AppDTO;
import dev.fizzar.linkpagebackend.domain.Type;
import dev.fizzar.linkpagebackend.service.AppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = {"http://localhost:4200", "http://10.0.0.205:4200"})
public record RestAPI(AppService appService) {

    @GetMapping("apps")
    public ResponseEntity<List<App>> getApps() {
        return ResponseEntity.ok(appService.getAllApps());
    }

    @PostMapping("createApp")
    public ResponseEntity<App> post(@RequestBody AppDTO app) {
        App toSave = new App(null, app.name(), app.url(), app.imageURL(), Type.valueOf(app.type()));
        return ResponseEntity.ok(appService.save(toSave));
    }

}
