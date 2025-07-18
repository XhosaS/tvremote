package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxq implements Comparable {
    public static final bxq a = new bxq(0, 1, 0, "");
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final agpc f = new agpn(new agum() { // from class: bxp
        @Override // defpackage.agum
        public final Object a() {
            bxq bxqVar = this.a;
            return BigInteger.valueOf(bxqVar.b).shiftLeft(32).or(BigInteger.valueOf(bxqVar.c)).shiftLeft(32).or(BigInteger.valueOf(bxqVar.d));
        }
    });

    public bxq(int i, int i2, int i3, String str) {
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
    public final int compareTo(bxq bxqVar) {
        bxqVar.getClass();
        return b().compareTo(bxqVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bxq)) {
            return false;
        }
        bxq bxqVar = (bxq) obj;
        return this.b == bxqVar.b && this.c == bxqVar.c && this.d == bxqVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        String str2 = this.e;
        if (agyv.n(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
