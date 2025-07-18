package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mjv extends Handler {
    private final WeakReference a;

    public mjv(mjw mjwVar) {
        this.a = new WeakReference(mjwVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        mjw mjwVar = (mjw) this.a.get();
        if (mjwVar != null && message.what == 1) {
            mjwVar.t();
            Handler handler = mjwVar.a;
            synchronized (handler) {
                if (mjwVar.d) {
                    handler.sendMessageDelayed(handler.obtainMessage(1), mjwVar.e != null ? 1500 - (r0.c % 1000) : 1000);
                }
            }
        }
    }
}
