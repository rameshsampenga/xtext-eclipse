/*******************************************************************************
 * Copyright (c) 2016 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.wizard;

import org.eclipse.core.runtime.IPath;

/**
 * This extended interface also contains the root location where the project must be created.
 * 
 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=338419
 * 
 * @author Lorenzo Bettini - Initial contribution and API
 * @since 2.10
 */
public interface IExtendedProjectInfo extends IProjectInfo {

	/**
	 * @return The path where the project should be created.
	 */
	IPath getLocationPath();

	/**
	 * Sets the path where the project should be created.
	 */
	void setLocationPath(IPath locationPath);
}
