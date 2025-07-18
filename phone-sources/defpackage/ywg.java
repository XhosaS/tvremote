package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ywg<T> implements ysy<T> {
    private final yil a;
    private final Object b;
    private final yjz c;

    public ywg(ysy ysyVar, yil yilVar) {
        this.a = yilVar;
        this.b = yxr.a(yilVar);
        this.c = new daz(ysyVar, (yih) null, 14);
    }

    @Override // defpackage.ysy
    public final Object emit(T t, yih<? super ygi> yihVar) {
        Object objAa = wae.aa(this.a, t, this.b, this.c, yihVar);
        return objAa == yio.a ? objAa : ygi.a;
    }
}
