package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cbp {
    public final TimeUnit a;
    private final int b = 1;

    public cbp(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.a = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cbp) {
            cbp cbpVar = (cbp) obj;
            int i = cbpVar.b;
            if (this.a == cbpVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 37;
    }

    public final String toString() {
        return "1 ".concat(this.a.toString());
    }
}
