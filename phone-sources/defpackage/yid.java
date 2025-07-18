package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yid implements yij {
    private final yik<?> key;

    public yid(yik<?> yikVar) {
        yikVar.getClass();
        this.key = yikVar;
    }

    @Override // defpackage.yil
    public <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public <E extends yij> E get(yik<E> yikVar) {
        return (E) wcq.U(this, yikVar);
    }

    @Override // defpackage.yij
    public yik<?> getKey() {
        return this.key;
    }

    @Override // defpackage.yil
    public yil minusKey(yik<?> yikVar) {
        return wcq.V(this, yikVar);
    }

    @Override // defpackage.yil
    public yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }
}
