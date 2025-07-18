package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvh extends xvx {
    final /* synthetic */ xvi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvh(xvi xviVar) {
        super(xviVar.b.f);
        this.a = xviVar;
    }

    @Override // defpackage.xvx
    public final void a() {
        int i = yfl.a;
        xvi xviVar = this.a;
        if (xviVar.a != null) {
            return;
        }
        try {
            xviVar.c.e();
        } catch (Throwable th) {
            this.a.b(xtk.c.d(th).e("Failed to call onReady."));
        }
    }
}
