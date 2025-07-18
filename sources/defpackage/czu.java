package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czu {
    private final int a;
    private final byte[] b;

    public czu(byte[] bArr) {
        this.a = dos.m(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof czu) {
            return Arrays.equals(this.b, ((czu) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
