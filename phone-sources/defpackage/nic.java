package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nic extends ocg {
    public static final Parcelable.Creator<nic> CREATOR = new nhv(6);
    public final Long a;
    public final List b;

    public nic(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iV = ocv.v(parcel);
        ocv.M(parcel, 1, l);
        ocv.Q(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
