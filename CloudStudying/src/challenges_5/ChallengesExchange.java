package challenges_5;

public class ChallengesExchange {

	public static void main(String[] args) {
	    // 유로 입력
	    int euro = 52;
	    // 달러 입력
	    int dollar = 32;
	    
	    /* 1. 환율 변수 생성 */
	    double euroToKwnRate = 1281.62664;
	    double dollarToKwnRate = 1091.70306;
	    
	    /* 2. 환전 결과 계산 */
	    double won1 = euro * euroToKwnRate;
	    double won2 = dollar * dollarToKwnRate;
	    double total = won1 + won2;
	    
	    // 결과 출력
	    System.out.printf("환전 결과: %.0f원", total);
	}

}

// 정답 코드 

//public class Exchange {
//	  public static void main(String[] args) {
//	    // 유로 입력
//	    int euro = Integer.parseInt(args[0]);
//	    // 달러 입력
//	    int dollar = Integer.parseInt(args[1]);
//	    /* 1. 환율 변수 생성 */
//	    double euroToKwnRate = 1281.62664;
//	    double dollarToKwnRate = 1091.70306;
//	    /* 2. 환전 결과 계산 */
//	    double kwn = (euro * euroToKwnRate) + (dollar * dollarToKwnRate);
//	    // 결과 출력
//	    System.out.printf("환전 결과: %.0f원", kwn);
//	  }
//	}