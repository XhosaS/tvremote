package defpackage;

import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osz extends aabs {
    osy a;
    private final TimeZone g;
    private final boolean h;

    public osz(TimeZone timeZone, boolean z) {
        super(timeZone.getID());
        this.a = new osy(Long.MIN_VALUE, Long.MIN_VALUE);
        this.g = timeZone;
        this.h = z;
    }

    private final long q(long j, boolean z, boolean z2) {
        for (int i = 1; i < 5; i++) {
            long j2 = ((true != z2 ? -1 : 1) * i * 7776000000L) + j;
            if (r(j2) != z) {
                return j2;
            }
        }
        return j;
    }

    private final boolean r(long j) {
        TimeZone timeZone = this.g;
        return timeZone.getOffset(j) != timeZone.getRawOffset();
    }

    @Override // defpackage.aabs
    public final int a(long j) {
        return this.g.getOffset(j);
    }

    @Override // defpackage.aabs
    public final int b(long j) {
        return this.g.getRawOffset();
    }

    final long c(long j, long j2, boolean z) {
        if (j2 <= j) {
            throw new AssertionError("upperBound must be greater than instant");
        }
        if (z == r(j2)) {
            throw new AssertionError("instant and upperBound must have different time zone offsets");
        }
        long j3 = j / 1000;
        long j4 = j2 / 1000;
        do {
            long j5 = (j4 + j3) / 2;
            boolean zR = r(j5 * 1000);
            if (zR != z) {
                j4 = j5;
            }
            if (zR == z) {
                j3 = j5;
            }
        } while (j4 - j3 > 1);
        long j6 = j3 * 1000;
        return r(j6) == z ? j4 * 1000 : j6;
    }

    @Override // defpackage.aabs
    public final long d(long j) {
        osy osyVar = this.a;
        if (osyVar.a(j)) {
            return osyVar.b;
        }
        osy osyVarF = f(j);
        if (osyVarF == null) {
            return j;
        }
        this.a = osyVarF;
        return osyVarF.b;
    }

    @Override // defpackage.aabs
    public final long e(long j) {
        long j2;
        osy osyVar = this.a;
        if (osyVar.a(j)) {
            j2 = osyVar.a;
        } else {
            osy osyVarF = f(j);
            if (osyVarF == null) {
                return j;
            }
            this.a = osyVarF;
            j2 = osyVarF.a;
        }
        return j2 - 1;
    }

    @Override // defpackage.aabs
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.g.equals(((osz) obj).g);
        }
        return false;
    }

    final osy f(long j) {
        boolean zR = r(j);
        long jQ = q(j, zR, true);
        if (jQ == j) {
            return null;
        }
        long jQ2 = q(j, zR, false);
        if (jQ2 != j) {
            return new osy(c(jQ2, j, !zR), c(j, jQ, zR));
        }
        return null;
    }

    @Override // defpackage.aabs
    public final String g(long j) {
        return this.g.getID();
    }

    @Override // defpackage.aabs
    public final boolean h() {
        return this.h;
    }

    @Override // defpackage.aabs
    public final int hashCode() {
        return this.g.hashCode();
    }
}
