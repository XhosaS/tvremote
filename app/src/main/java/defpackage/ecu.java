package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class ecu implements efg {
    final /* synthetic */ ech a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ecq c;
    final /* synthetic */ edf d;

    public ecu(edf edfVar, ech echVar, boolean z, ecq ecqVar) {
        this.a = echVar;
        this.b = z;
        this.c = ecqVar;
        this.d = edfVar;
    }

    @Override // defpackage.efg
    public final void a() {
        edf edfVar = this.d;
        if (this.b) {
            ecq ecqVar = this.c;
            dyd.a();
            if (ecqVar != null) {
                edfVar.k = ecqVar;
                edfVar.f(ecqVar);
            }
        }
    }

    @Override // defpackage.efg
    public final void b(boolean z, long j) {
        dyd.a();
        ecq ecqVar = this.c;
        if (ecqVar != null) {
            ech echVar = this.a;
            this.d.g(ecqVar, this.b, z, j, echVar, 0);
        }
    }
}
