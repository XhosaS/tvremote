package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iq extends ix {
    final /* synthetic */ ir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq(ir irVar) {
        super(irVar.d);
        this.a = irVar;
    }

    @Override // defpackage.ix
    protected final Object a(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.ix
    protected final void b(int i) {
        this.a.e(i);
    }
}
