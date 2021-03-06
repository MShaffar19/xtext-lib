/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.xbase.lib.internal;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Predicate;

/**
 * Internal wrapper to look like a google.collect predicate
 * 
 * @param <T>
 *            the type of the objects that can be used by this predicate.
 */
@GwtCompatible public class BooleanFunctionDelegate<T> implements Predicate<T> {

	private final Function1<? super T, Boolean> delegate;

	/**
	 * Creates a new {@link BooleanFunctionDelegate} that wraps the given delegate function. This implementation will
	 * throw a {@link NullPointerException} if the delegate's {@link Function1#apply(Object) implementation} returns
	 * <code>null</code> for a given object.
	 * 
	 * @param delegate
	 *            the delegate function. May not be <code>null</code>.
	 */
	public BooleanFunctionDelegate(Function1<? super T, Boolean> delegate) {
		if (delegate == null)
			throw new NullPointerException("delegate");
		this.delegate = delegate;
	}

	@Override
	public boolean apply(T input) {
		Boolean result = delegate.apply(input);
		return result.booleanValue();
	}

}