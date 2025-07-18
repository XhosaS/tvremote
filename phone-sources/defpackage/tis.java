package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tis extends tiu {
    public final String a;

    public tis() {
        this(null);
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tis) {
            return Objects.equals(this.a, ((tis) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override // defpackage.tiu
    public final String toString() {
        return "[" + ((Object) sip.k(this.d)) + " server_name=" + this.a + "]";
    }

    public tis(String str) {
        super(3);
        this.a = str;
    }
}
