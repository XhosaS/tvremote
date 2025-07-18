package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
class bin extends Handler {
    final /* synthetic */ bit a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bin(bit bitVar, Looper looper) {
        super(looper);
        this.a = bitVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.aC();
    }
}
