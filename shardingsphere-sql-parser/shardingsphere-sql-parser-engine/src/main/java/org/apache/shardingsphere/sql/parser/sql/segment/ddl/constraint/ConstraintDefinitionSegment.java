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

package org.apache.shardingsphere.sql.parser.sql.segment.ddl.constraint;

import com.google.common.base.Optional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.shardingsphere.sql.parser.sql.segment.ddl.CreateDefinitionSegment;
import org.apache.shardingsphere.sql.parser.sql.segment.dml.column.ColumnSegment;
import org.apache.shardingsphere.sql.parser.sql.segment.generic.TableSegment;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Constraint definition segment.
 */
@RequiredArgsConstructor
@Getter
@Setter
public final class ConstraintDefinitionSegment implements CreateDefinitionSegment {
    
    private final int startIndex;
    
    private final int stopIndex;
    
    private final Collection<ColumnSegment> primaryKeyColumns = new LinkedList<>();
    
    private TableSegment referencedTable;
    
    /**
     * Get referenced table.
     * 
     * @return referenced table
     */
    public Optional<TableSegment> getReferencedTable() {
        return Optional.fromNullable(referencedTable);
    }
}
