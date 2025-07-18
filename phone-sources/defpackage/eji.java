package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eji {
    public final long a;
    public final float b;
    public final long c;

    public eji(ejh ejhVar) {
        this.a = ejhVar.a;
        this.b = ejhVar.b;
        this.c = ejhVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eji)) {
            return false;
        }
        eji ejiVar = (eji) obj;
        return this.a == ejiVar.a && this.b == ejiVar.b && this.c == ejiVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
