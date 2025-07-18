package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaqk extends BroadcastReceiver {
    public aaql a;
    public Context b;

    public aaqk(aaql aaqlVar) {
        this.a = aaqlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aaql aaqlVar = this.a;
        if (aaqlVar != null && aaqlVar.b()) {
            if (aaql.a()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            aaql aaqlVar2 = this.a;
            aaqlVar2.a.e(aaqlVar2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
