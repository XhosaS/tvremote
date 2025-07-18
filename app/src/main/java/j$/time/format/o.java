package j$.time.format;

import j$.time.chrono.InterfaceC0048b;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o extends i {
    public static final j$.time.h h = j$.time.h.h0(2000, 1, 1);
    public final InterfaceC0048b g;

    public o(j$.time.temporal.n nVar, int i, int i2, InterfaceC0048b interfaceC0048b, int i3) {
        super(nVar, i, i2, F.NOT_NEGATIVE, i3);
        this.g = interfaceC0048b;
    }

    @Override // j$.time.format.i
    public final long a(y yVar, long j) {
        long jAbs = Math.abs(j);
        InterfaceC0048b interfaceC0048b = this.g;
        long jI = interfaceC0048b != null ? j$.desugar.sun.nio.fs.g.w(yVar.a).G(interfaceC0048b).i(this.a) : 0;
        long[] jArr = i.f;
        if (j >= jI) {
            long j2 = jArr[this.b];
            if (j < jI + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(v vVar, long j, int i, int i2) {
        o oVar;
        v vVar2;
        long j2;
        int i3;
        int i4;
        int i5;
        long j3;
        InterfaceC0048b interfaceC0048b = this.g;
        if (interfaceC0048b != null) {
            j$.time.chrono.m mVar = vVar.c().c;
            if (mVar == null && (mVar = vVar.a.e) == null) {
                mVar = j$.time.chrono.t.c;
            }
            i5 = mVar.G(interfaceC0048b).i(this.a);
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            n nVar = new n(oVar, vVar2, j2, i3, i4);
            if (vVar2.e == null) {
                vVar2.e = new ArrayList();
            }
            vVar2.e.add(nVar);
        } else {
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
        int i6 = i4 - i3;
        int i7 = oVar.b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = i.f[i7];
            long j5 = i5;
            long j6 = j5 - (j5 % j4);
            long j7 = i5 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return vVar2.f(oVar.a, j3, i3, i4);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        Object obj = this.g;
        return "ReducedValue(" + strValueOf + "," + this.b + "," + this.c + "," + String.valueOf(obj != null ? obj : 0) + ")";
    }
}
