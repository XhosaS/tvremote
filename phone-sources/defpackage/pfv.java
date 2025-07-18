package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfv {
    public final String a;
    private final String b;
    private final String c;
    private final pfw d;
    private final pfw e;
    private final boolean f;
    private final pfu g;
    private final int h = 1;
    private final int i;
    private final int j;

    public pfv(String str, String str2, String str3, pfw pfwVar, pfw pfwVar2, int i, boolean z, int i2, pfu pfuVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pfwVar;
        this.e = pfwVar2;
        this.i = i;
        this.f = z;
        this.j = i2;
        this.g = pfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfv)) {
            return false;
        }
        pfv pfvVar = (pfv) obj;
        int i = pfvVar.h;
        return yks.e(this.a, pfvVar.a) && yks.e(this.b, pfvVar.b) && yks.e(this.c, pfvVar.c) && yks.e(this.d, pfvVar.d) && yks.e(this.e, pfvVar.e) && this.i == pfvVar.i && this.f == pfvVar.f && this.j == pfvVar.j && yks.e(this.g, pfvVar.g);
    }

    public final int hashCode() {
        a.bw(1);
        int iHashCode = ((((((((this.a.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        int i = this.i;
        a.bw(i);
        int i2 = this.j;
        a.bw(i2);
        pfu pfuVar = this.g;
        return (((((((iHashCode * 31) + i) * 31) + a.q(this.f)) * 31) + i2) * 31) + (pfuVar == null ? 0 : pfuVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionData(type=TOOLTIP, key=");
        sb.append(this.a);
        sb.append(", body=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", lightColors=");
        sb.append(this.d);
        sb.append(", darkColors=");
        sb.append(this.e);
        sb.append(", theme=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? "AUTO" : "DARK" : "LIGHT"));
        sb.append(", useCustomColors=");
        sb.append(this.f);
        sb.append(", placement=");
        int i2 = this.j;
        sb.append((Object) (i2 != 1 ? i2 != 2 ? "BELOW" : "ABOVE" : "UNKNOWN"));
        sb.append(", action=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
