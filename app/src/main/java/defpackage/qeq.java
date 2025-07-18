package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qeq {
    public static pjf a(String str, Context context, pkn pknVar) throws qep {
        pje pjeVar;
        abyy abwxVar;
        List listG = yrl.c("|").g(str);
        int iOrdinal = ptn.a(context, pknVar).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (listG.size() != 4) {
                    throw new qep("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
                pjf pjfVar = pjf.a;
                pjeVar = new pje();
                String str2 = (String) listG.get(0);
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar2 = (pjf) pjeVar.b;
                str2.getClass();
                pjfVar2.b |= 1;
                pjfVar2.c = str2;
                long j = Integer.parseInt((String) listG.get(1));
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar3 = (pjf) pjeVar.b;
                pjfVar3.b |= 2;
                pjfVar3.d = j;
                String str3 = (String) listG.get(2);
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar4 = (pjf) pjeVar.b;
                str3.getClass();
                pjfVar4.b |= 4;
                pjfVar4.e = str3;
                int iA = phy.a(Integer.parseInt((String) listG.get(3)));
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar5 = (pjf) pjeVar.b;
                int i = iA - 1;
                if (iA == 0) {
                    throw null;
                }
                pjfVar5.f = i;
                pjfVar5.b |= 8;
            } else {
                if (listG.size() != 2) {
                    throw new qep("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                pjf pjfVar6 = pjf.a;
                pjeVar = new pje();
                String str4 = (String) listG.get(0);
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar7 = (pjf) pjeVar.b;
                str4.getClass();
                pjfVar7.b |= 4;
                pjfVar7.e = str4;
                int iA2 = phy.a(Integer.parseInt((String) listG.get(1)));
                if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjeVar.y();
                }
                pjf pjfVar8 = (pjf) pjeVar.b;
                int i2 = iA2 - 1;
                if (iA2 == 0) {
                    throw null;
                }
                pjfVar8.f = i2;
                pjfVar8.b |= 8;
            }
        } else {
            if (listG.size() != 5) {
                throw new qep("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            }
            pjf pjfVar9 = pjf.a;
            pje pjeVar2 = new pje();
            String str5 = (String) listG.get(0);
            if ((pjeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pjeVar2.y();
            }
            pjf pjfVar10 = (pjf) pjeVar2.b;
            str5.getClass();
            pjfVar10.b |= 1;
            pjfVar10.c = str5;
            long j2 = Integer.parseInt((String) listG.get(1));
            if ((pjeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pjeVar2.y();
            }
            pjf pjfVar11 = (pjf) pjeVar2.b;
            pjfVar11.b |= 2;
            pjfVar11.d = j2;
            String str6 = (String) listG.get(2);
            if ((pjeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pjeVar2.y();
            }
            pjf pjfVar12 = (pjf) pjeVar2.b;
            str6.getClass();
            pjfVar12.b |= 4;
            pjfVar12.e = str6;
            int iA3 = phy.a(Integer.parseInt((String) listG.get(3)));
            if ((pjeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                pjeVar2.y();
            }
            pjf pjfVar13 = (pjf) pjeVar2.b;
            int i3 = iA3 - 1;
            if (iA3 == 0) {
                throw null;
            }
            pjfVar13.f = i3;
            pjfVar13.b |= 8;
            if (listG.get(4) != null && !((String) listG.get(4)).isEmpty()) {
                try {
                    String str7 = (String) listG.get(4);
                    adwd adwdVar = adwd.a;
                    abyy abyyVar = adwd.b;
                    if (abyyVar == null) {
                        synchronized (adwd.class) {
                            abwxVar = adwd.b;
                            if (abwxVar == null) {
                                abwxVar = new abwx(adwd.a);
                                adwd.b = abwxVar;
                            }
                        }
                        abyyVar = abwxVar;
                    }
                    adwd adwdVar2 = (adwd) qer.b(str7, abyyVar);
                    if ((pjeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pjeVar2.y();
                    }
                    pjf pjfVar14 = (pjf) pjeVar2.b;
                    adwdVar2.getClass();
                    pjfVar14.g = adwdVar2;
                    pjfVar14.b |= 16;
                } catch (abxv e) {
                    throw new qep("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            pjeVar = pjeVar2;
        }
        return (pjf) pjeVar.v();
    }

    public static String b(pjf pjfVar, Context context, pkn pknVar) {
        int iOrdinal = ptn.a(context, pknVar).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return d(pjfVar);
            }
            if (iOrdinal == 2) {
                return c(pjfVar);
            }
            throw new RuntimeException(null, null);
        }
        StringBuilder sb = new StringBuilder(pjfVar.c);
        sb.append("|");
        sb.append(pjfVar.d);
        sb.append("|");
        sb.append(pjfVar.e);
        sb.append("|");
        sb.append((phy.a(pjfVar.f) != 0 ? r3 : 1) - 1);
        return sb.toString();
    }

    public static String c(pjf pjfVar) {
        StringBuilder sb = new StringBuilder(pjfVar.e);
        sb.append("|");
        int iA = phy.a(pjfVar.f);
        if (iA == 0) {
            iA = 1;
        }
        sb.append(iA - 1);
        return sb.toString();
    }

    public static String d(pjf pjfVar) {
        String strE;
        StringBuilder sb = new StringBuilder(pjfVar.c);
        sb.append("|");
        sb.append(pjfVar.d);
        sb.append("|");
        sb.append(pjfVar.e);
        sb.append("|");
        int iA = phy.a(pjfVar.f);
        if (iA == 0) {
            iA = 1;
        }
        sb.append(iA - 1);
        sb.append("|");
        if ((pjfVar.b & 16) != 0) {
            adwd adwdVar = pjfVar.g;
            if (adwdVar == null) {
                adwdVar = adwd.a;
            }
            strE = qer.e(adwdVar);
        } else {
            strE = "";
        }
        sb.append(strE);
        return sb.toString();
    }
}
