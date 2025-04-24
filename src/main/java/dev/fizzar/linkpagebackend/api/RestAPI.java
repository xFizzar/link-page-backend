package dev.fizzar.linkpagebackend.api;

import dev.fizzar.linkpagebackend.domain.App;
import dev.fizzar.linkpagebackend.service.AppService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:4200")
public record RestAPI(AppService appService) {

    @GetMapping("apps")
    public ResponseEntity<List<App>> getApps() {
        return ResponseEntity.ok(appService.getAllApps());
    }

    @PostMapping("createApp")
    public ResponseEntity<App> post(@RequestBody App app) {
        return ResponseEntity.ok(appService.save(app));
    }

}
