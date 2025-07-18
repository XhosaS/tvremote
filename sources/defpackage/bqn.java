package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqn extends Handler {
    final /* synthetic */ bqo a;

    public bqn(bqo bqoVar) {
        this.a = bqoVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        bqo bqoVar = this.a;
        synchronized (bqoVar) {
            long jLongValue = ((Long) message.obj).longValue();
            long j = bqoVar.c;
            if (jLongValue == j) {
                bqp bqpVar = bqoVar.d;
                bqoVar.d = null;
                bqoVar.c = Long.MAX_VALUE;
                if (bqpVar != null) {
                    Iterator it = bqoVar.b.iterator();
                    while (it.hasNext()) {
                        ((bqh) it.next()).e();
                    }
                }
            } else if (jLongValue < j) {
                Handler handler = bqoVar.a;
                handler.sendMessageAtTime(handler.obtainMessage(0, Long.valueOf(j)), bqoVar.c);
            }
        }
    }
}
