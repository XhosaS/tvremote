package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yxm extends yuk {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxm(Iterable[] iterableArr) {
        super(2, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.yuk
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
