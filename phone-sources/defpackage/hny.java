package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hny implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((hnv) message.obj).e();
        return true;
    }
}
