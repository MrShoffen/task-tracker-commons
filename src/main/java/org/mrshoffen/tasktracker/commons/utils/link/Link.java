package org.mrshoffen.tasktracker.commons.utils.link;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public class Link {
    private String name;
    private String href;
    private String method;

    public static LinkBuilder forName(String name) {
        LinkBuilder linkBuilder = new LinkBuilder();
        linkBuilder.name = name;
        return linkBuilder;
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class LinkBuilder {
        private String name;
        private String href;
        private String method;

        public LinkBuilder andMethod(String method) {
            this.method = method;
            return this;
        }

        public LinkBuilder andHref(String href) {
            this.href = href;
            return this;
        }

        public Link build() {
            Link link = new Link();
            link.href = href;
            link.method = method;
            link.name = name;
            return link;
        }
    }


}