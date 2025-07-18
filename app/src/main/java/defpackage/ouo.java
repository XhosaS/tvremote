package defpackage;

import com.google.android.libraries.home.auth.AuthRecoveryActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
class ouo implements uo {
    final /* synthetic */ oup a;

    public ouo(oup oupVar) {
        this.a = oupVar;
    }

    @Override // defpackage.uo
    public final void a() {
        oup oupVar = this.a;
        if (oupVar.b) {
            return;
        }
        oupVar.b = true;
        ((AuthRecoveryActivity) oupVar).a = (ouk) ((etb) oupVar.cO().dN()).c.kz.a();
    }
}
