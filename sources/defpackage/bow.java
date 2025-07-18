package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bow extends Handler {
    public bpm a;
    public final /* synthetic */ box b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bow(box boxVar, Looper looper) {
        super(looper);
        this.b = boxVar;
    }

    private final boolean a() {
        return this.a != null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        cbt cbtVar = box.a;
        ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/OnscreenRemoteService$ClientMessageHandler", "handleMessage", 99, "OnscreenRemoteService.java")).w("handleMessage: %d, keycode: %d", message.what, message.arg1);
        if (!a()) {
            this.a = this.b.c.a("virtual-remote");
        }
        if (!a()) {
            ((cbs) cbtVar.f().j("com/google/android/tv/remote/service/OnscreenRemoteService$ClientMessageHandler", "handleMessage", 102, "OnscreenRemoteService.java")).p("Input bridge is not open");
            return;
        }
        int i = message.arg1;
        int i2 = message.what;
        if (i2 == 1) {
            this.a.b(i);
            this.a.c(i);
        } else if (i2 == 2) {
            this.a.c(i);
        } else if (i2 != 3) {
            ((cbs) cbtVar.e().j("com/google/android/tv/remote/service/OnscreenRemoteService$ClientMessageHandler", "handleMessage", 122, "OnscreenRemoteService.java")).r("Unknown message type: %d", message.what);
            super.handleMessage(message);
        } else {
            this.a.b(i);
        }
        this.a.d();
    }
}
