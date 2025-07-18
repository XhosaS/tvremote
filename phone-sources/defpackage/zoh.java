package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zoh {
    public final byte[] a;
    public final int b;

    public zoh(byte[] bArr, int i) {
        this.a = vxr.bd(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zoh)) {
            return false;
        }
        zoh zohVar = (zoh) obj;
        if (zohVar.b == this.b) {
            return Arrays.equals(this.a, zohVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ vxr.ba(this.a);
    }
}
