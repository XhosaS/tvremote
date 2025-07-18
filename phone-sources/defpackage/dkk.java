package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkk implements dkr {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ ysk b;

    public dkk(AtomicReference atomicReference, ysk yskVar) {
        this.a = atomicReference;
        this.b = yskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dkr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yjz r6, defpackage.yih r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dkj
            if (r0 == 0) goto L13
            r0 = r7
            dkj r0 = (defpackage.dkj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkj r0 = new dkj
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            defpackage.ybn.f(r7)
            goto L62
        L2f:
            defpackage.ybn.f(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.a
            ysk r2 = r5.b
            r0.c = r3
            yof r4 = new yof
            yih r0 = defpackage.wcq.S(r0)
            r4.<init>(r0, r3)
            r4.v()
            bil r0 = new bil
            r3 = 3
            r0.<init>(r2, r3)
            r4.b(r0)
            java.lang.Object r7 = r7.getAndSet(r4)
            yoe r7 = (defpackage.yoe) r7
            if (r7 == 0) goto L58
            defpackage.ykr.k(r7)
        L58:
            r2.b(r6)
            java.lang.Object r6 = r4.i()
            if (r6 != r1) goto L62
            return r1
        L62:
            yfs r6 = new yfs
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkk.a(yjz, yih):java.lang.Object");
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public final /* synthetic */ yik getKey() {
        return dkr.c;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }
}
