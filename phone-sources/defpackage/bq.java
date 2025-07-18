package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bq extends bt {
    final /* synthetic */ ho a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ gx c;
    final /* synthetic */ go d;
    final /* synthetic */ bv e;

    public bq(bv bvVar, ho hoVar, AtomicReference atomicReference, gx gxVar, go goVar) {
        this.e = bvVar;
        this.a = hoVar;
        this.b = atomicReference;
        this.c = gxVar;
        this.d = goVar;
    }

    @Override // defpackage.bt
    public final void a() {
        ho hoVar = this.a;
        bv bvVar = this.e;
        this.b.set(((gt) hoVar.a()).b(bvVar.generateActivityResultKey(), bvVar, this.c, this.d));
    }
}
