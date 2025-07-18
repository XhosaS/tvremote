package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lnq extends BroadcastReceiver {
    final /* synthetic */ lnr a;

    public lnq(lnr lnrVar) {
        this.a = lnrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lnr lnrVar = this.a;
        if (lnrVar.q) {
            lnrVar.P(lnrVar.O(), false);
        }
    }
}
