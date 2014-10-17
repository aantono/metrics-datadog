package io.dropwizard.metrics;

import io.dropwizard.jackson.DiscoverableSubtypeResolver;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class DatadogReporterFactoryTest {
  @Test
  public void isDiscoverable() throws Exception {
    Assertions
        .assertThat(new DiscoverableSubtypeResolver().getDiscoveredSubtypes())
        .contains(DatadogReporterFactory.class);
  }
}