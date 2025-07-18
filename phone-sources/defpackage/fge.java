package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fge extends fgi {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final fgi[] e;

    public fge(String str, boolean z, boolean z2, String[] strArr, fgi[] fgiVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = fgiVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fge fgeVar = (fge) obj;
            if (this.b == fgeVar.b && this.c == fgeVar.c && Objects.equals(this.a, fgeVar.a) && Arrays.equals(this.d, fgeVar.d) && Arrays.equals(this.e, fgeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + this.a.hashCode();
    }
}
