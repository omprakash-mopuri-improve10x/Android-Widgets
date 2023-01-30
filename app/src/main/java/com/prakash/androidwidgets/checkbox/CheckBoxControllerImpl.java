package com.prakash.androidwidgets.checkbox;

public class CheckBoxControllerImpl implements CheckBoxController{
    @Override
    public String createOrderDetails(boolean isPizzaSelected, boolean isCoffeeSelected, boolean isTeaSelected) {
        int totalAmount = 0;
        String orderDetails = "Selected Items:";
        if (isPizzaSelected) {
            totalAmount += 100;
            orderDetails += "\nPizza Rs.100";
        }
        if (isCoffeeSelected) {
            totalAmount += 50;
            orderDetails += "\nCoffe Rs.50";
        }
        if (isTeaSelected) {
            totalAmount += 25;
            orderDetails += "\nTea Rs.25";
        }
        orderDetails += "\nTotal Rs: " + totalAmount;
        return orderDetails;
    }
}
