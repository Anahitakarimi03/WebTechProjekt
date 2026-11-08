package htw_berlin.planner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins =  {"http://localhost:5173", "https://planner-frontend-zgva.onrender.com"})

@RestController
public class PlannerController {

    @GetMapping("/")
    public List<PlannerEntry> index() {
        return List.of(
                new PlannerEntry(1, "WebTech M1 abgeben", false, LocalDate.of(2026, 10, 18), Priority.HIGH),
                new PlannerEntry( 2, "Einkaufen", true, LocalDate.of(2026, 11, 12), Priority.MEDIUM),
                new PlannerEntry( 3, "Mit Sara treffen", false, LocalDate.of(2026, 10, 14), Priority.LOW)
        );

        }
}