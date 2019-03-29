package jio.System.Threading;

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
import jio.System.Runtime.ConstrainedExecution.*;
import jio.System.Threading.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.*;

public class Thread extends CriticalFinalizerObject implements _Thread {
  protected NObject javonetHandle;

  public Thread(ThreadStart start) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Threading.Thread", start);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Thread(ThreadStart start, java.lang.Integer maxStackSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Threading.Thread", start, maxStackSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Thread(ParameterizedThreadStart start) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Threading.Thread", start);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Thread(ParameterizedThreadStart start, java.lang.Integer maxStackSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Threading.Thread", start, maxStackSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Thread(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTypeInfoCount(AtomicReference<java.lang.Long> pcTInfo) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._Thread")
          .invoke(
              "GetTypeInfoCount",
              new NOut(pcTInfo, JavonetHelper.JavaToDotnetType.get(java.lang.Long.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetTypeInfo(java.lang.Long iTInfo, java.lang.Long lcid, IntPtr ppTInfo) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._Thread")
          .invoke("GetTypeInfo", iTInfo, lcid, ppTInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void GetIDsOfNames(
      Guid riid, IntPtr rgszNames, java.lang.Long cNames, java.lang.Long lcid, IntPtr rgDispId) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._Thread")
          .invoke("GetIDsOfNames", riid, rgszNames, cNames, lcid, rgDispId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Invoke(
      java.lang.Long dispIdMember,
      Guid riid,
      java.lang.Long lcid,
      java.lang.Short wFlags,
      IntPtr pDispParams,
      IntPtr pVarResult,
      IntPtr pExcepInfo,
      IntPtr puArgErr) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.InteropServices._Thread")
          .invoke(
              "Invoke",
              dispIdMember,
              riid,
              lcid,
              wFlags,
              pDispParams,
              pVarResult,
              pExcepInfo,
              puArgErr);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
