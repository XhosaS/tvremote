package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iub implements ite {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/statesync/monitors/installedapps/InstalledAppsMonitor");
    private static final List d = agqq.d(fiu.b, fry.a, fiu.c, fqh.a, fiu.d);
    public final agow b;
    public agux c;
    private final fiu e;
    private final Supplier f;
    private final Supplier g;
    private final fxu h;
    private final gtu i;
    private final hab j;
    private final jbc k;
    private final agow l;
    private final ztw m;
    private final gtt n;
    private final List o;
    private final gzv p;
    private final boolean q;

    public iub(fiu fiuVar, Supplier supplier, Supplier supplier2, fxu fxuVar, gtu gtuVar, hab habVar, jbc jbcVar, agow agowVar, agow agowVar2, ztw ztwVar) {
        fiuVar.getClass();
        fxuVar.getClass();
        gtuVar.getClass();
        habVar.getClass();
        ztwVar.getClass();
        this.e = fiuVar;
        this.f = supplier;
        this.g = supplier2;
        this.h = fxuVar;
        this.i = gtuVar;
        this.j = habVar;
        this.k = jbcVar;
        this.b = agowVar;
        this.l = agowVar2;
        this.m = ztwVar;
        this.n = new iua(this);
        List list = d;
        ArrayList arrayList = new ArrayList(agqq.i(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new fxk((fxr) it.next(), new itu(this)));
        }
        this.o = arrayList;
        this.p = new gzv() { // from class: its
            @Override // defpackage.gzv
            public final void a(Intent intent) {
                ((zdv) iub.a.b().q("com/google/android/apps/tvsearch/statesync/monitors/installedapps/InstalledAppsMonitor", "onPackageCacheUpdated", 197, "InstalledAppsMonitor.kt")).u("Received PackageCache update");
                if (intent == null || agvy.c(intent.getAction(), "android.intent.action.PACKAGE_CHANGED")) {
                    return;
                }
                Uri data = intent.getData();
                String schemeSpecificPart = data != null ? data.getSchemeSpecificPart() : null;
                iub iubVar = this.a;
                if ((intent.getBooleanExtra("android.intent.extra.REPLACING", false) || agvy.c(intent.getAction(), "android.intent.action.PACKAGE_REPLACED")) && !((acfo) iubVar.b.a()).b.contains(schemeSpecificPart)) {
                    return;
                }
                iubVar.c.a(iubVar);
            }
        };
        Object objA = this.l.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.q = !r1.isNegative();
        this.c = new agux() { // from class: itt
            @Override // defpackage.agux
            public final Object a(Object obj) {
                zdy zdyVar = iub.a;
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object b(defpackage.iub r7, defpackage.agsw r8) {
        /*
            boolean r0 = r8 instanceof defpackage.itw
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r8
            itw r0 = (defpackage.itw) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            itw r0 = new itw
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r2 = defpackage.agtg.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            iva r7 = r0.e
            iuu r0 = r0.d
            defpackage.agpl.b(r8)
            goto L75
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.agpl.b(r8)
            iuw r8 = defpackage.iuw.a
            iuu r8 = new iuu
            r8.<init>()
            ivb r3 = defpackage.ivb.a
            iva r3 = new iva
            r3.<init>()
            ztw r5 = r7.m
            j$.time.Instant r5 = r5.a()
            r5.getClass()
            abzy r5 = defpackage.acbk.b(r5)
            abxd r6 = r3.b
            int r6 = r6.memoizedSerializedSize
            r6 = r6 & r1
            if (r6 != 0) goto L5b
            r3.y()
        L5b:
            abxd r6 = r3.b
            ivb r6 = (defpackage.ivb) r6
            r6.c = r5
            int r5 = r6.b
            r5 = r5 | r4
            r6.b = r5
            r0.d = r8
            r0.e = r3
            r0.c = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 == r2) goto Lc9
            r0 = r8
            r8 = r7
            r7 = r3
        L75:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            abxd r2 = r7.b
            int r2 = r2.memoizedSerializedSize
            r2 = r2 & r1
            if (r2 != 0) goto L81
            r7.y()
        L81:
            abxd r2 = r7.b
            ivb r2 = (defpackage.ivb) r2
            ivb r3 = defpackage.ivb.a
            abxs r3 = r2.d
            boolean r4 = r3.c()
            if (r4 != 0) goto L9a
            int r4 = r3.size()
            int r4 = r4 + r4
            abxs r3 = r3.d(r4)
            r2.d = r3
        L9a:
            abxs r2 = r2.d
            defpackage.abus.m(r8, r2)
            abxd r8 = r0.b
            int r8 = r8.memoizedSerializedSize
            r8 = r8 & r1
            if (r8 != 0) goto La9
            r0.y()
        La9:
            abxd r8 = r0.b
            iuw r8 = (defpackage.iuw) r8
            abxd r7 = r7.v()
            ivb r7 = (defpackage.ivb) r7
            iuw r1 = defpackage.iuw.a
            r7.getClass()
            r8.c = r7
            r7 = 2
            r8.b = r7
            abxd r7 = r0.v()
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r7.getClass()
            return r7
        Lc9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.b(iub, agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.agsw r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.itv
            if (r0 == 0) goto L13
            r0 = r5
            itv r0 = (defpackage.itv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            itv r0 = new itv
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.agpl.b(r5)
            fiu r5 = r4.e
            r0.c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.a(agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.gzs r8, java.lang.String r9, java.util.List r10, java.util.List r11, defpackage.agsw r12) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.c(gzs, java.lang.String, java.util.List, java.util.List, agsw):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[PHI: r1 r2 r11
  0x0061: PHI (r1v8 ??) = (r1v5 ??), (r1v10 ??) binds: [B:36:0x00c8, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r2v3 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:36:0x00c8, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x0061: PHI (r11v26 java.lang.Object) = (r11v19 java.lang.Object), (r11v1 java.lang.Object) binds: [B:36:0x00c8, B:15:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1 A[PHI: r3 r4 r5 r11
  0x00e1: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:39:0x00de, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r4v1 java.util.List) = (r4v0 java.util.List), (r4v2 java.util.List) binds: [B:39:0x00de, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r5v2 java.util.List) = (r5v1 java.util.List), (r5v3 java.util.List) binds: [B:39:0x00de, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r11v29 java.lang.Object) = (r11v28 java.lang.Object), (r11v1 java.lang.Object) binds: [B:39:0x00de, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.agsw r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.d(agsw):java.lang.Object");
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        return b(this, agswVar);
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        this.j.g(this.p);
        this.i.q(this.n);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            this.h.d((fxk) it.next());
        }
    }

    @Override // defpackage.ite
    public final void i() {
        gzv gzvVar = this.p;
        gzvVar.getClass();
        this.j.m.remove(gzvVar);
        this.i.p(this.n);
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            this.h.a((fxk) it.next());
        }
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.c = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:33:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.String r11, java.lang.String r12, java.util.List r13, java.util.List r14, defpackage.agsw r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.itz
            if (r0 == 0) goto L13
            r0 = r15
            itz r0 = (defpackage.itz) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            itz r0 = new itz
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.e
            agtg r1 = defpackage.agtg.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r11 = r0.d
            java.lang.Object r12 = r0.c
            java.lang.Object r13 = r0.b
            java.lang.Object r14 = r0.a
            java.lang.String r2 = r0.h
            defpackage.agpl.b(r15)
            r8 = r13
            r7 = r14
            r9 = r0
            r6 = r2
            goto Lc1
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3e:
            defpackage.agpl.b(r15)
            android.content.Intent r15 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r15.<init>(r2)
            android.content.Intent r11 = r15.addCategory(r11)
            r11.getClass()
            hab r15 = r10.j
            android.content.Intent r2 = defpackage.hab.d
            boolean r2 = r11.filterEquals(r2)
            if (r2 == 0) goto L5c
            java.util.List r11 = r15.k
            goto L69
        L5c:
            android.content.Intent r2 = defpackage.hab.e
            boolean r11 = r11.filterEquals(r2)
            if (r11 == 0) goto L67
            java.util.List r11 = r15.l
            goto L69
        L67:
            agrd r11 = defpackage.agrd.a
        L69:
            java.util.Map r15 = r15.j
            java.util.Collection r15 = r15.values()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r15.iterator()
        L78:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r15.next()
            r5 = r4
            gzs r5 = (defpackage.gzs) r5
            java.lang.String r5 = r5.c
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L78
            r2.add(r4)
            goto L78
        L91:
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.Iterator r15 = r2.iterator()
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r0
            r12 = r11
            r11 = r15
        La0:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Lc7
            java.lang.Object r13 = r11.next()
            r5 = r13
            gzs r5 = (defpackage.gzs) r5
            r9.h = r6
            r9.a = r7
            r9.b = r8
            r9.c = r12
            r9.d = r11
            r9.g = r3
            r4 = r10
            java.lang.Object r15 = r4.c(r5, r6, r7, r8, r9)
            if (r15 != r1) goto Lc1
            return r1
        Lc1:
            iur r15 = (defpackage.iur) r15
            r12.add(r15)
            goto La0
        Lc7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iub.n(java.lang.String, java.lang.String, java.util.List, java.util.List, agsw):java.lang.Object");
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
