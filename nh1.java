import java.util.Scanner;

class Main {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
		char[][] circle= new char[numOfAllPlayers-1][];
    for(int i=0;i<numOfAllPlayers-1;i++){
			circle[i] = new char[] {(char)(66+i),'0'};
		}
		char[] sul = {'A','1'};
		char[] tmp = {};
		int stop = 1;
		for(int i=0; i<numOfMovesPerGame.length;i++){
			for(int j=0;j<namesOfQuickPlyers.length;j++){
				if (circle[stop+numOfMovesPerGame[i]][0] != numOfQuickPlayers[j]){
					sul[1] = (char)((int)sul[1] + 1);
				}
			}
			tmp = circle[stop+direction[i]];
			circle[stop+direction[i]] = sul;
			sul = tmp;
			sul[1] = (char)((int)sul[1] + 1);	
			}
			if (stop <0){
        while (stop<0){
          stop+=5;}}
      else{
          stop = stop %5;}
			}
		}
		for(int i=0;i<circle.length;i++){
			System.out.println(circle[i][0]+" "+circle[i][1]); 
		}
		System.out.print(sul[0] + " "sul[1]);
  }

  private static class InputData {
    int numOfAllPlayers;
    int numOfQuickPlayers;
    char[] namesOfQuickPlayers;
    int numOfGames;
    int[] numOfMovesPerGame;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
      for(int i = 0; i < inputData.numOfGames ; i++){
        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
  }
}