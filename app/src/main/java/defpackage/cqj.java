package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqj {
    public final Object a;
    public final Throwable b;

    public cqj(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqj)) {
            return false;
        }
        cqj cqjVar = (cqj) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(cqjVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || cqjVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public cqj(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
