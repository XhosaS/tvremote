package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhu extends ocg {
    public static final Parcelable.Creator<nhu> CREATOR = new nhv(0);
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    public nhu(String str, List list, List list2, boolean z) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
    }

    public static qbn a() {
        qbn qbnVar = new qbn();
        qbnVar.d(false);
        return qbnVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.Q(parcel, 2, this.b);
        ocv.Q(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.x(parcel, iV);
    }
}
