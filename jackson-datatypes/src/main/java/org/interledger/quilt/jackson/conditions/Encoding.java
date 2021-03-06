package org.interledger.quilt.jackson.conditions;

import org.interledger.core.Condition;
import org.interledger.core.Fulfillment;

/**
 * Indicates the type of encoding and decoding to use when serializing and deserializing a {@link
 * Condition} or {@link Fulfillment}.
 */
public enum Encoding {
  HEX,
  BASE64,
  BASE64_WITHOUT_PADDING,
  BASE64URL,
  BASE64URL_WITHOUT_PADDING
}
