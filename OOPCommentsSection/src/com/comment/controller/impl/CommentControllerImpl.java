package com.comment.controller.impl;

import com.comment.controller.CommentController;
import com.comment.model.comment.Comment;

import java.sql.Date;

public class CommentControllerImpl implements CommentController {

    @Override
    public void createComment(String userId, String comment) {
        //check for the valid userId
        Comment inputComment = prepareComment(userId, comment);
        //Simple operation to insert comment in DB with userId - generate commentId using sequence
    }

    @Override
    public void editComment(String userId, String commentId, String comment) {
        String authorId = findAuthor(commentId);
        if((authorId!=null && !authorId.isEmpty() && authorId.equals(userId)) || checkIsAdmin(userId)){
            Comment inputComment = prepareComment(authorId, comment);
            inputComment.setCommentId(commentId);
            //Normal DB operation to update the comment
        }
    }

    @Override
    public void deleteComment(String userId, String commentId) {
        if(checkIsAdmin(userId) || checkIsModerator(userId)){
            //DB Operation to delete all the replies first and then delete the comment
        }
    }

    @Override
    public void deleteReply(String userId, String replyId) {
        if(checkForOriginalAuthor(userId, replyId) || checkIsAdmin(userId) || checkIsModerator(userId)){
            //Delete all the child replies
            //Then delete the reply
        }
    }

    private boolean checkForOriginalAuthor(String userId, String replyId) {
        //fetch original commentid from replyid and then find it's author
        //check if the given user is the author
        return false;
    }

    @Override
    public Date lastLoggedIn(String userId) {
        //DB operation to fetch last logged in if the user is present
        return null;
    }

    @Override
    public boolean checkIsAdmin(String userId) {
        //check if given user is admin or not
        return false;
    }

    @Override
    public boolean checkIsModerator(String userId) {
        //check if given user is moderator or not
        return false;
    }

    @Override
    public String findOriginalComment(String replyId) {
        //DB operation - check if it's a reply, then find original comment of this reply
        return null;
    }

    @Override
    public String findAuthor(String commentId) {
        //DB Query to find author by commentId
        return null;
    }

    @Override
    public void updateLastLoggedIn(String userId) {
        //DB operation to update last logged in time if the user is present
    }

    private Comment prepareComment(String userId, String comment) {
        Comment inputComment = new Comment();
        inputComment.setCreatedBy(userId);
        inputComment.setComment(comment);
        inputComment.setCreationTime(new Date((new java.util.Date()).getTime()));
        return inputComment;
    }
}
