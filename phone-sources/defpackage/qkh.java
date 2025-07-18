package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkh implements qjw {
    private static final tvn c = tvn.n("GnpSdk");
    public final qmr a;
    public final yfo b;
    private final xbw d;
    private final yil e;
    private final yil f;
    private final tst g;
    private final qoj h;
    private final Context i;
    private final tst j;
    private final rbi k;
    private final cb l;

    public qkh(qmr qmrVar, rbi rbiVar, cb cbVar, xbw xbwVar, yil yilVar, yil yilVar2, tst tstVar, qoj qojVar, Context context, osk oskVar, tst tstVar2, yfo yfoVar) {
        xbwVar.getClass();
        qojVar.getClass();
        oskVar.getClass();
        yfoVar.getClass();
        this.a = qmrVar;
        this.k = rbiVar;
        this.l = cbVar;
        this.d = xbwVar;
        this.e = yilVar;
        this.f = yilVar2;
        this.g = tstVar;
        this.h = qojVar;
        this.i = context;
        this.j = tstVar2;
        this.b = yfoVar;
    }

    private static final boolean f(List list, qen qenVar) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (yks.e(((vji) it.next()).h, String.valueOf(qenVar.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qjw
    public final Object a(List list, Map map, qjz qjzVar, String str, int i, qjx qjxVar, qel qelVar, vmd vmdVar, String str2, yih yihVar) {
        return ykr.l(this.f, new qke(this, list, map, qjzVar, qelVar, vmdVar, i, qjxVar, str, str2, null), yihVar);
    }

    @Override // defpackage.qjw
    public final Object b(List list, Map map, String str, vjj vjjVar, yih yihVar) {
        return ykr.l(this.e, new kaw(list, this, str, vjjVar, map, (yih) null, 4), yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x05db, code lost:
    
        if (r5 != r4) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        ((defpackage.tvk) defpackage.qkh.c.f()).s("Couldn't find registration result id match.");
        r27.h.f(r27.i.getPackageName(), "MISSING_ID");
        r4 = new defpackage.qdj(new java.lang.IllegalArgumentException("Couldn't find registration result id match."), 46);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r15v12, types: [qlp] */
    /* JADX WARN: Type inference failed for: r15v14, types: [qlq] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0, types: [qkh] */
    /* JADX WARN: Type inference failed for: r2v18, types: [qdl] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r28, java.util.Map r29, defpackage.qjz r30, defpackage.qel r31, long r32, defpackage.vmd r34, defpackage.yih r35) {
        /*
            Method dump skipped, instructions count: 1695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkh.c(java.util.List, java.util.Map, qjz, qel, long, vmd, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.util.Map r5, java.util.Map r6, defpackage.qel r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.qkg
            if (r0 == 0) goto L13
            r0 = r8
            qkg r0 = (defpackage.qkg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qkg r0 = new qkg
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r8)     // Catch: java.lang.Exception -> L27
            goto L56
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r8)
            boolean r7 = r7.a()
            if (r7 == 0) goto L56
            tst r7 = r4.g
            ttd r7 = (defpackage.ttd) r7     // Catch: java.lang.Exception -> L27
            java.lang.Object r7 = r7.a     // Catch: java.lang.Exception -> L27
            jbr r7 = (defpackage.jbr) r7     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = defpackage.jbr.s(r5, r6)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L56
            return r1
        L4b:
            tvn r6 = defpackage.qkh.c
            tuv r6 = r6.g()
            java.lang.String r7 = "Failed to report registration results"
            defpackage.a.co(r6, r7, r5)
        L56:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qkh.d(java.util.Map, java.util.Map, qel, yih):java.lang.Object");
    }

    public final cb e(qel qelVar) {
        if (qelVar.a()) {
            return this.l;
        }
        if (!qelVar.b()) {
            throw new IllegalStateException("targetType is not supported");
        }
        Object objB = this.d.b();
        objB.getClass();
        return (cb) objB;
    }
}
