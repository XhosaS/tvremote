package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bly extends blx {
    public final byte[] a;

    public bly(byte[] bArr) {
        super(8);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bly) {
            return Arrays.equals(this.a, ((bly) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.blx
    public final String toString() {
        return "[" + ((Object) aju.g(this.d)) + " secret=" + bjz.b(this.a) + "]";
    }
}
