class HighestMark{
    public static void main(String[] args){
        String[] names = {"Arun", "Meena", "Kavi", "Divya"};
        int[] marks = {85, 92, 78, 88};

        int highest = marks[0];
        String topper = names[0];

        for(int i = 1; i < marks.length; i++){
            if(marks[i] > highest){
                highest = marks[i];
                topper = names[i];
            }
         }
         System.out.println("Topper Name: " + topper);
         System.out.println("Highest Mark: " + highest);

    }
}