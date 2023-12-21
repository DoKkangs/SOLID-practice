package test;

public class Calculator {
    private Operation operation;
    // 의존 법칙
    // 각 기능을 가진 클래스의 상위 형태인 Operation을 참조하기 때문에
    // 기능이 변경되거나 추기되도 Operation을 implements한 클래스만 변경하면 된다.
    public Calculator(Operation operation) {
        this.operation = operation;
    }

    // 개방폐쇄법칙
    // 만약 계산기의 다른 계산 기능을 추가한다고 해도 Calculator의 코드는 크게 변경없이
    // Operation을 implements한 클래스를 만들어서 기능을 추가하면
    // 기존 코드의 변경은 최소화하면서 확장 가능.
    public double calculate(int num1, int num2){
        double answer = 0;
        answer = operation.operate(num1, num2);
        return answer;
    }

    public void setOperation(Operation operation){
        this.operation = operation;
    }
}
