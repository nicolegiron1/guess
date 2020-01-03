public class HiddenWord{
  private String word;

  public HiddenWord(String word){
    this.word = word;
  }

  public String getHint(String hint){
    String word = HiddenWord.getWord();

    for(int i = 0; i <= word.length()-1; i++){
      
    }
  }

  public String getWord(){
    return word;
  }

  public static void main(String[] args) {
      HiddenWord puzzle = new HiddenWord("HARPS");

      puzzle.getHint("AAAAA");
      puzzele.getHint("HELLO");
      puzzle.getHint("HEART");
      puzzle.getHint("HARMS");
      puzzle.getHint("HARPS");
  }
}
