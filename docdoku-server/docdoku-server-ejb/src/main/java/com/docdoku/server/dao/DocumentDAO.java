/*
 * DocDoku, Professional Open Source
 * Copyright 2006 - 2015 DocDoku SARL
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

package com.docdoku.server.dao;

import com.docdoku.core.configuration.PathDataIteration;
import com.docdoku.core.configuration.PathDataMaster;
import com.docdoku.core.configuration.ProductInstanceIteration;
import com.docdoku.core.document.DocumentIteration;
import com.docdoku.core.document.DocumentLink;
import com.docdoku.core.product.PartIteration;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DocumentDAO {
    private static final Logger LOGGER = Logger.getLogger(DocumentDAO.class.getName());

    private final EntityManager em;

    public DocumentDAO(EntityManager pEM) {
        em=pEM;
    }

    public void updateDoc(DocumentIteration pDoc){
        em.merge(pDoc);
    }

    public void removeDoc(DocumentIteration pDoc){
        em.remove(pDoc);
    }
}