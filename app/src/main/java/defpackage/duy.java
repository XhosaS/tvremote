package defpackage;

import android.content.Context;
import android.graphics.PathEffect;
import android.util.SparseIntArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
class duy {
    static dru a(dve dveVar, dru druVar, drq drqVar, boolean z, String str) {
        dxx dxxVar;
        Object obj;
        dxx dxxVar2;
        List list;
        int iIntValue;
        if (z && str == null) {
            throw new IllegalStateException("Cannot reuse a null global key");
        }
        dzh dzhVar = druVar.f;
        if (str == null) {
            drq drqVar2 = druVar.c;
            Pattern pattern = dsd.a;
            boolean z2 = drqVar.m;
            String strConcat = z2 ? "$".concat(String.valueOf(drqVar.B())) : drqVar.B();
            if (drqVar2 == null) {
                str = strConcat;
            } else {
                String strI = druVar.i();
                if (strI == null) {
                    dsr.b(2, "Trying to generate parent-based key for component " + drqVar.d() + " , but parent " + drqVar2.d() + " has a null global key \".");
                    str = "null".concat(String.valueOf(strConcat));
                } else {
                    StringBuilder sb = new StringBuilder(strI.length() + strConcat.length() + 1);
                    sb.append(strI);
                    sb.append(",");
                    sb.append(strConcat);
                    str = sb.toString();
                    if (z2) {
                        dxo dxoVar = druVar.j;
                        dxoVar.getClass();
                        if (dxoVar.mManualKeysCounter == null) {
                            dxoVar.mManualKeysCounter = new HashMap(1);
                        }
                        Integer num = (Integer) dxoVar.mManualKeysCounter.get(strConcat);
                        if (num == null) {
                            num = 0;
                        }
                        dxoVar.mManualKeysCounter.put(strConcat, Integer.valueOf(num.intValue() + 1));
                        iIntValue = num.intValue();
                        if (iIntValue != 0) {
                            dsr.b(1, "The manual key " + strConcat.substring(1) + " you are setting on this " + drqVar.d() + " is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
                        }
                    } else {
                        dxo dxoVar2 = druVar.j;
                        dxoVar2.getClass();
                        if (dxoVar2.e == null) {
                            dxoVar2.e = new SparseIntArray(1);
                        }
                        SparseIntArray sparseIntArray = dxoVar2.e;
                        int i = drqVar.i;
                        int i2 = sparseIntArray.get(i, 0);
                        dxoVar2.e.put(i, i2 + 1);
                        iIntValue = i2;
                    }
                    if (iIntValue != 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 4);
                        sb2.append(str);
                        sb2.append('!');
                        sb2.append(iIntValue);
                        str = sb2.toString();
                    }
                }
            }
        }
        dzh dzhVar2 = druVar.f;
        WeakReference weakReference = druVar.i;
        dru druVar2 = new dru(druVar, dzhVar2, weakReference != null ? (dve) weakReference.get() : null);
        druVar2.c = drqVar;
        druVar2.h = druVar.h;
        druVar2.d = str;
        druVar2.i = new WeakReference(dveVar);
        druVar2.g = druVar.f;
        druVar2.j = new dxo(drqVar, druVar2, druVar.d());
        dxo dxoVar3 = druVar2.j;
        dxoVar3.getClass();
        dxy dxyVar = dveVar.c;
        dxyVar.getClass();
        drq drqVar3 = dxoVar3.a;
        if (!drqVar3.f()) {
            dxyVar.o(dxoVar3.b.i());
        } else if (drqVar3.U()) {
            dru druVar3 = dxoVar3.b;
            String strI2 = druVar3.i();
            if (drqVar3.U()) {
                dxyVar.l();
                dxyVar.j();
                synchronized (dxyVar) {
                    dxxVar = (dxx) dxyVar.e.get(strI2);
                }
                if (dxxVar != null) {
                    dxo dxoVar4 = druVar3.j;
                    dxoVar4.getClass();
                    dxxVar2 = dxoVar4.c;
                    drqVar3.O(dxxVar, dxxVar2);
                } else {
                    duu duuVar = dxyVar.g;
                    synchronized (duuVar) {
                        Map map = duuVar.b;
                        obj = map.get(strI2);
                        if (obj == null) {
                            obj = new Object();
                            map.put(strI2, obj);
                        }
                    }
                    synchronized (obj) {
                        Map map2 = duuVar.a;
                        dxx dxxVar3 = (dxx) map2.get(strI2);
                        if (dxxVar3 == null) {
                            drqVar3.E(druVar3);
                            dxo dxoVar5 = druVar3.j;
                            if (dxoVar5 == null) {
                                throw null;
                            }
                            map2.put(strI2, dxoVar5.c);
                        } else {
                            dxo dxoVar6 = druVar3.j;
                            if (dxoVar6 == null) {
                                throw null;
                            }
                            drqVar3.O(dxxVar3, dxoVar6.c);
                        }
                    }
                    dxo dxoVar7 = druVar3.j;
                    dxoVar7.getClass();
                    dxxVar2 = dxoVar7.c;
                }
                boolean z3 = ebc.a;
                dxyVar.g(strI2, dxxVar2);
                synchronized (dxyVar) {
                    Map map3 = dxyVar.a;
                    list = map3 == null ? null : (List) map3.get(strI2);
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    ArrayList arrayList = null;
                    while (it.hasNext()) {
                        dxxVar2.b((dxw) it.next());
                        dyt dytVarA = dxxVar2 instanceof drp ? ((drp) dxxVar2).a() : null;
                        if (dytVarA != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(dytVarA);
                        }
                    }
                    eeu.a.addAndGet(list.size());
                    synchronized (dxyVar) {
                        dxyVar.a.remove(strI2);
                        Map map4 = dxyVar.b;
                        if (map4 != null) {
                            map4.remove(strI2);
                        }
                        dxyVar.d.put(strI2, list);
                        if (arrayList != null && !arrayList.isEmpty()) {
                            dxyVar.k();
                            dxyVar.c.put(strI2, arrayList);
                        }
                    }
                }
            }
        }
        dzh dzhVarAm = drqVar.am(dzhVar);
        druVar2.g = dzhVar;
        druVar2.f = dzhVarAm;
        boolean z4 = ebc.a;
        return druVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.dvk b(defpackage.dve r16, defpackage.dru r17, defpackage.dwo r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duy.b(dve, dru, dwo, int, int):dvk");
    }

    static dvs c(dve dveVar, dru druVar, drq drqVar, boolean z, String str) {
        return d(dveVar, druVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), drqVar, false, z, str);
    }

