package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xl extends bko implements byl {
    public float a;

    public xl(float f) {
        this.a = f;
    }

    private final long i(long j, boolean z) {
        int iA = clv.a(j);
        if (iA == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iA * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || wv.f(j, iRound, iA)) {
            return (iRound << 32) | iA;
        }
        return 0L;
    }

    private final long l(long j, boolean z) {
        int iB = clv.b(j);
        if (iB == Integer.MAX_VALUE) {
            return 0L;
        }
        int iRound = Math.round(iB / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !wv.f(j, iB, iRound)) {
            return 0L;
        }
        return (iB << 32) | (iRound & 4294967295L);
    }

    private final long m(long j, boolean z) {
        int iC = clv.c(j);
        int iRound = Math.round(iC * this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || wv.f(j, iRound, iC)) {
            return (iRound << 32) | iC;
        }
        return 0L;
    }

    private final long n(long j, boolean z) {
        int iD = clv.d(j);
        int iRound = Math.round(iD / this.a);
        if (iRound <= 0) {
            return 0L;
        }
        if (z && !wv.f(j, iD, iRound)) {
            return 0L;
        }
        return (iD << 32) | (iRound & 4294967295L);
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        long jL = l(j, true);
        if (a.s(jL, 0L)) {
            jL = i(j, true);
            if (a.s(jL, 0L)) {
                jL = n(j, true);
                if (a.s(jL, 0L)) {
                    jL = m(j, true);
                    if (a.s(jL, 0L)) {
                        jL = l(j, false);
                        if (a.s(jL, 0L)) {
                            jL = i(j, false);
                            if (a.s(jL, 0L)) {
                                jL = n(j, false);
                                if (a.s(jL, 0L)) {
                                    jL = m(j, false);
                                    if (a.s(jL, 0L)) {
                                        jL = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!a.s(jL, 0L)) {
            j = clw.o((int) (jL >> 32), (int) (jL & 4294967295L));
        }
        bwj bwjVarU = bvsVar.u(j);
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new kb(bwjVarU, 18));
    }

    @Override // defpackage.byl
    public final int e(buz buzVar, buy buyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return buyVar.c(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.byl
    public final int f(buz buzVar, buy buyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return buyVar.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        return Math.round(i * this.a);
    }

    @Override // defpackage.byl
    public final int g(buz buzVar, buy buyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return buyVar.e(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.byl
    public final int h(buz buzVar, buy buyVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return buyVar.f(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
        return Math.round(i * this.a);
    }
}
