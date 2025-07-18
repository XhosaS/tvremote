package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ucl implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ucn b;

    public ucl(ucn ucnVar, Bundle bundle) {
        this.a = bundle;
        this.b = ucnVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof udb) {
            Bundle bundle = new Bundle();
            ((udb) udeVar).a();
            String strE = this.b.e(udeVar);
            strE.getClass();
            this.a.putBundle(strE, bundle);
        }
    }
}
