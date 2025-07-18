package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dey {
    public final byte[] a;
    public final int b;

    public dey(byte[] bArr, int i) {
        this.a = dos.p(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dey)) {
            return false;
        }
        dey deyVar = (dey) obj;
        if (deyVar.b == this.b) {
            return Arrays.equals(this.a, deyVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ dos.m(this.a);
    }
}
