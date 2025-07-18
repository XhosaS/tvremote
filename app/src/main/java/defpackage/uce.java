package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uce implements ucm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ ucg b;

    public uce(ucg ucgVar, Bundle bundle) {
        this.a = bundle;
        this.b = ucgVar;
    }

    @Override // defpackage.ucm
    public final void a(ude udeVar) {
        if (udeVar instanceof uca) {
            this.b.d(udeVar, this.a);
            ((uca) udeVar).a();
        }
    }
}
