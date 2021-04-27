package e2e.framework.example.config;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {
  private Properties properties;

  public ConfigurationReader(final String propertyFileName) {
    this.properties = initProperties(propertyFileName);
  }

  public String getProperty(final String propertyName) {

    String property = this.properties.getProperty(propertyName).trim();

    return property;
  }

  private Properties initProperties(final String fileName) {

    Properties props = new Properties();
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream(fileName);

    try {
      props.load(inputStream);
    } catch (IOException e) {}

    return props;
  }
}
