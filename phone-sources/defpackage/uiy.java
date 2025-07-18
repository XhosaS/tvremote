package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uiy extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public uiy(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (uiz.a) {
            Iterator it = uiz.b.values().iterator();
            while (it.hasNext()) {
                ((uiz) it.next()).i();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
