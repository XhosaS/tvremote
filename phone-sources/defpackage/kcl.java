package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcl extends iym {
    public final yow d;
    public final Map e;
    public final idr f;
    public boolean g;
    public ypc h;
    public final iom i;
    private final kpy l;
    private final ipa m;
    private final isi n;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    public kcl(iom iomVar, ipa ipaVar, isi isiVar, iom iomVar2, kpy kpyVar, yow yowVar) {
        jzs jzsVar = (jzs) iomVar.d.b();
        jzsVar.getClass();
        kw kwVar = (kw) iomVar.b.b();
        kwVar.getClass();
        irc ircVar = (irc) iomVar.c.b();
        ircVar.getClass();
        isf isfVar = (isf) iomVar.a.b();
        isfVar.getClass();
        super(jbr.ad(new kco(jzsVar, kwVar, ircVar, isfVar)), 0, 6);
        this.m = ipaVar;
        this.n = isiVar;
        this.i = iomVar2;
        this.l = kpyVar;
        this.d = yowVar;
        this.e = new LinkedHashMap();
        this.f = new idz(wkn.UNSPECIFIED);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(boolean r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kcj
            if (r0 == 0) goto L13
            r0 = r7
            kcj r0 = (defpackage.kcj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kcj r0 = new kcj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r6 = r0.a
            java.lang.String r1 = r0.e
            int r0 = r0.f
            defpackage.ybn.f(r7)
            goto L72
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ybn.f(r7)
            idr r7 = r5.f
            java.lang.Object r7 = r7.a()
            r7.getClass()
            wkn r7 = (defpackage.wkn) r7
            wkn r2 = defpackage.wkn.INDETERMINATE
            if (r7 != r2) goto L4a
            ygi r6 = defpackage.ygi.a
            return r6
        L4a:
            int r7 = r7.ordinal()
            r2 = 3
            if (r7 == r2) goto L53
            r7 = 4
            goto L54
        L53:
            r7 = r2
        L54:
            ypc r2 = r5.h
            if (r2 != 0) goto L5e
            java.lang.String r2 = "deferred"
            defpackage.yks.c(r2)
            r2 = 0
        L5e:
            r0.f = r7
            java.lang.String r4 = "GOOGLE_TV_MOBILE_"
            r0.e = r4
            r0.a = r6
            r0.d = r3
            java.lang.Object r0 = r2.n(r0)
            if (r0 == r1) goto Ld8
            r1 = r0
            r0 = r7
            r7 = r1
            r1 = r4
        L72:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L7d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L99
            java.lang.Object r3 = r7.next()
            r4 = r3
            wnm r4 = (defpackage.wnm) r4
            java.lang.String r4 = r4.b
            r4.getClass()
            boolean r4 = defpackage.ylh.O(r4, r1)
            if (r4 == 0) goto L7d
            r2.add(r3)
            goto L7d
        L99:
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.yfm.z(r2, r1)
            r7.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        La8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r1.next()
            wnm r2 = (defpackage.wnm) r2
            wnl r3 = defpackage.wnl.a
            vtw r3 = r3.m()
            r3.getClass()
            java.lang.String r2 = r2.b
            r2.getClass()
            defpackage.wcq.J(r2, r3)
            defpackage.wcq.K(r0, r3)
            wnl r2 = defpackage.wcq.I(r3)
            r7.add(r2)
            goto La8
        Ld0:
            iom r0 = r5.i
            r0.b(r7, r6)
            ygi r6 = defpackage.ygi.a
            return r6
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcl.a(boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0172, code lost:
    
        if (a(r12, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r12) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcl.b(yih):java.lang.Object");
    }

    @Override // defpackage.iym, defpackage.sbt
    protected final void e() {
        y(sbr.class, new kci(this, (yih) null, 0));
    }
}
