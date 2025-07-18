package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agba extends agbd {
    final /* synthetic */ agbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agba(agbe agbeVar) {
        super(agbeVar);
        this.a = agbeVar;
        int i = agfd.a;
    }

    @Override // defpackage.agbd
    public final void a() {
        ahwx ahwxVar = new ahwx();
        int i = agfd.a;
        agbe agbeVar = this.a;
        synchronized (agbeVar.a) {
            ahwx ahwxVar2 = agbeVar.b;
            ahwxVar.fF(ahwxVar2, ahwxVar2.b);
            agbeVar.e = false;
        }
        agbe agbeVar2 = this.a;
        agbeVar2.f.fF(ahwxVar, ahwxVar.b);
        agbeVar2.f.flush();
    }
}
