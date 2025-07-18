package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xxn extends xwt {
    final /* synthetic */ xvk a;
    final /* synthetic */ xxo b;

    public xxn(xxo xxoVar, xvk xvkVar) {
        this.a = xvkVar;
        this.b = xxoVar;
    }

    @Override // defpackage.xwt
    protected final xvk b() {
        return this.a;
    }

    @Override // defpackage.xwt, defpackage.xvk
    public final void o(xvm xvmVar) {
        this.b.a.b();
        this.a.o(new xxm(this, xvmVar));
    }
}
