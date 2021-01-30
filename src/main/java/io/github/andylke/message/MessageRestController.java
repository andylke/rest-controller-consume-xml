package io.github.andylke.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping(path = "/messages")
@CacheConfig(cacheNames = {"messages"})
public class MessageRestController {

  private static final Logger LOGGER = LoggerFactory.getLogger(MessageRestController.class);

  @PostMapping
  public JsonNode add(@RequestBody final JsonNode message) {
    LOGGER.info("message = [{}]", message);
    return message;
  }
}
