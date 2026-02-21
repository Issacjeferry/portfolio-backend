package com.issac.portfolio.service;

import com.issac.portfolio.entity.Achievement;

import java.util.List;

public interface AchievementService {

    Achievement createAchievement(Achievement achievement);

    List<Achievement> getAllAchievements();

    void deleteAchievement(Long id);
}
