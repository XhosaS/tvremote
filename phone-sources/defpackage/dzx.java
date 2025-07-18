package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dzx {
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public static final String d = edt.Z(3);
    public static final String e = edt.Z(4);
    public static final String f = edt.Z(5);
    public static final String g = edt.Z(6);
    public final Uri h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;

    public dzx(dzw dzwVar) {
        this.h = dzwVar.a;
        this.i = dzwVar.b;
        this.j = dzwVar.c;
        this.k = dzwVar.d;
        this.l = dzwVar.e;
        this.m = dzwVar.f;
        this.n = dzwVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzx)) {
            return false;
        }
        dzx dzxVar = (dzx) obj;
        return this.h.equals(dzxVar.h) && Objects.equals(this.i, dzxVar.i) && Objects.equals(this.j, dzxVar.j) && this.k == dzxVar.k && this.l == dzxVar.l && Objects.equals(this.m, dzxVar.m) && Objects.equals(this.n, dzxVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.k) * 31) + this.l) * 31;
        String str3 = this.m;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
