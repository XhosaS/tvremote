package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ucf implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ucg b;

    public ucf(ucg ucgVar, Bundle bundle) {
        this.a = bundle;
        this.b = ucgVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof ucb) {
            this.b.d(udeVar, this.a);
            ((ucb) udeVar).a();
        }
    }
}
