package com.company;

public class Compute {

   public static void compute(){

       ElectionData electionData = new ElectionData();

       int n1 = electionData.getNumOfVoteForFirst();
       int n2 = electionData.getNumOfVoteForSecond();
       int n3 = electionData.getMissingNumOfVote();
       System.out.println(electionData.getNumOfVoteForFirst());

       Add.add(n1, n2, n3);

       int total = electionData.getTotalNumOfVote();

       double percent1 = (electionData.getNumOfVoteForFirst()/total) *100;
       double percent2 = (electionData.getNumOfVoteForSecond()/total) *100;
       double percent3 = (electionData.getMissingNumOfVote()/total) *100;

       electionData.setFirstPer(percent1);
       electionData.setSecondPer(percent2);
       electionData.setAbstainedPer(percent3);

   }

}
