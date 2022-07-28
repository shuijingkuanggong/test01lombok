package com.atguigu.test;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		System.out.println(employee);
		Employee employee2 = new Employee(55, "旺旺", 55.55);
		System.out.println(employee2);
		employee.setName("花花");
		System.out.println(employee);
		System.out.println(employee2.getName());
		Employee employee3 = new Employee(55, "旺旺", 55.55);
		System.out.println(employee2.equals(employee3));

	}

}
