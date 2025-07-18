package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class orb extends oqk {
    public orb() {
        super(ngl.START_SERVICE, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 10) {
            throw new IllegalArgumentException();
        }
        ngy ngyVar = (ngy) tstVar.c();
        ngw ngwVar = ngyVar.b == 10 ? (ngw) ngyVar.c : ngw.a;
        Context context = oqpVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((ngwVar.b & 1) != 0) {
            intent.setAction(ngwVar.c);
        }
        if ((ngwVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, ngwVar.d));
        }
        for (int i = 0; i < ngwVar.e.size(); i++) {
            intent.addCategory((String) ngwVar.e.get(i));
        }
        Iterator<E> it = ngwVar.f.iterator();
        while (it.hasNext()) {
            qtl.aI(intent, (ngr) it.next());
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        String.valueOf(intent);
        if (Build.VERSION.SDK_INT < 26 || !ngwVar.g) {
            context.startService(intent);
            return oqpVar;
        }
        context.startForegroundService(intent);
        return oqpVar;
    }

    @Override // defpackage.oqk
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
