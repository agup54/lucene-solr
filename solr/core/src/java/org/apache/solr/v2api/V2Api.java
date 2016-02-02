package org.apache.solr.v2api;

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


import org.apache.solr.common.util.Lookup;
import org.apache.solr.common.util.Map2;

public abstract class V2Api implements SpecProvider {
  protected Map2 spec;

  protected V2Api(Map2 spec) {
    this.spec = spec;
  }


  public abstract void call(V2RequestContext ctx);

  @Override
  public Map2 getSpec() {
    return spec;
  }

}
