/*
 * Copyright (c) 2016 Aberger Software GmbH. All Rights Reserved.
 *               http://www.aberger.at
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.example.jerseyguice.dao;

import java.util.List;

import com.example.jerseyguice.model.User;
/** A DataAccessObject has the responsibility to do all SQL for us.
 */
public interface DataAccessObject<T extends Object> {
    T findById(int id);
    List<T> listAll();
	User add(User user);
	void delete(User user);
	boolean update(User user);
}