package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyz extends ogh {
    final /* synthetic */ nza a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyz(nza nzaVar, Looper looper) {
        super(looper);
        this.a = nzaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + message.what);
            return;
        }
        nyy nyyVar = (nyy) message.obj;
        nza nzaVar = this.a;
        Lock lock = nzaVar.a;
        lock.lock();
        try {
            if (nzaVar.j != nyyVar.c) {
                lock.unlock();
            } else {
                nyyVar.a();
            }
        } finally {
            nzaVar.a.unlock();
        }
    }
}
