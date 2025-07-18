package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ucd implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ucg b;

    public ucd(ucg ucgVar, Bundle bundle) {
        this.a = bundle;
        this.b = ucgVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof ubw) {
            this.b.d(udeVar, this.a);
            ((ubw) udeVar).a();
        }
    }
}
