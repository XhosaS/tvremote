package defpackage;

import android.view.View;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdi implements bsb {
    private final View a;
    private final float b;
    private final cvm c;
    private final int[] d;

    public cdi(View view, float f) {
        this.a = view;
        this.b = f;
        cvm cvmVar = new cvm(view);
        cvmVar.a(true);
        this.c = cvmVar;
        this.d = new int[2];
        int[] iArr = cww.a;
        cwm.k(view, true);
    }

    private final void e() {
        cvm cvmVar = this.c;
        if (cvmVar.k(0)) {
            cvmVar.c(0);
        }
        if (cvmVar.k(1)) {
            cvmVar.c(1);
        }
    }

    @Override // defpackage.bsb
    public final long a(long j, long j2, int i) {
        cvm cvmVar = this.c;
        if (!cvmVar.m(ccf.m(j2), ccf.o(i))) {
            return 0L;
        }
        int[] iArr = this.d;
        Arrays.fill(iArr, 0, iArr.length, 0);
        cvmVar.i(ccf.l(Float.intBitsToFloat((int) (j >> 32))), ccf.l(Float.intBitsToFloat((int) (j & 4294967295L))), ccf.l(Float.intBitsToFloat((int) (j2 >> 32))), ccf.l(Float.intBitsToFloat((int) (4294967295L & j2))), null, ccf.o(i), iArr);
        return ccf.p(iArr, j2);
    }

    @Override // defpackage.bsb
    public final long b(long j, int i) {
        cvm cvmVar = this.c;
        if (!cvmVar.m(ccf.m(j), ccf.o(i))) {
            return 0L;
        }
        int[] iArr = this.d;
        Arrays.fill(iArr, 0, iArr.length, 0);
        cvmVar.g(ccf.l(Float.intBitsToFloat((int) (j >> 32))), ccf.l(Float.intBitsToFloat((int) (4294967295L & j))), iArr, null, ccf.o(i));
        return ccf.p(iArr, j);
    }

    @Override // defpackage.bsb
    public final Object c(long j, long j2, yih yihVar) {
        cvm cvmVar = this.c;
        if (!cvmVar.l(ccf.n(j2, this.b)) || !cvmVar.d(ccf.k(cmm.a(j2)), ccf.k(cmm.b(j2)), true)) {
            j2 = 0;
        }
        e();
        return new cmm(j2);
    }

    @Override // defpackage.bsb
    public final Object d(long j, yih yihVar) {
        cvm cvmVar = this.c;
        if (!cvmVar.l(ccf.n(j, this.b)) || !cvmVar.e(ccf.k(cmm.a(j)), ccf.k(cmm.b(j)))) {
            j = 0;
        }
        e();
        return new cmm(j);
    }
}
