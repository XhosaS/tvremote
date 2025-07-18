package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aamv extends BroadcastReceiver {
    public aamw a;

    public aamv(aamw aamwVar) {
        this.a = aamwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aamw aamwVar = this.a;
        if (aamwVar != null && aamwVar.b()) {
            if (FirebaseInstanceId.m()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            aamw aamwVar2 = this.a;
            aamwVar2.a.h(aamwVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
