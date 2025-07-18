package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdk {
    public final bdl a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new bdl();
        }
        ClassLoader classLoader = bdl.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        agsf agsfVar = new agsf(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            agsfVar.put(str, bundle.get(str));
        }
        return new bdl(agsfVar.d());
    }
}
