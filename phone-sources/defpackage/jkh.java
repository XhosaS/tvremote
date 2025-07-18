package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkh extends ixi {
    public final Object d;
    public final Object e;
    private final Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public jkh(isy isyVar, iyz iyzVar, wkx wkxVar) {
        vvd vvdVar = wru.f;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.f = isyVar;
        this.d = iyzVar;
        wly wlyVar = ((wru) this.b).e;
        this.e = jbr.ad(isyVar.a(wlyVar == null ? wly.a : wlyVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Type inference failed for: r5v4, types: [ino, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkh.i():long");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iof, java.lang.Object] */
    public final wnp j() {
        wll wllVar = ((wtg) this.b).b;
        if (wllVar == null) {
            wllVar = wll.a;
        }
        ?? r1 = this.d;
        wllVar.getClass();
        return r1.b(wllVar, "play-movies");
    }

    public final int k() {
        List listA = ((iye) this.e).a();
        int i = 0;
        if (listA.isEmpty()) {
            return 0;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (((ixh) it.next()).dQ() == wkw.FEATURED_CAROUSEL_CARD && (i = i + 1) < 0) {
                yfm.v();
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:30:0x008a, B:31:0x008c], limit reached: 46 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009c -> B:34:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.jff
            if (r0 == 0) goto L13
            r0 = r8
            jff r0 = (defpackage.jff) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jff r0 = new jff
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r2 = r0.b
            java.lang.Object r4 = r0.a
            defpackage.ybn.f(r8)
            goto L9e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.ybn.f(r8)
            java.lang.Object r8 = r7.e
            iye r8 = (defpackage.iye) r8
            java.util.List r8 = r8.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L48:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r8.next()
            r5 = r4
            ixh r5 = (defpackage.ixh) r5
            wkw r5 = r5.dQ()
            wkw r6 = defpackage.wkw.FEATURED_CAROUSEL_CARD
            if (r5 != r6) goto L48
            r2.add(r4)
            goto L48
        L61:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
            r4 = r8
        L6b:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto La9
            java.lang.Object r8 = r2.next()
            ixh r8 = (defpackage.ixh) r8
            java.lang.Object r8 = r8.c()
            boolean r5 = r8 instanceof defpackage.wsd
            r6 = 0
            if (r5 == 0) goto L83
            wsd r8 = (defpackage.wsd) r8
            goto L84
        L83:
            r8 = r6
        L84:
            if (r8 == 0) goto La3
            wlx r8 = r8.f
            if (r8 != 0) goto L8c
            wlx r8 = defpackage.wlx.a
        L8c:
            if (r8 == 0) goto La3
            java.lang.Object r5 = r7.d
            r0.a = r4
            r0.b = r2
            r0.d = r3
            iyz r5 = (defpackage.iyz) r5
            java.lang.Object r8 = defpackage.hju.C(r5, r8, r0)
            if (r8 == r1) goto La2
        L9e:
            r6 = r8
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto La3
        La2:
            return r1
        La3:
            if (r6 == 0) goto L6b
            r4.add(r6)
            goto L6b
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkh.l(yih):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jkh(iof iofVar, ihi ihiVar, ino inoVar, wkx wkxVar) {
        vvd vvdVar = wtg.c;
        vvdVar.getClass();
        super(wkxVar, vvdVar);
        this.d = iofVar;
        this.f = ihiVar;
        this.e = inoVar;
    }
}
