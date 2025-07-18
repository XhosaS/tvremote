package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rrw implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final /* synthetic */ int d;

    public rrw(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        int i = this.d;
        if (i == 0) {
            return new rrv(xcl.a(this.a), (tst) ((xcn) this.b).a, (Executor) this.c.b());
        }
        if (i == 1) {
            return new rmo((uht) this.a.b(), (cb) this.b.b(), this.c);
        }
        if (i == 2) {
            return new rrx();
        }
        if (i == 3) {
            rrx rrxVar = (((tst) ((xcn) this.b).a).g() || ((tst) ((xcn) this.a).a).g()) ? (rrx) this.c.b() : new rrx(null);
            rrxVar.getClass();
            return rrxVar;
        }
        if (i == 4) {
            ImmutableSet immutableSetOf = (((tst) ((xcn) this.b).a).g() || ((tst) ((xcn) this.a).a).g()) ? ImmutableSet.of((rqf) this.c.b()) : ImmutableSet.of();
            immutableSetOf.getClass();
            return immutableSetOf;
        }
        if (i == 5) {
            return new aafi((teo) this.b.b(), (tex) this.a.b(), ((rgq) this.c).a());
        }
        upq upqVar = (upq) this.b.b();
        return new urh(upqVar, ((Boolean) ((tst) ((xcn) this.a).a).e(true)).booleanValue());
    }

    public rrw(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, float[] fArr) {
        this.d = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
    }

    public rrw(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, int[] iArr) {
        this.d = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
    }
}
