/* **************************************************************************************
 * Copyright (c) 2021 Calypso Networks Association https://www.calypsonet-asso.org/
 *
 * See the NOTICE file(s) distributed with this work for additional information
 * regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ************************************************************************************** */
package org.eclipse.keyple.core.plugin;

/**
 * Indicates that an error occurred while communicating with a reader.
 *
 * @since 2.0
 */
public class ReaderIOException extends RuntimeException {

  /**
   * @param message the message to identify the exception context
   * @since 2.0
   */
  public ReaderIOException(String message) {
    super(message);
  }

  /**
   * @param message the message to identify the exception context
   * @param cause the cause
   * @since 2.0
   */
  public ReaderIOException(String message, Throwable cause) {
    super(message, cause);
  }
}
