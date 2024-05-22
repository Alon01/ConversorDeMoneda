package com.hectoresquivel.conversor.modelos;

import java.util.Map;

public record MonedaBase(String base_code, Map<String, Double> conversion_rates) {

}
