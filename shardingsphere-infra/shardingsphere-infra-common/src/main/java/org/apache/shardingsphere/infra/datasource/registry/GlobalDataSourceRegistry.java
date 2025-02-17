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

package org.apache.shardingsphere.infra.datasource.registry;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.sql.DataSource;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Global data source registry.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
public final class GlobalDataSourceRegistry {
    
    private static final GlobalDataSourceRegistry INSTANCE = new GlobalDataSourceRegistry();
    
    private volatile Map<Instance, DataSource> cachedDataSources = new LinkedHashMap<>();
    
    private volatile Map<String, String> dataSourceSchema = new LinkedHashMap<>();
    
    private volatile boolean dataSourceAggregationEnabled;
    
    /**
     * Get global data source.
     *
     * @return instance of ShardingSphere global data source.
     */
    public static GlobalDataSourceRegistry getInstance() {
        return INSTANCE;
    }
}
