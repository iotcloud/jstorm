/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.jstorm.daemon.supervisor;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.jstorm.daemon.worker.State;
import com.alibaba.jstorm.daemon.worker.WorkerHeartbeat;

/**
 * Worker's state and Hearbeat
 * 
 * @author Xin.Zhou
 */
public class StateHeartbeat {
    private State state;
    private WorkerHeartbeat hb;

    public StateHeartbeat(State state, WorkerHeartbeat hb) {
        this.state = state;
        this.hb = hb;
    }

    public State getState() {
        return this.state;
    }

    public WorkerHeartbeat getHeartbeat() {
        return this.hb;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
