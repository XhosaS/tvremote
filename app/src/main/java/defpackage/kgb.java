package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgb extends kos {
    public kgb() {
        super(Looper.getMainLooper());
    }

    public final void a(kfd kfdVar, kfc kfcVar) {
        ThreadLocal threadLocal = BasePendingResult.b;
        sendMessage(obtainMessage(1, new Pair(kfdVar, kfcVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).k(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        kfd kfdVar = (kfd) pair.first;
        kfc kfcVar = (kfc) pair.second;
        try {
            kfdVar.a(kfcVar);
        } catch (RuntimeException e) {
            BasePendingResult.l(kfcVar);
            throw e;
        }
    }

    public kgb(Looper looper) {
        super(looper);
    }
}
