package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coy extends Activity implements cpd {
    public cpc e;

    @Override // defpackage.cpd
    public final cox e() {
        return this.e;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ComponentCallbacks2 application = getApplication();
        if (!(application instanceof cpd)) {
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), cpd.class.getCanonicalName()));
        }
        dnx.bn(this, (cpd) application);
        super.onCreate(bundle);
    }
}
