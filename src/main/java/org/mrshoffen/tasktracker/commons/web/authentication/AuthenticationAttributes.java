package org.mrshoffen.tasktracker.commons.web.authentication;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class AuthenticationAttributes {
    public static final String REFRESH_TOKEN_COOKIE_NAME = "refreshToken";
    public static final String ACCESS_TOKEN_COOKIE_NAME = "accessToken";

    public static final String AUTHORIZED_USER_HEADER_NAME = "X-Auth-User";

}
