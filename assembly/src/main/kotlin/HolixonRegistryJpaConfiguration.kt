package io.holixon.avro.adapter.registry.holixon

import mu.KLogging
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct

/**
 * Configuration for JPA.
 */
@Configuration
@ConditionalOnProperty(name = ["avro.registry.holixon.mode"], havingValue = "jpa")
@ComponentScan("io.holixon.avro.adapter.registry.jpa")
class HolixonRegistryJpaConfiguration {

  companion object : KLogging()

  /**
   * Show that current configuration is used.
   */
  @PostConstruct
  fun activated() {
    logger.info { "HLX-REGISTRY: Activated JPA mode" }
  }
}
