package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhw extends ocg {
    public static final Parcelable.Creator<nhw> CREATOR = new nhv(2);
    public final List a;
    public final List b;

    public nhw(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iV = ocv.v(parcel);
        ocv.S(parcel, 1, list);
        ocv.S(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
