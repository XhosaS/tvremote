package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ung extends BroadcastReceiver {
    public unh a;

    public ung(unh unhVar) {
        this.a = unhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        unh unhVar = this.a;
        if (unhVar != null && unhVar.b()) {
            aafi aafiVar = FirebaseInstanceId.h;
            unh unhVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = unhVar2.a;
            FirebaseInstanceId.p(unhVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
