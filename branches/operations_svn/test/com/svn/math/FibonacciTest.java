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

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Deep Shah
 */
public class FibonacciTest {

    @Test
    public void shouldFindFibonacciValueOfZero() {
        assertEquals(0, new Fibonacci(0).value());
    }

    @Test
    public void shouldFindFibonacciValueOfOne() {
        assertEquals(1, new Fibonacci(1).value());
    }
}