    static dvs d(dve dveVar, dru druVar, int i, int i2, drq drqVar, boolean z, boolean z2, String str) {
        drq drqVar2;
        dru druVarA;
        String strI;
        dxo dxoVar;
        dvs dwnVar;
        boolean z3 = ebc.a;
        Map map = drq.g;
        dvd dvdVar = dveVar.b;
        boolean zContainsKey = dvdVar != null ? dvdVar.l.containsKey(Integer.valueOf(drqVar.j)) : false;
        try {
            druVarA = a(dveVar, druVar, drqVar, z2, str);
            strI = druVarA.i();
            drqVar2 = druVarA.c;
            try {
                dxoVar = druVarA.j;
            } catch (Exception e) {
                e = e;
                dsq.e(druVar, drqVar2, e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            drqVar2 = drqVar;
        }
        if (dxoVar == null) {
            throw null;
        }
        boolean zAa = drq.aa(drqVar);
        if ((zAa || zContainsKey) && !z) {
            dwnVar = new dwn(druVarA, druVarA.f);
        } else if (drqVar2.e()) {
            dwnVar = drqVar2.c(dveVar, druVarA);
        } else if (drq.ac(drqVar2)) {
            dwnVar = new dvs(druVarA);
            dwnVar.O = 1;
            drqVar2.M(dxoVar.b);
        } else {
            if (!drq.Z(drqVar2)) {
                throw new IllegalArgumentException("component:" + drqVar2.d());
            }
            drq drqVar3 = drqVar2.ax(druVarA, i).a;
            dwnVar = drqVar3 != null ? drqVar3 == drqVar2 ? drqVar3.c(dveVar, druVarA) : c(dveVar, druVarA, drqVar3, false, null) : null;
        }
        if (dwnVar != null) {
            if (dwnVar.b() == 0 && ((drqVar2.P() && drq.ac(drqVar2)) || ((zAa || zContainsKey) && !z))) {
                dwnVar.N = drq.q;
            }
            drk drkVar = drqVar2.o;
            if (drkVar != null && (!drq.aa(drqVar2) || !z)) {
                dww dwwVar = drkVar.c;
                if (dwwVar != null) {
                    dwnVar.s(dwwVar);
                }
                if ((drkVar.a & 1) != 0) {
                    dwnVar.t(drkVar.e);
                }
                byte b = drkVar.a;
                if ((b & 2) != 0) {
                    dwnVar.w = drkVar.f;
                }
                if (drkVar.g || (b & 28) != 0) {
                    dwnVar.B = true;
                }
                drj drjVar = drkVar.b;
                if (drjVar != null) {
                    if ((drjVar.a & 1) != 0) {
                        dwnVar.L(drjVar.d);
                    }
                    if ((drjVar.a & 2) != 0) {
                        dwnVar.Q();
                    }
                    if ((drjVar.a & 262144) != 0) {
                        dwnVar.K();
                    }
                    if ((drjVar.a & 4) != 0) {
                        dwnVar.R();
                    }
                    int i3 = drjVar.a;
                    if ((i3 & 1024) != 0) {
                        dwnVar.B = true;
                    }
                    if ((i3 & 8) != 0) {
                        dwnVar.H(drjVar.b);
                    }
                    if ((drjVar.a & 16) != 0) {
                        dwnVar.y(null);
                    }
                    if ((drjVar.a & 32) != 0) {
                        dwnVar.A(null);
                    }
                    if ((drjVar.a & 64) != 0) {
                        dwnVar.M(drjVar.c);
                    }
                    if ((drjVar.a & 128) != 0) {
                        dwnVar.F(null);
                    }
                    if ((drjVar.a & 65536) != 0) {
                        dwnVar.G(null);
                    }
                    if ((drjVar.a & 512) != 0) {
                        dwnVar.D(drjVar.g, drjVar.f);
                    }
                    if ((drjVar.a & 131072) != 0) {
                        dwnVar.E(drjVar.h);
                    }
                    if ((drjVar.a & Integer.MIN_VALUE) != 0) {
                        dyt dytVar = drjVar.i;
                        if (dwnVar.t == null) {
                            dwnVar.t = new ArrayList(1);
                        }
                        dwnVar.t.add(dytVar);
                    }
                    if ((drjVar.a & 256) != 0) {
                        for (int i4 = 0; i4 < 9; i4++) {
                            float fC = drjVar.e.c(i4);
                            if (!enx.a(fC)) {
                                int iB = enz.b(i4);
                                int i5 = (int) fC;
                                if (dwnVar.p == null) {
                                    dwnVar.p = new dtm();
                                }
                                dwnVar.I |= 33554432;
                                dwnVar.p.e(iB, i5);
                            }
                        }
                    }
                    if ((drjVar.a & 8192) != 0) {
                        dre dreVar = drjVar.j;
                        int[] iArr = dreVar.b;
                        int[] iArr2 = dreVar.c;
                        float[] fArr = dreVar.a;
                        PathEffect pathEffect = dreVar.d;
                        dwnVar.P(iArr, iArr2, fArr);
                    }
                    if ((drjVar.a & 16384) != 0) {
                        dwnVar.N();
                    }
                    if ((drjVar.a & 32768) != 0) {
                        dwnVar.O();
                    }
                }
            }
            dwnVar.b.add(dxoVar);
            f(druVarA);
            if (drqVar2.Q()) {
                dvc dvcVar = new dvc(strI, drqVar2, dxoVar);
                if (dwnVar.v == null) {
                    dwnVar.v = new ArrayList(4);
                }
                dwnVar.v.add(dvcVar);
            }
            List list = dxoVar.g;
            if (list != null && !list.isEmpty()) {
                List list2 = dxoVar.g;
                if (dwnVar.u == null) {
                    dwnVar.u = new ArrayList(list2.size());
                }
                dwnVar.u.addAll(list2);
            }
            return dwnVar;
        }
        return null;
    }

    static void e(dve dveVar, dvs dvsVar) {
        List list = dvsVar.y;
        if (list != null) {
            dru druVarE = dvsVar.e();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dvsVar.v(dveVar, druVarE, (drq) list.get(i));
            }
            list.clear();
        }
        int iA = dvsVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            e(dveVar, dvsVar.h(i2));
        }
    }

