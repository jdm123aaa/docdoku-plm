/*
 * DocDoku, Professional Open Source
 * Copyright 2006 - 2017 DocDoku SARL
 *
 * This file is part of DocDokuPLM.
 *
 * DocDokuPLM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DocDokuPLM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with DocDokuPLM.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.docdoku.server.indexer;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import java.util.Properties;

/**
 * Retrieves Elasticsearch config from custom jndi resource
 *
 * @author Morgan Guimard
 */
@ApplicationScoped
public class IndexerConfigManager {

    @Resource(name = "elasticsearch.config")
    private Properties properties;

    public Integer getNumberOfShards(){
        return Integer.parseInt(properties.getProperty("number_of_shards"));
    }

    public Integer getNumberOfReplicas(){
        return Integer.parseInt(properties.getProperty("number_of_replicas"));
    }

    public String getAutoExpandReplicas(){
        return properties.getProperty("auto_expand_replicas");
    }

    public String getServerUri() {
        return properties.getProperty("serverUri");
    }

    public String getUserName() { return properties.getProperty("username"); }

    public String getPassword() { return properties.getProperty("password"); }

    public String getAWSService() { return properties.getProperty("awsService"); }

    public String getAWSRegion() { return properties.getProperty("awsRegion"); }

    public String getAWSAccessKey() { return properties.getProperty("awsAccessKey"); }

    public String getAWSSecretKey() { return properties.getProperty("awsSecretKey"); }

}