package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uly extends ocg {
    public static final Parcelable.Creator<uly> CREATOR = new sct(14);
    public final String a;

    public uly(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.x(parcel, iV);
    }
}
