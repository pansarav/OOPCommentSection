package com.comment.controller;

import java.sql.Date;

public interface CommentController {

    public void createComment(String userId, String comment);

    public void editComment(String userId, String commentId, String comment);

    public void deleteComment(String userId, String commentId);

    public void deleteReply(String userId, String replyId);

    public Date lastLoggedIn(String userId);

    public boolean checkIsAdmin(String userId);

    public boolean checkIsModerator(String userId);

    public String findOriginalComment(String replyId);

    public String findAuthor(String commentId);

    public void updateLastLoggedIn(String userId);

}
