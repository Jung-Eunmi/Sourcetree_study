package test0922.test1;

import test0922.test1.exception.DivideNotZeroException;
import test0922.test1.exception.ModNotZeroException;
import test0922.test1.exception.MultipleNotZeroException;

public class Calculrator {

    public void plus(int num1, int num2) {
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }

    public void minus(int num1, int num2) {
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }

    public void multiply(int num1, int num2) throws MultipleNotZeroException {

        if (num1==0 || num2==0){
            throw new MultipleNotZeroException("곱하기는 0으로 할수없습니다.");
        }else {
            System.out.println(num1+"*"+num2+"="+(num1*num2));
        }
    }

    public void divide(int num1, int num2) throws DivideNotZeroException {

        if (num1==0 || num2==0){
            throw new DivideNotZeroException("나누기는 0으로 할수없습니다.");
        }else {
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }
    }

    public void mod(int num1, int num2) throws ModNotZeroException {
        if (num1==0 || num2==0){
            throw new ModNotZeroException("나누기는 0으로 할수없습니다.");
        }else {
            System.out.println(num1+"/"+num2+"="+(num1/num2));
        }
        System.out.println(num1+"%"+num2+"="+(num1%num2));
    }


}
