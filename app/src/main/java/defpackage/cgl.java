package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cgl implements agux {
    final /* synthetic */ cbv a;
    final /* synthetic */ zyd b;

    public cgl(cbv cbvVar, zyd zydVar) {
        this.a = cbvVar;
        this.b = zydVar;
    }

    @Override // defpackage.agux
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof cfs) {
            this.a.d(((cfs) th).a);
        }
        this.b.cancel(false);
        return agpu.a;
    }
}
