package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnf implements Comparable {
    public static final gnf a = new gnf(0, 1, 0, "");
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final yft f = new yga(new gem(this, 9));

    public gnf(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object objA = this.f.a();
        objA.getClass();
        return (BigInteger) objA;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gnf gnfVar) {
        gnfVar.getClass();
        return b().compareTo(gnfVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gnf)) {
            return false;
        }
        gnf gnfVar = (gnf) obj;
        return this.b == gnfVar.b && this.c == gnfVar.c && this.d == gnfVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        String str2 = this.e;
        if (ylh.L(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
