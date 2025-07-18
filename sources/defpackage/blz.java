package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blz extends blx {
    public final byte[] a;

    public blz(byte[] bArr) {
        super(7);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof blz) {
            return Arrays.equals(this.a, ((blz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.blx
    public final String toString() {
        return "[" + aju.g(this.d) + " secret=" + bjz.b(this.a) + "]";
    }
}
