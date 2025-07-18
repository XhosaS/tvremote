package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bde extends BroadcastReceiver {
    public static volatile byj a;
    public static volatile byj b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", b.c(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        byj byjVar = b;
        if (byjVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        bcn[] bcnVarArrB = ((cih) byjVar.a).b(stringExtra);
        if (bcnVarArrB != null) {
            for (bcn bcnVar : bcnVarArrB) {
                cih cihVar = bcn.h;
                bcnVar.a();
            }
        }
    }
}
