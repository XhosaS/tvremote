package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class tpv implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Set set = tpu.a;
        uea.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Set set = tpu.a;
        uea.c();
        tpu.b = i;
        Iterator it = tpu.a.iterator();
        while (it.hasNext()) {
            ((tps) it.next()).b(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
