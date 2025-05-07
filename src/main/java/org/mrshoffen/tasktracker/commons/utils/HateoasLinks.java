package org.mrshoffen.tasktracker.commons.utils;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HateoasLinks {


    private Map<String, Map<String, String>> links;

    private String prefix;

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class LinksBuilder {

        @Getter
        private final Map<String, Map<String, String>> links = new HashMap<>();

        private String prefix = "";


        public LinksBuilder addLink(String name, String href, String method) {
            links.put(name,
                    Map.of("href", prefix + href, "method", method));
            return this;
        }

        public LinksBuilder setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public HateoasLinks build() {
            return new HateoasLinks(links, prefix);
        }

    }

    public static LinksBuilder builder() {
        return new HateoasLinks.LinksBuilder();
    }
}