package com.company;

import java.util.Scanner;

public class ElectionService {

    public static void electionService(){

        ElectionData electionData = new ElectionData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of first candidate");
        String name1 = scanner.nextLine();
        electionData.setFirstName(name1);

        System.out.println("Enter the name of second candidate");
        String name2 = scanner.nextLine();
        electionData.setSecondName(name2);

        System.out.println("Enter the vote for candidate 1 ");
        int n1 = scanner.nextInt();
        electionData.setNumOfVoteForFirst(n1);

        System.out.println("Enter the vote for candidate 2 ");
        int n2 = scanner.nextInt();
        electionData.setNumOfVoteForSecond(n2);

        System.out.print("Enter the abstained votes ");
        int n3 = scanner.nextInt();
        electionData.setMissingNumOfVote(n3);

        System.out.println(electionData.getNumOfVoteForFirst());


    }
}
