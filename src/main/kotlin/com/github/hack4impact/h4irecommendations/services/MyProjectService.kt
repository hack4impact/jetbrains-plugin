package com.github.hack4impact.h4irecommendations.services

import com.github.hack4impact.h4irecommendations.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