    static boolean f(dru druVar) {
        ComponentTree componentTree = druVar.h;
        return componentTree == null ? drb.a(null) : componentTree.d;
    }

    public static boolean g(int i, int i2, int i3, int i4, float f, float f2) {
        return dwf.a(i, i3, (int) f) && dwf.a(i2, i4, (int) f2);
    }

    static dvk h(dve dveVar, dvs dvsVar, int i, int i2) {
        boolean z = ebc.a;
        dvt dvtVar = new dvt(dveVar);
        if (dvtVar.a.b == null) {
            throw new IllegalStateException("Cannot calculate a layout without a layout state.");
        }
        dvs.z(dvsVar, null);
        eoe eoeVarO = dvs.o(dvtVar, dvsVar, null);
        if (dvsVar.J()) {
            Context context = dvsVar.a;
            if ((context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
                eoeVarO.g(eny.RTL);
            }
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) eoeVarO;
        if (enx.a(YogaNodeJNIBase.j(YogaNative.jni_YGNodeStyleGetWidthJNI(yogaNodeJNIBase.c)).a)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.c, View.MeasureSpec.getSize(i));
            } else if (mode == 0) {
                YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.c, Float.NaN);
            } else if (mode == 1073741824) {
                YogaNative.jni_YGNodeStyleSetWidthJNI(yogaNodeJNIBase.c, View.MeasureSpec.getSize(i));
            }
        }
        if (enx.a(YogaNodeJNIBase.j(YogaNative.jni_YGNodeStyleGetHeightJNI(yogaNodeJNIBase.c)).a)) {
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE) {
                YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.c, View.MeasureSpec.getSize(i2));
            } else if (mode2 == 0) {
                YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.c, Float.NaN);
            } else if (mode2 == 1073741824) {
                YogaNative.jni_YGNodeStyleSetHeightJNI(yogaNodeJNIBase.c, View.MeasureSpec.getSize(i2));
            }
        }
        float size = View.MeasureSpec.getMode(i) == 0 ? Float.NaN : View.MeasureSpec.getSize(i);
        float size2 = View.MeasureSpec.getMode(i2) != 0 ? View.MeasureSpec.getSize(i2) : Float.NaN;
        yogaNodeJNIBase.k();
        ArrayList arrayList = new ArrayList();
        arrayList.add(eoeVarO);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i3)).b;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.k();
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i4 = 0; i4 < yogaNodeJNIBaseArr.length; i4++) {
            jArr[i4] = yogaNodeJNIBaseArr[i4].c;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.c, size, size2, jArr, yogaNodeJNIBaseArr);
        for (int i5 = 0; i5 < dvsVar.b(); i5++) {
            drq drqVar = dvsVar.k(i5).a;
            dru druVar = dvsVar.k(i5).b;
            drqVar.ao();
        }
        return (dvk) yogaNodeJNIBase.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static defpackage.dvb i(defpackage.dve r16, defpackage.dru r17, defpackage.drq r18, java.lang.String r19, int r20, int r21, boolean r22, defpackage.dvs r23, defpackage.dxc r24) {
        /*
            r8 = r24
            r9 = 0
            boolean r0 = defpackage.ebc.a     // Catch: java.lang.Exception -> Lb2
            r10 = 1
            r0 = r22
            if (r10 == r0) goto Lc
            r2 = r9
            goto Le
        Lc:
            r2 = r23
        Le:
            if (r8 == 0) goto L1c
            if (r2 != 0) goto L15
            java.lang.String r0 = "start_create_layout"
            goto L17
        L15:
            java.lang.String r0 = "start_reconcile_layout"
        L17:
            r8.c(r0)
            r11 = r8
            goto L1d
        L1c:
            r11 = r9
        L1d:
            java.lang.String r12 = "end_create_layout"
            r13 = 0
            if (r2 != 0) goto L4e
            if (r11 == 0) goto L26
            r14 = r13
            goto L27
        L26:
            r14 = r10
        L27:
            r6 = 0
            r7 = 0
            r5 = 1
            r0 = r16
            r1 = r17
            r4 = r18
            r2 = r20
            r3 = r21
            dvs r1 = d(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L46
            boolean r2 = r0.b()
            if (r2 == 0) goto L46
            if (r11 == 0) goto L80
            r11.c(r12)
            goto L80
        L46:
            dvd r2 = r0.b
            if (r2 == 0) goto L4c
            r2.G = r13
        L4c:
            r2 = r9
            goto L76
        L4e:
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            dru r3 = a(r0, r1, r4, r10, r5)
            drq r4 = r3.c
            dxo r3 = r3.j
            r3.getClass()
            dxy r6 = r0.c
            r6.getClass()
            if (r11 == 0) goto L69
            goto L6a
        L69:
            r13 = r10
        L6a:
            java.util.Set r6 = r6.f()
            r15 = r4
            r4 = r3
            r3 = r15
            dvs r1 = defpackage.dvs.i(r0, r1, r2, r3, r4, r5, r6)
            r14 = r13
        L76:
            if (r10 == r14) goto L80
            if (r2 != 0) goto L7b
            goto L7d
        L7b:
            java.lang.String r12 = "end_reconcile_layout"
        L7d:
            r11.c(r12)
        L80:
            if (r1 != 0) goto L88
            dvb r0 = new dvb
            r0.<init>(r9)
            return r0
        L88:
            boolean r2 = r0.b()
            if (r2 == 0) goto L94
            dvb r0 = new dvb
            r0.<init>(r1)
            return r0
        L94:
            if (r8 == 0) goto L9c
            java.lang.String r2 = "start_measure"
            r8.c(r2)
            goto L9d
        L9c:
            r8 = r9
        L9d:
            r2 = r20
            r3 = r21
            dvk r0 = h(r0, r1, r2, r3)
            if (r8 == 0) goto Lac
            java.lang.String r1 = "end_measure"
            r8.c(r1)
        Lac:
            dvb r1 = new dvb
            r1.<init>(r0)
            return r1
        Lb2:
            r0 = move-exception
            r1 = r17
            r4 = r18
            defpackage.dsq.e(r1, r4, r0)
            dvb r0 = new dvb
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duy.i(dve, dru, drq, java.lang.String, int, int, boolean, dvs, dxc):dvb");
    }
}
