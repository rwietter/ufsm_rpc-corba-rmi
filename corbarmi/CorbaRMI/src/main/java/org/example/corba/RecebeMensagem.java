package org.example.corba;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

class RecebeMensagem extends IServidorCorbaPOA implements Object {
    int i = 0;

    public void envia(boolean msg){
        i++;
        if(i==100) {
            System.out.println(i);
        }
    }

  /**
   * @param object 
   * @return
   */
  public boolean _is_equivalent(Object object) {
    return false;
  }

  /**
   * @param i 
   * @return
   */
  public int _hash(int i) {
    return 0;
  }

  /**
   * @return 
   */
  public Object _duplicate() {
    return null;
  }

  /**
   * 
   */
  public void _release() {

  }

  /**
   * @param s 
   * @return
   */
  public Request _request(String s) {
    return null;
  }

  /**
   * @param context 
   * @param s
   * @param nvList
   * @param namedValue
   * @return
   */
  public Request _create_request(Context context, String s, NVList nvList, NamedValue namedValue) {
    return null;
  }

  /**
   * @param context 
   * @param s
   * @param nvList
   * @param namedValue
   * @param exceptionList
   * @param contextList
   * @return
   */
  public Request _create_request(Context context, String s, NVList nvList, NamedValue namedValue, ExceptionList exceptionList, ContextList contextList) {
    return null;
  }

  /**
   * @param i 
   * @return
   */
  public Policy _get_policy(int i) {
    return null;
  }

  /**
   * @return 
   */
  public DomainManager[] _get_domain_managers() {
    return new DomainManager[0];
  }

  /**
   * @param policies 
   * @param setOverrideType
   * @return
   */
  public Object _set_policy_override(Policy[] policies, SetOverrideType setOverrideType) {
    return null;
  }
}