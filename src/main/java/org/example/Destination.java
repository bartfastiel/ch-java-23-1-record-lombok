package org.example;

import java.math.BigDecimal;

public record Destination(
        String name,
        BigDecimal price,
        String country
) {
}
