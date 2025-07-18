package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogi extends ocg {
    public static final Parcelable.Creator<ogi> CREATOR = new obd(18);
    public final String a;
    public final long b;

    public ogi(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.C(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
