package logicalprograms;

public class Stu {
	private int id;
	private String name;
	private int marks;
	Stu(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
