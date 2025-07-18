package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yec {
    public static final zgn a;
    public static final zgn b;
    public static final zgn c;
    public static final zgn d;
    public static final zgn e;
    public final zgn f;
    public final zgn g;
    final int h;

    static {
        zgn zgnVar = zgn.a;
        a = wcq.aD(":status");
        b = wcq.aD(":method");
        c = wcq.aD(":path");
        d = wcq.aD(":scheme");
        e = wcq.aD(":authority");
        wcq.aD(":host");
        wcq.aD(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yec(String str, String str2) {
        this(wcq.aD(str), wcq.aD(str2));
        zgn zgnVar = zgn.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yec) {
            yec yecVar = (yec) obj;
            if (this.f.equals(yecVar.f) && this.g.equals(yecVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.h(), this.g.h());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yec(zgn zgnVar, String str) {
        this(zgnVar, wcq.aD(str));
        zgn zgnVar2 = zgn.a;
    }

    public yec(zgn zgnVar, zgn zgnVar2) {
        this.f = zgnVar;
        this.g = zgnVar2;
        this.h = zgnVar.c() + 32 + zgnVar2.c();
    }
}
