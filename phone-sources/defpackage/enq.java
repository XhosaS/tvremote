package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public enq(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enq)) {
            return false;
        }
        enq enqVar = (enq) obj;
        return this.c == enqVar.c && this.d == enqVar.d && Objects.equals(this.a, enqVar.a) && Objects.equals(this.b, enqVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    public enq(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }
}
