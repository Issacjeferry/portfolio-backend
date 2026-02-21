package com.issac.portfolio.service.impl;

import com.issac.portfolio.entity.Achievement;
import com.issac.portfolio.repository.AchievementRepository;
import com.issac.portfolio.service.AchievementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements AchievementService {

    private final AchievementRepository achievementRepository;

    @Override
    public Achievement createAchievement(Achievement achievement) {
        return achievementRepository.save(achievement);
    }

    @Override
    public List<Achievement> getAllAchievements() {
        return achievementRepository.findAll();
    }

    @Override
    public void deleteAchievement(Long id) {
        achievementRepository.deleteById(id);
    }
}
