package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agw extends akn {
    public agw() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            agi agiVar = (agi) pair.second;
            try {
                throw null;
            } catch (RuntimeException e) {
                BasePendingResult.n(agiVar);
                throw e;
            }
        }
        if (i == 2) {
            ((BasePendingResult) message.obj).m(Status.c);
            return;
        }
        Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
    }

    public agw(Looper looper) {
        super(looper);
    }
}
