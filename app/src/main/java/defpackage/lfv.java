package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfv extends kuj {
    final /* synthetic */ lgp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfv(lgp lgpVar, lco lcoVar) {
        super(lcoVar);
        this.b = lgpVar;
    }

    @Override // defpackage.kuj
    public final void b() {
        lgp lgpVar = this.b;
        lgpVar.g();
        if (lgpVar.w()) {
            lbk lbkVar = lgpVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.a("Inactivity, disconnecting from the service");
            lgpVar.k();
        }
    }
}
