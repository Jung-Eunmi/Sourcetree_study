package test0915;

import java.util.Random;

public class Horse {

    private int speedFirst;
    private int speedSecond;
    private int speedThird;

    Random random = new Random();

    public void horseGo() {

        if(speedFirst <= 900 && speedSecond <= 900 && speedThird <= 900) {

            int horseNum = random.nextInt(3);

            switch (horseNum) {
                case 0:
                    speedFirst += 100;
                    System.out.println("1번말!!!!!!! " + speedFirst + "m 를 달리고 있습니다.");
                    System.out.println("2번말!!!!!!! " + speedSecond + "m 를 달리고 있습니다.");
                    System.out.println("3번말!!!!!!! " + speedThird + "m 를 달리고 있습니다.");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

                case 1:
                    speedSecond += 100;
                    System.out.println("1번말!!!!!!! " + speedFirst + "m 를 달리고 있습니다.");
                    System.out.println("2번말!!!!!!! " + speedSecond + "m 를 달리고 있습니다.");
                    System.out.println("3번말!!!!!!! " + speedThird + "m 를 달리고 있습니다.");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

                case 2:
                    speedThird += 100;
                    System.out.println("1번말!!!!!!! " + speedFirst + "m 를 달리고 있습니다.");
                    System.out.println("2번말!!!!!!! " + speedSecond + "m 를 달리고 있습니다.");
                    System.out.println("3번말!!!!!!! " + speedThird + "m 를 달리고 있습니다.");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

            }

        } else {
            System.out.println("이미 경기가 끝났어요!!");
        }

    }

