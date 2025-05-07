package org.mrshoffen.tasktracker.commons.utils.link;


import org.mrshoffen.tasktracker.commons.web.dto.ResourceDto;

/**
 * Абстрактный класс для внедрения ссылок в дто. Клиент сам решает, какие ссылки внедрять
 * переопределяя метод buildLinks.
 *
 * Далее уже вызывает injectLink - подобно мапперу.
 * @param <T>
 */
public abstract class LinksInjector<T extends ResourceDto> {

    public T injectLink(T dto) {
        dto.setApi(generateLinks(dto));
        return dto;
    }

    protected abstract Links generateLinks(T dto);
}
