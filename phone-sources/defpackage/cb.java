package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cb {
    public final Object a;

    public cb(Object obj) {
        this.a = obj;
    }

    public static final boolean A(Object obj, qth qthVar) {
        if (obj == null) {
            return false;
        }
        qthVar.j(obj);
        return true;
    }

    public static final void g(bdj bdjVar, int i) {
        while (bdjVar.q >= 0 && bdjVar.p <= i) {
            bdjVar.H();
            bdjVar.U();
        }
    }

    public static final void q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
        }
    }

    public static boolean z(rii riiVar) {
        return riiVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, voy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [voy] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(defpackage.voy r9, defpackage.qyn r10, defpackage.cuh r11, defpackage.yjv r12, defpackage.yvc r13, defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.B(voy, qyn, cuh, yjv, yvc, yih):java.lang.Object");
    }

    public final Object C(qen qenVar, vjc vjcVar, yih yihVar) {
        vjd vjdVar = vjd.a;
        vjdVar.getClass();
        qsu qsuVar = (qsu) this.a;
        return ykr.l(qsuVar.t, new kaw(qsuVar, "/v1/fetchlatestthreads", qenVar, vjcVar, vjdVar, (yih) null, 5), yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, qbd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(java.util.List r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qsd
            if (r0 == 0) goto L13
            r0 = r7
            qsd r0 = (defpackage.qsd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qsd r0 = new qsd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.ybn.f(r7)
            goto L38
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r7)
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L53
            java.lang.Object r7 = r6.next()
            qen r7 = (defpackage.qen) r7
            java.lang.Object r2 = r5.a
            vlo r4 = defpackage.vlo.LOCALE_CHANGED
            r0.a = r6
            r0.c = r3
            java.lang.Object r7 = r2.b(r7, r4, r0)
            if (r7 != r1) goto L38
            return r1
        L53:
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.D(java.util.List, yih):java.lang.Object");
    }

    public final synchronized void E(qpk qpkVar) {
        ((HashSet) this.a).remove(qpkVar);
        notifyAll();
    }

    public final synchronized boolean F(qpk qpkVar) {
        while (((HashSet) this.a).contains(qpkVar)) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        ((HashSet) this.a).add(qpkVar);
        return true;
    }

    public final uhp G() {
        return qtl.aH(((nwq) this.a).w());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final qjx H() {
        int i = ((SharedPreferences) this.a.b()).getInt("last_successful_registration_account_type", qjx.b.f);
        boolean z = false;
        qjx qjxVar = null;
        for (qjx qjxVar2 : qjx.values()) {
            if (qjxVar2.f == i) {
                if (z) {
                    return null;
                }
                z = true;
                qjxVar = qjxVar2;
            }
        }
        if (z) {
            return qjxVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final String I() {
        String string = ((SharedPreferences) this.a.b()).getString("internal_target_id", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final String J() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_environment_url", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final String K() {
        String string = ((SharedPreferences) this.a.b()).getString("last_successful_registration_pseudonymous_cookie", "");
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final void L(String str) {
        ((SharedPreferences) this.a.b()).edit().putString("internal_target_id", str).apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final boolean M() {
        return ((SharedPreferences) this.a.b()).getBoolean("is_registered_to_unified_fcm_registration", false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final int N() {
        int i = ((SharedPreferences) this.a.b()).getInt("last_used_registration_api", 3);
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            if (i3 < 3) {
                int i5 = iArr[i3];
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i) {
                    if (z) {
                        break;
                    }
                    z = true;
                    i4 = i5;
                }
                i3++;
            } else if (z) {
                i2 = i4;
            }
        }
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xbw] */
    public final void O(int i) {
        ((SharedPreferences) this.a.b()).edit().putInt("last_used_registration_api", i).apply();
    }

    public final cb P(ViewGroup viewGroup) {
        rcj rcjVarT = ((rzy) this.a).t(viewGroup);
        viewGroup.addView(rcjVarT.a);
        return new cb(rcjVarT);
    }

    public final cr a() {
        return ((cd) this.a).e;
    }

    public final void b() {
        ((cd) this.a).e.L();
    }

    public final void c() {
        ((cd) this.a).e.ak(true);
    }

    public final boolean d() {
        return hu.l((Context) this.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    public final void e(ss ssVar, bao baoVar, int i) {
        int i2 = i & 6;
        bao baoVarD = baoVar.d(1320309496);
        int i3 = i2 == 0 ? (true != baoVarD.F(ssVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (baoVarD.L((i3 & 19) != 18, i3 & 1)) {
            ?? r1 = this.a;
            int iA = ((bje) r1).a();
            for (int i4 = 0; i4 < iA; i4++) {
                ((yka) r1.get(i4)).a(ssVar, baoVarD, Integer.valueOf(i3 & 14));
            }
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, ssVar, i, 2, null);
        }
    }

    public final void f(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            bb$$ExternalSyntheticApiModelOutline1.m69m(this.a).notifyViewVisibilityChanged(view, i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final void h(Object obj, float f) {
        this.a.put(obj, Float.valueOf(f));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final apn i() {
        return (apn) this.a.a();
    }

    public final clx j() {
        throw new IllegalArgumentException(a.cj(this, "The density on DrawerState (", ") was not set. Did you use DrawerState with the Drawer composable?"));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final ysx k(guw guwVar) {
        guwVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((gte) obj).b(guwVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gte) it.next()).a(guwVar.k));
        }
        return ytb.a(new dbm((ysx[]) yfm.al(arrayList2).toArray(new ysx[0]), 3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final boolean l(guw guwVar) throws IOException {
        guwVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((gte) obj).c(guwVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            gpn.b();
            int i = gta.a;
            yfm.ax(arrayList, null, null, null, new gwp(1), 31);
        }
        return arrayList.isEmpty();
    }

    public final void m(Runnable runnable) {
        ((Handler) this.a).removeCallbacks(runnable);
    }

    public final void n(long j, Runnable runnable) {
        ((Handler) this.a).postDelayed(runnable, j);
    }

    public final Class o() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final List p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void r(ggi ggiVar) {
        ggiVar.getClass();
        int i = ggiVar.a;
        ?? r1 = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = r1.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            r1.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        Integer numValueOf2 = Integer.valueOf(ggiVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + ggiVar);
        }
        treeMap2.put(numValueOf2, ggiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(defpackage.ysy r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ger
            if (r0 == 0) goto L13
            r0 = r6
            ger r0 = (defpackage.ger) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ger r0 = new ger
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            defpackage.ybn.f(r6)
            goto L3f
        L2f:
            defpackage.ybn.f(r6)
            java.lang.Object r6 = r4.a
            r0.b = r3
            yvc r6 = (defpackage.yvc) r6
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            yfs r5 = new yfs
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.s(ysy, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(defpackage.yjv r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.gby
            if (r0 == 0) goto L13
            r0 = r7
            gby r0 = (defpackage.gby) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gby r0 = new gby
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r7)     // Catch: defpackage.gbv -> L27
            goto L49
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.ybn.f(r7)
            uc r7 = new uc     // Catch: defpackage.gbv -> L27
            r2 = 0
            r4 = 14
            r7.<init>(r5, r6, r2, r4)     // Catch: defpackage.gbv -> L27
            r0.b = r3     // Catch: defpackage.gbv -> L27
            java.lang.Object r6 = defpackage.yoz.k(r7, r0)     // Catch: defpackage.gbv -> L27
            if (r6 != r1) goto L49
            return r1
        L45:
            cb r7 = r6.a
            if (r7 != r5) goto L4c
        L49:
            ygi r6 = defpackage.ygi.a
            return r6
        L4c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb.t(yjv, yih):java.lang.Object");
    }

    public final void u(gcf gcfVar) {
        gcd gcdVar = gcfVar instanceof gcd ? (gcd) gcfVar : null;
        ((gog) ((gav) this.a).g.a).b(gcdVar, new xa(gcfVar, 17));
    }

    public final gcd v() {
        return (gcd) ((gog) this.a).c;
    }

    public final String w(int i) throws Resources.NotFoundException {
        try {
            String resourceName = ((Context) this.a).getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public final void x(rox roxVar) {
        roxVar.getClass();
        Object obj = ((ulp) this.a).a;
        int i = roy.c;
        ((roy) obj).a.add(roxVar);
    }

    public final void y(rox roxVar) {
        Object obj = ((ulp) this.a).a;
        int i = roy.c;
        ((roy) obj).a.remove(roxVar);
    }

    public cb(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cb(Context context) {
        this.a = context.getApplicationContext();
    }

    public cb() {
        this.a = new bje();
    }

    public cb(aoi aoiVar) {
        int i = aoh.a;
        this.a = new anm(aoiVar, new aoe(this, 3));
    }

    public cb(byte[] bArr, byte[] bArr2) {
        new yyk();
        this.a = new bci(null, bcz.c);
    }

    public cb(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public cb(long[] jArr) {
        ji jiVar;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            int length = jArrCopyOf.length;
            jiVar = new ji(length);
            int i = jiVar.b;
            jArrCopyOf.getClass();
            if (i < 0) {
                kv.c("");
            }
            if (length != 0) {
                jiVar.a(jiVar.b + length);
                long[] jArr2 = jiVar.a;
                int i2 = jiVar.b;
                if (i != i2) {
                    yfm.bi(jArr2, jArr2, i + length, i, i2);
                }
                yfm.bi(jArrCopyOf, jArr2, i, 0, jArrCopyOf.length);
                jiVar.b += length;
            }
        } else {
            jiVar = new ji((byte[]) null);
        }
        this.a = jiVar;
    }

    public cb(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.a = new gog();
    }

    public /* synthetic */ cb(fus fusVar, yjk yjkVar) {
        this.a = new gag(yjkVar instanceof gca ? new ahf((Object) yjkVar, 2, (char[]) null) : new ajh(yjkVar, (yih) null, 2), fusVar).e;
    }

    public cb(int i) {
        this.a = yvd.a(new int[i]);
    }

    public cb(char[] cArr, byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public cb(gho ghoVar) {
        ghoVar.getClass();
        this.a = ghoVar;
    }

    public cb(byte[] bArr, char[] cArr) {
        this.a = new CopyOnWriteArrayList();
    }

    public cb(char[] cArr) {
        this.a = crh.k(Looper.getMainLooper());
    }

    public cb(gun gunVar) {
        gunVar.getClass();
        this.a = gunVar;
    }

    public cb(gag gagVar) {
        gsv gsvVar;
        gte[] gteVarArr = new gte[8];
        gteVarArr[0] = new gtc((gtr) gagVar.b);
        gteVarArr[1] = new gtd((gtm) gagVar.e);
        gteVarArr[2] = new gtj((gtr) gagVar.d);
        gtr gtrVar = (gtr) gagVar.c;
        gteVarArr[3] = new gtf(gtrVar);
        gteVarArr[4] = new gti(gtrVar);
        gteVarArr[5] = new gth((gtr) gagVar.c);
        gteVarArr[6] = new gtg((gtr) gagVar.c);
        if (Build.VERSION.SDK_INT >= 28) {
            Object obj = gagVar.a;
            int i = gta.a;
            Object systemService = ((Context) obj).getSystemService("connectivity");
            systemService.getClass();
            gsvVar = new gsv((ConnectivityManager) systemService);
        } else {
            gsvVar = null;
        }
        gteVarArr[7] = gsvVar;
        this.a = yfm.aW(gteVarArr);
    }

    public cb(WorkDatabase workDatabase, byte[] bArr) {
        workDatabase.getClass();
        this.a = workDatabase;
    }

    public cb(byte[] bArr, short[] sArr) {
        this.a = new HashSet();
    }

    public cb(qjq qjqVar, qqe qqeVar) {
        qjqVar.getClass();
        this.a = qqeVar;
    }

    public cb(qbd qbdVar) {
        qbdVar.getClass();
        this.a = qbdVar;
    }

    public cb(yfo yfoVar, byte[] bArr) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    public cb(yfo yfoVar) {
        yfoVar.getClass();
        this.a = yfoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.ComponentCallbacks, java.lang.Object] */
    public cb(Context context, ulp ulpVar) {
        this.a = ulpVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(ulpVar.a);
        application.registerComponentCallbacks(ulpVar.a);
    }
}
