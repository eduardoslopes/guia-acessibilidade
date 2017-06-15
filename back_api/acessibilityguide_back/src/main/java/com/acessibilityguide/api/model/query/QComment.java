package com.acessibilityguide.api.model.query;

import com.acessibilityguide.api.model.Comment;
import com.acessibilityguide.api.model.query.assoc.QAssocGuideUser;
import com.acessibilityguide.api.model.query.assoc.QAssocMarker;
import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Comment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QComment extends TQRootBean<Comment,QComment> {

  private static final QComment _alias = new QComment(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QComment alias() {
    return _alias;
  }

  public PLong<QComment> id;
  public PString<QComment> content;
  public QAssocMarker<QComment> marker;
  public QAssocGuideUser<QComment> user;


  /**
   * Construct with a given EbeanServer.
   */
  public QComment(EbeanServer server) {
    super(Comment.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QComment() {
    super(Comment.class);
  }

  /**
   * Construct for Alias.
   */
  private QComment(boolean dummy) {
    super(dummy);
  }
}
