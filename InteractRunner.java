import java.util.Scanner;


/** 
	*класс для запуска калькулятора
	*поддерживает ввод пользователя
*/
public class InteractRunner {

	public static void main(String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "no";
			String first = ""; 
			while (!exit.equals("yes")) {
				if (first.equals("")) { 
				System.out.println("Enter first arg : ");
				first = reader.next();
			}
				System.out.println("Enter second arg : ");
				String second = reader.next();
				String act = "mist";
				System.out.println("Select the action: * multiplication, / division, + addition, - subtraction");
				while (act.equals("mist")) {
				act = reader.next();
				if(act.equals("*")){
					calc.mult(Integer.valueOf(first), Integer.valueOf(second));
				}
						else if(act.equals("/")){
							calc.div(Integer.valueOf(first), Integer.valueOf(second));
						}
								else if(act.equals("+")){
									calc.add(Integer.valueOf(first), Integer.valueOf(second));
								}
										else if(act.equals("-")){
											calc.ded(Integer.valueOf(first), Integer.valueOf(second));
					}
				
				else {
					System.out.println("Enter the correct arithmetic action");
					act = "mist";
				}
			}
				System.out.println("Result : " + calc.getResult());
				System.out.println("Use the result for further calculation? yes/no ");
				String clean = reader.next();
				
				/** Проверка использования полученного 
				* результата в дальнейших вычислениях
				* @first либо пустая строка, если результат не нужен
				* либо равно результату
				*/
								
				if(clean.equals("no")) {
					calc.cleanResult();
					first = "";
				}
					else 
						first = String.valueOf(calc.getResult());
					
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		} finally {
			reader.close();
		}
	}
}
