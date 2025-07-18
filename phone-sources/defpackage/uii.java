package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uii extends uhn {
    final /* synthetic */ uik a;
    private final ufv b;

    public uii(uik uikVar, ufv ufvVar) {
        this.a = uikVar;
        ufvVar.getClass();
        this.b = ufvVar;
    }

    @Override // defpackage.uhn
    public final /* bridge */ /* synthetic */ Object a() {
        uhp uhpVarA = this.b.a();
        uhpVarA.getClass();
        return uhpVarA;
    }

    @Override // defpackage.uhn
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.uhn
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.uhn
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.ev((uhp) obj);
    }

    @Override // defpackage.uhn
    public final boolean g() {
        return this.a.isDone();
    }
}
