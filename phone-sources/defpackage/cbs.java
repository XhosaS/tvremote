package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbs implements ComponentCallbacks2 {
    final /* synthetic */ Configuration a;
    final /* synthetic */ cvw b;

    public cbs(Configuration configuration, cvw cvwVar) {
        this.a = configuration;
        this.b = cvwVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        cvw cvwVar = this.b;
        Configuration configuration2 = this.a;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = ((HashMap) cvwVar.a).entrySet().iterator();
        while (it.hasNext()) {
            ceg cegVar = (ceg) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (cegVar == null || Configuration.needNewResources(iUpdateFrom, cegVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    @yfp
    public final void onLowMemory() {
        this.b.m();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.m();
    }
}
