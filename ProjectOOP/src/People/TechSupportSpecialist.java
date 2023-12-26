package People;

import java.util.Date;
import java.util.Vector;
import DataBase.Data;
import Entities.Order;
import Enumerators.ITOrderStatus;

public class TechSupportSpecialist extends Employee {
	
	public TechSupportSpecialist() {
		
	}
	
	public TechSupportSpecialist(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname, 
			double Salary, Date hireDate) {
		super(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate);
	}
	
	
	public Vector<Order> viewNewOrders() {
        Vector<Order> newOrders = new Vector<>();
        for (Order order : Data.getOrders()) {
            if (order.getStatus() == ITOrderStatus.NEW) {
                newOrders.add(order);
            }
        }
        return newOrders;
    }

    public String acceptOrder(Order order) {
        if (order.getStatus() == ITOrderStatus.NEW) {
            order.setStatus(ITOrderStatus.OLD); // Установка статуса "OLD" после принятия заказа
            return "Order Accepted";
        } 
	else {
            return "Order has already been accepted or rejected.";
        }
    }

    public String rejectOrder(Order order) {
        if (order.getStatus() == ITOrderStatus.NEW) {
            Data.getOrders().remove(order);
            return "Order Rejected";
        } 
	else {
            return "Order has already been accepted or rejected.";
        }
    }
}
