package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blv extends blx {
    public final String a;

    public blv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blv) {
            return Objects.equals(this.a, ((blv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // defpackage.blx
    public final String toString() {
        return "[" + ((Object) aju.g(this.d)) + " server_name=" + this.a + "]";
    }

    public blv(String str) {
        super(3);
        this.a = str;
    }
}
