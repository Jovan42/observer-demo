package com.example.demo;

import com.example.demo.test.model.Employee;
import com.example.demo.test.publisher.EmployeesStore;
import com.example.demo.test.subscriber.ProfitCalculator;
import com.example.demo.test.model.Sale;
import com.example.demo.test.publisher.SaleStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContTest {

    private EmployeesStore employeesStore;

    private SaleStore saleStore;
    private ProfitCalculator profitCalculator;

    public ContTest(EmployeesStore employeesStore, SaleStore saleStore, ProfitCalculator profitCalculator) {
        this.employeesStore = employeesStore;
        this.saleStore = saleStore;
        this.profitCalculator = profitCalculator;
    }


    @GetMapping("")
    public void test() {
        employeesStore.addEmployee(new Employee("Jovan", "Manojlovic", 3000L));
        System.out.println(profitCalculator.calculateProfit());
        employeesStore.addEmployee(new Employee("Jovan", "Manojlovic", 2000L));
        System.out.println(profitCalculator.calculateProfit());
        employeesStore.addEmployee(new Employee("Jovan", "Manojlovic", 2000L));
        System.out.println(profitCalculator.calculateProfit());
        saleStore.addSale(new Sale(2000L));
        System.out.println(profitCalculator.calculateProfit());
        saleStore.addSale(new Sale(4000L));
        System.out.println(profitCalculator.calculateProfit());

    }
}
