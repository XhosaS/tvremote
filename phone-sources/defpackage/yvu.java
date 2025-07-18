package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvu implements yil {
    public final Throwable a;
    private final /* synthetic */ yil b;

    public yvu(Throwable th, yil yilVar) {
        this.b = yilVar;
        this.a = th;
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) this.b.fold(r, yjzVar);
    }

    @Override // defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        return (E) this.b.get(yikVar);
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return this.b.minusKey(yikVar);
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return this.b.plus(yilVar);
    }
}
