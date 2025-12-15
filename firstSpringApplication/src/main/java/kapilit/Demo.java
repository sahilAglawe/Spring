package kapilit;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo {

	private int i;
    private int j;
    private List<Integer> numbers;
    
	/*public Demo(String value, int i, int j) {
		super();
		this.value = value;
		this.i = i;
		this.j = j;
	} */
    
    

	public Demo() {
		super();
	}

	 public Demo(int i, int j, List<Integer> numbers) {
	        this.i = i;
	        this.j = j;
	        this.numbers = numbers;
	    }



	public void show() {
		System.out.println("hello");
		System.out.println(i+j);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
	public void display() {
		System.out.println("int , int , list");
		
		int sumOfEvenSquares = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();

        System.out.println(sumOfEvenSquares);
	}
}
