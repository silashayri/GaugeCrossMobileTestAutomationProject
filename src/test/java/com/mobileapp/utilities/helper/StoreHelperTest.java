package com.mobileapp.utilities.helper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StoreHelperTest {

  @Test
  public void should_store_helper_instance_not_null(){
      StoreHelper storeHelper = StoreHelper.INSTANCE;
      storeHelper.printAllValues();
      Assertions.assertThat(storeHelper).isNotNull();
  }
}