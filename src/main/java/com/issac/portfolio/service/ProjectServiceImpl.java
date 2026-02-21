package com.issac.portfolio.service.impl;

import com.issac.portfolio.entity.Project;
import com.issac.portfolio.repository.ProjectRepository;
import com.issac.portfolio.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    @Override
    public Project updateProject(Long id, Project project) {

        Project existing = getProjectById(id);

        existing.setTitle(project.getTitle());
        existing.setDescription(project.getDescription());
        existing.setTechnologies(project.getTechnologies());
        existing.setYear(project.getYear());
        existing.setGithubUrl(project.getGithubUrl());
        existing.setLiveUrl(project.getLiveUrl());

        return projectRepository.save(existing);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
