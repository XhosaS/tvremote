package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lhn extends kuj {
    final /* synthetic */ lho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhn(lho lhoVar, lco lcoVar) {
        super(lcoVar);
        this.b = lhoVar;
    }

    @Override // defpackage.kuj
    public final void b() {
        lho lhoVar = this.b;
        lhoVar.e();
        lbk lbkVar = lhoVar.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.k.a("Starting upload from DelayedRunnable");
        lhoVar.m.Z();
    }
}
