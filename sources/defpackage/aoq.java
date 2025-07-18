package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoq extends anx {
    public aoq() {
        super(aco.START_SERVICE, 10L);
    }

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        if (!bygVar.f() || ((adb) bygVar.b()).b != 10) {
            throw new IllegalArgumentException();
        }
        adb adbVar = (adb) bygVar.b();
        acz aczVar = adbVar.b == 10 ? (acz) adbVar.c : acz.a;
        Context context = aodVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((aczVar.b & 1) != 0) {
            intent.setAction(aczVar.c);
        }
        if ((aczVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, aczVar.d));
        }
        for (int i = 0; i < aczVar.e.size(); i++) {
            intent.addCategory((String) aczVar.e.get(i));
        }
        Iterator it = aczVar.f.iterator();
        while (it.hasNext()) {
            sd.e(intent, (acu) it.next());
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(String.valueOf(String.valueOf(intent))));
        if (Build.VERSION.SDK_INT < 26 || !aczVar.g) {
            context.startService(intent);
            return aodVar;
        }
        context.startForegroundService(intent);
        return aodVar;
    }

    @Override // defpackage.anx
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
