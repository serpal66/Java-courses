/** 
	класс реализует калькулятор
*/
public class Calculator {
	/**
		результат вычисления
	*/
	private int result;
		
	/**
	суммируем аргументы
	@param params Аргументы суммирования
	*/
	public void add(int ... params){
		for(Integer param:params){
			this.result += param;
		}
	}
	
	/**
	вычитаем аргументы
	@param params Аргументы вычитания
	*/
	public void ded(int ... params){
	/**
	 приплюсовать удвоенное первое значение
	*/
		this.result = params[0]*2; 
		for(Integer param:params){
			this.result -= param;
		}
	}
	
	/**
	умножаем аргументы
	@param params Аргументы умножения
	*/
	public void mult(int ... params){
		this.result =1; // первое число точно определено
		for(Integer param:params){
			this.result *= param;
		}
	}
	
	/**
	делим аргументы
	@param params Аргументы деления
	*/
	public void div(int ... params){
		this.result = params[0]*params[0];//первое число 
		for(Integer param:params){
			this.result /= param;
		}
	}
	
	/**
	получить результат
	@return результат вычисления
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
	очистить результат вычисления
	*/
	public void cleanResult() {
		  this.result = 0;
		}
}
