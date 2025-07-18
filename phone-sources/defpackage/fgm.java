package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgm extends fgi {
    public final String a;
    public final byte[] b;

    public fgm(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgm fgmVar = (fgm) obj;
            if (Objects.equals(this.a, fgmVar.a) && Arrays.equals(this.b, fgmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // defpackage.fgi
    public final String toString() {
        return this.f + ": owner=" + this.a;
    }
}
