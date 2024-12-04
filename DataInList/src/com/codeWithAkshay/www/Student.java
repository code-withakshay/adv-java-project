package com.codeWithAkshay.www;

public class Student 
{
	private int id;
    private String name;
    private String add;
    private int roll;

    public Student(int id, String name, String add, int roll ) 
    {
        this.id = id;
        this.name = name;
        this.add = add;
        this.roll=roll;
    }

	public int getId() 
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public String getAdd() 
	{
		return add;
	}
	public int getRoll()
	{
		return roll;
	}

   
}

