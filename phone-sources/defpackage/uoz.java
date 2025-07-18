package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uoz extends BroadcastReceiver {
    public upa a;
    public Context b;

    public uoz(upa upaVar) {
        this.a = upaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        upa upaVar = this.a;
        if (upaVar != null && upaVar.b()) {
            upa upaVar2 = this.a;
            FirebaseMessaging firebaseMessaging = upaVar2.a;
            FirebaseMessaging.l(upaVar2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
