package com.acessibilityguide.api.model.query;

import com.acessibilityguide.api.model.AcessibilityType;
import com.acessibilityguide.api.model.query.assoc.QAssocMarker;
import com.avaje.ebean.EbeanServer;
import org.avaje.ebean.typequery.PBoolean;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQRootBean;
import org.avaje.ebean.typequery.TypeQueryBean;

/**
 * Query bean for AcessibilityType.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAcessibilityType extends TQRootBean<AcessibilityType,QAcessibilityType> {

  private static final QAcessibilityType _alias = new QAcessibilityType(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QAcessibilityType alias() {
    return _alias;
  }

  public PLong<QAcessibilityType> id;
  public PString<QAcessibilityType> name;
  public PBoolean<QAcessibilityType> another;
  public QAssocMarker<QAcessibilityType> markers;


  /**
   * Construct with a given EbeanServer.
   */
  public QAcessibilityType(EbeanServer server) {
    super(AcessibilityType.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QAcessibilityType() {
    super(AcessibilityType.class);
  }

  /**
   * Construct for Alias.
   */
  private QAcessibilityType(boolean dummy) {
    super(dummy);
  }
}
