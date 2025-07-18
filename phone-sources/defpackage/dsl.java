package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsl implements bby {
    public final yow a;
    public final yjk c;
    public long f;
    public yoe g;
    private final bah h = new bah(new ddd(this, 4));
    public final Object d = new Object();
    public int e = 5;

    public dsl(yow yowVar, yjk yjkVar) {
        this.a = yowVar;
        this.c = yjkVar;
    }

    @Override // defpackage.bby
    public final Object a(yjv yjvVar, yih yihVar) {
        return this.h.a(yjvVar, yihVar);
    }

    public final void b(long j) {
        this.h.b(j);
        synchronized (this.d) {
            this.f = j;
        }
    }

    public final void c() {
        synchronized (this.d) {
            yoe yoeVar = this.g;
            if (yoeVar != null) {
                yoeVar.e(null);
            }
        }
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
        return bby.b;
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
