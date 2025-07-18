package defpackage;

import android.app.Service;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cpa extends Service {
    @Override // android.app.Service
    public void onCreate() {
        ComponentCallbacks2 application = getApplication();
        if (!(application instanceof cpd)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), cpd.class.getCanonicalName()));
        }
        dnx.bn(this, (cpd) application);
        super.onCreate();
    }
}