    public void horseDown() {
        if(speedFirst <= 900 && speedSecond <= 900 && speedThird <= 900) {

            int horseNum = random.nextInt(3);

            switch (horseNum) {
                case 0:
                    speedSecond += 100;
                    speedThird += 100;
                    System.out.println("1번말ㅠㅠㅠㅠㅠㅠ " + speedFirst + "m에서 장애물에 걸렸습니다ㅠㅠㅠ!!!!!!");
                    System.out.println("2번말!!!!계속해서 " + speedSecond + "m를 달리고 있습니다!!!!");
                    System.out.println("3번말!!!!계속해서 " + speedThird + "m를 달리고 있습니다!!!!!!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedThird,"\uD83D\uDC2A");

                    break;

                case 1:
                    speedFirst += 100;
                    speedThird += 100;
                    System.out.println("1번말!!!!계속해서 " + speedFirst + "m를 달리고 있습니다!!!!");
                    System.out.println("2번말ㅠㅠㅠㅠㅠㅠ " + speedSecond + "m에서 장애물에 걸렸습니다ㅠㅠㅠ!!!!!!");
                    System.out.println("3번말!!!!계속해서 " + speedThird + "m를 달리고 있습니다!!!!!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

                case 2:
                    speedFirst += 100;
                    speedSecond += 100;
                    System.out.println("1번말!!!!계속해서 " + speedFirst + "m를 달리고 있습니다!!!");
                    System.out.println("2번말!!!!계속해서 " + speedSecond + "m를 달리고 있습니다!!!!!!!");
                    System.out.println("3번말ㅠㅠㅠㅠㅠㅠ " + speedThird + "m에서 장애물에 걸렸습니다ㅠㅠㅠ!!!!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

            }

        } else {
            System.out.println("이미 경기가 끝났어요!!");
        }

    }

    public void horseOut() {
        if(speedFirst <= 900 && speedSecond <= 900 && speedThird <= 900) {

            int horseNum = random.nextInt(3);

            switch (horseNum) {
                case 0:
                    speedFirst = 0;
                    System.out.println("1번말!!!이게 무슨일이죠!!!경기장밖으로 나갔습니다!!" + speedFirst + "m에서 다시 시작합니다!!!");
                    System.out.println("2번말!!!!계속해서 " + speedSecond + "m를 달리고 있는데요!!!");
                    System.out.println("3번말!!!!계속해서 " + speedThird + "m를 달리고 있습니다!!!!!!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

                case 1:
                    speedSecond = 0;
                    System.out.println("1번말!!!!계속해서 " + speedFirst + "m를 달리고 있는데요!!!");
                    System.out.println("2번말!!!이게 무슨일이죠!!!경기장밖으로 나갔습니다!!" + speedSecond + "m에서 다시 시작합니다!!!");
                    System.out.println("3번말!!!!계속해서 " + speedThird + "m를 달리고 있습니다!!!!!!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

                case 2:
                    speedThird = 0;
                    System.out.println("1번말!!!!계속해서 " + speedFirst + "m를 달리고 있는데요!!!");
                    System.out.println("2번말!!!!계속해서 " + speedSecond + "m를 달리고 있습니다!!!!!!!!");
                    System.out.println("3번말!!!이게 무슨일이죠!!!경기장밖으로 나갔습니다!!" + speedThird + "m에서 다시 시작합니다!!!");
                    horseCRT1(speedFirst,"\uD83D\uDC0E");
                    horseCRT1(speedSecond,"\uD83E\uDD8D");
                    horseCRT1(speedFirst,"\uD83D\uDC2A");
                    break;

            }

        } else {
            System.out.println("이미 경기가 끝났어요!!");
        }

    }

    public void horseChampion() {
        if (speedFirst >= 1000) {
            System.out.println("1번말 승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");

            if (speedSecond >= 1000) {
                System.out.println("2번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

            if (speedThird >= 1000) {
                System.out.println("3번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

        } else if (speedSecond >= 1000) {
            System.out.println("2번말 승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");

            if (speedFirst >= 1000) {
                System.out.println("1번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

            if (speedThird >= 1000) {
                System.out.println("3번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

        } else if (speedThird >= 1000) {
            System.out.println("3번말 승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");

            if (speedFirst >= 1000) {
                System.out.println("1번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

            if (speedSecond >= 1000) {
                System.out.println("3번말 공동승리\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89\uD83C\uDF89");
            }

        }

    }


    public void horseCRT1(int frist, String second) {

        if (frist == 0) {
                System.out.println(second+"  " + "  " + "  " + "  " +"  " +"  " +"  " +"  " +"  " +"||"+"  ");
        } else if (frist == 100) {
                System.out.println("  " + second + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||" + "  ");
        } else if (frist == 200) {
                System.out.println("  " + "  " + second+ "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||"+ "  " );
        } else if (frist == 300) {
                System.out.println("  " + "  " + "  " + second+ "  " + "  " + "  " + "  " + "  "+ "  "+"||" + "  ");
        } else if (frist == 400) {
                System.out.println("  " + "  " + "  " + "  " + second + "  " + "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (frist == 500) {
                System.out.println("  " + "  " + "  " + "  " + "  " + second+ "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (frist == 600) {
                System.out.println("  " + "  " + "  " + "  " + "  " + "  " + second+ "  " + "  " + "  " +"||"+ "  ");
        } else if (frist == 700) {
                System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + second+ "  " + "  " +"||"+ "  ");
        } else if (frist == 800) {
                System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + second+ "  " +"||"+ "  ");
        } else if (frist == 900) {
                System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + second +"||"+ "  ");
        } else if (frist == 1000) {
                System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "||"+second);
        }

    }

    public void horseCRT2() {

        if (speedSecond==0){
            System.out.println("\uD83E\uDD8D"+"  " + "  " + "  " + "  " +"  " +"  " +"  " +"  " +"  " +"||"+"  ");
        } else if (speedSecond == 100) {
            System.out.println("  " + "\uD83E\uDD8D" + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||" + "  ");
        } else if (speedSecond == 200) {
            System.out.println("  " + "  " + "\uD83E\uDD8D"+ "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||"+ "  " );
        } else if (speedSecond == 300) {
            System.out.println("  " + "  " + "  " + "\uD83E\uDD8D"+ "  " + "  " + "  " + "  " + "  "+ "  "+"||" + "  ");
        } else if (speedSecond == 400) {
            System.out.println("  " + "  " + "  " + "  " + "\uD83E\uDD8D" + "  " + "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (speedSecond == 500) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "\uD83E\uDD8D"+ "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (speedSecond == 600) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "\uD83E\uDD8D"+ "  " + "  " + "  " +"||"+ "  ");
        } else if (speedSecond == 700) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83E\uDD8D"+ "  " + "  " +"||"+ "  ");
        } else if (speedSecond == 800) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83E\uDD8D"+ "  " +"||"+ "  ");
        } else if (speedSecond == 900) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83E\uDD8D" +"||"+ "  ");
        } else if (speedSecond == 1000) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "||"+"\uD83E\uDD8D");
        }

    }


    public void horseCRT3() {

        if (speedThird==0){
            System.out.println("\uD83D\uDC2A"+"  " + "  " + "  " + "  " +"  " +"  " +"  " +"  " +"  " +"||"+"  ");
        } else if (speedThird == 100) {
            System.out.println("  " + "\uD83D\uDC2A" + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||" + "  ");
        } else if (speedThird == 200) {
            System.out.println("  " + "  " + "\uD83D\uDC2A"+ "  " + "  " + "  " + "  " + "  " + "  " + "  " +"||"+ "  " );
        } else if (speedThird == 300) {
            System.out.println("  " + "  " + "  " + "\uD83D\uDC2A"+ "  " + "  " + "  " + "  " + "  "+ "  "+"||" + "  ");
        } else if (speedThird == 400) {
            System.out.println("  " + "  " + "  " + "  " + "\uD83D\uDC2A" + "  " + "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (speedThird == 500) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "\uD83D\uDC2A"+ "  " + "  " + "  " + "  " +"||"+ "  ");
        } else if (speedThird == 600) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "\uD83D\uDC2A"+ "  " + "  " + "  " +"||"+ "  ");
        } else if (speedThird == 700) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83D\uDC2A"+ "  " + "  " +"||"+ "  ");
        } else if (speedThird == 800) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83D\uDC2A"+ "  " +"||"+ "  ");
        } else if (speedThird == 900) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "\uD83D\uDC2A" +"||"+ "  ");
        } else if (speedThird == 1000) {
            System.out.println("  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "  " + "||"+"\uD83D\uDC2A");
        }

    }

}

