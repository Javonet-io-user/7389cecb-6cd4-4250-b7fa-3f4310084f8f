package PacketHandler;

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
import PacketHandler.*;
import jio.System.Threading.*;
import jio.System.Text.*;
import jio.System.Collections.*;
import jio.System.*;

public class clsPacketHandler {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getVersion() {
    try {
      java.lang.String res = javonetHandle.get("Version");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setVersion(java.lang.String param) {
    try {
      javonetHandle.set("Version", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Threading.Thread getPacketParserThread() {
    try {
      Object res = javonetHandle.<NObject>get("PacketParserThread");
      if (res == null) return null;
      return new jio.System.Threading.Thread((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setPacketParserThread(jio.System.Threading.Thread param) {
    try {
      javonetHandle.set("PacketParserThread", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getisSmallNumberingPlan() {
    try {
      java.lang.Boolean res = javonetHandle.get("isSmallNumberingPlan");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setisSmallNumberingPlan(java.lang.Boolean param) {
    try {
      javonetHandle.set("isSmallNumberingPlan", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public cls.PBXType getCurrentPBXType() {
    try {
      Object res = javonetHandle.<NEnum>get("CurrentPBXType");
      if (res == null) return null;
      return cls.PBXType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setCurrentPBXType(cls.PBXType param) {
    try {
      javonetHandle.set("CurrentPBXType", NEnum.fromJavaEnum(param));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Text.StringBuilder getSwitchResponseString() {
    try {
      Object res = javonetHandle.<NObject>get("SwitchResponseString");
      if (res == null) return null;
      return new jio.System.Text.StringBuilder((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setSwitchResponseString(jio.System.Text.StringBuilder param) {
    try {
      javonetHandle.set("SwitchResponseString", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.ArrayList getalPacketsToBeHandled() {
    try {
      Object res = javonetHandle.<NObject>get("alPacketsToBeHandled");
      if (res == null) return null;
      return new jio.System.Collections.ArrayList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setalPacketsToBeHandled(jio.System.Collections.ArrayList param) {
    try {
      javonetHandle.set("alPacketsToBeHandled", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncludeCallIDFor_R_Packet() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncludeCallIDFor_R_Packet");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncludeCallIDFor_R_Packet(java.lang.Boolean param) {
    try {
      javonetHandle.set("IncludeCallIDFor_R_Packet", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrNOSOB() {
    try {
      java.lang.Integer res = javonetHandle.get("errNOSOB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrNOSOB(java.lang.Integer param) {
    try {
      javonetHandle.set("errNOSOB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrNOEOB() {
    try {
      java.lang.Integer res = javonetHandle.get("errNOEOB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrNOEOB(java.lang.Integer param) {
    try {
      javonetHandle.set("errNOEOB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrNOEOBSOB() {
    try {
      java.lang.Integer res = javonetHandle.get("errNOEOBSOB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrNOEOBSOB(java.lang.Integer param) {
    try {
      javonetHandle.set("errNOEOBSOB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT1BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT1BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT1BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT1BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT2BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT2BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT2BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT2BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT3BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT3BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT3BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT3BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT4BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT4BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT4BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT4BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT5BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT5BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT5BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT5BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT6BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT6BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT6BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT6BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT7BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT7BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT7BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT7BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT8BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT8BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT8BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT8BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKT9BADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKT9BADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKT9BADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKT9BADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKTLBADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKTLBADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKTLBADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKTLBADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrPAKTCBADPORT() {
    try {
      java.lang.Integer res = javonetHandle.get("errPAKTCBADPORT");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrPAKTCBADPORT(java.lang.Integer param) {
    try {
      javonetHandle.set("errPAKTCBADPORT", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer geterrRPTSOB() {
    try {
      java.lang.Integer res = javonetHandle.get("errRPTSOB");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void seterrRPTSOB(java.lang.Integer param) {
    try {
      javonetHandle.set("errRPTSOB", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getEnablePktProcessForVL() {
    try {
      java.lang.Boolean res = javonetHandle.get("EnablePktProcessForVL");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setEnablePktProcessForVL(java.lang.Boolean param) {
    try {
      javonetHandle.set("EnablePktProcessForVL", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList getslTrunkMaster() {
    try {
      Object res = javonetHandle.<NObject>get("slTrunkMaster");
      if (res == null) return null;
      return new SortedList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setslTrunkMaster(SortedList param) {
    try {
      javonetHandle.set("slTrunkMaster", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public SortedList getslExtMaster() {
    try {
      Object res = javonetHandle.<NObject>get("slExtMaster");
      if (res == null) return null;
      return new SortedList((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setslExtMaster(SortedList param) {
    try {
      javonetHandle.set("slExtMaster", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public clsPacketHandler(java.lang.String Passwd) {
    try {
      javonetHandle = Javonet.New("PacketHandler.clsPacketHandler", Passwd);
      javonetHandle.addEventListener(
          "Evt_Packet_Zero_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Zero_ReceivedEventHandler handler :
                  _Evt_Packet_Zero_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_0.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_1_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_1_ReceivedEventHandler handler :
                  _Evt_Packet_1_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_1.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_2_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_2_ReceivedEventHandler handler :
                  _Evt_Packet_2_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_2.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_3_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_3_ReceivedEventHandler handler :
                  _Evt_Packet_3_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_3.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_4_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_4_ReceivedEventHandler handler :
                  _Evt_Packet_4_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_4.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_5_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_5_ReceivedEventHandler handler :
                  _Evt_Packet_5_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_5.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_6_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_6_ReceivedEventHandler handler :
                  _Evt_Packet_6_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_6.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_7_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_7_ReceivedEventHandler handler :
                  _Evt_Packet_7_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_7.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_G_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_G_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_G_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_upper_G.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_E_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_E_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_E_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_Upper_E.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Pipe_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Pipe_ReceivedEventHandler handler :
                  _Evt_Packet_Pipe_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_Pipe.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_M_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_M_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_M_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_Upper_M.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Lower_c_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Lower_c_ReceivedEventHandler handler :
                  _Evt_Packet_Lower_c_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], ACD_Pkt_Lower_c.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Error_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Error_ReceivedEventHandler handler : _Evt_Error_ReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], jio.System.Exception.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Error_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Error_ReceivedEventHandler handler :
                  _Evt_Packet_Error_ReceivedListeners) {
                handler.Invoke(
                    Convert(objects[0], java.lang.String.class),
                    Convert(objects[1], jio.System.Exception.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_Y_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_Y_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_Y_ReceivedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_small_a_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_small_a_ReceivedEventHandler handler :
                  _Evt_Packet_small_a_ReceivedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_small_g_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_small_g_ReceivedEventHandler handler :
                  _Evt_Packet_small_g_ReceivedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_WrongPassword",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_WrongPasswordEventHandler handler : _Evt_WrongPasswordListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_R_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_R_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_R_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], AMS_Pkt_R.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_T_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_T_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_T_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], AMS_Pkt_T.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_S_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_S_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_S_ReceivedListeners) {
                handler.Invoke(Convert(objects[0], AMS_Pkt_S.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "HealthOK",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.HealthOKEventHandler handler : _HealthOKListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Evt_Packet_Upper_H_Received",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Evt_Packet_Upper_H_ReceivedEventHandler handler :
                  _Evt_Packet_Upper_H_ReceivedListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "Send_P_PacketToSwitch",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.Send_P_PacketToSwitchEventHandler handler :
                  _Send_P_PacketToSwitchListeners) {
                handler.Invoke();
              }
            }
          });
      javonetHandle.addEventListener(
          "ChangeTmrHealth_Interval",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (cls.ChangeTmrHealth_IntervalEventHandler handler :
                  _ChangeTmrHealth_IntervalListeners) {
                handler.Invoke(Convert(objects[0], java.lang.Integer.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public clsPacketHandler(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Shutdown() {
    try {
      javonetHandle.invoke("Shutdown");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void StopProcessingPacketServer() {
    try {
      javonetHandle.invoke("StopProcessingPacketServer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static cls.mvStates getStateCategory(java.lang.Integer mvState) {
    try {
      Object res =
          Javonet.getType("PacketHandler.clsPacketHandler").invoke("getStateCategory", mvState);
      if (res == null) return null;
      return cls.mvStates.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String getStateInText(cls.mvStates mvState) {
    try {
      java.lang.String res =
          Javonet.getType("PacketHandler.clsPacketHandler")
              .invoke("getStateInText", NEnum.fromJavaEnum(mvState));
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String getPBXExtStateText(java.lang.Integer mvState) {
    try {
      java.lang.String res =
          Javonet.getType("PacketHandler.clsPacketHandler").invoke("getPBXExtStateText", mvState);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Zero_ReceivedEventHandler>
      _Evt_Packet_Zero_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Zero_ReceivedEventHandler>();

  public void addEvt_Packet_Zero_Received(cls.Evt_Packet_Zero_ReceivedEventHandler toAdd) {
    _Evt_Packet_Zero_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Zero_Received(cls.Evt_Packet_Zero_ReceivedEventHandler toRemove) {
    _Evt_Packet_Zero_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_1_ReceivedEventHandler>
      _Evt_Packet_1_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_1_ReceivedEventHandler>();

  public void addEvt_Packet_1_Received(cls.Evt_Packet_1_ReceivedEventHandler toAdd) {
    _Evt_Packet_1_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_1_Received(cls.Evt_Packet_1_ReceivedEventHandler toRemove) {
    _Evt_Packet_1_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_2_ReceivedEventHandler>
      _Evt_Packet_2_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_2_ReceivedEventHandler>();

  public void addEvt_Packet_2_Received(cls.Evt_Packet_2_ReceivedEventHandler toAdd) {
    _Evt_Packet_2_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_2_Received(cls.Evt_Packet_2_ReceivedEventHandler toRemove) {
    _Evt_Packet_2_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_3_ReceivedEventHandler>
      _Evt_Packet_3_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_3_ReceivedEventHandler>();

  public void addEvt_Packet_3_Received(cls.Evt_Packet_3_ReceivedEventHandler toAdd) {
    _Evt_Packet_3_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_3_Received(cls.Evt_Packet_3_ReceivedEventHandler toRemove) {
    _Evt_Packet_3_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_4_ReceivedEventHandler>
      _Evt_Packet_4_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_4_ReceivedEventHandler>();

  public void addEvt_Packet_4_Received(cls.Evt_Packet_4_ReceivedEventHandler toAdd) {
    _Evt_Packet_4_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_4_Received(cls.Evt_Packet_4_ReceivedEventHandler toRemove) {
    _Evt_Packet_4_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_5_ReceivedEventHandler>
      _Evt_Packet_5_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_5_ReceivedEventHandler>();

  public void addEvt_Packet_5_Received(cls.Evt_Packet_5_ReceivedEventHandler toAdd) {
    _Evt_Packet_5_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_5_Received(cls.Evt_Packet_5_ReceivedEventHandler toRemove) {
    _Evt_Packet_5_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_6_ReceivedEventHandler>
      _Evt_Packet_6_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_6_ReceivedEventHandler>();

  public void addEvt_Packet_6_Received(cls.Evt_Packet_6_ReceivedEventHandler toAdd) {
    _Evt_Packet_6_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_6_Received(cls.Evt_Packet_6_ReceivedEventHandler toRemove) {
    _Evt_Packet_6_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_7_ReceivedEventHandler>
      _Evt_Packet_7_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_7_ReceivedEventHandler>();

  public void addEvt_Packet_7_Received(cls.Evt_Packet_7_ReceivedEventHandler toAdd) {
    _Evt_Packet_7_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_7_Received(cls.Evt_Packet_7_ReceivedEventHandler toRemove) {
    _Evt_Packet_7_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_G_ReceivedEventHandler>
      _Evt_Packet_Upper_G_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_G_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_G_Received(cls.Evt_Packet_Upper_G_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_G_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_G_Received(
      cls.Evt_Packet_Upper_G_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_G_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_E_ReceivedEventHandler>
      _Evt_Packet_Upper_E_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_E_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_E_Received(cls.Evt_Packet_Upper_E_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_E_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_E_Received(
      cls.Evt_Packet_Upper_E_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_E_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Pipe_ReceivedEventHandler>
      _Evt_Packet_Pipe_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Pipe_ReceivedEventHandler>();

  public void addEvt_Packet_Pipe_Received(cls.Evt_Packet_Pipe_ReceivedEventHandler toAdd) {
    _Evt_Packet_Pipe_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Pipe_Received(cls.Evt_Packet_Pipe_ReceivedEventHandler toRemove) {
    _Evt_Packet_Pipe_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_M_ReceivedEventHandler>
      _Evt_Packet_Upper_M_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_M_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_M_Received(cls.Evt_Packet_Upper_M_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_M_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_M_Received(
      cls.Evt_Packet_Upper_M_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_M_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Lower_c_ReceivedEventHandler>
      _Evt_Packet_Lower_c_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Lower_c_ReceivedEventHandler>();

  public void addEvt_Packet_Lower_c_Received(cls.Evt_Packet_Lower_c_ReceivedEventHandler toAdd) {
    _Evt_Packet_Lower_c_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Lower_c_Received(
      cls.Evt_Packet_Lower_c_ReceivedEventHandler toRemove) {
    _Evt_Packet_Lower_c_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Error_ReceivedEventHandler> _Evt_Error_ReceivedListeners =
      new java.util.ArrayList<cls.Evt_Error_ReceivedEventHandler>();

  public void addEvt_Error_Received(cls.Evt_Error_ReceivedEventHandler toAdd) {
    _Evt_Error_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Error_Received(cls.Evt_Error_ReceivedEventHandler toRemove) {
    _Evt_Error_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Error_ReceivedEventHandler>
      _Evt_Packet_Error_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Error_ReceivedEventHandler>();

  public void addEvt_Packet_Error_Received(cls.Evt_Packet_Error_ReceivedEventHandler toAdd) {
    _Evt_Packet_Error_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Error_Received(cls.Evt_Packet_Error_ReceivedEventHandler toRemove) {
    _Evt_Packet_Error_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_Y_ReceivedEventHandler>
      _Evt_Packet_Upper_Y_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_Y_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_Y_Received(cls.Evt_Packet_Upper_Y_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_Y_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_Y_Received(
      cls.Evt_Packet_Upper_Y_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_Y_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_small_a_ReceivedEventHandler>
      _Evt_Packet_small_a_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_small_a_ReceivedEventHandler>();

  public void addEvt_Packet_small_a_Received(cls.Evt_Packet_small_a_ReceivedEventHandler toAdd) {
    _Evt_Packet_small_a_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_small_a_Received(
      cls.Evt_Packet_small_a_ReceivedEventHandler toRemove) {
    _Evt_Packet_small_a_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_small_g_ReceivedEventHandler>
      _Evt_Packet_small_g_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_small_g_ReceivedEventHandler>();

  public void addEvt_Packet_small_g_Received(cls.Evt_Packet_small_g_ReceivedEventHandler toAdd) {
    _Evt_Packet_small_g_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_small_g_Received(
      cls.Evt_Packet_small_g_ReceivedEventHandler toRemove) {
    _Evt_Packet_small_g_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_WrongPasswordEventHandler> _Evt_WrongPasswordListeners =
      new java.util.ArrayList<cls.Evt_WrongPasswordEventHandler>();

  public void addEvt_WrongPassword(cls.Evt_WrongPasswordEventHandler toAdd) {
    _Evt_WrongPasswordListeners.add(toAdd);
  }

  public void removeEvt_WrongPassword(cls.Evt_WrongPasswordEventHandler toRemove) {
    _Evt_WrongPasswordListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_R_ReceivedEventHandler>
      _Evt_Packet_Upper_R_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_R_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_R_Received(cls.Evt_Packet_Upper_R_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_R_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_R_Received(
      cls.Evt_Packet_Upper_R_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_R_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_T_ReceivedEventHandler>
      _Evt_Packet_Upper_T_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_T_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_T_Received(cls.Evt_Packet_Upper_T_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_T_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_T_Received(
      cls.Evt_Packet_Upper_T_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_T_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_S_ReceivedEventHandler>
      _Evt_Packet_Upper_S_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_S_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_S_Received(cls.Evt_Packet_Upper_S_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_S_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_S_Received(
      cls.Evt_Packet_Upper_S_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_S_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.HealthOKEventHandler> _HealthOKListeners =
      new java.util.ArrayList<cls.HealthOKEventHandler>();

  public void addHealthOK(cls.HealthOKEventHandler toAdd) {
    _HealthOKListeners.add(toAdd);
  }

  public void removeHealthOK(cls.HealthOKEventHandler toRemove) {
    _HealthOKListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Evt_Packet_Upper_H_ReceivedEventHandler>
      _Evt_Packet_Upper_H_ReceivedListeners =
          new java.util.ArrayList<cls.Evt_Packet_Upper_H_ReceivedEventHandler>();

  public void addEvt_Packet_Upper_H_Received(cls.Evt_Packet_Upper_H_ReceivedEventHandler toAdd) {
    _Evt_Packet_Upper_H_ReceivedListeners.add(toAdd);
  }

  public void removeEvt_Packet_Upper_H_Received(
      cls.Evt_Packet_Upper_H_ReceivedEventHandler toRemove) {
    _Evt_Packet_Upper_H_ReceivedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.Send_P_PacketToSwitchEventHandler>
      _Send_P_PacketToSwitchListeners =
          new java.util.ArrayList<cls.Send_P_PacketToSwitchEventHandler>();

  public void addSend_P_PacketToSwitch(cls.Send_P_PacketToSwitchEventHandler toAdd) {
    _Send_P_PacketToSwitchListeners.add(toAdd);
  }

  public void removeSend_P_PacketToSwitch(cls.Send_P_PacketToSwitchEventHandler toRemove) {
    _Send_P_PacketToSwitchListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<cls.ChangeTmrHealth_IntervalEventHandler>
      _ChangeTmrHealth_IntervalListeners =
          new java.util.ArrayList<cls.ChangeTmrHealth_IntervalEventHandler>();

  public void addChangeTmrHealth_Interval(cls.ChangeTmrHealth_IntervalEventHandler toAdd) {
    _ChangeTmrHealth_IntervalListeners.add(toAdd);
  }

  public void removeChangeTmrHealth_Interval(cls.ChangeTmrHealth_IntervalEventHandler toRemove) {
    _ChangeTmrHealth_IntervalListeners.remove(toRemove);
  }

  public enum PBXType {
    IRIS(0L),
    IRIS_Plus(1L),
    DX_2000(2L),
    IRIS_Lite(3L),
    NGX(4L),
    ;
    private long numVal;

    PBXType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum q_pkt_ReasonCodes {
    CallDial(1L),
    Ring(2L),
    Talk(3L),
    Flash(5L),
    Release(6L),
    OffHook(7L),
    SuspectOffHook(8L),
    DevState(9L),
    DevLoginLogout(10L),
    AgLogin(11L),
    AgLogout(12L),
    AgBreak(13L),
    AgSelectiveLogin(14L),
    CallTransfer(15L),
    OffHookForDial(16L),
    SuspectOffHookForDial(17L),
    FlashForTransfer(19L),
    bargingStart(20L),
    IntrusionStart(21L),
    CoachingStart(22L),
    FlashForConferenceConnect(23L),
    FlashBeforeConference(24L),
    TrunkPick(25L),
    CallDialBeforeConf(26L),
    FlashRetrieve(27L),
    WRing(28L),
    ;
    private long numVal;

    q_pkt_ReasonCodes(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum PacketType {
    Packet_Zero(0L),
    Packet_One(1L),
    Packet_Two(2L),
    Packet_Three(3L),
    Packet_Four(4L),
    Packet_Five(5L),
    Packet_Six(6L),
    Packet_Seven(7L),
    Packet_a(8L),
    Packet_Health(9L),
    Packet_M(10L),
    Packet_L(11L),
    Packet_Upper_C(12L),
    Packet_Y(13L),
    Packet_Lower_c(14L),
    Packet_R(17L),
    Packet_S(18L),
    Packet_CRM(19L),
    Packet_Error(20L),
    Packet_G(21L),
    Packet_Pipe(22L),
    Packet_Upper_H(23L),
    Packet_T(24L),
    ;
    private long numVal;

    PacketType(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum PacketLen {
    Pkt_Seven_Len(3L),
    Pkt_Seven_Len_32(5L),
    Pkt_Three_Len(6L),
    Packet_Error_Len(7L),
    Pkt_Five_Len_32(8L),
    Pkt_S_Len_32(9L),
    Pkt_Three_Len_Large(10L),
    Packet_Error_Len_32(11L),
    Pkt_Six_Len_32(13L),
    Pkt_Two_Len_Large(15L),
    Pkt_Two_Len_32(17L),
    Pkt_M_Len(18L),
    Packet_Pipe_Len(21L),
    Pkt_Pipe_Len_Large(25L),
    Pkt_Nine_Len_Large(27L),
    Pkt_Zero_Len(30L),
    Pkt_Zero_Len_32(33L),
    Pkt_OutgoingCall_Len(65L),
    Pkt_T_Len(67L),
    Pkt_OutgoingCall_Len_Large(77L),
    Packet_CRM_Len(88L),
    Pkt_R_Len(92L),
    ;
    private long numVal;

    PacketLen(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public enum mvStates {
    idle(0L),
    Wrap(1L),
    Que(2L),
    Ring(3L),
    ACD(4L),
    Hold(5L),
    Rels(6L),
    busy(7L),
    InCall(8L),
    OutCall(9L),
    Talk(10L),
    NACD(11L),
    Calling(12L),
    busyhold(13L),
    INC(14L),
    GC_Idle(1000L),
    GC_Disconnect(1001L),
    GC_Blocked(1002L),
    GC_UnBlocked(1003L),
    GC_Hold(1004L),
    GC_Dialing(1005L),
    GC_Talk(1006L),
    SIP_IncCall(1007L),
    GC_Error(1008L),
    GC_ErrRecovered(1009L),
    GC_Busy(1010L),
    GC_Suspect(1011L),
    GC_DialTone(1012L),
    SIP_Idle(2000L),
    SIP_Disconnect(2001L),
    SIP_Blocked(2002L),
    SIP_UnBlocked(2003L),
    SIP_Hold(2004L),
    SIP_Dialing(2005L),
    SIP_Talk(2006L),
    SIP_Error(2008L),
    SIP_ErrRecovered(2009L),
    SIP_Busy(2010L),
    SIP_Suspect(2011L),
    SIP_DialTone(2012L),
    SIP_RegsFail(2013L),
    LineDoesNotExist(3001L),
    CSTA_NotDefined(3002L),
    ;
    private long numVal;

    mvStates(long numVal) {
      this.numVal = numVal;
    }

    public long getNumVal() {
      return numVal;
    }
  }

  public static class ACD_Pkt_Upper_M extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_Version() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_Version");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_Version(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_Version", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Upper_M(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_0 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCallerPort() {
      try {
        java.lang.String res = javonetHandle.get("CallerPort");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCallerPort(java.lang.String param) {
      try {
        javonetHandle.set("CallerPort", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_Status() {
      try {
        java.lang.String res = javonetHandle.get("Call_Status");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_Status(java.lang.String param) {
      try {
        javonetHandle.set("Call_Status", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_CLI() {
      try {
        java.lang.String res = javonetHandle.get("Call_CLI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_CLI(java.lang.String param) {
      try {
        javonetHandle.set("Call_CLI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_DNI() {
      try {
        java.lang.String res = javonetHandle.get("Call_DNI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_DNI(java.lang.String param) {
      try {
        javonetHandle.set("Call_DNI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_0(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_1 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Short getState() {
      try {
        java.lang.Short res = javonetHandle.get("State");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setState(java.lang.Short param) {
      try {
        javonetHandle.set("State", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDest() {
      try {
        java.lang.String res = javonetHandle.get("Dest");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDest(java.lang.String param) {
      try {
        javonetHandle.set("Dest", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getStateName() {
      try {
        java.lang.String res = javonetHandle.get("StateName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setStateName(java.lang.String param) {
      try {
        javonetHandle.set("StateName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_1(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_2 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCalled() {
      try {
        java.lang.String res = javonetHandle.get("Called");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCalled(java.lang.String param) {
      try {
        javonetHandle.set("Called", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getUnknown() {
      try {
        java.lang.String res = javonetHandle.get("Unknown");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setUnknown(java.lang.String param) {
      try {
        javonetHandle.set("Unknown", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getACDGrp() {
      try {
        java.lang.String res = javonetHandle.get("ACDGrp");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setACDGrp(java.lang.String param) {
      try {
        javonetHandle.set("ACDGrp", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_2(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_3 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getRcv_Party() {
      try {
        java.lang.String res = javonetHandle.get("Rcv_Party");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setRcv_Party(java.lang.String param) {
      try {
        javonetHandle.set("Rcv_Party", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getType_Of_Call() {
      try {
        java.lang.String res = javonetHandle.get("Type_Of_Call");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setType_Of_Call(java.lang.String param) {
      try {
        javonetHandle.set("Type_Of_Call", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_3(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_4 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Short getLogin_Logout() {
      try {
        java.lang.Short res = javonetHandle.get("Login_Logout");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setLogin_Logout(java.lang.Short param) {
      try {
        javonetHandle.set("Login_Logout", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentID() {
      try {
        java.lang.String res = javonetHandle.get("AgentID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentID(java.lang.String param) {
      try {
        javonetHandle.set("AgentID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getACD_Grp() {
      try {
        java.lang.String res = javonetHandle.get("ACD_Grp");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setACD_Grp(java.lang.String param) {
      try {
        javonetHandle.set("ACD_Grp", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_4(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_5 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentID() {
      try {
        java.lang.String res = javonetHandle.get("AgentID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentID(java.lang.String param) {
      try {
        javonetHandle.set("AgentID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getWrap_Code() {
      try {
        java.lang.String res = javonetHandle.get("Wrap_Code");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setWrap_Code(java.lang.String param) {
      try {
        javonetHandle.set("Wrap_Code", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_5(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_6 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getACD_Grp() {
      try {
        java.lang.String res = javonetHandle.get("ACD_Grp");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setACD_Grp(java.lang.String param) {
      try {
        javonetHandle.set("ACD_Grp", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getType_Of_Call() {
      try {
        java.lang.String res = javonetHandle.get("Type_Of_Call");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setType_Of_Call(java.lang.String param) {
      try {
        javonetHandle.set("Type_Of_Call", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_6(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_7 extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_7(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_Lower_c extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getResponse() {
      try {
        java.lang.Integer res = javonetHandle.get("Response");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setResponse(java.lang.Integer param) {
      try {
        javonetHandle.set("Response", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getStatus() {
      try {
        java.lang.Integer res = javonetHandle.get("Status");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setStatus(java.lang.Integer param) {
      try {
        javonetHandle.set("Status", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDum1() {
      try {
        java.lang.String res = javonetHandle.get("Dum1");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDum1(java.lang.String param) {
      try {
        javonetHandle.set("Dum1", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDum2() {
      try {
        java.lang.String res = javonetHandle.get("Dum2");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDum2(java.lang.String param) {
      try {
        javonetHandle.set("Dum2", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Lower_c(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_Pipe extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExtNo() {
      try {
        java.lang.String res = javonetHandle.get("ExtNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExtNo(java.lang.String param) {
      try {
        javonetHandle.set("ExtNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_CLI() {
      try {
        java.lang.String res = javonetHandle.get("Call_CLI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_CLI(java.lang.String param) {
      try {
        javonetHandle.set("Call_CLI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Pipe(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_upper_G extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getData() {
      try {
        java.lang.String res = javonetHandle.get("Data");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setData(java.lang.String param) {
      try {
        javonetHandle.set("Data", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLResult() {
      try {
        java.lang.String res = javonetHandle.get("XMLResult");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLResult(java.lang.String param) {
      try {
        javonetHandle.set("XMLResult", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLPacket() {
      try {
        java.lang.String res = javonetHandle.get("XMLPacket");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLPacket(java.lang.String param) {
      try {
        javonetHandle.set("XMLPacket", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLInfo() {
      try {
        java.lang.String res = javonetHandle.get("XMLInfo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLInfo(java.lang.String param) {
      try {
        javonetHandle.set("XMLInfo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_upper_G(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_Upper_E extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.Integer getErrorCode() {
      try {
        java.lang.Integer res = javonetHandle.get("ErrorCode");
        if (res == null) return 0;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setErrorCode(java.lang.Integer param) {
      try {
        javonetHandle.set("ErrorCode", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getData() {
      try {
        java.lang.String res = javonetHandle.get("Data");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setData(java.lang.String param) {
      try {
        javonetHandle.set("Data", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getErrorText() {
      try {
        java.lang.String res = javonetHandle.get("ErrorText");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setErrorText(java.lang.String param) {
      try {
        javonetHandle.set("ErrorText", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLResult() {
      try {
        java.lang.String res = javonetHandle.get("XMLResult");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLResult(java.lang.String param) {
      try {
        javonetHandle.set("XMLResult", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLPacket() {
      try {
        java.lang.String res = javonetHandle.get("XMLPacket");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLPacket(java.lang.String param) {
      try {
        javonetHandle.set("XMLPacket", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getXMLInfo() {
      try {
        java.lang.String res = javonetHandle.get("XMLInfo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setXMLInfo(java.lang.String param) {
      try {
        javonetHandle.set("XMLInfo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Upper_E(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class AMS_Pkt_R extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCallType() {
      try {
        java.lang.String res = javonetHandle.get("CallType");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCallType(java.lang.String param) {
      try {
        javonetHandle.set("CallType", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentID() {
      try {
        java.lang.String res = javonetHandle.get("AgentID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentID(java.lang.String param) {
      try {
        javonetHandle.set("AgentID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentName() {
      try {
        java.lang.String res = javonetHandle.get("AgentName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentName(java.lang.String param) {
      try {
        javonetHandle.set("AgentName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getGroupNo() {
      try {
        java.lang.String res = javonetHandle.get("GroupNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setGroupNo(java.lang.String param) {
      try {
        javonetHandle.set("GroupNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTrunkNo() {
      try {
        java.lang.String res = javonetHandle.get("TrunkNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTrunkNo(java.lang.String param) {
      try {
        javonetHandle.set("TrunkNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCLI() {
      try {
        java.lang.String res = javonetHandle.get("CLI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCLI(java.lang.String param) {
      try {
        javonetHandle.set("CLI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDNI() {
      try {
        java.lang.String res = javonetHandle.get("DNI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDNI(java.lang.String param) {
      try {
        javonetHandle.set("DNI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCallID() {
      try {
        java.lang.String res = javonetHandle.get("CallID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCallID(java.lang.String param) {
      try {
        javonetHandle.set("CallID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public AMS_Pkt_R(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class AMS_Pkt_T extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExtNo() {
      try {
        java.lang.String res = javonetHandle.get("ExtNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExtNo(java.lang.String param) {
      try {
        javonetHandle.set("ExtNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTrunkNo() {
      try {
        java.lang.String res = javonetHandle.get("TrunkNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTrunkNo(java.lang.String param) {
      try {
        javonetHandle.set("TrunkNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getThirdPartyID() {
      try {
        java.lang.String res = javonetHandle.get("ThirdPartyID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setThirdPartyID(java.lang.String param) {
      try {
        javonetHandle.set("ThirdPartyID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public AMS_Pkt_T(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class Pkt_CRM extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExtnNo() {
      try {
        java.lang.String res = javonetHandle.get("ExtnNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExtnNo(java.lang.String param) {
      try {
        javonetHandle.set("ExtnNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentNo() {
      try {
        java.lang.String res = javonetHandle.get("AgentNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentNo(java.lang.String param) {
      try {
        javonetHandle.set("AgentNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAgentName() {
      try {
        java.lang.String res = javonetHandle.get("AgentName");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAgentName(java.lang.String param) {
      try {
        javonetHandle.set("AgentName", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getGroupNo() {
      try {
        java.lang.String res = javonetHandle.get("GroupNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setGroupNo(java.lang.String param) {
      try {
        javonetHandle.set("GroupNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTrunkNo() {
      try {
        java.lang.String res = javonetHandle.get("TrunkNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTrunkNo(java.lang.String param) {
      try {
        javonetHandle.set("TrunkNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_CLI() {
      try {
        java.lang.String res = javonetHandle.get("Call_CLI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_CLI(java.lang.String param) {
      try {
        javonetHandle.set("Call_CLI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_DNI() {
      try {
        java.lang.String res = javonetHandle.get("Call_DNI");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_DNI(java.lang.String param) {
      try {
        javonetHandle.set("Call_DNI", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public Pkt_CRM(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class AMS_Pkt_S extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPkt_ID() {
      try {
        java.lang.String res = javonetHandle.get("Pkt_ID");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPkt_ID(java.lang.String param) {
      try {
        javonetHandle.set("Pkt_ID", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getPortNo() {
      try {
        java.lang.String res = javonetHandle.get("PortNo");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setPortNo(java.lang.String param) {
      try {
        javonetHandle.set("PortNo", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public AMS_Pkt_S(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_Incoming_Call extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTrunk_Number() {
      try {
        java.lang.String res = javonetHandle.get("Trunk_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTrunk_Number(java.lang.String param) {
      try {
        javonetHandle.set("Trunk_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExt_Number() {
      try {
        java.lang.String res = javonetHandle.get("Ext_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExt_Number(java.lang.String param) {
      try {
        javonetHandle.set("Ext_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_Start_Time() {
      try {
        java.lang.String res = javonetHandle.get("Call_Start_Time");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_Start_Time(java.lang.String param) {
      try {
        javonetHandle.set("Call_Start_Time", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_Duration() {
      try {
        java.lang.String res = javonetHandle.get("Call_Duration");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_Duration(java.lang.String param) {
      try {
        javonetHandle.set("Call_Duration", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_End_Date() {
      try {
        java.lang.String res = javonetHandle.get("Call_End_Date");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_End_Date(java.lang.String param) {
      try {
        javonetHandle.set("Call_End_Date", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDet_16KZ_Pulses() {
      try {
        java.lang.String res = javonetHandle.get("Det_16KZ_Pulses");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDet_16KZ_Pulses(java.lang.String param) {
      try {
        javonetHandle.set("Det_16KZ_Pulses", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDialed_Number() {
      try {
        java.lang.String res = javonetHandle.get("Dialed_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDialed_Number(java.lang.String param) {
      try {
        javonetHandle.set("Dialed_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAccntCDOrCallOriginator() {
      try {
        java.lang.String res = javonetHandle.get("AccntCDOrCallOriginator");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAccntCDOrCallOriginator(java.lang.String param) {
      try {
        javonetHandle.set("AccntCDOrCallOriginator", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Incoming_Call(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class ACD_Pkt_Outgoing_Call extends ValueType {
    protected NObject javonetHandle;
    /** GetFiled */
    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getTrunk_Number() {
      try {
        java.lang.String res = javonetHandle.get("Trunk_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setTrunk_Number(java.lang.String param) {
      try {
        javonetHandle.set("Trunk_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getExt_Number() {
      try {
        java.lang.String res = javonetHandle.get("Ext_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setExt_Number(java.lang.String param) {
      try {
        javonetHandle.set("Ext_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_Start_Time() {
      try {
        java.lang.String res = javonetHandle.get("Call_Start_Time");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_Start_Time(java.lang.String param) {
      try {
        javonetHandle.set("Call_Start_Time", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_Duration() {
      try {
        java.lang.String res = javonetHandle.get("Call_Duration");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_Duration(java.lang.String param) {
      try {
        javonetHandle.set("Call_Duration", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getCall_End_Date() {
      try {
        java.lang.String res = javonetHandle.get("Call_End_Date");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setCall_End_Date(java.lang.String param) {
      try {
        javonetHandle.set("Call_End_Date", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDet_16KZ_Pulses() {
      try {
        java.lang.String res = javonetHandle.get("Det_16KZ_Pulses");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDet_16KZ_Pulses(java.lang.String param) {
      try {
        javonetHandle.set("Det_16KZ_Pulses", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getDialed_Number() {
      try {
        java.lang.String res = javonetHandle.get("Dialed_Number");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setDialed_Number(java.lang.String param) {
      try {
        javonetHandle.set("Dialed_Number", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    @MethodTypeAnnotation(type = "GetField")
    public java.lang.String getAccntCDOrCallOriginator() {
      try {
        java.lang.String res = javonetHandle.get("AccntCDOrCallOriginator");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    @MethodTypeAnnotation(type = "SetField")
    public void setAccntCDOrCallOriginator(java.lang.String param) {
      try {
        javonetHandle.set("AccntCDOrCallOriginator", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ACD_Pkt_Outgoing_Call(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public interface Evt_Packet_Zero_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_0 Pkt);
  }

  public interface Evt_Packet_1_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_1 Pkt);
  }

  public interface Evt_Packet_2_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_2 PktID);
  }

  public interface Evt_Packet_3_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_3 Pkt);
  }

  public interface Evt_Packet_4_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_4 Pkt);
  }

  public interface Evt_Packet_5_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_5 Pkt);
  }

  public interface Evt_Packet_6_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_6 Pkt);
  }

  public interface Evt_Packet_7_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_7 Pkt);
  }

  public interface Evt_Packet_Upper_G_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_upper_G Pkt);
  }

  public interface Evt_Packet_Upper_E_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_Upper_E Pkt);
  }

  public interface Evt_Packet_Pipe_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_Pipe Pkt);
  }

  public interface Evt_Packet_Upper_M_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_Upper_M Pkt);
  }

  public interface Evt_Packet_Lower_c_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(ACD_Pkt_Lower_c Pkt);
  }

  public interface Evt_Error_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.String ErrorMsg, jio.System.Exception Exp);
  }

  public interface Evt_Packet_Error_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.String ErrorMsg, jio.System.Exception Exp);
  }

  public interface Evt_Packet_Upper_Y_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Evt_Packet_small_a_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Evt_Packet_small_g_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Evt_WrongPasswordEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Evt_Packet_Upper_R_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(AMS_Pkt_R Pkt);
  }

  public interface Evt_Packet_Upper_T_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(AMS_Pkt_T Pkt);
  }

  public interface Evt_Packet_Upper_S_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(AMS_Pkt_S Pkt);
  }

  public interface HealthOKEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Evt_Packet_Upper_H_ReceivedEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface Send_P_PacketToSwitchEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke();
  }

  public interface ChangeTmrHealth_IntervalEventHandler {
    /** Method */
    @MethodTypeAnnotation(type = "DelegateMethod")
    public void Invoke(java.lang.Integer Value);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
