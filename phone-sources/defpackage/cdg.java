package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdg implements bkr {
    private final bdl b = new bce(1.0f);

    @Override // defpackage.bkr
    public final float a() {
        return this.b.e();
    }

    public final void b(float f) {
        this.b.h(f);
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
        return bkr.a;
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
