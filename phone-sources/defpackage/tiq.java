package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiq {
    public final int a;
    public final int b;

    public tiq(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiq)) {
            return false;
        }
        tiq tiqVar = (tiq) obj;
        return this.b == tiqVar.b && this.a == tiqVar.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.b;
        return (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ENCODING_QRCODE" : "ENCODING_HEXADECIMAL" : "ENCODING_NUMERIC" : "ENCODING_ALPHANUMERIC" : "ENCODING_UNKNOWN") + ":" + this.a;
    }
}
