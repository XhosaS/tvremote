package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uci implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ucn b;

    public uci(ucn ucnVar, Bundle bundle) {
        this.a = bundle;
        this.b = ucnVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof ucr) {
            this.b.d(udeVar, this.a);
            ((ucr) udeVar).a();
        }
    }
}
