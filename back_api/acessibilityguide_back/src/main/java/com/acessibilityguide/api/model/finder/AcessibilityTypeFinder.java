package com.acessibilityguide.api.model.finder;

import com.acessibilityguide.api.model.AcessibilityType;
import com.acessibilityguide.api.model.query.QAcessibilityType;
import com.avaje.ebean.Finder;

public class AcessibilityTypeFinder extends Finder<Long,AcessibilityType> {

  /**
   * Construct using the default EbeanServer.
   */
  public AcessibilityTypeFinder() {
    super(AcessibilityType.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public AcessibilityTypeFinder(String serverName) {
    super(AcessibilityType.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QAcessibilityType where() {
     return new QAcessibilityType(db());
  }
}
