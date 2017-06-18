package br.com.bomrastreio.api.correios.trace;

import br.com.bomrastreio.api.object.ObjectStatus;

public enum TraceStatus {

  UND_00(ObjectStatus.UNDEFINED),
  BDE_00(ObjectStatus.DELIVERED),
  BDE_01(ObjectStatus.DELIVERED),
  BDE_02(ObjectStatus.ACTION_REQUIRED),
  BDE_03(ObjectStatus.DELAYED),
  BDE_04(ObjectStatus.DELAYED),
  BDE_05(ObjectStatus.DELAYED),
  BDE_06(ObjectStatus.DELAYED),
  BDE_07(ObjectStatus.IN_TRANSIT),
  BDE_08(ObjectStatus.DELAYED),
  BDE_09(ObjectStatus.ACTION_REQUIRED),
  BDE_10(ObjectStatus.DELAYED),
  BDE_12(ObjectStatus.ACTION_REQUIRED),
  BDE_19(ObjectStatus.DELAYED),
  BDE_20(ObjectStatus.DELAYED),
  BDE_21(ObjectStatus.DELAYED),
  BDE_22(ObjectStatus.DELAYED),
  BDE_23(ObjectStatus.DELAYED),
  BDE_24(ObjectStatus.DELAYED),
  BDE_25(ObjectStatus.DELAYED),
  BDE_26(ObjectStatus.DELAYED),
  BDE_28(ObjectStatus.ACTION_REQUIRED),
  BDE_32(ObjectStatus.DELAYED),
  BDE_33(ObjectStatus.DELAYED),
  BDE_34(ObjectStatus.DELAYED),
  BDE_35(ObjectStatus.DELAYED),
  BDE_36(ObjectStatus.DELAYED),
  BDE_37(ObjectStatus.ACTION_REQUIRED),
  BDE_38(ObjectStatus.IN_TRANSIT),
  BDE_40(ObjectStatus.DELAYED),
  BDE_41(ObjectStatus.IN_TRANSIT),
  BDE_42(ObjectStatus.DELAYED),
  BDE_43(ObjectStatus.ACTION_REQUIRED),
  BDE_45(ObjectStatus.IN_TRANSIT),
  BDE_46(ObjectStatus.IN_TRANSIT),
  BDE_47(ObjectStatus.IN_TRANSIT),
  BDE_48(ObjectStatus.DELAYED),
  BDE_49(ObjectStatus.DELAYED),
  BDE_50(ObjectStatus.ACTION_REQUIRED),
  BDE_51(ObjectStatus.ACTION_REQUIRED),
  BDE_52(ObjectStatus.ACTION_REQUIRED),
  BDE_53(ObjectStatus.IN_TRANSIT),
  BDE_54(ObjectStatus.ACTION_REQUIRED),
  BDE_55(ObjectStatus.IN_TRANSIT),
  BDE_56(ObjectStatus.DELAYED),
  BDE_57(ObjectStatus.IN_TRANSIT),
  BDE_58(ObjectStatus.IN_TRANSIT),
  BDE_59(ObjectStatus.IN_TRANSIT),
  BDE_66(ObjectStatus.IN_TRANSIT),
  BDE_69(ObjectStatus.IN_TRANSIT),
  BDI_00(ObjectStatus.DELIVERED),
  BDI_01(ObjectStatus.DELIVERED),
  BDI_02(ObjectStatus.ACTION_REQUIRED),
  BDI_03(ObjectStatus.DELAYED),
  BDI_04(ObjectStatus.DELAYED),
  BDI_05(ObjectStatus.DELAYED),
  BDI_06(ObjectStatus.DELAYED),
  BDI_07(ObjectStatus.IN_TRANSIT),
  BDI_08(ObjectStatus.DELAYED),
  BDI_09(ObjectStatus.ACTION_REQUIRED),
  BDI_10(ObjectStatus.DELAYED),
  BDI_12(ObjectStatus.ACTION_REQUIRED),
  BDI_19(ObjectStatus.DELAYED),
  BDI_20(ObjectStatus.DELAYED),
  BDI_21(ObjectStatus.DELAYED),
  BDI_22(ObjectStatus.DELAYED),
  BDI_23(ObjectStatus.DELAYED),
  BDI_24(ObjectStatus.DELAYED),
  BDI_25(ObjectStatus.DELAYED),
  BDI_26(ObjectStatus.DELAYED),
  BDI_28(ObjectStatus.ACTION_REQUIRED),
  BDI_32(ObjectStatus.DELAYED),
  BDI_33(ObjectStatus.DELAYED),
  BDI_34(ObjectStatus.DELAYED),
  BDI_35(ObjectStatus.DELAYED),
  BDI_36(ObjectStatus.DELAYED),
  BDI_37(ObjectStatus.ACTION_REQUIRED),
  BDI_38(ObjectStatus.IN_TRANSIT),
  BDI_40(ObjectStatus.DELAYED),
  BDI_41(ObjectStatus.IN_TRANSIT),
  BDI_42(ObjectStatus.DELAYED),
  BDI_43(ObjectStatus.ACTION_REQUIRED),
  BDI_45(ObjectStatus.IN_TRANSIT),
  BDI_46(ObjectStatus.IN_TRANSIT),
  BDI_47(ObjectStatus.IN_TRANSIT),
  BDI_48(ObjectStatus.DELAYED),
  BDI_49(ObjectStatus.DELAYED),
  BDI_50(ObjectStatus.ACTION_REQUIRED),
  BDI_51(ObjectStatus.ACTION_REQUIRED),
  BDI_52(ObjectStatus.ACTION_REQUIRED),
  BDI_53(ObjectStatus.IN_TRANSIT),
  BDI_54(ObjectStatus.ACTION_REQUIRED),
  BDI_55(ObjectStatus.IN_TRANSIT),
  BDI_56(ObjectStatus.DELAYED),
  BDI_57(ObjectStatus.IN_TRANSIT),
  BDI_58(ObjectStatus.IN_TRANSIT),
  BDI_59(ObjectStatus.IN_TRANSIT),
  BDI_66(ObjectStatus.IN_TRANSIT),
  BDI_69(ObjectStatus.IN_TRANSIT),
  BDR_00(ObjectStatus.DELIVERED),
  BDR_01(ObjectStatus.DELIVERED),
  BDR_02(ObjectStatus.ACTION_REQUIRED),
  BDR_03(ObjectStatus.DELAYED),
  BDR_04(ObjectStatus.DELAYED),
  BDR_05(ObjectStatus.DELAYED),
  BDR_06(ObjectStatus.DELAYED),
  BDR_07(ObjectStatus.IN_TRANSIT),
  BDR_08(ObjectStatus.DELAYED),
  BDR_09(ObjectStatus.ACTION_REQUIRED),
  BDR_10(ObjectStatus.DELAYED),
  BDR_12(ObjectStatus.ACTION_REQUIRED),
  BDR_19(ObjectStatus.DELAYED),
  BDR_20(ObjectStatus.DELAYED),
  BDR_21(ObjectStatus.DELAYED),
  BDR_22(ObjectStatus.DELAYED),
  BDR_23(ObjectStatus.DELAYED),
  BDR_24(ObjectStatus.DELAYED),
  BDR_25(ObjectStatus.DELAYED),
  BDR_26(ObjectStatus.DELAYED),
  BDR_28(ObjectStatus.ACTION_REQUIRED),
  BDR_32(ObjectStatus.DELAYED),
  BDR_33(ObjectStatus.DELAYED),
  BDR_34(ObjectStatus.DELAYED),
  BDR_35(ObjectStatus.DELAYED),
  BDR_36(ObjectStatus.DELAYED),
  BDR_37(ObjectStatus.ACTION_REQUIRED),
  BDR_38(ObjectStatus.IN_TRANSIT),
  BDR_40(ObjectStatus.DELAYED),
  BDR_41(ObjectStatus.IN_TRANSIT),
  BDR_42(ObjectStatus.DELAYED),
  BDR_43(ObjectStatus.ACTION_REQUIRED),
  BDR_45(ObjectStatus.IN_TRANSIT),
  BDR_46(ObjectStatus.IN_TRANSIT),
  BDR_47(ObjectStatus.IN_TRANSIT),
  BDR_48(ObjectStatus.DELAYED),
  BDR_49(ObjectStatus.DELAYED),
  BDR_50(ObjectStatus.ACTION_REQUIRED),
  BDR_51(ObjectStatus.ACTION_REQUIRED),
  BDR_52(ObjectStatus.ACTION_REQUIRED),
  BDR_53(ObjectStatus.IN_TRANSIT),
  BDR_54(ObjectStatus.ACTION_REQUIRED),
  BDR_55(ObjectStatus.IN_TRANSIT),
  BDR_56(ObjectStatus.DELAYED),
  BDR_57(ObjectStatus.IN_TRANSIT),
  BDR_58(ObjectStatus.IN_TRANSIT),
  BDR_59(ObjectStatus.IN_TRANSIT),
  BDR_66(ObjectStatus.IN_TRANSIT),
  BDR_69(ObjectStatus.IN_TRANSIT),
  BLQ_01(ObjectStatus.IN_TRANSIT),
  CD_00(ObjectStatus.IN_TRANSIT),
  CD_01(ObjectStatus.IN_TRANSIT),
  CD_02(ObjectStatus.IN_TRANSIT),
  CD_03(ObjectStatus.IN_TRANSIT),
  CMT_00(ObjectStatus.IN_TRANSIT),
  CO_01(ObjectStatus.IN_TRANSIT),
  CUN_00(ObjectStatus.IN_TRANSIT),
  CUN_01(ObjectStatus.IN_TRANSIT),
  DO_00(ObjectStatus.IN_TRANSIT),
  DO_01(ObjectStatus.IN_TRANSIT),
  DO_02(ObjectStatus.IN_TRANSIT),
  EST_01(ObjectStatus.IN_TRANSIT),
  EST_02(ObjectStatus.IN_TRANSIT),
  EST_03(ObjectStatus.IN_TRANSIT),
  EST_04(ObjectStatus.IN_TRANSIT),
  EST_05(ObjectStatus.IN_TRANSIT),
  EST_06(ObjectStatus.IN_TRANSIT),
  EST_09(ObjectStatus.IN_TRANSIT),
  FC_01(ObjectStatus.DELAYED),
  FC_02(ObjectStatus.IN_TRANSIT),
  FC_03(ObjectStatus.IN_TRANSIT),
  FC_04(ObjectStatus.IN_TRANSIT),
  FC_05(ObjectStatus.IN_TRANSIT),
  FC_07(ObjectStatus.IN_TRANSIT),
  IDC_01(ObjectStatus.IN_TRANSIT),
  IDC_02(ObjectStatus.IN_TRANSIT),
  IDC_03(ObjectStatus.IN_TRANSIT),
  IDC_04(ObjectStatus.IN_TRANSIT),
  IDC_05(ObjectStatus.IN_TRANSIT),
  IDC_06(ObjectStatus.IN_TRANSIT),
  IDC_07(ObjectStatus.IN_TRANSIT),
  LDE_00(ObjectStatus.IN_TRANSIT),
  LDI_00(ObjectStatus.ACTION_REQUIRED),
  LDI_01(ObjectStatus.ACTION_REQUIRED),
  LDI_02(ObjectStatus.ACTION_REQUIRED),
  LDI_03(ObjectStatus.ACTION_REQUIRED),
  LDI_14(ObjectStatus.ACTION_REQUIRED),
  OEC_00(ObjectStatus.ACTION_REQUIRED),
  OEC_01(ObjectStatus.IN_TRANSIT),
  OEC_09(ObjectStatus.IN_TRANSIT),
  PAR_15(ObjectStatus.IN_TRANSIT),
  PAR_16(ObjectStatus.IN_TRANSIT),
  PAR_17(ObjectStatus.IN_TRANSIT),
  PAR_18(ObjectStatus.IN_TRANSIT),
  PMT_01(ObjectStatus.IN_TRANSIT),
  PO_00(ObjectStatus.IN_TRANSIT),
  PO_01(ObjectStatus.IN_TRANSIT),
  PO_09(ObjectStatus.IN_TRANSIT),
  RO_00(ObjectStatus.IN_TRANSIT),
  RO_01(ObjectStatus.IN_TRANSIT),
  TRI_00(ObjectStatus.IN_TRANSIT);

  private ObjectStatus objectStatus;

  TraceStatus(ObjectStatus objectStatus) {
    this.objectStatus = objectStatus;
  }

  public ObjectStatus getObjectStatus() {
    return objectStatus;
  }

  /**
   * Find a tracking object status from the joining of type and status.
   * If wasn't found any status, the default will be {@link ObjectStatus#UNDEFINED}.
   *
   * @param type   Trace response type
   * @param status Trace status number
   * @return ObjectStatus
   */
  public static TraceStatus of(String type, String status) {
    String traceStatusName = type + "_" + status;
    TraceStatus traceStatus;

    try {
      traceStatus = TraceStatus.valueOf(traceStatusName);
    } catch (Exception ex) {
      traceStatus = TraceStatus.UND_00;
    }

    return traceStatus;
  }

}