package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlj extends ocg {
    public static final Parcelable.Creator<nlj> CREATOR = new nld(5);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public nlj(int i, String str, List list, List list2, double d) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = d;
    }

    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlj)) {
            return false;
        }
        nlj nljVar = (nlj) obj;
        return this.a == nljVar.a && TextUtils.equals(this.b, nljVar.b) && a.Q(this.c, nljVar.c) && a.Q(this.d, nljVar.d) && this.e == nljVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.O(parcel, 3, this.b);
        List list = this.c;
        ocv.S(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        ocv.S(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        ocv.z(parcel, 6, this.e);
        ocv.x(parcel, iV);
    }

    public nlj(nlj nljVar) {
        this.a = nljVar.a;
        this.b = nljVar.b;
        this.c = nljVar.c;
        this.d = nljVar.d;
        this.e = nljVar.e;
    }

    public nlj() {
        a();
    }
}
