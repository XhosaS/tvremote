package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahx implements CharSequence {
    public final List a;
    public final List b;
    public final CharSequence c;
    public final long d;
    public final chb e;
    public final yfw f;

    public /* synthetic */ ahx(CharSequence charSequence, long j, chb chbVar, yfw yfwVar, List list, int i) {
        j = (i & 2) != 0 ? chb.a : j;
        charSequence = 1 == (i & 1) ? "" : charSequence;
        chbVar = (i & 4) != 0 ? null : chbVar;
        yfwVar = (i & 8) != 0 ? null : yfwVar;
        this.a = (i & 16) != 0 ? null : list;
        this.b = null;
        this.c = charSequence instanceof ahx ? ((ahx) charSequence).c : charSequence;
        this.d = ccf.P(j, charSequence.length());
        this.e = chbVar != null ? new chb(ccf.P(chbVar.b, charSequence.length())) : null;
        this.f = yfwVar != null ? new yfw(yfwVar.a, new chb(ccf.P(((chb) yfwVar.b).b, charSequence.length()))) : null;
    }

    public final int a() {
        return this.c.length();
    }

    public final boolean b(CharSequence charSequence) {
        return ylh.w(this.c, charSequence);
    }

    public final boolean c() {
        return this.f == null;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.c.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ahx ahxVar = (ahx) obj;
        long j = this.d;
        long j2 = ahxVar.d;
        long j3 = chb.a;
        return a.s(j, j2) && yks.e(this.e, ahxVar.e) && yks.e(this.f, ahxVar.f) && yks.e(this.a, ahxVar.a) && b(ahxVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        long j = chb.a;
        chb chbVar = this.e;
        int iK = (((iHashCode + a.k(this.d)) * 31) + (chbVar != null ? a.k(chbVar.b) : 0)) * 31;
        yfw yfwVar = this.f;
        int iHashCode2 = (iK + (yfwVar != null ? yfwVar.hashCode() : 0)) * 31;
        List list = this.a;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }
}
