import java.util.Arrays;

class PartytoCFriends {
    public static void main(String[] args) {
        int N = 4; // number of friends
        int C = 4; // wants to give the party
        int R = 10; // amount is available

        int[] friends = { 2, 2, 5, 1 };

        Arrays.sort(friends);

        int countFriends = 0;

        for (int i = 0; i < N; i++) {
            if (countFriends <= C && (R - friends[i]) >= 0) {
                R -= friends[i];
                countFriends++;
            }
        }

        if (countFriends >= C) {
            System.out.println("Party");
        } else {
            System.out.println("Sad");
        }
    }

}