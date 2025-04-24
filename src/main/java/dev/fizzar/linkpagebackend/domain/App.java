package dev.fizzar.linkpagebackend.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnTransformer;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "apps")
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String url;

    @Column(name = "image")
    private String imageURL;

    @Enumerated(EnumType.STRING)
    private Type type;


}
