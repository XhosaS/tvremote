package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tff extends tes {
    public tff(tfg tfgVar, kwy kwyVar) {
        new ulp("OnRequestInstallCallback", (byte[]) null);
        super(tfgVar, kwyVar);
    }

    @Override // defpackage.tes
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.b.w(new tey((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
