/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtend2.lib;

import com.google.common.annotations.GwtCompatible;
/*
 * Will be replaced with \n on GWT 
 */
@GwtCompatible(emulated = true)
class DefaultLineDelimiter {
	public static String get() {
		return System.getProperty("line.separator");
	}
}
