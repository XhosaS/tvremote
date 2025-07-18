package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kab {
    public final String a;
    private final lio b;
    private final String c;

    public kab(lio lioVar, String str, String str2) {
        this.b = lioVar;
        this.a = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kab)) {
            return false;
        }
        kab kabVar = (kab) obj;
        return yks.e(this.b, kabVar.b) && yks.e(this.a, kabVar.a) && yks.e(this.c, kabVar.c);
    }

    public final int hashCode() {
        return (((((lif) this.b).a() * 31) + this.a.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DestinationData(uiElementNode=" + this.b + ", verticalsHelperContext=" + this.a + ", psdValue=" + this.c + ")";
    }
}
