package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zof {
    private final byte[] a;
    private final int b;

    public zof(byte[] bArr, int i) {
        this.a = vxr.bd(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zof)) {
            return false;
        }
        zof zofVar = (zof) obj;
        if (zofVar.b == this.b) {
            return Arrays.equals(this.a, zofVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ vxr.ba(this.a);
    }
}
