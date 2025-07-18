package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjw extends BroadcastReceiver {
    final /* synthetic */ rjk a;
    public final /* synthetic */ rjx b;

    public rjw(rjx rjxVar, rjk rjkVar) {
        this.a = rjkVar;
        this.b = rjxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        szg.n(this.a.a(), new qvj(this, 3), ugk.a);
    }
}
