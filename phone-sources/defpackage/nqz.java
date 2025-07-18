package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nqz {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqz)) {
            return false;
        }
        nqz nqzVar = (nqz) obj;
        int i = nqzVar.a;
        if (this.b != nqzVar.b) {
            return false;
        }
        int i2 = nqzVar.c;
        int i3 = nqzVar.d;
        int i4 = nqzVar.e;
        boolean z = nqzVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.b), 0, 0, 0, false});
    }
}
