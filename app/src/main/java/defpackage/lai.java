package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
class lai extends BroadcastReceiver {
    public final lih a;
    public boolean b;
    public boolean c;

    public lai(lih lihVar) {
        this.a = lihVar;
    }

    public final void a() {
        lih lihVar = this.a;
        lihVar.v();
        lihVar.aC().g();
        lihVar.aC().g();
        if (this.b) {
            lihVar.aB().k.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                lihVar.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.a.aB().c.b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lih lihVar = this.a;
        lihVar.v();
        String action = intent.getAction();
        lihVar.aB().k.b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            lihVar.aB().f.b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        lag lagVar = lihVar.b;
        lihVar.ai(lagVar);
        boolean zD = lagVar.d();
        if (this.c != zD) {
            this.c = zD;
            lihVar.aC().h(new lah(this));
        }
    }
}
