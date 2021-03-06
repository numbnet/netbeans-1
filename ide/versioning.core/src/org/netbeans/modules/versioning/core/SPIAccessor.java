/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.versioning.core;

import org.netbeans.modules.versioning.core.spi.VCSContext;

import java.util.*;
import org.netbeans.modules.versioning.core.api.VCSFileProxy;
import org.netbeans.modules.versioning.core.spi.VCSHistoryProvider;
import org.netbeans.modules.versioning.core.spi.VCSHistoryProvider.HistoryEntry;
import org.openide.filesystems.FileObject;

/**
 * Make it possible to hide contructors and factory methods in VCSContext.
 * 
 * @author Maros Sandor
 */
public abstract class SPIAccessor {
    
    public static SPIAccessor IMPL;
        
    public abstract VCSContext createContextForFiles(Set<VCSFileProxy> files, Set<? extends FileObject> originalFiles);
    
    public abstract Object[] getLookupObjects(VCSHistoryProvider.HistoryEntry entry);

    public abstract void setLookupObjects(HistoryEntry entry, Object[] lookupObjects);

    public abstract void flushCachedContext ();
}
