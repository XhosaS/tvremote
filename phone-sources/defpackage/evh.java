package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evh implements ewz {
    public final ImmutableList a;
    private final ewz b;

    public evh(ewz ewzVar, List list) {
        this.b = ewzVar;
        this.a = ImmutableList.copyOf((Collection) list);
    }

    @Override // defpackage.ewz
    public final long c() {
        return this.b.c();
    }

    @Override // defpackage.ewz
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.ewz
    public final void m(long j) {
        this.b.m(j);
    }

    @Override // defpackage.ewz
    public final boolean n(eji ejiVar) {
        return this.b.n(ejiVar);
    }

    @Override // defpackage.ewz
    public final boolean o() {
        return this.b.o();
    }
}
