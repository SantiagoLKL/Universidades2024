package Controller;

import Repository.UniversidadRepository;
import ch.qos.logback.core.model.Model;
import co.edu.ucentral.universidades2024.Universidad;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class UniversidadController {
    private final UniversidadRepository universidadRepository;

    public UniversidadController(UniversidadRepository universidadRepository) {
        this.universidadRepository = universidadRepository;
    }

    @GetMapping("/universidades")
    public String listarUniversidades(Model model) {
        List<Universidad> universidades = universidadRepository.findAll();
        model.addText("universidades");
        return "lista-universidades"; // Nombre de la plantilla Thymeleaf
    }
}

