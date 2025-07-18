package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzc extends BroadcastReceiver {
    public static volatile zft a;
    public static volatile zft b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.cg(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        zft zftVar = b;
        if (zftVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        ryp[] rypVarArrG = ((unx) zftVar.a).g(stringExtra);
        if (rypVarArrG != null) {
            for (ryp rypVar : rypVarArrG) {
                unx unxVar = ryp.h;
                rypVar.a();
            }
        }
    }
}
