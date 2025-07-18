package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tiv extends tiu {
    public final byte[] a;

    public tiv(byte[] bArr) {
        super(8);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tiv) {
            return Arrays.equals(this.a, ((tiv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.tiu
    public final String toString() {
        return "[" + ((Object) sip.k(this.d)) + " secret=" + sip.m(this.a) + "]";
    }
}
