package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blt {
    public final int a;
    public final int b;

    public blt(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blt)) {
            return false;
        }
        blt bltVar = (blt) obj;
        return this.b == bltVar.b && this.a == bltVar.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.a));
    }

    public final String toString() {
        return aju.i(this.b) + ":" + this.a;
    }
}
