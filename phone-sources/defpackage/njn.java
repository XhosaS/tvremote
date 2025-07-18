package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njn {
    public static final rza a = new rza("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        njp.a(context).b();
        Iterator it = nwu.t().iterator();
        while (it.hasNext()) {
            ((nwu) it.next()).f();
        }
        synchronized (nzg.c) {
            nzg nzgVar = nzg.d;
            if (nzgVar != null) {
                nzgVar.k.incrementAndGet();
                Handler handler = nzgVar.o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
