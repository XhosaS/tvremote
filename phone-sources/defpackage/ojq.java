package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojq extends ocg {
    public static final Parcelable.Creator<ojq> CREATOR = new oee(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public ojq(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojq)) {
            return false;
        }
        ojq ojqVar = (ojq) obj;
        return this.a == ojqVar.a && this.b == ojqVar.b && this.c == ojqVar.c && this.e == ojqVar.e && this.f == ojqVar.f && this.i == ojqVar.i && a.Q(this.d, ojqVar.d) && a.Q(this.g, ojqVar.g) && a.Q(this.h, ojqVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.i), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, z);
        ocv.y(parcel, 2, this.b);
        ocv.y(parcel, 3, this.c);
        ocv.N(parcel, 4, this.d, i);
        ocv.y(parcel, 5, this.e);
        ocv.y(parcel, 6, this.f);
        ocv.O(parcel, 7, this.g);
        ocv.S(parcel, 8, this.h);
        ocv.y(parcel, 9, this.i);
        ocv.x(parcel, iV);
    }
}
