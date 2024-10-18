package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * A simplified voting machine.
 */
public class VotingMachine {
    /**
     * Stores votes for candidates.
     */
    private Map<String, Integer> votes = new HashMap<>();

    /**
     * Adds candidate.
     *
     * @param name the candidate's name
     */
    public void addCandidate(String name) {
        votes.put(name, 0);
    }

    /**
     * Casts a vote for a candidate.
     *
     * @param name the candidate's name
     */
    public void castVote(String name) {
        votes.computeIfPresent(name, (k, v) -> v + 1); //used chatgpt so vote can be shown with candidate name
    }

    /**
     * Returns a string representation of the voting machine.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return votes.toString();
    }
}
