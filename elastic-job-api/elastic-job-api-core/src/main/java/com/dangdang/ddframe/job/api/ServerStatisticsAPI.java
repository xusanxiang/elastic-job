/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package com.dangdang.ddframe.job.api;

import com.dangdang.ddframe.job.domain.ServerInfo;
import com.dangdang.ddframe.job.domain.ServerBriefInfo;

import java.util.Collection;

/**
 * 作业服务器状态展示的API.
 *
 * @author zhangliang
 */
public interface ServerStatisticsAPI {
    
    /**
     * 获取所有作业服务器简明信息.
     *
     * @return 作业服务器简明信息集合
     */
    Collection<ServerBriefInfo> getAllServersBriefInfo();
    
    /**
     * 获取作业服务器部署的作业.
     *
     * @param serverIp 作业服务器IP
     * @return 作业服务器部署的作业
     */
    Collection<ServerInfo> getJobs(String serverIp);
}
