package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lrf;
import defpackage.lse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lrf();
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
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
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return lse.a(this.a, flagOverride.a) && lse.a(this.b, flagOverride.b) && lse.a(this.c, flagOverride.c) && this.d == flagOverride.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, this.a);
        kkx.r(parcel, 3, this.b);
        kkx.q(parcel, 4, this.c, i);
        kkx.c(parcel, 5, this.d);
        kkx.b(parcel, iA);
    }
}
