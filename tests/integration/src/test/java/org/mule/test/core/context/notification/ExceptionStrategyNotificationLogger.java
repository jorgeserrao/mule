/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.test.core.context.notification;

import org.mule.runtime.core.api.context.notification.ExceptionStrategyNotificationListener;
import org.mule.runtime.core.context.notification.ErrorHandlerNotification;

public class ExceptionStrategyNotificationLogger extends AbstractNotificationLogger<ErrorHandlerNotification>
    implements ExceptionStrategyNotificationListener<ErrorHandlerNotification> {

  @Override
  public boolean isBlocking() {
    return false;
  }
}
