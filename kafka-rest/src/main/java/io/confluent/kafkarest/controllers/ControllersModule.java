/*
 * Copyright 2020 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafkarest.controllers;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

/**
 * A module to install the various controllers required by the application.
 */
public final class ControllersModule extends AbstractBinder {

  protected void configure() {
    bind(ClusterManagerImpl.class).to(ClusterManager.class);
  }
}
