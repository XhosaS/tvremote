package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azi {
    static final azj a = new azg(cxs.a, true);
    private final Random b;
    private final ayu c;

    public azi(Random random, ayu ayuVar) {
        this.b = random;
        this.c = ayuVar;
    }

    public final azj a(cxs cxsVar) {
        int iAp = dnx.ap(cxsVar.d);
        if (iAp == 0) {
            iAp = 1;
        }
        int i = iAp - 1;
        if (i == 1) {
            return new azg(cxsVar, cxsVar.c == 1000);
        }
        if (i == 3) {
            return new azg(cxsVar, this.b.nextDouble() * 1000.0d < ((double) cxsVar.c));
        }
        if (i != 4) {
            if (i == 5) {
                cxsVar = cxs.a;
            }
            return new azg(cxsVar, true);
        }
        Random random = this.b;
        ayu ayuVar = this.c;
        ayuVar.getClass();
        return new azh(cxsVar, random, ayuVar);
    }
}
