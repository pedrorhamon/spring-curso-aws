package com.starking.dsleam.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author pedroRhamon
 */

@AllArgsConstructor
@Getter
public enum ResourceType {
	
	LESSON_ONLY("Lesson Only"),
	LESSON_TASK("Lesson task"),
	FORUM("Forum"),
	EXTERNAL_LINK("External link");
	
	private String description;

}
