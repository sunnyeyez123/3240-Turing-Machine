public class TuringMachine {

	private String input;
	private Character[][] tape; // new String[2][input.length];
	private int tapeLen;
	private boolean valid = false;
	private boolean result = false;

	public TuringMachine(String inputString) {
		input = inputString;
		tapeLen = input.length();
		tape = new Character[2][tapeLen];
		// set up tape
		for (int i = 0; i < tapeLen; i++) {
			tape[0][i] = ' ';
			tape[1][i] = input.charAt(i);
		}
	}

	public void validate() {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '0' || input.charAt(i) == '1') {
				valid = true;
			} else {
				valid = false;
			}
			if (valid == false) {
				System.out.println("Invalid String");
				break;
			}
		}

	}
	
	public boolean isValid(){
		return valid;
	}

	public void mark(int i) {
		tape[0][i] ='X';
	}
	
	public boolean isMarked(int i){
		if(tape[0][i] =='X'){
			return true;
		}
		
		return false;
	}

	public void test() {
		int count = 0;
		boolean found1 = false;
		boolean found0 = false;
		boolean stage5 = false;
		boolean stage1 = false;
		while (count < tapeLen) {

			// 1. Scan the tape and mark the Þrst 1 which has not been marked.
			// If no unmarked 1Õs are found go to stage 5.
			//Otherwise move the head back to the start of the tape
			for (int i = 0; i < tapeLen; i++) {
				
				if(tape[1][i].equals('1')){
					System.out.println("found a 1");
					found1 = true;
					if(!isMarked(i)){
						mark(i);
						break;
					}
				}
			}
			if(!found1){
				stage5 = true;
			}
			printTape();
			// 2. Scan the tape until an unmarked 0 is found, mark the 0, if no
			// 0Õs are found reject

			for (int i = 0; i < tapeLen; i++) {

			}
			// 3. Scan the tape once more until an unmarked zero is found, mark
			// the 0, if no 0Õs are found
			// reject
			for (int i = 0; i < tapeLen; i++) {

			}

			// 4. Move the head back to the start of the tape and go to stage 1

			// 5. Move the head back to the start of the tape. Scan the tape to
			// see if any unmarked 0Õs are
			// found. If none are found accept, otherwise reject.
			for (int i = 0; i < tapeLen; i++) {

			}
			count++;
		}//end while
		
	}

	public void getResult() {

		if (result) {
			System.out.println("ACCEPT");
		} else {
			System.out.println("REJECT");
		}
	}

	public void printTape() {
		for (int i = 0; i < tapeLen; i++) {

			if (tape[0][i].equals('X')) {
				System.out.print("X ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
		for (int j = 0; j < tapeLen; j++) {
			System.out.print(tape[1][j] + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");

	}

}
