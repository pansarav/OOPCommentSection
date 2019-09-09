package com.comment.model.comment;

import java.sql.Date;

public class Reply extends Comment {

    private String isReply;
    private String replyId;
    private String replyComment;
    private String replyCreatedBy;
    private Date replyCreationTime;
    private String originalCommentId;

    public String getIsReply() {
        return isReply;
    }

    public void setIsReply(String isReply) {
        this.isReply = isReply;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyComment() {
        return replyComment;
    }

    public void setReplyComment(String replyComment) {
        this.replyComment = replyComment;
    }

    public String getReplyCreatedBy() {
        return replyCreatedBy;
    }

    public void setReplyCreatedBy(String replyCreatedBy) {
        this.replyCreatedBy = replyCreatedBy;
    }

    public Date getReplyCreationTime() {
        return replyCreationTime;
    }

    public void setReplyCreationTime(Date replyCreationTime) {
        this.replyCreationTime = replyCreationTime;
    }

    public String getOriginalCommentId() {
        return originalCommentId;
    }

    public void setOriginalCommentId(String originalCommentId) {
        this.originalCommentId = originalCommentId;
    }

    @Override
    public String toString() {
        return replyComment + " by " + replyCreatedBy + " (replied to " + this.getCreatedBy() + ")";
    }
}
