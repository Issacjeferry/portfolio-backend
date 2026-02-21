package com.issac.portfolio.controller;

import com.issac.portfolio.entity.Achievement;
import com.issac.portfolio.service.AchievementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/achievements")
@RequiredArgsConstructor
public class AchievementController {

    private final AchievementService achievementService;

    @PostMapping
    public Achievement createAchievement(@RequestBody Achievement achievement) {
        return achievementService.createAchievement(achievement);
    }

    @GetMapping
    public List<Achievement> getAllAchievements() {
        return achievementService.getAllAchievements();
    }

    @DeleteMapping("/{id}")
    public String deleteAchievement(@PathVariable Long id) {
        achievementService.deleteAchievement(id);
        return "Achievement deleted successfully";
    }
}
