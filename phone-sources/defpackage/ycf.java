package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ycf extends ycg {
    final /* synthetic */ ych a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycf(ych ychVar) {
        super(ychVar);
        this.a = ychVar;
        int i = yfl.a;
    }

    @Override // defpackage.ycg
    public final void a() {
        zgk zgkVar = new zgk();
        int i = yfl.a;
        ych ychVar = this.a;
        synchronized (ychVar.a) {
            zgk zgkVar2 = ychVar.b;
            zgkVar.eW(zgkVar2, zgkVar2.b);
            ychVar.e = false;
        }
        ych ychVar2 = this.a;
        ychVar2.f.eW(zgkVar, zgkVar.b);
        ychVar2.f.flush();
    }
}
