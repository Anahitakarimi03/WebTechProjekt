package htw_berlin.planner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlannerController {

    @GetMapping("/")
    public List<PlannerEntry> index() {
        return List.of(
                new PlannerEntry(1, "WebTech M1 abgeben", false, "2026, 10, 18"),
                new PlannerEntry( 2, "Einkaufen", true, "2026, 10, 12"),
                new PlannerEntry( 3, "Mit Sara treffen", false, "2026, 10, 14")
        );
    }
}