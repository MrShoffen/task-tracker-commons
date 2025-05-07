package org.mrshoffen.tasktracker.commons.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mrshoffen.tasktracker.commons.utils.link.Links;

/**
 * Базовый дто класс для хранения ссылок HATEOAS
 */
@Getter
@Setter
@NoArgsConstructor
public abstract class ResourceDto {

    protected Links api;
}
