/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This package contains a filtering engine for a collection of 
 * {@link net.shibboleth.idp.attribute.IdPAttribute}s. An 
 * {@link net.shibboleth.idp.attribute.filter.context.AttributeFilterContext} is passed 
 * through one or more {@link net.shibboleth.idp.attribute.filter.AttributeFilterPolicy} 
 * objects which retain or remove values for the attributes in the 
 * collection.
 */

package net.shibboleth.idp.attribute.filter;

