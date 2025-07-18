package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaqq extends BroadcastReceiver {
    final /* synthetic */ aaqr a;
    private aaqr b;

    public aaqq(aaqr aaqrVar, aaqr aaqrVar2) {
        this.a = aaqrVar;
        this.b = aaqrVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        aaqr aaqrVar = this.b;
        if (aaqrVar != null && aaqrVar.a()) {
            if (aaqr.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            aaqr aaqrVar2 = this.b;
            aaqrVar2.b.b(aaqrVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
