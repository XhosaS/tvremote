package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erd {
    public final String a;
    public final int b;
    public final double c;
    public final String d;

    public erd(String str, double d) {
        this.a = str;
        this.b = 2;
        this.c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erd)) {
            return false;
        }
        erd erdVar = (erd) obj;
        return this.b == erdVar.b && Double.compare(this.c, erdVar.c) == 0 && Objects.equals(this.a, erdVar.a) && Objects.equals(this.d, erdVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public erd(String str, String str2, int i) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        a.ab(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }
}
