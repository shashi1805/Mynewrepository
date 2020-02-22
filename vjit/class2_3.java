package vjit;
enum gender{m,f,o}
public class class2_3 {
	
	public long phonenumber()
	{
	long phonenumber=345675;
	return phonenumber;
		
	}
   public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
String firstname;
   String lastname;
   char gender;
   class2_3()
   {
	   firstname="shashi";
	   lastname="kumar";
	    gender='M';
   }
      void person(String firstname,  String lastname, char gender)
      {	
    	  this.firstname="shashi";
   	   this.lastname="kumar";
   	    this.gender='M';
   	    
      }
	
}

