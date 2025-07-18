package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgc extends fgi {
    public final byte[] a;

    public fgc(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgc fgcVar = (fgc) obj;
            if (this.f.equals(fgcVar.f) && Arrays.equals(this.a, fgcVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }
}
