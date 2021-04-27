package e2e.framework.example.config;

public class ConfigurationManager {

  private static final String PROPERTY_FILE_NAME = "config.properties";
  private static final String BASE_URL = "baseUrl";
  private static final String APP_ID = "appId";

  private static ConfigurationReader configurationReader;
  private static String baseUrl;
  private static String appId;

  static {
    configurationReader = new ConfigurationReader(PROPERTY_FILE_NAME);
    baseUrl = configurationReader.getProperty(BASE_URL);
    appId = configurationReader.getProperty(APP_ID);
  }


  public static String getBaseUrl() {

    return baseUrl;
  }

  public static String getAppId() {

    return appId;
  }
}