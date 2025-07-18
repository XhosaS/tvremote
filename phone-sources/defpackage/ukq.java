package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukq {
    public final ulb a;
    public final int b;
    private final int c;

    public ukq(ulb ulbVar, int i, int i2) {
        this.a = ulbVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean a() {
        return this.c == 0;
    }

    public final boolean b() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ukq) {
            ukq ukqVar = (ukq) obj;
            if (this.a.equals(ukqVar.a) && this.b == ukqVar.b && this.c == ukqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }

    public ukq(Class cls, int i, int i2) {
        this(new ulb(ula.class, cls), i, i2);
    }
}
