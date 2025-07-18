package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avr implements awc {
    private final String a;
    private final String b;

    public avr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.awc
    public final String a() {
        return this.b;
    }

    @Override // defpackage.awc
    public final String b() {
        return this.a;
    }

    @Override // defpackage.awc
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            avr avrVar = (avr) obj;
            return yks.e(this.a, avrVar.a) && yks.e(this.b, avrVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        a.bw(1);
        return ((((iHashCode + iHashCode2) * 31) + 1237) * 31) + 1;
    }

    @Override // defpackage.awc
    public final void c() {
    }
}
