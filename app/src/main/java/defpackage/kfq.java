package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfq {
    public final kei a;
    private final int b;
    private final kee c;
    private final String d;

    public kfq(kei keiVar, kee keeVar, String str) {
        this.a = keiVar;
        this.c = keeVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{keiVar, keeVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfq)) {
            return false;
        }
        kfq kfqVar = (kfq) obj;
        return kki.a(this.a, kfqVar.a) && kki.a(this.c, kfqVar.c) && kki.a(this.d, kfqVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
