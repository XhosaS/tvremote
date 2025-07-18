package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class im extends ix {
    final /* synthetic */ ir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(ir irVar) {
        super(irVar.d);
        this.a = irVar;
    }

    @Override // defpackage.ix
    protected final Object a(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.ix
    protected final void b(int i) {
        this.a.e(i);
    }
}
