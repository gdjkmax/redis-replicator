/*
 * Copyright 2016-2018 Leon Chen
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

package com.moilioncircle.redis.replicator.rdb.datatype;

/**
 * @author Leon Chen
 * @since 3.0.0
 */
public class ContextKeyValuePair extends KeyValuePair<Void, Void> {

    public <K, V> KeyValuePair<K, V> valueOf(KeyValuePair<K, V> kv) {
        kv.setDb(this.getDb());
        kv.setEvictType(this.getEvictType());
        kv.setEvictValue(this.getEvictValue());
        kv.setExpiredType(this.getExpiredType());
        kv.setExpiredValue(this.getExpiredValue());
        return kv;
    }
}
