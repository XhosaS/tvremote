package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yce extends ycg {
    final /* synthetic */ ych a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yce(ych ychVar) {
        super(ychVar);
        this.a = ychVar;
        int i = yfl.a;
    }

    @Override // defpackage.ycg
    public final void a() {
        int i;
        zgk zgkVar = new zgk();
        int i2 = yfl.a;
        ych ychVar = this.a;
        synchronized (ychVar.a) {
            zgk zgkVar2 = ychVar.b;
            zgkVar.eW(zgkVar2, zgkVar2.h());
            ychVar.d = false;
            i = ychVar.i;
        }
        ych ychVar2 = this.a;
        ychVar2.f.eW(zgkVar, zgkVar.b);
        synchronized (ychVar2.a) {
            ychVar2.i -= i;
        }
    }
}
