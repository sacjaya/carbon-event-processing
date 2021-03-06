/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.event.execution.manager.core.internal.util;

import org.wso2.carbon.utils.CarbonUtils;

import java.io.File;

/**
 * Consist of the constants required for EventManagerService
 */
public class ExecutionManagerConstants {

    private ExecutionManagerConstants() {

    }

    public static final String TEMPLATE_DOMAIN_PATH = CarbonUtils.getCarbonConfigDirPath()
            + File.separator + "cep" + File.separator + "domain-template";

    public static final String TEMPLATE_CONFIG_PATH = ExecutionManagerConstants.PATH_SEPARATOR + "repository"
            + ExecutionManagerConstants.PATH_SEPARATOR + "components"
            + ExecutionManagerConstants.PATH_SEPARATOR + "org.wso2.carbon.event.execution.manager.core"
            + ExecutionManagerConstants.PATH_SEPARATOR + "template-config";

    public static final String PATH_SEPARATOR = "/";

    public static final String CONFIG_NAME_SEPARATOR = "-";

    public static final String CONFIG_FILE_EXTENSION = ".xml";

    public static final String DEFAULT_CHARSET = "UTF-8";
}
