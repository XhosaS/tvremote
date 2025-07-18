package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ce {
    private BroadcastReceiver a;
    final /* synthetic */ cj c;

    public ce(cj cjVar) {
        this.c = cjVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new cd(this);
        }
        cj cjVar = this.c;
        cjVar.k.registerReceiver(this.a, intentFilterA);
    }
}
