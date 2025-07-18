package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afoi {
    public String a = "unknown-authority";
    public afeh b = afeh.a;
    public String c;
    public afgh d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof afoi)) {
            return false;
        }
        afoi afoiVar = (afoi) obj;
        return this.a.equals(afoiVar.a) && this.b.equals(afoiVar.b) && yqs.a(this.c, afoiVar.c) && yqs.a(this.d, afoiVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
