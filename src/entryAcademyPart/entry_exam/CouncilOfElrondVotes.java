package entryAcademyPart.entry_exam;

import java.util.*;

public class CouncilOfElrondVotes {
    private static boolean areValidVotes(String[] votes) {
        for (String vote : votes) {
            if(!vote.equals("Yes") && !vote.equals("No") && !vote.equals("Abstain")) {
                return false;
            }
        }

        return true;
    }
    private static Map<String, Integer> countVotes(String[] votes) {
        int yesCounter = 0, noCounter = 0;
        for (String vote : votes) {
            switch (vote) {
                case "Yes" ->
                    yesCounter++;
                case "No"->
                    noCounter++;
            }
        }

        int finalYesCounter = yesCounter;
        int finalNoCounter = noCounter;
        return new HashMap<>() {{
            put("Yes", finalYesCounter);
            put("No", finalNoCounter);
        }};
    }
    private static boolean containsOnlyAbstain(String[] votes) {
        for (String vote : votes) {
            if (!vote.equals("Abstain")) {
                return false;
            }
        }

        return true;
    }
    private static String determineVote(String[] votes) {
        if(containsOnlyAbstain(votes)) {
            return "Abstain";
        }
        Map<String, Integer> votesNumbers = countVotes(votes);
        int maxVoteNumbers = 0;
        String vote = "";
        String[] possibleKeys = new String[]{"Yes", "No"};
        for (int i = 0; i < votesNumbers.size(); i++) {
            if((i + 1) < votesNumbers.size() &&
                    Objects.equals(votesNumbers.get(possibleKeys[i]), votesNumbers.get(possibleKeys[i + 1]))) {
                return "Tie";
            }
            if(maxVoteNumbers < votesNumbers.get(possibleKeys[i])) {
                maxVoteNumbers = votesNumbers.getOrDefault(possibleKeys[i], 0);
                vote = possibleKeys[i];
            }
        }

        if(maxVoteNumbers == 0) {
            return "Abstain";
        }
        return switch (vote) {
            case "Yes" -> "Yes";
            case "No" -> "No";
            default -> "Tie";
        };

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] votes;
        do {
            input = scanner.nextLine();
            votes = input.split(", ");
        } while(!areValidVotes(votes));
        System.out.println(determineVote(votes));
    }
}