package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akw extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(20);
    public final String a;
    public final String b;
    public final akv c;
    public final boolean d;

    public akw(String str, String str2, akv akvVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = akvVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akw)) {
            return false;
        }
        akw akwVar = (akw) obj;
        return ii.X(this.a, akwVar.a) && ii.X(this.b, akwVar.b) && ii.X(this.c, akwVar.c) && this.d == akwVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.u(parcel, 2, this.a);
        qq.u(parcel, 3, this.b);
        qq.t(parcel, 4, this.c, i);
        qq.k(parcel, 5, this.d);
        qq.j(parcel, iH);
    }
}
