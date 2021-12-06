package view;

public class Display {
	private static final String COMMA = ", ";
	private static final int FIRST_CAR = 0;
	private static final int START_CAR_POSITION = 0;
	private static final String CAR_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
	private static final String EXECUTION_MESSAGE = "실행 결과";
	private static final String WINNER_MESSAGE = "최종 우승자 : ";

	private Display() {
	}

	public static void pleaseInputRacingCarNames() {
		System.out.println(CAR_INPUT_MESSAGE);
	}

	public static void pleaseInputNumberOfCarRaces() {
		System.out.println(TRY_COUNT_MESSAGE);
	}

	public static void showExecutionResult() {
		System.out.println();
		System.out.println(EXECUTION_MESSAGE);
	}

	public static void showRacingCarNowPositions(String[] carNames, int[] carPositions) {
		System.out.println();
		for (int index = FIRST_CAR; index < carNames.length; index++) {
			showRacingCarName(carNames[index]);
			showRacingCarPosition(carPositions[index]);
		}
	}

	private static void showRacingCarName(String carName) {
		System.out.print(carName + " : ");
	}

	private static void showRacingCarPosition(int carPosition) {
		for (int index = START_CAR_POSITION; index < carPosition; index++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void showWinnerMessage() {
		System.out.println();
		System.out.print(WINNER_MESSAGE);
	}

	public static void showWinner(String winner) {
		System.out.print(winner);
	}

	public static void putComma() {
		System.out.print(COMMA);
	}
}
