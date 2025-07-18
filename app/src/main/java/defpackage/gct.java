package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class gct implements ServiceConnection {
    final /* synthetic */ gcv c;

    public gct(gcv gcvVar) {
        this.c = gcvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.c.b = null;
    }
}
