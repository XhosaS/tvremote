package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agaz extends agbd {
    final /* synthetic */ agbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agaz(agbe agbeVar) {
        super(agbeVar);
        this.a = agbeVar;
        int i = agfd.a;
    }

    @Override // defpackage.agbd
    public final void a() {
        int i;
        ahwx ahwxVar = new ahwx();
        int i2 = agfd.a;
        agbe agbeVar = this.a;
        synchronized (agbeVar.a) {
            ahwx ahwxVar2 = agbeVar.b;
            ahwxVar.fF(ahwxVar2, ahwxVar2.f());
            agbeVar.d = false;
            i = agbeVar.i;
        }
        agbe agbeVar2 = this.a;
        agbeVar2.f.fF(ahwxVar, ahwxVar.b);
        synchronized (agbeVar2.a) {
            agbeVar2.i -= i;
        }
    }
}
