package com.github.noahrichards.millisplugin.services

import com.intellij.openapi.project.Project
import com.github.noahrichards.millisplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
