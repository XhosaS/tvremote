package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zea {
    public static final zgn a;
    public static final zgn b;
    public static final zgn c;
    public static final zgn d;
    public static final zgn e;
    public static final zgn f;
    public final zgn g;
    public final zgn h;
    public final int i;

    static {
        zgn zgnVar = zgn.a;
        a = wcq.aD(":");
        b = wcq.aD(":status");
        c = wcq.aD(":method");
        d = wcq.aD(":path");
        e = wcq.aD(":scheme");
        f = wcq.aD(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zea(String str, String str2) {
        this(wcq.aD(str), wcq.aD(str2));
        str2.getClass();
        zgn zgnVar = zgn.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zea)) {
            return false;
        }
        zea zeaVar = (zea) obj;
        return yks.e(this.g, zeaVar.g) && yks.e(this.h, zeaVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        zgn zgnVar = this.h;
        return this.g.h() + ": " + zgnVar.h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zea(zgn zgnVar, String str) {
        this(zgnVar, wcq.aD(str));
        zgnVar.getClass();
    }

    public zea(zgn zgnVar, zgn zgnVar2) {
        this.g = zgnVar;
        this.h = zgnVar2;
        this.i = zgnVar.c() + 32 + zgnVar2.c();
    }
}
