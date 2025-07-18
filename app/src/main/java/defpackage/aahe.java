package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aahe extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public aahe(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (aahf.a) {
            Iterator it = aahf.b.values().iterator();
            while (it.hasNext()) {
                ((aahf) it.next()).e();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
