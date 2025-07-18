package androidx.compose.material3.internal;

import defpackage.a;
import defpackage.ayk;
import defpackage.bko;
import defpackage.bnq;
import defpackage.bpt;
import defpackage.bzi;
import defpackage.cma;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class BaseLinearWavyProgressElement<N extends ayk> extends bzi<N> {
    @Override // defpackage.bzi
    public /* bridge */ /* synthetic */ void e(bko bkoVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinearWavyProgressElement)) {
            return false;
        }
        long jI = i();
        BaseLinearWavyProgressElement baseLinearWavyProgressElement = (BaseLinearWavyProgressElement) obj;
        long jI2 = baseLinearWavyProgressElement.i();
        long j = bnq.a;
        return a.s(jI, jI2) && a.s(j(), baseLinearWavyProgressElement.j()) && yks.e(k(), baseLinearWavyProgressElement.k()) && yks.e(l(), baseLinearWavyProgressElement.l()) && cma.b(f(), baseLinearWavyProgressElement.f()) && cma.b(h(), baseLinearWavyProgressElement.h()) && cma.b(g(), baseLinearWavyProgressElement.g());
    }

    public float f() {
        throw null;
    }

    public float g() {
        throw null;
    }

    public float h() {
        throw null;
    }

    public int hashCode() {
        long jI = i();
        long j = bnq.a;
        int iK = a.k(jI);
        return (((((((((((iK * 31) + a.k(j())) * 31) + k().hashCode()) * 31) + l().hashCode()) * 31) + Float.floatToIntBits(f())) * 31) + Float.floatToIntBits(h())) * 31) + Float.floatToIntBits(g());
    }

    public long i() {
        throw null;
    }

    public long j() {
        throw null;
    }

    public bpt k() {
        throw null;
    }

    public bpt l() {
        throw null;
    }
}
