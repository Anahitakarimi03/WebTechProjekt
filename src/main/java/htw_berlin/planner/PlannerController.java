package htw_berlin.planner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlannerController {

    @GetMapping("/")
    public List<PlannerEntry> index() {
        return List.of(new PlannerEntry("M1"), new PlannerEntry("M2"),new PlannerEntry("M3"),new PlannerEntry("M4"));
    }

}