package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aon extends anx {
    public aon() {
        super(aco.SEND_BROADCAST, 10L);
    }

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        if (!bygVar.f() || ((adb) bygVar.b()).b != 3) {
            throw new IllegalArgumentException();
        }
        adb adbVar = (adb) bygVar.b();
        acx acxVar = adbVar.b == 3 ? (acx) adbVar.c : acx.a;
        Context context = aodVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((acxVar.b & 1) != 0) {
            intent.setAction(acxVar.c);
        }
        if ((acxVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, acxVar.d));
        }
        if ((acxVar.b & 4) != 0) {
            intent.setData(Uri.parse(acxVar.e));
        }
        Iterator it = acxVar.f.iterator();
        while (it.hasNext()) {
            sd.e(intent, (acu) it.next());
        }
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(String.valueOf(String.valueOf(intent))));
        context.sendBroadcast(intent);
        return aodVar;
    }

    @Override // defpackage.anx
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
