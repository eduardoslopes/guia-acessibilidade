package com.acessibilityguide.api.model.query.assoc;

import com.acessibilityguide.api.model.Comment;
import com.acessibilityguide.api.model.query.QComment;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocComment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocComment<R> extends TQAssocBean<Comment,R> {

  public PLong<R> id;
  public PString<R> content;
  public QAssocMarker<R> marker;
  public QAssocGuideUser<R> user;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QComment>... properties) {
    return fetchProperties(properties);
  }

  public QAssocComment(String name, R root) {
    super(name, root);
  }
}
