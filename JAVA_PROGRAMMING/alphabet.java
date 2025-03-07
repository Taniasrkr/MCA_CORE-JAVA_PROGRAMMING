
class Alphabet {
    
    public void printAlphabets() {
        System.out.println("Alphabets from A to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println(); 
    }
}


class MainAlphabet {
    public static void main(String[] args) {
        Alphabet ob1 = new Alphabet();
        ob1.printAlphabets();
    }
}
