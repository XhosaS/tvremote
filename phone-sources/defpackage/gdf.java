package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdf extends Handler {
    final /* synthetic */ gdk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdf(gdk gdkVar, Looper looper) {
        super(looper);
        this.a = gdkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.d();
    }
}
