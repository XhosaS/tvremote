package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvo {
    public String a = "unknown-authority";
    public xpv b = xpv.a;
    public String c;
    public xqy d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof xvo)) {
            return false;
        }
        xvo xvoVar = (xvo) obj;
        return this.a.equals(xvoVar.a) && this.b.equals(xvoVar.b) && a.Q(this.c, xvoVar.c) && a.Q(this.d, xvoVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
