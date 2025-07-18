package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aap extends BroadcastReceiver {
    final /* synthetic */ aar a;

    public aap(aar aarVar) {
        this.a = aarVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
