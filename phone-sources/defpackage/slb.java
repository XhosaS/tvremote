package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class slb implements uha {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ ttl c;
    final /* synthetic */ sle d;
    final /* synthetic */ Integer e;
    final /* synthetic */ slf f;

    public slb(slf slfVar, AtomicBoolean atomicBoolean, Set set, ttl ttlVar, sle sleVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = ttlVar;
        this.d = sleVar;
        this.e = num;
        this.f = slfVar;
    }

    @Override // defpackage.uha
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.a.get()) {
            this.b.size();
            this.c.a(slf.a);
            return;
        }
        this.b.size();
        sle sleVar = this.d;
        synchronized (sleVar.c) {
            ImmutableSet.copyOf((Collection) sleVar.b);
        }
        slf.a.convert(this.e.intValue(), this.f.g);
    }

    @Override // defpackage.uha
    public final void a(Throwable th) {
    }
}
