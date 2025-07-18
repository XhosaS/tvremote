package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfr extends tfj {
    final /* synthetic */ itp a;

    public tfr(itp itpVar) {
        this.a = itpVar;
    }

    @Override // defpackage.tfj
    public final void a() {
        tfs tfsVar = (tfs) this.a.a;
        tfsVar.m.asBinder().unlinkToDeath(tfsVar.j, 0);
        tfsVar.m = null;
        tfsVar.f = false;
    }
}
