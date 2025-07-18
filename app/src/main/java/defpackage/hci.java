package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hci implements gyi {
    private final Context a;
    private final gyx b;
    private final Set c;
    private final Set d;

    public hci(Context context) {
        context.getClass();
        this.a = context;
        this.b = gyx.S;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.c = setSingleton;
        this.d = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.b;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        Intent intent = new Intent("com.google.android.katniss.action.START_SUGGESTION_STRINGS_UPDATES");
        ComponentName componentName = irm.a;
        this.a.sendBroadcast(intent.setComponent(irm.C));
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
