package dev.fizzar.linkpagebackend.repository;

import dev.fizzar.linkpagebackend.domain.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App, Long> {
}