package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxc {
    public static final /* synthetic */ int b = 0;
    private static final vrm c;
    private static final String d;
    private static final String e;
    private static final String f;
    public vrm a;
    private final ExecutorService g;
    private final Map h;
    private final nhl i;

    static {
        vtw vtwVarM = vrm.a.m();
        vtwVarM.getClass();
        c = vxr.ah(vtwVarM);
        d = uvp.a.a;
        e = uvq.a.a;
        f = uvr.a.a;
    }

    public qxc(ExecutorService executorService, nhl nhlVar) {
        nhlVar.getClass();
        this.g = executorService;
        this.i = nhlVar;
        this.h = new LinkedHashMap();
        this.a = c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.accounts.Account r12, java.lang.String r13, boolean r14, defpackage.yih r15) throws java.lang.Exception {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.qwx
            if (r0 == 0) goto L13
            r0 = r15
            qwx r0 = (defpackage.qwx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qwx r0 = new qwx
            r0.<init>(r11, r15)
        L18:
            r15 = r0
            java.lang.Object r0 = r15.b
            yio r1 = defpackage.yio.a
            int r2 = r15.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r14 = r15.a
            defpackage.ybn.f(r0)     // Catch: java.lang.Exception -> L2a
            goto L93
        L2a:
            r0 = move-exception
            r12 = r0
            goto Lb4
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            defpackage.ybn.f(r0)
            nhl r0 = r11.i     // Catch: java.lang.Exception -> L2a
            nhn r5 = new nhn     // Catch: java.lang.Exception -> L2a
            java.lang.String[] r13 = new java.lang.String[]{r13}     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r5.<init>(r12, r13, r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r12 = r0.a     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            java.lang.String r13 = defpackage.nhd.a     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            android.accounts.Account r13 = r5.a     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            defpackage.ocv.aF(r13)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            java.lang.String r13 = r13.name     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            defpackage.ocv.aD(r13)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            java.lang.String r13 = "This call can involve network request. It is unsafe to call from main thread."
            defpackage.ocv.az(r13)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            r13 = r12
            android.content.Context r13 = (android.content.Context) r13     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            defpackage.rwv.c(r13)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            nhf r4 = new nhf     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            r6 = r12
            android.content.Context r6 = (android.content.Context) r6     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            r4.<init>()     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            android.content.ComponentName r13 = defpackage.nhk.d     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            android.content.Context r12 = (android.content.Context) r12     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            java.lang.Object r12 = defpackage.nhk.g(r12, r13, r4)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            r12.intValue()     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            onz r12 = defpackage.osk.r(r12)     // Catch: java.lang.Exception -> L2a defpackage.nhc -> L80 java.io.IOException -> L82
            goto L88
        L80:
            r0 = move-exception
            goto L83
        L82:
            r0 = move-exception
        L83:
            r12 = r0
            onz r12 = defpackage.osk.q(r12)     // Catch: java.lang.Exception -> L2a
        L88:
            r15.a = r14     // Catch: java.lang.Exception -> L2a
            r15.d = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = defpackage.wae.G(r12, r15)     // Catch: java.lang.Exception -> L2a
            if (r0 != r1) goto L93
            return r1
        L93:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L2a
            if (r0 != 0) goto L98
            goto L9f
        L98:
            int r12 = r0.intValue()     // Catch: java.lang.Exception -> L2a
            if (r12 != r3) goto L9f
            goto Laf
        L9f:
            r12 = 0
            if (r0 != 0) goto La3
            goto Lab
        La3:
            int r13 = r0.intValue()     // Catch: java.lang.Exception -> L2a
            r15 = 2
            if (r13 != r15) goto Lab
            goto Lae
        Lab:
            if (r14 == 0) goto Lae
            goto Laf
        Lae:
            r3 = r12
        Laf:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L2a
            return r12
        Lb4:
            boolean r13 = r12 instanceof defpackage.nhc
            if (r13 != 0) goto Lbe
            boolean r13 = r12 instanceof java.io.IOException
            if (r13 == 0) goto Lbd
            goto Lbe
        Lbd:
            throw r12
        Lbe:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxc.a(android.accounts.Account, java.lang.String, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qxk r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.qwy
            if (r0 == 0) goto L13
            r0 = r7
            qwy r0 = (defpackage.qwy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qwy r0 = new qwy
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ybn.f(r7)
            r0.c = r3
            java.util.concurrent.ExecutorService r7 = r5.g
            ypx r2 = new ypx
            r2.<init>(r7)
            qxb r7 = new qxb
            r3 = 0
            r7.<init>(r6, r5, r3)
            java.lang.Object r7 = defpackage.ykr.l(r2, r7, r0)
            if (r7 == r1) goto L95
        L47:
            vrm r7 = (defpackage.vrm) r7
            vve r6 = r7.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r1 = r5.h
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L90
            java.util.Iterator r2 = r2.iterator()
        L71:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L90
            java.lang.Object r3 = r2.next()
            qxs r3 = (defpackage.qxs) r3
            vve r4 = r7.b
            java.util.Map r4 = j$.util.DesugarCollections.unmodifiableMap(r4)
            java.lang.Object r4 = r4.get(r0)
            r4.getClass()
            vrk r4 = (defpackage.vrk) r4
            r3.a(r4)
            goto L71
        L90:
            r1.remove(r0)
            goto L57
        L94:
            return r7
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxc.b(qxk, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.vou r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxc.c(vou, yih):java.lang.Object");
    }

    public final void d(vrn vrnVar, qxs qxsVar) {
        vrk vrkVar = (vrk) DesugarCollections.unmodifiableMap(this.a.b).get(vrnVar != null ? vrnVar.c : null);
        if (vrkVar == null) {
            vrk vrkVar2 = vrq.a;
            vrkVar = vrq.a;
        }
        if (vrnVar != null && !DesugarCollections.unmodifiableMap(this.a.b).containsKey(vrnVar.c)) {
            Map map = this.h;
            String str = vrnVar.c;
            Object arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(str, arrayList);
            }
            ((List) arrayList).add(qxsVar);
        }
        qxsVar.a(vrkVar);
    }
}
