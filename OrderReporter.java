package com.patrones.u1;

import java.util.List;

public class OrderReporter {
    public void print(List<String> orders) {
        System.out.println("=== Reporte de Órdenes ===");
        orders.forEach(order -> System.out.println("  " + order));
    }
}
