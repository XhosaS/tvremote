package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class vyt {
    public abstract int a();

    public abstract long b();

    public abstract vxo c();

    public abstract vyd d();

    public abstract vyh e();

    public abstract Instant f();

    final vyt g(vxo vxoVar, Instant instant) {
        yqw.M(b() != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new vxj(vxoVar, b() + 1, new vxf(0L), new vxg(0L), 0, instant);
    }

    final boolean h(vyt vytVar) {
        yqw.L(b() != Long.MIN_VALUE);
        yqw.L(!equals(vytVar) || this == vytVar);
        long jB = b();
        vxj vxjVar = (vxj) vytVar;
        long j = vxjVar.b;
        if (jB < j) {
            return true;
        }
        if (b() == j) {
            if (((vxf) d()).a < ((vxf) vxjVar.c).a) {
                return true;
            }
            if (((vxg) e()).a < ((vxg) vxjVar.d).a) {
                return true;
            }
        }
        return false;
    }

    final boolean i() {
        return a() > 3;
    }
}
