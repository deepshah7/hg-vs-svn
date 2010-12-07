/*
 * Copyright 2008 the original author or authors.
 *
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
 */
package com.svn.math;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Deep Shah
 */
public class Factorial {

    private int ofValue;

    public Factorial(int ofValue) {
        this.ofValue = ofValue;
    }

    public long value() {
        if(ofValue == 0) return 0;
        if(ofValue == 1) return 1;

        long value=1;
        for(int i=1;i<=ofValue;i++) {
            value *= i;
        }
        return value;
    }

}
