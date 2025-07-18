package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vem extends BroadcastReceiver {
    final /* synthetic */ veo a;

    public vem(veo veoVar) {
        this.a = veoVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        veo veoVar = this.a;
        if (veoVar.b()) {
            context.unregisterReceiver(this);
            veoVar.a = null;
        }
    }
}
