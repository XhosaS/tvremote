package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihf implements wlk {
    private final Context a;

    public ihf(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        Intent intent2 = new Intent("com.google.android.apps.tvsearch.setup.fix.START_FIX_SETTING_RECEIVER_KATNISS_COLDSTART");
        ComponentName componentName = irm.a;
        Intent component = intent2.setComponent(irm.k);
        component.getClass();
        this.a.sendBroadcast(component);
        return zxy.a;
    }
}
