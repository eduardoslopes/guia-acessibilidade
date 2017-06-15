package com.acessibilityguide.api.model.finder;

import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.model.query.QGuideUser;
import com.avaje.ebean.Finder;

public class GuideUserFinder extends Finder<Long,GuideUser> {

  /**
   * Construct using the default EbeanServer.
   */
  public GuideUserFinder() {
    super(GuideUser.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public GuideUserFinder(String serverName) {
    super(GuideUser.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QGuideUser where() {
     return new QGuideUser(db());
  }
}
