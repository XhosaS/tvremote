package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xve extends xvx {
    final /* synthetic */ xsm a;
    final /* synthetic */ xvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xve(xvi xviVar, xsm xsmVar) {
        super(xviVar.b.f);
        this.a = xsmVar;
        this.b = xviVar;
    }

    @Override // defpackage.xvx
    public final void a() {
        int i = yfl.a;
        xvi xviVar = this.b;
        if (xviVar.a != null) {
            return;
        }
        try {
            xviVar.c.c(this.a);
        } catch (Throwable th) {
            this.b.b(xtk.c.d(th).e("Failed to read headers"));
        }
    }
}
