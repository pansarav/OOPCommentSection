package com.comment.model.user;

public class Moderator extends User {

    private boolean isModerator;

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean moderator) {
        isModerator = moderator;
    }
}
