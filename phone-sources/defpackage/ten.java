package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ten extends teq {
    final /* synthetic */ teo a;

    public ten(teo teoVar, kwy kwyVar) {
        this.a = teoVar;
        new ulp("OnRequestInstallCallback", (byte[]) null);
        super(teoVar, kwyVar);
    }

    @Override // defpackage.teq
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (teo.a(bundle) != 0) {
            this.c.v(new teu(teo.a(bundle)));
            return;
        }
        kwy kwyVar = this.c;
        teo teoVar = this.a;
        int i = bundle.getInt("version.code", -1);
        int i2 = bundle.getInt("update.availability");
        int i3 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i4 = bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        ulp.ap(new File(((Context) teoVar.e.a).getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", teo.d(bundle.getIntegerArrayList(ssr.q("blocking.destructive.intent"))));
        map.put("nonblocking.destructive.intent", teo.d(bundle.getIntegerArrayList(ssr.q("nonblocking.destructive.intent"))));
        map.put("blocking.intent", teo.d(bundle.getIntegerArrayList(ssr.q("blocking.intent"))));
        map.put("nonblocking.intent", teo.d(bundle.getIntegerArrayList(ssr.q("nonblocking.intent"))));
        kwyVar.w(new tei(i, i2, i3, numValueOf, i4, j, j2, pendingIntent, pendingIntent2));
    }
}
