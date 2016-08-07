public class FizzBuzzWhizz {
    private int[] specialNumberList;

    public FizzBuzzWhizz(int[] specialNumberList) {
        this.specialNumberList = specialNumberList;
    }

    public String speak(int i) {
        if (i % specialNumberList[0] == 0) {
            return "Fizz";
        }
        if (i%specialNumberList[1]==0){
            return "Buzz";
        }

        return null;
    }
}
