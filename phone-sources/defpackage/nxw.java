package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxw extends ogh {
    public nxw() {
        super(Looper.getMainLooper());
    }

    public final void a(nxd nxdVar, nxc nxcVar) {
        int i = BasePendingResult.p;
        sendMessage(obtainMessage(1, new Pair(nxdVar, nxcVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).n(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        nxd nxdVar = (nxd) pair.first;
        nxc nxcVar = (nxc) pair.second;
        try {
            nxdVar.a(nxcVar);
        } catch (RuntimeException e) {
            BasePendingResult.p(nxcVar);
            throw e;
        }
    }

    public nxw(Looper looper) {
        super(looper);
    }
}
