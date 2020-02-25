package bg.stockexchange.api.constant;

public class ConfigurationConstants {

    public static final long EXPIRATION_TIME = 24 * 1000 * 3600;

    public static final String HEADER_AUTHORIZATION = "Authorization";

    public static final String TOKEN_PREFIX = "Bearer ";

    public static final String UTF = "UTF-8";

    public static final String LOGIN_USER_ID = "userId";

    public static final String ROLES = "roles";

    public static final String CONFIG_VERSION = "2.3.20";

    public static class Headers {
        public static final String ACCESS_NAME = "Access-Control-Expose-Headers";
        public static final String ACCESS_VALUE = "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, Authorization";
    }

    public static class User {
        public static final String ERROR_PASSWORD_VALIDATION = "ERROR_PASSWORD_VALIDATION";
        public static final String ERROR_EMAIL_VALIDATION = "ERROR_EMAIL_VALIDATION";

    }

}
