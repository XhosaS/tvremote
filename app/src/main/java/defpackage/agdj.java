package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdj {
    public static final ahxb a = ahxb.a.a(":status");
    public static final ahxb b = ahxb.a.a(":method");
    public static final ahxb c = ahxb.a.a(":path");
    public static final ahxb d = ahxb.a.a(":scheme");
    public static final ahxb e = ahxb.a.a(":authority");
    public final ahxb f;
    public final ahxb g;
    final int h;

    static {
        ahxb.a.a(":host");
        ahxb.a.a(":version");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public agdj(String str, String str2) {
        ahxa ahxaVar = ahxb.a;
        this(ahxaVar.a(str), ahxaVar.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof agdj) {
            agdj agdjVar = (agdj) obj;
            if (this.f.equals(agdjVar.f) && this.g.equals(agdjVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.d(), this.g.d());
    }

    public agdj(ahxb ahxbVar, ahxb ahxbVar2) {
        this.f = ahxbVar;
        this.g = ahxbVar2;
        this.h = ahxbVar.b() + 32 + ahxbVar2.b();
    }
}
