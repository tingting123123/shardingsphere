/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.mode.manager.cluster.governance.registry.cache.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Start scaling event.
 */
@RequiredArgsConstructor
@Getter
public final class StartScalingEvent {
    
    private final String schemaName;
    
    private final String sourceDataSource;
    
    private final String sourceRule;
    
    private final String targetDataSource;
    
    private final String targetRule;
    
    private final String ruleCacheId;
    
    public StartScalingEvent(final String schemaName, final String sourceDataSource, final String sourceRule, final String targetRule, final String ruleCacheId) {
        this(schemaName, sourceDataSource, sourceRule, sourceDataSource, targetRule, ruleCacheId);
    }
}