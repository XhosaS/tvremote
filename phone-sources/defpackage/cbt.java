package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbt implements ComponentCallbacks2 {
    final /* synthetic */ cxe a;

    public cbt(cxe cxeVar) {
        this.a = cxeVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.L();
    }

    @Override // android.content.ComponentCallbacks
    @yfp
    public final void onLowMemory() {
        this.a.L();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.a.L();
    }
}
