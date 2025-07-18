package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksc extends ksg {
    final /* synthetic */ String a = "Error with data collection. Data lost.";
    final /* synthetic */ Object b;
    final /* synthetic */ ksp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksc(ksp kspVar, Object obj) {
        super(kspVar, false);
        this.b = obj;
        this.c = kspVar;
    }

    @Override // defpackage.ksg
    public final void a() {
        kqz kqzVar = this.c.f;
        kkk.k(kqzVar);
        kqzVar.logHealthData(5, this.a, new kmf(this.b), new kmf(null), new kmf(null));
    }
}
