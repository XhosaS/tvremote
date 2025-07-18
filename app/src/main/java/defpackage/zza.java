package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zza extends zyb {
    final /* synthetic */ zzc a;
    private final zvh b;

    public zza(zzc zzcVar, zvh zvhVar) {
        this.a = zzcVar;
        zvhVar.getClass();
        this.b = zvhVar;
    }

    @Override // defpackage.zyb
    public final /* bridge */ /* synthetic */ Object a() {
        zyd zydVarA = this.b.a();
        zydVarA.getClass();
        return zydVarA;
    }

    @Override // defpackage.zyb
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.zyb
    public final void d(Throwable th) {
        this.a.q(th);
    }

    @Override // defpackage.zyb
    public final /* synthetic */ void e(Object obj) {
        this.a.eZ((zyd) obj);
    }

    @Override // defpackage.zyb
    public final boolean g() {
        return this.a.isDone();
    }
}
