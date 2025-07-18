package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bag implements yjv {
    final /* synthetic */ baf a;
    final /* synthetic */ bah b;
    final /* synthetic */ yld c;

    public bag(baf bafVar, bah bahVar, yld yldVar) {
        this.a = bafVar;
        this.b = bahVar;
        this.c = yldVar;
    }

    @Override // defpackage.yjv
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        bhn bhnVar;
        int i;
        baf bafVar = this.a;
        bafVar.a = null;
        bafVar.b = null;
        int i2 = this.c.a;
        do {
            bhnVar = this.b.a;
            i = bhnVar.get();
        } while (!bhnVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        return ygi.a;
    }
}
