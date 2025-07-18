package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyu extends ogh {
    final /* synthetic */ nyw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyu(nyw nywVar, Looper looper) {
        super(looper);
        this.a = nywVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            nyw nywVar = this.a;
            nywVar.b.lock();
            try {
                if (nywVar.q()) {
                    nywVar.o();
                }
                return;
            } finally {
                nywVar.b.unlock();
            }
        }
        if (i == 2) {
            this.a.p();
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
    }
}
