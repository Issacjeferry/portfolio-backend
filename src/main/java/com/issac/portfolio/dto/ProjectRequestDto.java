package com.issac.portfolio.dto;

import jakarta.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequestDto {

    @NotBlank(message = "Project title is required")
    private String title;

    @NotBlank(message = "Project description is required")
    private String description;

    @NotBlank(message = "Technologies field cannot be empty")
    private String technologies;

    @NotNull(message = "Year is required")
    @Min(value = 2000, message = "Year must be valid")
    private Integer year;

    @Pattern(
            regexp = "^(http|https)://.*$",
            message = "GitHub URL must be valid"
    )
    private String githubUrl;

    @Pattern(
            regexp = "^(http|https)://.*$",
            message = "Live URL must be valid"
    )
    private String liveUrl;
}
