import java.util.Scanner;

public class CallMainGame {
    private int total;
    private int exit;

    public void first(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                What is the capital of France?
                1) Rome
                2) Berlin
                3) Madrid
                4) Paris
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==4){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void second(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                In which year did World War II end?
                1) 1942
                2) 1945
                3) 1939
                4) 1950
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==2){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void Third(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Which superhero is also known as the "Caped Crusader"?
                1) Superman
                2) Spider-Man
                3) Batman
                4) Iron Man
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==3){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }

    public void fourth(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                What is the highest-grossing movie of all time (as of 2024)?
                1) Avatar
                2) Avengers: Endgame
                3) Titanic
                4) Star Wars: The Force Awakens
                
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==1){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }

    public void fifth(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Which planet is known as the Red Planet?
                1) Venus
                2) Mars
                3) Jupiter
                4) Saturn
                
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==2){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void sixth(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Who wrote the play Romeo and Juliet?
                1) Charles Dickens
                2) William Shakespeare
                3) Mark Twain
                4) Jane Austen
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==2){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void seventh(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                What gas do plants absorb during photosynthesis?
                1) Oxygen
                2) Carbon Dioxide
                3) Nitrogen
                4) Hydrogen
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==2){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void eighth(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                What is the chemical symbol for gold?
                1) Go
                2) Gd
                3) Au
                4) Ag
                
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==3){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void ninth(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                How many bones are there in the adult human body?
                1) 206
                2) 305
                3) 150
                4) 180
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==1){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public void tent(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                Who was the first President of the United States?
                1) Thomas Jefferson
                2) George Washington
                3) Abraham Lincoln
                4) John Adams
                
                """);
        System.out.print("Enter the correct option:- ");
        int ans=scanner.nextInt();
        if(ans==2){
            System.out.println("Correct Answer +10");
            total=total+10;
        }
        else {
            exit=1;
        }
    }
    public int getTotal(){
        return total;
    }
    public int getExit(){
        return exit;
    }
}
