package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzh {
    private static Boolean f;
    public final rwv a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;

    public rzh(rwv rwvVar, String str, String str2, boolean z) {
        this.a = rwvVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        Context context = rwvVar.c;
        Pattern pattern = sjt.a;
        sjs sjsVar = new sjs(context);
        sjsVar.d("phenotype");
        sjsVar.e(str2 + "/" + str + ".pb");
        if (z) {
            int i = osx.a;
            sjsVar.b();
        }
        this.b = sjsVar.a();
    }

    public static boolean c() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    objInvoke.getClass();
                    Boolean bool = (Boolean) objInvoke;
                    bool.booleanValue();
                    f = bool;
                } catch (ReflectiveOperationException unused) {
                    f = false;
                }
            }
        }
        return f.booleanValue();
    }

    public final uhp a(String str) {
        rwv rwvVar = this.a;
        ulp ulpVarF = rwvVar.f();
        String str2 = this.c;
        str2.getClass();
        str.getClass();
        return ufn.i(ulp.aE(((omi) ulpVarF.a).c(str2, str, null).a(ugk.a, new ono() { // from class: rxi
            @Override // defpackage.ono
            public final Object a(onz onzVar) {
                int i;
                rxg rxgVar;
                int i2;
                olu oluVar = (olu) onzVar.e();
                vtw vtwVarM = rxf.a.m();
                String str3 = oluVar.a;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                rxf rxfVar = (rxf) vucVar;
                str3.getClass();
                int i3 = 1;
                rxfVar.b |= 1;
                rxfVar.c = str3;
                String str4 = oluVar.c;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                rxf rxfVar2 = (rxf) vucVar2;
                str4.getClass();
                rxfVar2.b |= 4;
                rxfVar2.e = str4;
                boolean z = oluVar.f;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                rxf rxfVar3 = (rxf) vucVar3;
                rxfVar3.b |= 8;
                rxfVar3.h = z;
                long j = oluVar.g;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                rxf rxfVar4 = (rxf) vtwVarM.b;
                rxfVar4.b |= 16;
                rxfVar4.i = j;
                byte[] bArr = oluVar.b;
                if (bArr != null) {
                    vsz vszVarQ = vsz.q(bArr);
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    rxf rxfVar5 = (rxf) vtwVarM.b;
                    rxfVar5.b |= 2;
                    rxfVar5.d = vszVarQ;
                }
                olt[] oltVarArr = oluVar.d;
                int length = oltVarArr.length;
                int i4 = 0;
                while (i4 < length) {
                    olt oltVar = oltVarArr[i4];
                    oma[] omaVarArr = oltVar.b;
                    int length2 = omaVarArr.length;
                    int i5 = 0;
                    while (i5 < length2) {
                        oma omaVar = omaVarArr[i5];
                        int i6 = omaVar.g;
                        if (i6 != i3) {
                            if (i6 == 2) {
                                i2 = i3;
                                vtw vtwVarM2 = rxg.a.m();
                                String str5 = omaVar.a;
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                rxg rxgVar2 = (rxg) vtwVarM2.b;
                                str5.getClass();
                                rxgVar2.b |= 1;
                                rxgVar2.e = str5;
                                boolean zE = omaVar.e();
                                if (!vtwVarM2.b.A()) {
                                    vtwVarM2.u();
                                }
                                rxg rxgVar3 = (rxg) vtwVarM2.b;
                                rxgVar3.c = 2;
                                rxgVar3.d = Boolean.valueOf(zE);
                                rxgVar = (rxg) vtwVarM2.r();
                            } else if (i6 == 3) {
                                i2 = i3;
                                vtw vtwVarM3 = rxg.a.m();
                                String str6 = omaVar.a;
                                if (!vtwVarM3.b.A()) {
                                    vtwVarM3.u();
                                }
                                rxg rxgVar4 = (rxg) vtwVarM3.b;
                                str6.getClass();
                                rxgVar4.b |= 1;
                                rxgVar4.e = str6;
                                double dA = omaVar.a();
                                if (!vtwVarM3.b.A()) {
                                    vtwVarM3.u();
                                }
                                rxg rxgVar5 = (rxg) vtwVarM3.b;
                                rxgVar5.c = 3;
                                rxgVar5.d = Double.valueOf(dA);
                                rxgVar = (rxg) vtwVarM3.r();
                            } else if (i6 == 4) {
                                i2 = i3;
                                vtw vtwVarM4 = rxg.a.m();
                                String str7 = omaVar.a;
                                if (!vtwVarM4.b.A()) {
                                    vtwVarM4.u();
                                }
                                rxg rxgVar6 = (rxg) vtwVarM4.b;
                                str7.getClass();
                                rxgVar6.b |= 1;
                                rxgVar6.e = str7;
                                String strC = omaVar.c();
                                if (!vtwVarM4.b.A()) {
                                    vtwVarM4.u();
                                }
                                rxg rxgVar7 = (rxg) vtwVarM4.b;
                                rxgVar7.c = 4;
                                rxgVar7.d = strC;
                                rxgVar = (rxg) vtwVarM4.r();
                            } else {
                                if (i6 != 5) {
                                    throw new IllegalArgumentException(a.cf(i6, "Unrecognized flag type: "));
                                }
                                vtw vtwVarM5 = rxg.a.m();
                                String str8 = omaVar.a;
                                if (!vtwVarM5.b.A()) {
                                    vtwVarM5.u();
                                }
                                rxg rxgVar8 = (rxg) vtwVarM5.b;
                                str8.getClass();
                                i2 = i3;
                                rxgVar8.b |= 1;
                                rxgVar8.e = str8;
                                vsz vszVarQ2 = vsz.q(omaVar.f());
                                if (!vtwVarM5.b.A()) {
                                    vtwVarM5.u();
                                }
                                rxg rxgVar9 = (rxg) vtwVarM5.b;
                                rxgVar9.c = 5;
                                rxgVar9.d = vszVarQ2;
                                rxgVar = (rxg) vtwVarM5.r();
                            }
                            i = i2;
                        } else {
                            int i7 = i3;
                            vtw vtwVarM6 = rxg.a.m();
                            String str9 = omaVar.a;
                            if (!vtwVarM6.b.A()) {
                                vtwVarM6.u();
                            }
                            rxg rxgVar10 = (rxg) vtwVarM6.b;
                            str9.getClass();
                            rxgVar10.b |= 1;
                            rxgVar10.e = str9;
                            long jB = omaVar.b();
                            if (!vtwVarM6.b.A()) {
                                vtwVarM6.u();
                            }
                            rxg rxgVar11 = (rxg) vtwVarM6.b;
                            i = i7;
                            rxgVar11.c = i;
                            rxgVar11.d = Long.valueOf(jB);
                            rxgVar = (rxg) vtwVarM6.r();
                        }
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        rxf rxfVar6 = (rxf) vtwVarM.b;
                        rxgVar.getClass();
                        vun vunVar = rxfVar6.f;
                        if (!vunVar.c()) {
                            rxfVar6.f = vuc.s(vunVar);
                        }
                        rxfVar6.f.add(rxgVar);
                        i5++;
                        i3 = i;
                    }
                    int i8 = i3;
                    String[] strArr = oltVar.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (!vtwVarM.b.A()) {
                                vtwVarM.u();
                            }
                            rxf rxfVar7 = (rxf) vtwVarM.b;
                            str10.getClass();
                            vun vunVar2 = rxfVar7.g;
                            if (!vunVar2.c()) {
                                rxfVar7.g = vuc.s(vunVar2);
                            }
                            rxfVar7.g.add(str10);
                        }
                    }
                    i4++;
                    i3 = i8;
                }
                return (rxf) vtwVarM.r();
            }
        })), new tsl() { // from class: rze
            @Override // defpackage.tsl
            public final Object apply(Object obj) {
                rxf rxfVar = (rxf) obj;
                vtw vtwVarM = rzi.a.m();
                if (rxfVar == null) {
                    return (rzi) vtwVarM.r();
                }
                for (rxg rxgVar : rxfVar.f) {
                    vtw vtwVarM2 = rzj.a.m();
                    String str3 = rxgVar.e;
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    vuc vucVar = vtwVarM2.b;
                    rzj rzjVar = (rzj) vucVar;
                    str3.getClass();
                    rzjVar.b |= 1;
                    rzjVar.e = str3;
                    int i = rxgVar.c;
                    int iJ = rrx.J(i);
                    if (iJ == 0) {
                        throw null;
                    }
                    int i2 = iJ - 1;
                    if (i2 == 0) {
                        long jLongValue = i == 1 ? ((Long) rxgVar.d).longValue() : 0L;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        rzj rzjVar2 = (rzj) vtwVarM2.b;
                        rzjVar2.c = 2;
                        rzjVar2.d = Long.valueOf(jLongValue);
                    } else if (i2 == 1) {
                        boolean zBooleanValue = i == 2 ? ((Boolean) rxgVar.d).booleanValue() : false;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        rzj rzjVar3 = (rzj) vtwVarM2.b;
                        rzjVar3.c = 3;
                        rzjVar3.d = Boolean.valueOf(zBooleanValue);
                    } else if (i2 == 2) {
                        double dDoubleValue = i == 3 ? ((Double) rxgVar.d).doubleValue() : 0.0d;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        rzj rzjVar4 = (rzj) vtwVarM2.b;
                        rzjVar4.c = 4;
                        rzjVar4.d = Double.valueOf(dDoubleValue);
                    } else if (i2 == 3) {
                        String str4 = i == 4 ? (String) rxgVar.d : "";
                        if (!vucVar.A()) {
                            vtwVarM2.u();
                        }
                        rzj rzjVar5 = (rzj) vtwVarM2.b;
                        str4.getClass();
                        rzjVar5.c = 5;
                        rzjVar5.d = str4;
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        vsz vszVar = i == 5 ? (vsz) rxgVar.d : vsz.b;
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        rzj rzjVar6 = (rzj) vtwVarM2.b;
                        vszVar.getClass();
                        rzjVar6.c = 6;
                        rzjVar6.d = vszVar;
                    }
                    rzj rzjVar7 = (rzj) vtwVarM2.r();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    rzi rziVar = (rzi) vtwVarM.b;
                    rzjVar7.getClass();
                    vun vunVar = rziVar.g;
                    if (!vunVar.c()) {
                        rziVar.g = vuc.s(vunVar);
                    }
                    rziVar.g.add(rzjVar7);
                }
                String str5 = rxfVar.e;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar2 = vtwVarM.b;
                rzi rziVar2 = (rzi) vucVar2;
                str5.getClass();
                rziVar2.b = 4 | rziVar2.b;
                rziVar2.e = str5;
                String str6 = rxfVar.c;
                if (!vucVar2.A()) {
                    vtwVarM.u();
                }
                vuc vucVar3 = vtwVarM.b;
                rzi rziVar3 = (rzi) vucVar3;
                str6.getClass();
                rziVar3.b = 1 | rziVar3.b;
                rziVar3.c = str6;
                long j = rxfVar.i;
                if (!vucVar3.A()) {
                    vtwVarM.u();
                }
                vuc vucVar4 = vtwVarM.b;
                rzi rziVar4 = (rzi) vucVar4;
                rziVar4.b |= 8;
                rziVar4.f = j;
                if ((rxfVar.b & 2) != 0) {
                    vsz vszVar2 = rxfVar.d;
                    if (!vucVar4.A()) {
                        vtwVarM.u();
                    }
                    rzi rziVar5 = (rzi) vtwVarM.b;
                    vszVar2.getClass();
                    rziVar5.b |= 2;
                    rziVar5.d = vszVar2;
                }
                return (rzi) vtwVarM.r();
            }
        }, rwvVar.b());
    }

    public final uhp b(rzi rziVar) {
        return sfy.F(new grz(this, rziVar, 14, null), this.a.b());
    }

    public final boolean d() {
        rzk rzkVar = this.a.e;
        boolean z = this.e;
        uis uisVar = uis.FILE;
        if (z) {
            rxr rxrVarB = rzkVar.b();
            return rxrVarB.e && new vul(rxrVarB.i, rxr.a).contains(uisVar);
        }
        rxq rxqVarA = rzkVar.a();
        return rxqVarA.e && new vul(rxqVarA.j, rxq.a).contains(uisVar);
    }
}
