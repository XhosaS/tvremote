package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.util.Log;
import android.util.SizeF;
import android.view.PointerIcon;
import android.view.View;
import android.widget.RemoteViews;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwo {
    public static void a(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    static int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a.cf(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final dbd c(dcr dcrVar, dcw dcwVar, List list, yow yowVar) {
        daw dcvVar = dcwVar;
        if (dcwVar == null) {
            dcvVar = new dcv();
        }
        return new dbz(dcrVar, yfm.p(new daz(list, (yih) null, 0)), dcvVar, yowVar);
    }

    public static /* synthetic */ dbd d(dcn dcnVar, dcw dcwVar, yow yowVar, yjk yjkVar, int i) {
        yhb yhbVar = (i & 4) != 0 ? yhb.a : null;
        if ((i & 8) != 0) {
            yot yotVar = ypk.a;
            yowVar = yoz.l(yya.a.plus(new yqy(null)));
        }
        if ((i & 2) != 0) {
            dcwVar = null;
        }
        yhbVar.getClass();
        yowVar.getClass();
        return c(new dcd(dcnVar, yjkVar), dcwVar, yhbVar, yowVar);
    }

    public static final void f(int i) {
        synchronized (UnmanagedSessionReceiver.b) {
            if (((cwo) UnmanagedSessionReceiver.a.get(Integer.valueOf(i))) != null) {
                throw null;
            }
        }
    }

    public static final void g(dms dmsVar, long j, yjz yjzVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        Iterable iterableS;
        Object next;
        yfw yfwVar;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(361732211);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(dmsVar) : baoVarD.H(dmsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                baoVarD.x(292027481);
                ((bas) baoVarD).aa();
                iterableS = ((dmq) dmsVar).a;
                baoVar2 = baoVarD;
            } else {
                baoVarD.x(292096053);
                Set set = ((dmq) dmsVar).a;
                boolean z = false;
                long j2 = ((cmc) yfm.aj(set, new yib(new yjv[]{new cjp(8), new cjp(9)})).get(0)).a;
                Bundle bundle = (Bundle) baoVarD.f(dko.a);
                cmc[] cmcVarArr = new cmc[2];
                int i5 = bundle.getInt("appWidgetMinHeight", 0);
                int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                cmcVarArr[0] = (i5 == 0 || i6 == 0) ? null : new cmc(a.j(i6, i5));
                int i7 = bundle.getInt("appWidgetMaxHeight", 0);
                int i8 = bundle.getInt("appWidgetMinWidth", 0);
                cmcVarArr[1] = (i7 == 0 || i8 == 0) ? null : new cmc(a.j(i8, i7));
                List listAW = yfm.aW(cmcVarArr);
                ArrayList arrayList = new ArrayList(yfm.z(listAW, 10));
                Iterator it = listAW.iterator();
                while (it.hasNext()) {
                    long j3 = ((cmc) it.next()).a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        boolean z2 = z;
                        Set set2 = set;
                        long j4 = ((cmc) it2.next()).a;
                        bao baoVar3 = baoVarD;
                        if (((float) Math.ceil(cmc.b(j3))) + 1.0f <= cmc.b(j4) || ((float) Math.ceil(cmc.a(j3))) + 1.0f <= cmc.a(j4)) {
                            yfwVar = null;
                        } else {
                            cmc cmcVar = new cmc(j4);
                            float fB = cmc.b(j3) - cmc.b(j4);
                            float fA = cmc.a(j3) - cmc.a(j4);
                            yfwVar = new yfw(cmcVar, Float.valueOf((fB * fB) + (fA * fA)));
                        }
                        if (yfwVar != null) {
                            arrayList2.add(yfwVar);
                        }
                        set = set2;
                        z = z2;
                        baoVarD = baoVar3;
                    }
                    Set set3 = set;
                    bao baoVar4 = baoVarD;
                    boolean z3 = z;
                    Iterator it3 = arrayList2.iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            float fFloatValue = ((Number) ((yfw) next).b).floatValue();
                            do {
                                Object next2 = it3.next();
                                float fFloatValue2 = ((Number) ((yfw) next2).b).floatValue();
                                int iCompare = Float.compare(fFloatValue, fFloatValue2);
                                if (iCompare > 0) {
                                    fFloatValue = fFloatValue2;
                                }
                                if (iCompare > 0) {
                                    next = next2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    yfw yfwVar2 = (yfw) next;
                    cmc cmcVar2 = yfwVar2 != null ? (cmc) yfwVar2.a : null;
                    arrayList.add(new cmc(cmcVar2 != null ? cmcVar2.a : j2));
                    set = set3;
                    z = z3;
                    baoVarD = baoVar4;
                }
                baoVar2 = baoVarD;
                boolean z4 = z;
                if (arrayList.isEmpty()) {
                    cmc[] cmcVarArr2 = new cmc[2];
                    cmcVarArr2[z4 ? 1 : 0] = new cmc(j2);
                    cmcVarArr2[1] = new cmc(j2);
                    iterableS = yfm.s(cmcVarArr2);
                } else {
                    iterableS = arrayList;
                }
                ((bas) baoVar2).aa();
            }
            List listAb = yfm.ab(iterableS);
            ArrayList arrayList3 = new ArrayList(yfm.z(listAb, 10));
            Iterator it4 = listAb.iterator();
            while (it4.hasNext()) {
                h(((cmc) it4.next()).a, dmsVar, yjzVar, baoVar2, ((i4 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896));
                arrayList3.add(ygi.a);
            }
            baoVarD = baoVar2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(dmsVar, j, yjzVar, i, 4);
        }
    }

    public static final void h(long j, dms dmsVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-771692794);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(dmsVar) : baoVarD.H(dmsVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bcm.i(diy.a.c(new cmc(j)), bga.k(-367769018, new arg(yjzVar, j, dmsVar, 4), baoVarD), baoVarD, 56);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(j, dmsVar, yjzVar, i, 3);
        }
    }

    public static final int i(dro droVar) {
        int i = droVar.e;
        int i2 = 8388611;
        if (!a.r(i, 0)) {
            if (a.r(i, 2)) {
                i2 = 8388613;
            } else if (a.r(i, 1)) {
                i2 = 1;
            } else {
                String strA = drm.a(i);
                Objects.toString(strA);
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: ".concat(strA));
            }
        }
        int i3 = droVar.f;
        int i4 = 48;
        if (!a.r(i3, 0)) {
            if (a.r(i3, 2)) {
                i4 = 80;
            } else if (a.r(i3, 1)) {
                i4 = 16;
            } else {
                String strA2 = drn.a(i3);
                Objects.toString(strA2);
                Log.w("GlanceAppWidget", "Unknown vertical alignment: ".concat(strA2));
            }
        }
        return i2 | i4;
    }

    public static final RemoteViews j(dmw dmwVar, int i) {
        return new RemoteViews(dmwVar.a.getPackageName(), i);
    }

    public static final RemoteViews k(dmw dmwVar, List list, int i) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(((diz) it.next()) instanceof dkz)) {
                    diz dizVar = (diz) yfm.Z(list);
                    dmk dmkVarC = dmf.c(dmwVar, dizVar.b(), i);
                    RemoteViews remoteViews = dmkVarC.a;
                    o(remoteViews, dmwVar.e(dmkVarC), dizVar);
                    return remoteViews;
                }
            }
        }
        Object objS = yfm.S(list);
        objS.getClass();
        dms dmsVar = ((dkz) objS).e;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            diz dizVar2 = (diz) it2.next();
            dizVar2.getClass();
            dkz dkzVar = (dkz) dizVar2;
            long j = dkzVar.a;
            dmk dmkVarC2 = dmf.c(dmwVar, dkzVar.b(), i);
            RemoteViews remoteViews2 = dmkVarC2.a;
            o(remoteViews2, dmw.g(dmwVar.c(dmkVarC2.b, 0), 0, false, new AtomicInteger(-1), null, new AtomicBoolean(false), j, 0, false, 64703), dizVar2);
            arrayList.add(new yfw(new SizeF(cmc.b(j), cmc.a(j)), remoteViews2));
        }
        if (dmsVar instanceof dmr) {
            return (RemoteViews) ((yfw) yfm.Z(arrayList)).b;
        }
        if (!(dmsVar instanceof dmq) && !yks.e(dmsVar, dmp.a)) {
            throw new yfu();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return new RemoteViews((Map<SizeF, RemoteViews>) yfm.k(arrayList));
        }
        if (arrayList.size() != 1 && arrayList.size() != 2) {
            throw new IllegalArgumentException("unsupported views size");
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add((RemoteViews) ((yfw) it3.next()).b);
        }
        int size = arrayList2.size();
        if (size == 1) {
            return (RemoteViews) arrayList2.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList2.get(0), (RemoteViews) arrayList2.get(1));
        }
        throw new IllegalArgumentException("There must be between 1 and 2 views.");
    }

    public static final String l(long j) {
        if (j == 9205357640488583168L) {
            return "Unspecified";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) cma.a(cmc.b(j)));
        sb.append('x');
        sb.append((Object) cma.a(cmc.a(j)));
        return sb.toString();
    }

    public static final void m(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.addStableView(i, remoteViews2, i2);
        } else {
            remoteViews.addView(i, remoteViews2);
        }
    }

    public static final void n(RemoteViews remoteViews, dmw dmwVar, dma dmaVar, List list) {
        int i = 0;
        for (Object obj : yfm.ak(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            o(remoteViews, dmwVar.c(dmaVar, i), (diz) obj);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x03f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(android.widget.RemoteViews r16, defpackage.dmw r17, defpackage.diz r18) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwo.o(android.widget.RemoteViews, dmw, diz):void");
    }

    private static final void p(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            diz dizVar = (diz) it.next();
            if (dizVar instanceof dky) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0081 -> B:24:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:24:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.util.List r7, defpackage.dbg r8, defpackage.yih r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.dba
            if (r0 == 0) goto L13
            r0 = r9
            dba r0 = (defpackage.dba) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dba r0 = new dba
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.b
            java.lang.Object r8 = r0.a
            ylf r8 = (defpackage.ylf) r8
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L30
            goto L64
        L30:
            r9 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            defpackage.ybn.f(r9)
            goto L5b
        L42:
            defpackage.ybn.f(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            dbb r2 = new dbb
            r5 = 0
            r2.<init>(r7, r9, r5)
            r0.a = r9
            r0.d = r4
            java.lang.Object r7 = r8.a(r2, r0)
            if (r7 == r1) goto L94
            r7 = r9
        L5b:
            ylf r8 = new ylf
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()
            yjv r9 = (defpackage.yjv) r9
            r0.a = r8     // Catch: java.lang.Throwable -> L30
            r0.b = r7     // Catch: java.lang.Throwable -> L30
            r0.d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Throwable -> L30
            if (r9 != r1) goto L64
            goto L94
        L7d:
            java.lang.Object r2 = r8.a
            if (r2 != 0) goto L84
            r8.a = r9
            goto L64
        L84:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            defpackage.ybn.h(r2, r9)
            goto L64
        L8a:
            java.lang.Object r7 = r8.a
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L93
            ygi r7 = defpackage.ygi.a
            return r7
        L93:
            throw r7
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwo.e(java.util.List, dbg, yih):java.lang.Object");
    }
}
