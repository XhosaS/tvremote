package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvg extends ocg {
    public static final Parcelable.Creator<nvg> CREATOR = new nub(8);
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public nvg(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nvg) {
            nvg nvgVar = (nvg) obj;
            String str = this.a;
            if (((str != null && str.equals(nvgVar.a)) || (str == null && nvgVar.a == null)) && a() == nvgVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ocv.aK("name", this.a, arrayList);
        ocv.aK(krh.VERSION, Long.valueOf(a()), arrayList);
        return ocv.aJ(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.B(parcel, 2, this.b);
        ocv.C(parcel, 3, a());
        ocv.x(parcel, iV);
    }

    public nvg(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
