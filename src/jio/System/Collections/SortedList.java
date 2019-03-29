package jio.System.Collections;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Collections.*;
import jio.System.*;

public class SortedList
    implements IDictionary, ICollection, IEnumerable, ICloneable, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IDictionary_GetEnumerator();
  }

  public SortedList() {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(java.lang.Integer initialCapacity) {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList", initialCapacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList", comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(IComparer comparer, java.lang.Integer capacity) {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList", comparer, capacity);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(IDictionary d) {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList", d);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(IDictionary d, IComparer comparer) {
    try {
      javonetHandle = Javonet.New("System.Collections.SortedList", d, comparer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SortedList(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IDictionary")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
