package dev.fizzar.linkpagebackend.service;

import dev.fizzar.linkpagebackend.domain.App;
import dev.fizzar.linkpagebackend.repository.AppRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record AppService(AppRepository repository) {

    public List<App> getAllApps() {
        return repository.findAll();
    }

    public App save(App app) {
        return repository.save(app);
    }

    public App findById(Long id) {
        return repository.findById(id).orElse(null);
    }

}
