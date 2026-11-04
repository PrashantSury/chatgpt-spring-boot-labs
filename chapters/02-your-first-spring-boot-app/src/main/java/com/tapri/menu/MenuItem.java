package com.tapri.menu;

// A simple API model for one item on the Tapri Cloud menu.
// Prices are in INR.
public record MenuItem(
        String name,
        int price
) {
}
