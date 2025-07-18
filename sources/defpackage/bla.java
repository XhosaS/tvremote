package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bla implements Handler.Callback {
    final /* synthetic */ att a;

    public bla(att attVar) {
        this.a = attVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        att attVar = this.a;
        bjz bjzVar = (bjz) message.obj;
        synchronized (attVar.a) {
            if (bjzVar == null) {
                throw null;
            }
        }
        return true;
    }
}
