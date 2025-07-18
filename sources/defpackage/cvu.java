package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvu {
    public static final cvx a = new cvx("REMOVE_FROZEN");
    public final int b;
    public final int c;
    public final cvf d;
    public final asv e;
    private final cvg f;

    public cvu(int i) {
        this.b = i;
        int i2 = i - 1;
        this.c = i2;
        cvh cvhVar = cvh.a;
        this.f = new cvg(null, cvhVar);
        this.d = new cvf(0L, cvhVar);
        this.e = new asv(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final cvu a() {
        long j;
        while (true) {
            cvf cvfVar = this.d;
            j = cvfVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (cvfVar.a(j, j2)) {
                j = j2;
                break;
            }
        }
        cvg cvgVar = this.f;
        while (true) {
            cvu cvuVar = (cvu) cvgVar.a;
            if (cvuVar != null) {
                return cvuVar;
            }
            int i = this.b;
            cvu cvuVar2 = new cvu(i + i);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.c;
                int i4 = i2 & i3;
                if (i4 != (((int) (j3 >> 30)) & i3)) {
                    Object cvtVar = this.e.o(i4).a;
                    if (cvtVar == null) {
                        cvtVar = new cvt(i2);
                    }
                    cvuVar2.e.o(cvuVar2.c & i2).b(cvtVar);
                    i2++;
                }
            }
            cvuVar2.d.b = dnx.av(j, 1152921504606846976L);
            cvgVar.c(null, cvuVar2);
        }
    }
}
