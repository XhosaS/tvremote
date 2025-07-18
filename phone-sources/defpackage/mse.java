package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mse extends fus {
    final /* synthetic */ msf a;

    public mse(msf msfVar) {
        this.a = msfVar;
    }

    @Override // defpackage.fus
    public final void onRoutePresentationDisplayChanged(fuy fuyVar, fux fuxVar) {
        msf msfVar = this.a;
        if (fuxVar != msfVar.e || fuxVar.h() == null) {
            msfVar.b();
        } else {
            msfVar.g.b();
        }
    }

    @Override // defpackage.fus
    public final void onRouteSelected(fuy fuyVar, fux fuxVar) {
        this.a.b();
    }

    @Override // defpackage.fus
    public final void onRouteUnselected(fuy fuyVar, fux fuxVar) {
        this.a.b();
    }
}
