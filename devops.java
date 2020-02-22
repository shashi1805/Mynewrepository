2.
git config ----global user.name "shashi1805"
git config ----global user.email "shashireddy1805@gmail.com"
git clone https://github.com/shashi1805/Mynewrepository
cd MyNewRepository
git remote
git remote -v
start notepad Calculator.java
git status
ls
git add Calculator.java
git status
git commit -m "First Commit"
git push
------------------------------------------------------------------------------------
import java.util.Scanner;

public class Calculator {
	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        double f = sc.nextDouble();
	        double s = sc.nextDouble();
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = sc.next().charAt(0);
	        double r;
	        switch(operator)
	        {
	            case '+':
	                r = f + s;
	                break;
	            case '-':
	                r = f - s;
	                break;
	            case '*':
	                r = f * s;
	                break;
	            case '/':
	                r = f / s;
	                break;
	            default:
	                System.out.printf("Error! operator is not correct");
	                return;
	        }
	        System.out.printf("%.1f %c %.1f = %.1f", f, operator, s, r);
	    }
	}
OUTPUT:
Enter two numbers: 2
3
Enter an operator (+, -, *, /): +
2.0 + 3.0 = 5.0