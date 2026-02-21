package com.issac.portfolio.service;

import com.issac.portfolio.entity.Skill;

import java.util.List;

public interface SkillService {

    Skill createSkill(Skill skill);

    List<Skill> getAllSkills();

    void deleteSkill(Long id);
}
