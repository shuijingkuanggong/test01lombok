package com.atguigu.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	
	private Integer id;
	private String name;
	private Double salary;

	public static void main(String[] args) {
		
		User user = new User();
		User user2 = new User(33, "姗姗", 33.33);
		System.out.println(user);
		System.out.println(user2);
		user.setName("合合");
		System.out.println(user);
		System.out.println(user2.getName());
		System.out.println(user.equals(user2));
		

	}

}
