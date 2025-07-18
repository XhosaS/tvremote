package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oqz extends oqk {
    public oqz() {
        super(ngl.SEND_BROADCAST, 10L);
    }

    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        if (!tstVar.g() || ((ngy) tstVar.c()).b != 3) {
            throw new IllegalArgumentException();
        }
        ngy ngyVar = (ngy) tstVar.c();
        ngu nguVar = ngyVar.b == 3 ? (ngu) ngyVar.c : ngu.a;
        Context context = oqpVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((nguVar.b & 1) != 0) {
            intent.setAction(nguVar.c);
        }
        if ((nguVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, nguVar.d));
        }
        if ((nguVar.b & 4) != 0) {
            intent.setData(Uri.parse(nguVar.e));
        }
        Iterator<E> it = nguVar.f.iterator();
        while (it.hasNext()) {
            qtl.aI(intent, (ngr) it.next());
        }
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        String.valueOf(intent);
        context.sendBroadcast(intent);
        return oqpVar;
    }

    @Override // defpackage.oqk
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
