package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihb extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihb(yjv yjvVar, AtomicReference atomicReference, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = yjvVar;
        this.d = atomicReference;
        this.b = yjzVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((ihb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
        return ((ihb) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ypc] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        if (this.f == 0) {
            ihb ihbVar = new ihb((ysx) this.b, (ypc) this.c, (yjz) this.d, yihVar, 0);
            ihbVar.e = obj;
            return ihbVar;
        }
        ihb ihbVar2 = new ihb((yjv) this.c, (AtomicReference) this.d, (yjz) this.b, yihVar, 1);
        ihbVar2.e = obj;
        return ihbVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (defpackage.yoz.u(r7.a, r6) != r0) goto L17;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ysx] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ypc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, yqe] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L76
            yio r0 = defpackage.yio.a
            int r3 = r6.a
            if (r3 == 0) goto L20
            if (r3 == r2) goto L18
            java.lang.Object r0 = r6.e
            dhk r0 = (defpackage.dhk) r0
            defpackage.ybn.f(r7)     // Catch: java.lang.Throwable -> L16
            goto L63
        L16:
            r7 = move-exception
            goto L6e
        L18:
            java.lang.Object r1 = r6.e
            dhk r1 = (defpackage.dhk) r1
            defpackage.ybn.f(r7)
            goto L53
        L20:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r6.e
            yow r7 = (defpackage.yow) r7
            dhk r3 = new dhk
            yil r4 = r7.c()
            yqe r4 = defpackage.yoz.w(r4)
            java.lang.Object r5 = r6.c
            java.lang.Object r7 = r5.a(r7)
            r3.<init>(r4, r7, r1)
            java.lang.Object r7 = r6.d
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            java.lang.Object r7 = r7.getAndSet(r3)
            dhk r7 = (defpackage.dhk) r7
            if (r7 == 0) goto L52
            r6.e = r3
            r6.a = r2
            java.lang.Object r7 = r7.a
            java.lang.Object r7 = defpackage.yoz.u(r7, r6)
            if (r7 == r0) goto L6b
        L52:
            r1 = r3
        L53:
            java.lang.Object r7 = r6.b     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L6c
            r6.e = r1     // Catch: java.lang.Throwable -> L6c
            r3 = 2
            r6.a = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r7.a(r2, r6)     // Catch: java.lang.Throwable -> L6c
            if (r7 == r0) goto L6b
            r0 = r1
        L63:
            java.lang.Object r1 = r6.d
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            defpackage.a.u(r1, r0)
            return r7
        L6b:
            return r0
        L6c:
            r7 = move-exception
            r0 = r1
        L6e:
            java.lang.Object r1 = r6.d
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            defpackage.a.u(r1, r0)
            throw r7
        L76:
            yio r0 = defpackage.yio.a
            int r3 = r6.a
            if (r3 == 0) goto L80
            defpackage.ybn.f(r7)
            goto La7
        L80:
            defpackage.ybn.f(r7)
            java.lang.Object r7 = r6.e
            yow r7 = (defpackage.yow) r7
            java.lang.Object r3 = r6.c
            dbv r4 = new dbv
            r5 = 20
            r4.<init>(r3, r7, r1, r5)
            r3 = 3
            r5 = 0
            defpackage.ykr.q(r7, r1, r5, r4, r3)
            java.lang.Object r1 = r6.b
            java.lang.Object r3 = r6.d
            ioo r4 = new ioo
            r4.<init>(r7, r3, r2)
            r6.a = r2
            java.lang.Object r7 = r1.a(r4, r6)
            if (r7 != r0) goto La7
            return r0
        La7:
            ygi r7 = defpackage.ygi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihb(ysx ysxVar, ypc ypcVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = ysxVar;
        this.c = ypcVar;
        this.d = yjzVar;
    }
}
