/*
 * Copyright (c) 2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.registry.core.interfaces;

import java.net.URL;

public interface IRegistryConnection {
	public String getUsername();
	public String getPassword();
	public String getPath();
	public URL getURL();
	public void setUsername(String username);
	public void setPassword(String password);
	public void setPath(String path);
	public void setURL(URL url);
	public void setMediaType(String mediaType);
	public String getId();
	public void setId(String id);
	public void setConnectionName(String connectionName);
	public String getConnectionName();
	public String getCaption();
	public String getMediaType();
}
