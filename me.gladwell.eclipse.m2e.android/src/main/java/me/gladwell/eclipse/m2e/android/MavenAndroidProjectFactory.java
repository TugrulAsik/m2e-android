package me.gladwell.eclipse.m2e.android;

import me.gladwell.eclipse.m2e.android.model.AndroidProject;
import me.gladwell.eclipse.m2e.android.model.MavenAndroidProject;

import org.apache.maven.project.MavenProject;

public class MavenAndroidProjectFactory implements AndroidProjectFactory {

	public AndroidProject createAndroidProject(MavenProject mavenProject) {
		return new MavenAndroidProject(mavenProject);
	}

}