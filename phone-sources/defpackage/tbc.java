package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tbc implements Handler.Callback {
    final /* synthetic */ tbe a;

    public tbc(tbe tbeVar) {
        this.a = tbeVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        tbe tbeVar = this.a;
        tbd tbdVar = (tbd) message.obj;
        synchronized (tbeVar.a) {
            if (tbeVar.c == tbdVar || tbeVar.d == tbdVar) {
                tbeVar.d(tbdVar, 2);
            }
        }
        return true;
    }
}
