package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upf extends BroadcastReceiver {
    final /* synthetic */ upg a;
    private upg b;

    public upf(upg upgVar, upg upgVar2) {
        this.a = upgVar;
        this.b = upgVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        upg upgVar = this.b;
        if (upgVar != null && upgVar.a()) {
            upg upgVar2 = this.b;
            upgVar2.b.b(upgVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
