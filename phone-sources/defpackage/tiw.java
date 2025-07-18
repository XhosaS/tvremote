package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiw extends tiu {
    public final byte[] a;

    public tiw(byte[] bArr) {
        super(7);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tiw) {
            return Arrays.equals(this.a, ((tiw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.tiu
    public final String toString() {
        return "[" + sip.k(this.d) + " secret=" + sip.m(this.a) + "]";
    }
}
