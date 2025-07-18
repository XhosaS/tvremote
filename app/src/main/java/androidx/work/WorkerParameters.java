package androidx.work;

import defpackage.agte;
import defpackage.caz;
import defpackage.cbg;
import defpackage.ccz;
import defpackage.coe;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final caz b;
    public final Set c;
    public final int d;
    public final Executor e;
    public final agte f;
    public final ccz g;
    public final cbg h;
    public final coe i;

    public WorkerParameters(UUID uuid, caz cazVar, Collection collection, int i, Executor executor, agte agteVar, coe coeVar, ccz cczVar, cbg cbgVar) {
        this.a = uuid;
        this.b = cazVar;
        this.c = new HashSet(collection);
        this.d = i;
        this.e = executor;
        this.f = agteVar;
        this.i = coeVar;
        this.g = cczVar;
        this.h = cbgVar;
    }
}
