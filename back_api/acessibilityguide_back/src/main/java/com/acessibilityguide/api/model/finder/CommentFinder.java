package com.acessibilityguide.api.model.finder;

import com.acessibilityguide.api.model.Comment;
import com.acessibilityguide.api.model.query.QComment;
import com.avaje.ebean.Finder;

public class CommentFinder extends Finder<Long,Comment> {

  /**
   * Construct using the default EbeanServer.
   */
  public CommentFinder() {
    super(Comment.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public CommentFinder(String serverName) {
    super(Comment.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QComment where() {
     return new QComment(db());
  }
}
