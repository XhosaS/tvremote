package defpackage;

import java.util.HashMap;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eop {
    public boolean a;
    private final HashMap d = new HashMap();
    private UUID e = dys.d;
    private epl f = epr.a;
    private int[] g = new int[0];
    public boolean b = true;
    private final sew h = new sew();
    public long c = 300000;

    public final eou a(epu epuVar) {
        return new eou(this.e, this.f, epuVar, this.d, this.a, this.g, this.b, this.h, this.c);
    }

    public final void b(int... iArr) {
        for (int i : iArr) {
            boolean z = true;
            if (i != 2 && i != 1) {
                z = false;
            }
            a.H(z);
        }
        this.g = (int[]) iArr.clone();
    }

    public final void c(UUID uuid, epl eplVar) {
        uuid.getClass();
        this.e = uuid;
        this.f = eplVar;
    }
}
