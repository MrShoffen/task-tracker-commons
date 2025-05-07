package org.mrshoffen.tasktracker.commons.utils.link;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Links {

    private Map<String, Link> links;

    public static LinksBuilder builder() {
        return new Links.LinksBuilder();
    }


    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class LinksBuilder {

        @Getter
        private final Map<String, Link> links = new HashMap<>();


        public LinksBuilder addLink(Link link) {
            links.put(link.getName(), link);
            return this;
        }


        public Links build() {
            return new Links(links);
        }

    }
}