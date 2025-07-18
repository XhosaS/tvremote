package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wjz implements ComponentCallbacks2 {
    final /* synthetic */ wke a;

    public wjz(wke wkeVar) {
        this.a = wkeVar;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        uea.c();
        wke wkeVar = this.a;
        if (wkeVar.a == null) {
            return;
        }
        if ((i == 60 || i == 80) && wkeVar.b == 0) {
            wkeVar.a.o();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
