package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojp extends ocg {
    public static final Parcelable.Creator<ojp> CREATOR = new oee(2);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ojp(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojp)) {
            return false;
        }
        ojp ojpVar = (ojp) obj;
        return this.a == ojpVar.a && this.b == ojpVar.b && a.Q(this.f, ojpVar.f) && a.Q(this.e, ojpVar.e) && a.Q(this.c, ojpVar.c) && this.d == ojpVar.d && a.Q(this.g, ojpVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, z);
        ocv.y(parcel, 2, this.b);
        List list = this.e;
        ocv.S(parcel, 3, list == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list));
        List list2 = this.f;
        ocv.S(parcel, 4, list2 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list2));
        ocv.O(parcel, 5, this.c);
        ocv.y(parcel, 6, this.d);
        List list3 = this.g;
        ocv.S(parcel, 7, list3 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list3));
        ocv.x(parcel, iV);
    }
}
