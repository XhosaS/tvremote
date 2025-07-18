package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zja {
    private final int a;
    private final byte[] b;

    public zja(byte[] bArr) {
        this.a = vxr.ba(bArr);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zja) {
            return Arrays.equals(this.b, ((zja) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
