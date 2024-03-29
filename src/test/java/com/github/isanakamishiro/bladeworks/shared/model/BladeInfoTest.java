package com.github.isanakamishiro.bladeworks.shared.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;

import com.github.isanakamishiro.bladeworks.shared.model.BladeInfo;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BladeInfoTest extends AppEngineTestCase {

    private BladeInfo model = new BladeInfo();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
