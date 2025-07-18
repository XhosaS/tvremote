package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhh implements gyi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/datastore/cleanup/FileCleanerTask");
    public static final List b = agqq.d(new qpi("foo/"), new qpi("phenotype/shared/device_tier_phenotype.pb"), new qpi("phenotype/shared/device_tier_phenotype.pb.lock"), new qpi("phenotype/shared/device_tier_phenotype.pb.version"), new qpi("phenotype/shared/user_tier_phenotype.pb"), new qpi("phenotype/shared/user_tier_phenotype.pb.lock"), new qpi("phenotype/shared/user_tier_phenotype.pb.version"));
    public final Supplier c;
    private final agte d;
    private final gyx e;
    private final Set f;
    private final Set g;

    static {
        agqq.d("phenotype/shared/", "phenotype/");
    }

    public fhh(agte agteVar, Supplier supplier) {
        agteVar.getClass();
        this.d = agteVar;
        this.c = supplier;
        this.e = gyx.m;
        Set setSingleton = Collections.singleton(hag.d);
        setSingleton.getClass();
        this.f = setSingleton;
        this.g = agqj.p(new gyx[]{gyx.j, gyx.Q});
    }

    @Override // defpackage.gzc
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.e;
    }

    @Override // defpackage.gyi
    public final Object c(agsw agswVar) throws Throwable {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/datastore/cleanup/FileCleanerTask", "run", 49, "FileCleanerTask.kt")).u("Deleting obsolete files and directories");
        Object objA = ahal.a(this.d, new fhg(this, null), agswVar);
        return objA == agtg.a ? objA : agpu.a;
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
