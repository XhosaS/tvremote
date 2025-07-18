package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihj implements gyi {
    private final Context a;
    private final agow b;
    private final gyx c;
    private final Set d;
    private final Set e;

    public ihj(Context context, agow agowVar) {
        context.getClass();
        agowVar.getClass();
        this.a = context;
        this.b = agowVar;
        this.c = gyx.n;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.d = setSingleton;
        this.e = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.c;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) {
        if (((Boolean) this.b.a()).booleanValue()) {
            this.a.sendBroadcast(new Intent("com.google.android.apps.tvsearch.setup.fix.SCHEDULE_KATNISS_PERIODIC_FIX_SETTING_WORK").setPackage("com.google.android.katniss"));
        }
        return agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
