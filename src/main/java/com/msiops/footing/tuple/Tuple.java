/**
 * Licensed to Media Science International (MSI) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. MSI
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.msiops.footing.tuple;

public interface Tuple {

    static <T1, T2, T3> Tuple3<T1, T2, T3> of(final T1 t1, final T2 t2,
            final T3 t3) {
        return new Tuple3<>(t1, t2, t3);
    }

    static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(final T1 t1,
            final T2 t2, final T3 t3, final T4 t4, final T5 t5) {
        return new Tuple5<>(t1, t2, t3, t4, t5);
    }

}
