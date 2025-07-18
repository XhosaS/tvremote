package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvt {
    static final rvu a = new rvr(zah.a, true);
    private final Random b;
    private final uep c;
    private final rvd d;

    public rvt(Random random, rvd rvdVar, uep uepVar) {
        this.b = random;
        this.c = uepVar;
        this.d = rvdVar;
    }

    public final rvu a(zah zahVar) {
        int iAV = a.aV(zahVar.d);
        if (iAV == 0) {
            iAV = 1;
        }
        int i = iAV - 1;
        if (i == 1) {
            return new rvr(zahVar, zahVar.c == 1000);
        }
        if (i == 3) {
            return new rvr(zahVar, this.b.nextDouble() * 1000.0d < ((double) zahVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                zahVar = zah.a;
            }
            return new rvr(zahVar, true);
        }
        Random random = this.b;
        rvd rvdVar = this.d;
        rvdVar.getClass();
        return new rvs(zahVar, random, rvdVar, this.c);
    }
}
