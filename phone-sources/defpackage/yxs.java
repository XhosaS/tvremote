package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxs implements yqz {
    private final Object a;
    private final ThreadLocal b;
    private final yik c;

    public yxs(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new yxt(threadLocal);
    }

    @Override // defpackage.yqz
    public final Object eI(yil yilVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = this.a;
        Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.yqz
    public final void eJ(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.yil
    public final <R> R fold(R r, yjz<? super R, ? super yij, ? extends R> yjzVar) {
        return (R) wcq.T(this, r, yjzVar);
    }

    @Override // defpackage.yij, defpackage.yil
    public final <E extends yij> E get(yik<E> yikVar) {
        if (yks.e(this.c, yikVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.yij
    public final yik<?> getKey() {
        return this.c;
    }

    @Override // defpackage.yil
    public final yil minusKey(yik<?> yikVar) {
        return yks.e(this.c, yikVar) ? yim.a : this;
    }

    @Override // defpackage.yil
    public final yil plus(yil yilVar) {
        return wcq.W(this, yilVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ")";
    }
}
