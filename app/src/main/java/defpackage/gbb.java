package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbb extends BroadcastReceiver {
    final /* synthetic */ gbc a;

    public gbb(gbc gbcVar) {
        this.a = gbcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        if (agvy.c("android.katniss.search.action.CONVERSATION_IS_ENDED", intent.getAction())) {
            this.a.b.finish();
        }
    }
}
