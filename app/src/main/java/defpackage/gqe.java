package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqe implements gyi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/ondevice/sources/UsageStatsTask");
    public static final Duration b = ztz.a();
    public final agow c;
    public final Context d;
    public final agow e;
    public final agow f;
    private final agte g;
    private final gyx h;
    private final Set i;
    private final Set j;

    public gqe(agow agowVar, Context context, agte agteVar, agow agowVar2, agow agowVar3) {
        agowVar.getClass();
        context.getClass();
        agteVar.getClass();
        agowVar2.getClass();
        agowVar3.getClass();
        this.c = agowVar;
        this.d = context;
        this.g = agteVar;
        this.e = agowVar2;
        this.f = agowVar3;
        this.h = gyx.P;
        Set setSingleton = Collections.singleton(hag.g);
        setSingleton.getClass();
        this.i = setSingleton;
        Set setSingleton2 = Collections.singleton(gyx.j);
        setSingleton2.getClass();
        this.j = setSingleton2;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.h;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) throws Throwable {
        Object objA = ahal.a(this.g, new gqd(this, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.j;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.i;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
