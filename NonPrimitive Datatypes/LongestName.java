class LongestName{
    public static void main(String[] args){
        String[] names = {"Monisha", "Blessy", "Kowsalya", "Charru"};
        String longest = names[0];

        for(String name: names){
            if(name.length() > longest.length()){
                longest = name;

            }
        }
        System.out.println("TotalStudents: " + names.length);
        System.out.println("LongestName: " + longest);
    }
}