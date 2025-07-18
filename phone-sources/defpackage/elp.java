package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elp extends BroadcastReceiver {
    final /* synthetic */ elq a;

    public elp(elq elqVar) {
        this.a = elqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        elq elqVar = this.a;
        elqVar.a(elm.g(context, intent, elqVar.g, elqVar.i));
    }
}
