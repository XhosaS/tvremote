package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfi implements yij {
    public static final bbx b = new bbx();
    public final yii a;

    public gfi(yii yiiVar) {
        this.a = yiiVar;
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
    public final yik<gfi> getKey() {
        return b;
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
