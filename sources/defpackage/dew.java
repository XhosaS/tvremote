package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dew {
    private final byte[] a;
    private final int b;

    public dew(byte[] bArr, int i) {
        this.a = dos.p(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dew)) {
            return false;
        }
        dew dewVar = (dew) obj;
        if (dewVar.b == this.b) {
            return Arrays.equals(this.a, dewVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ dos.m(this.a);
    }
}
