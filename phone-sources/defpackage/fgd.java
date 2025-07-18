package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgd extends fgi {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final fgi[] g;

    public fgd(String str, int i, int i2, long j, long j2, fgi[] fgiVarArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = fgiVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fgd fgdVar = (fgd) obj;
            if (this.b == fgdVar.b && this.c == fgdVar.c && this.d == fgdVar.d && this.e == fgdVar.e && Objects.equals(this.a, fgdVar.a) && Arrays.equals(this.g, fgdVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b + 527;
        String str = this.a;
        long j = this.e;
        return (((((((i * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
