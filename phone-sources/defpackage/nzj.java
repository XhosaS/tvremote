package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzj extends BroadcastReceiver {
    public Context a;
    private final nzi b;

    public nzj(nzi nziVar) {
        this.b = nziVar;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            a();
        }
    }
}
