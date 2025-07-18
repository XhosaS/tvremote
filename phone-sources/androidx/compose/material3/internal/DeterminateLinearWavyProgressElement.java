package androidx.compose.material3.internal;

import defpackage.a;
import defpackage.ayk;
import defpackage.bko;
import defpackage.bnq;
import defpackage.bpt;
import defpackage.cma;
import defpackage.fh;
import defpackage.yjk;
import defpackage.yjv;
import defpackage.yks;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DeterminateLinearWavyProgressElement extends BaseLinearWavyProgressElement<ayk> {
    private final yjk a;
    private final yjv b;
    private final long c;
    private final long d;
    private final bpt e;
    private final bpt f;
    private final float h;
    private final float i;
    private final float j;
    private final float k;

    public DeterminateLinearWavyProgressElement(yjk yjkVar, yjv yjvVar, long j, long j2, bpt bptVar, bpt bptVar2, float f, float f2, float f3, float f4) {
        this.a = yjkVar;
        this.b = yjvVar;
        this.c = j;
        this.d = j2;
        this.e = bptVar;
        this.f = bptVar2;
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
    }

    @Override // defpackage.bzi
    public final /* bridge */ /* synthetic */ bko d() {
        return new ayk(this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.h, this.j, this.k);
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement, defpackage.bzi
    public final /* synthetic */ void e(bko bkoVar) {
        ayk aykVar = (ayk) bkoVar;
        long j = aykVar.a;
        long j2 = bnq.a;
        long j3 = this.c;
        if (!a.s(j, j3)) {
            aykVar.a = j3;
            aykVar.e();
        }
        long j4 = this.d;
        if (!a.s(aykVar.b, j4)) {
            aykVar.b = j4;
            aykVar.e();
        }
        bpt bptVar = this.e;
        if (!yks.e(aykVar.c, bptVar)) {
            aykVar.c = bptVar;
            aykVar.f();
        }
        bpt bptVar2 = this.f;
        if (!yks.e(aykVar.d, bptVar2)) {
            aykVar.d = bptVar2;
            aykVar.f();
        }
        float f = this.h;
        if (!cma.b(aykVar.e, f)) {
            aykVar.e = f;
            aykVar.f();
        }
        float f2 = this.j;
        if (!cma.b(aykVar.f, f2)) {
            aykVar.f = f2;
            aykVar.b();
            aykVar.f();
        }
        float f3 = this.k;
        if (!cma.b(aykVar.g, f3)) {
            aykVar.g = f3;
            aykVar.b();
            aykVar.f();
        }
        float f4 = this.i;
        if (!cma.b(aykVar.n, f4)) {
            aykVar.n = f4;
            fh.D(aykVar.o);
        }
        yjk yjkVar = aykVar.l;
        yjk yjkVar2 = this.a;
        if (yjkVar == yjkVar2 && aykVar.m == this.b) {
            return;
        }
        aykVar.l = yjkVar2;
        aykVar.m = this.b;
        aykVar.o.e();
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof DeterminateLinearWavyProgressElement)) {
            return false;
        }
        DeterminateLinearWavyProgressElement determinateLinearWavyProgressElement = (DeterminateLinearWavyProgressElement) obj;
        return cma.b(this.i, determinateLinearWavyProgressElement.i) && this.a == determinateLinearWavyProgressElement.a && this.b == determinateLinearWavyProgressElement.b;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final float f() {
        return this.h;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final float g() {
        return this.k;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final float h() {
        return this.j;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final int hashCode() {
        return (((((super.hashCode() * 31) + Float.floatToIntBits(this.i)) * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final long i() {
        return this.c;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final long j() {
        return this.d;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final bpt k() {
        return this.e;
    }

    @Override // androidx.compose.material3.internal.BaseLinearWavyProgressElement
    public final bpt l() {
        return this.f;
    }
}
