package com.cts.oopd.model;

public class Employee extends Person{
		private int salary;
		public Employee() {
			super();
		}
		public Employee(String name,int age,int salary) {
			super(name,age);
			this.salary=salary;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public int getSalary() {
			return this.salary;
		}
		@Override
		public String toString() {
			return super.toString()+"," +salary;
		}
	}

