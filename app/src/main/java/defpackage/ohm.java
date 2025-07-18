package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohm extends oik {
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final oii f;

    public ohm(String str, Long l, Long l2, Long l3, Integer num, oii oiiVar) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = num;
        this.f = oiiVar;
    }

    @Override // defpackage.oik
    public final oii a() {
        return this.f;
    }

    @Override // defpackage.oik
    public final Integer b() {
        return this.e;
    }

    @Override // defpackage.oik
    public final Long c() {
        return this.c;
    }

    @Override // defpackage.oik
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.oik
    public final Long e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        Long l3;
        Integer num;
        oii oiiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oik) {
            oik oikVar = (oik) obj;
            if (this.a.equals(oikVar.f()) && ((l = this.b) != null ? l.equals(oikVar.e()) : oikVar.e() == null) && ((l2 = this.c) != null ? l2.equals(oikVar.c()) : oikVar.c() == null) && ((l3 = this.d) != null ? l3.equals(oikVar.d()) : oikVar.d() == null) && ((num = this.e) != null ? num.equals(oikVar.b()) : oikVar.b() == null) && ((oiiVar = this.f) != null ? oiiVar.equals(oikVar.a()) : oikVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oik
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (l3 == null ? 0 : l3.hashCode())) * 1000003;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        oii oiiVar = this.f;
        return iHashCode5 ^ (oiiVar != null ? oiiVar.hashCode() : 0);
    }

    public final String toString() {
        return "TimeSpan{name=" + this.a + ", startTimeUs=" + this.b + ", endTimeUs=" + this.c + ", spanLengthTimeUs=" + this.d + ", parentId=" + this.e + ", spanInfo=" + String.valueOf(this.f) + "}";
    }
}
