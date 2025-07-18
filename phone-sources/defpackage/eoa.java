package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eoa extends eof {
    final long a;
    final long b;
    final List c;
    final long d;
    private final long e;
    private final long f;

    public eoa(enw enwVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(enwVar, j, j2);
        this.a = j3;
        this.b = j4;
        this.c = list;
        this.d = j5;
        this.e = j6;
        this.f = j7;
    }

    public final long a(long j, long j2) {
        long jC = c(j);
        return jC != -1 ? jC : (int) (e((j2 - this.f) + this.d, j) - b(j, j2));
    }

    public final long b(long j, long j2) {
        if (c(j) == -1) {
            long j3 = this.e;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.a, e((j2 - this.f) - j3, j));
            }
        }
        return this.a;
    }

    public abstract long c(long j);

    public final long d(long j, long j2) {
        List list = this.c;
        if (list != null) {
            return (((eod) list.get((int) (j - this.a))).b * 1000000) / this.i;
        }
        long jC = c(j2);
        return (jC == -1 || j != (this.a + jC) + (-1)) ? (this.b * 1000000) / this.i : j2 - f(j);
    }

    public final long e(long j, long j2) {
        long jC = c(j2);
        long j3 = this.a;
        if (jC != 0) {
            if (this.c != null) {
                long j4 = (jC + j3) - 1;
                long j5 = j3;
                while (j5 <= j4) {
                    long j6 = ((j4 - j5) / 2) + j5;
                    long jF = f(j6);
                    if (jF < j) {
                        j5 = 1 + j6;
                    } else {
                        if (jF <= j) {
                            return j6;
                        }
                        j4 = j6 - 1;
                    }
                }
                return j5 == j3 ? j5 : j4;
            }
            long j7 = (j / ((this.b * 1000000) / this.i)) + j3;
            if (j7 >= j3) {
                return jC != -1 ? Math.min(j7, (j3 + jC) - 1) : j7;
            }
        }
        return j3;
    }

    public final long f(long j) {
        List list = this.c;
        return edt.B(list != null ? ((eod) list.get((int) (j - this.a))).a - this.j : (j - this.a) * this.b, 1000000L, this.i);
    }

    public abstract enw g(enz enzVar, long j);

    public boolean h() {
        return this.c != null;
    }
}
