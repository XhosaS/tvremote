package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ofn implements onu {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ofn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.onu
    public final void d(Exception exc) {
        nve nveVar;
        uka ukaVar;
        int i = this.b;
        if (i == 0) {
            ofr.b.g(this.a, new lsq(18));
            return;
        }
        if (i == 1) {
            int i2 = nor.a;
            nsf.e();
            ((kwy) this.a).w(false);
            return;
        }
        if (i == 2) {
            ofy.b.g(this.a, new lsq(19));
            return;
        }
        if (i == 3) {
            if ((exc instanceof nwk) && (nveVar = ((nwk) exc).a.i) != null && nveVar.c == 24) {
                ((oit) this.a).c.set(SystemClock.elapsedRealtime());
                return;
            }
            return;
        }
        if (i == 4) {
            boolean z = osq.a;
            Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
            return;
        }
        if (i == 5) {
            boolean z2 = osq.a;
            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
            return;
        }
        Object obj = this.a;
        uka ukaVar2 = (uka) obj;
        Object obj2 = ukaVar2.b;
        Queue queue = ((ukb) obj2).b;
        synchronized (queue) {
            if (queue.peek() == obj) {
                queue.remove();
                ((ukb) obj2).c = 0;
                ukaVar = (uka) queue.peek();
            } else {
                ukaVar = null;
            }
        }
        ((kwy) ukaVar2.c).v(exc);
        if (ukaVar != null) {
            ukaVar.a();
        }
    }
}
