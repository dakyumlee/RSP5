
import java.util.Scanner;
public class Rocksp {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);
		        int value3 = 0;
		        int value4 = 0;
		        int com1 = (int) (Math.random() * 3);

		        int com2;
		        do {
		            com2 = (int) (Math.random() * 3);
		        } while (com1 == com2);

		        String[] choices = {"가위", "바위", "보"};

		        String value1 = "";
		        String value2 = "";

		        System.out.print("가위(0), 바위(1), 보(2) 중에서 2가지 선택: ");
		        int me1 = scanner.nextInt();

		        if (0 <= me1 && me1 <= 2) {
		            value1 = choices[me1];

		            System.out.print(value1 + "를 제외하고 가위(0), 바위(1), 보(2) 중에서 1가지 선택: ");
		            int me2 = scanner.nextInt();

		            if (me1 != me2 && 0 <= me2 && me2 <= 2) {
		                value2 = choices[me2];

		                System.out.println("com: " + choices[com1] + " " + choices[com2]);
		                System.out.println("me: " + value1 + " " + value2 + "\n");

		                System.out.print("com: " + choices[com1] + " " + choices[com2] + " me: " + value1 + " " + value2 + " // " +
		                        value1 + "(" + me1 + ") " + value2 + "(" + me2 + ") 중에서 선택: ");
		                int me = scanner.nextInt();

		                int comSel = (int) (Math.random() * 2);
		                int comValue;
		                int com;
		                if (comSel == 0) {
		                    com = com1;
		                } else {
		                    com = com2;
		                }

		                String comChoice = choices[com];
		                String meValue = choices[me];

		                System.out.println("com의 선택: " + comChoice);
		                System.out.println("me의 선택: " + meValue + "\n");

		                if (com == me) {
		                    System.out.println("비김");
		                } else if ((com == 0 && me == 1) || (com == 1 && me == 2) || (com == 2 && me == 0)) {
		                    System.out.println("승리");
		                } else {
		                    System.out.println("패배");
		                }
		            } else {
		                System.out.println("입력 오류");
		            }
		            
		        } else {
		            System.out.println("입력 오류");
		        }

		        scanner.close();
		    }

	}

