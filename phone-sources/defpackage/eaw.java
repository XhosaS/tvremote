package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eaw extends eay {
    private final ImmutableList e;
    private final ImmutableList f;
    private final int[] g;
    private final int[] h;

    public eaw(ImmutableList immutableList, ImmutableList immutableList2, int[] iArr) {
        a.H(immutableList.size() == 1);
        this.e = immutableList;
        this.f = immutableList2;
        this.g = iArr;
        int[] iArr2 = new int[1];
        this.h = iArr2;
        iArr2[iArr[0]] = 0;
    }

    @Override // defpackage.eay
    public final int a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eay
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.eay
    public final int c() {
        return this.e.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eay
    public final eav d(int i, eav eavVar, boolean z) {
        eav eavVar2 = (eav) this.f.get(i);
        eavVar.k(eavVar2.f, eavVar2.g, eavVar2.h, eavVar2.i, eavVar2.j, eavVar2.l, eavVar2.k);
        return eavVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eay
    public final eax e(int i, eax eaxVar, long j) {
        eax eaxVar2 = (eax) this.e.get(i);
        eaxVar.e(eaxVar2.o, eaxVar2.q, eaxVar2.r, eaxVar2.s, eaxVar2.t, eaxVar2.u, eaxVar2.v, eaxVar2.w, eaxVar2.x, eaxVar2.z, eaxVar2.A, eaxVar2.B, eaxVar2.C, eaxVar2.D);
        eaxVar.y = eaxVar2.y;
        return eaxVar;
    }

    @Override // defpackage.eay
    public final Object f(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eay
    public final int g(boolean z) {
        if (q()) {
            return -1;
        }
        if (z) {
            return this.g[0];
        }
        return 0;
    }

    @Override // defpackage.eay
    public final int h(boolean z) {
        if (q()) {
            return -1;
        }
        return z ? this.g[c() - 1] : c() - 1;
    }

    @Override // defpackage.eay
    public final int i(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i != h(z)) {
            return z ? this.g[this.h[i] + 1] : i + 1;
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.eay
    public final int j(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i != g(z)) {
            return z ? this.g[this.h[i] - 1] : i - 1;
        }
        if (i2 == 2) {
            return h(z);
        }
        return -1;
    }
}
