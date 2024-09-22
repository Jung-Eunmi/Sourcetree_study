package test0922.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        /* comment.
         *   <요구사항>
         *   1. 클래스는 Application, BookDTO 클래스로 구성한다. o
         *   2. Application 클래스는 main 메소드를 포함한다. o
         *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다.o
         *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.o
         *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며
         *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다.o
         *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
         *      2번째 인덱스에 추가를 할 것이다.
         *   <출력 예시>
         *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고 출력하는 구문을 작성하라.
         *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라.
         *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.*/
        List<BookDTO> bDTO = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("책 번호를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.print("책 이름를 입력하세요 : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("책 저자를 입력하세요 : ");
        String author = sc.nextLine();
        System.out.print("책 가격를 입력하세요 : ");
        int price = sc.nextInt();

        BookDTO book1 = new BookDTO(1,"book1","author1",10000);
        BookDTO book2 = new BookDTO(2,"book2","author2",20000);
        BookDTO book3 = new BookDTO(num,name,author,price);
        BookDTO book4 = new BookDTO(4,"book4","author4",40000);
        BookDTO book5 = new BookDTO(5,"book5","author5",50000);
        bDTO.add(book1);
        bDTO.add(book2);
        bDTO.add(book4);
        bDTO.add(book5);
        bDTO.add(2,book3);

        for (int i = 0; i<bDTO.size(); i++){
            System.out.println("[" + i + "] : " + bDTO.get(i));
        }

    }

}

