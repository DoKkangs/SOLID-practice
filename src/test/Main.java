package test;

public class Main {
    public static void main(String[] args) {
        // 리스코프 치환 법칙
        // Operation 인터페이스 타입으로 변수를 선언
        // 중간에 다른 클래스로 바꿔도 같은 인터페이스를 implements하였기 때문에 치환 가능
        Operation operation = new AddOperation();
        Calculator calculator  = new Calculator(operation);
        calculator.calculate(3, 5);

        operation = new SubstractOperation();
        calculator.setOperation(operation);
        calculator.calculate(3,5);


        operation = new MultiplyOperation();
        calculator.setOperation(operation);
        calculator.calculate(3,5);


        operation = new DivideOperation();
        calculator.setOperation(operation);
        calculator.calculate(3,5);
    }
}