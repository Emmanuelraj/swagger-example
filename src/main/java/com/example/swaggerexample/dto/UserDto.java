package com.example.swaggerexample.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

public class UserDto {

	
	@ApiModelProperty(notes="name of the user")
	private String userName;
	

	@ApiModelProperty(notes="name of the salary")
	private Long salary;
	
	
	
	
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}





	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}





	/**
	 * @return the salary
	 */
	public Long getSalary() {
		return salary;
	}





	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Long salary) {
		this.salary = salary;
	}





	public UserDto() {
		// TODO Auto-generated constructor stub
	}





	public UserDto(String userName, Long salary) {
		super();
		this.userName = userName;
		this.salary = salary;
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDto [userName=" + userName + ", salary=" + salary + "]";
	}
	
	
	

}
