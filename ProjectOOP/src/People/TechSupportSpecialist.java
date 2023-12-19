package People;

import java.util.Date;
import java.util.Vector;
import DataBase.Data;
import Entities.Order;

public class TechSupportSpecialist extends Employee {
    
    public TechSupportSpecialist(String username, String password, Date birthDate, String phoneNumber, String email, String name, 
			String surname, double Salary, Date hiredate) {
		super(username, password, birthDate, phoneNumber, email, name, surname, Salary, hiredate);
	}
    
    public void acceptOrder(Order order) {
        Vector<Order> newOrders = Data.getOrders();
        if (newOrders.contains(order)) {
            newOrders.remove(order);
            order.viewStatus();
            System.out.println("The order has been accepted: " + order.getDescription());
        } else {
            System.out.println("This order is not in the list of new orders.");
        }
    }
    
    public void rejectOrder(Order order) {
        Vector<Order> newOrders = Data.getOrders();
        if (newOrders.contains(order)) {
            newOrders.remove(order);
            System.out.println("Заказ отклонен: " + order.getDescription());
        } else {
            System.out.println("The order was rejected.");
        }
    }
    
    public void viewNewOrders() {
        Vector<Order> newOrders = Data.getOrders();
        System.out.println("List of new orders:");
        for (Order order : newOrders) {
            System.out.println(order);
        }
    }
}

