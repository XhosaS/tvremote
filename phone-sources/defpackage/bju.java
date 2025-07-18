package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bju implements bfq, yij {
    public static final bjt a = new bjt();
    public final bas b;

    public bju(bas basVar) {
        this.b = basVar;
    }

    @Override // defpackage.bfq
    public final List a() {
        return this.b.V();
    }

    public final void b(Throwable th, Object obj) {
        bcm.l(th, new aye(this, obj, 4, null));
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
    public final yik<?> getKey() {
        return a;
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
