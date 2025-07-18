package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import defpackage.cwp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionTrampolineActivity extends Activity {
    public static final int $stable = 8;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cwp.j(this, getIntent());
        finish();
    }
}
