package vjit;

public class person {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	float age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person a= new person();
		a.setName("smith");
		a.setAge(28);

	}

}
