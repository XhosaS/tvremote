package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyf implements gyi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/platform/gms/SecurityProviderTask");
    public final Context b;
    private final agte c;
    private final gyx d;
    private final Set e;
    private final Set f;

    public gyf(Context context, agte agteVar) {
        context.getClass();
        agteVar.getClass();
        this.b = context;
        this.c = agteVar;
        this.d = gyx.M;
        this.e = hag.a;
        this.f = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return -1073741824;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.d;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) throws Throwable {
        Object objA = ahal.a(this.c, new gye(this, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
