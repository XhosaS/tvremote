package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ha {
    private BroadcastReceiver a;
    final /* synthetic */ hf c;

    public ha(hf hfVar) {
        this.c = hfVar;
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
            this.a = new gz(this);
        }
        hf hfVar = this.c;
        hfVar.k.registerReceiver(this.a, intentFilterA);
    }
}
