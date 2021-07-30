package com.company;

import java.util.Scanner;

public class ElectionData {

    private String firstName;
    private String secondName;
    private int numOfVoteForFirst;
    private int numOfVoteForSecond;
    private int totalNumOfVote;
    private int missingNumOfVote;
    private double firstPer;
    private double secondPer;
    private double abstainedPer;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getNumOfVoteForFirst() {
        return numOfVoteForFirst;
    }

    public void setNumOfVoteForFirst(int numOfVoteForFirst) {
        this.numOfVoteForFirst = numOfVoteForFirst;
    }

    public int getNumOfVoteForSecond() {
        return numOfVoteForSecond;
    }

    public void setNumOfVoteForSecond(int numOfVoteForSecond) {
        this.numOfVoteForSecond = numOfVoteForSecond;
    }

    public int getTotalNumOfVote() {
        return totalNumOfVote;
    }

    public void setTotalNumOfVote(int totalNumOfVote) {
        this.totalNumOfVote = totalNumOfVote;
    }

    public int getMissingNumOfVote() {
        return missingNumOfVote;
    }

    public void setMissingNumOfVote(int missingNumOfVote) {
        this.missingNumOfVote = missingNumOfVote;
    }

    public double getFirstPer() {
        return firstPer;
    }

    public void setFirstPer(double firstPer) {
        this.firstPer = firstPer;
    }

    public double getSecondPer() {
        return secondPer;
    }

    public void setSecondPer(double secondPer) {
        this.secondPer = secondPer;
    }

    public double getAbstainedPer() {
        return abstainedPer;
    }

    public void setAbstainedPer(double abstainedPer) {
        this.abstainedPer = abstainedPer;
    }

    public void electionService(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of first candidate");
        String name1 = scanner.nextLine();
        this.firstName =name1;

        System.out.println("Enter the name of second candidate");
        String name2 = scanner.nextLine();
        this.secondName =name2;

        System.out.println("Enter the vote for candidate 1 ");
        int n1 = scanner.nextInt();
        this.numOfVoteForFirst =n1;

        System.out.println("Enter the vote for candidate 2 ");
        int n2 = scanner.nextInt();
        this.numOfVoteForSecond =n2;

        System.out.print("Enter the abstained votes ");
        int n3 = scanner.nextInt();
        this.missingNumOfVote =n3;

    }

    public void compute(){

        this.totalNumOfVote = Add.add(this.numOfVoteForFirst, this.numOfVoteForSecond, this.missingNumOfVote);

        double percent1 = ((double) this.numOfVoteForFirst/(double) this.totalNumOfVote) *100;
        double percent2 = ((double) this.numOfVoteForSecond/(double) this.totalNumOfVote) *100;
        double percent3 = ((double) this.missingNumOfVote/(double) this.totalNumOfVote) *100;

        this.firstPer = percent1;
        this.secondPer = percent2;
        this.abstainedPer = percent3;
    }

    public void display(){
        System.out.println( this.firstName + "got" + this.firstPer);
        System.out.println( this.secondName + "got" + this.secondPer);
        System.out.println("Percentage of abstainee votes is " + this.abstainedPer);
        System.out.println("Total voting population is "+ this.totalNumOfVote);

        if(this.firstPer > this.secondPer){
            System.out.println("The winner of the election is "+ firstName);
        }
        else if(this.secondPer > this.firstPer){
            System.out.println("The winner of the election is "+ secondName);
        }
        else {
            System.out.println("It is a tie");
        }
    }




    }
