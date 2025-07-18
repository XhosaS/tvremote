package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuq implements Parcelable.Creator {
    public static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, eventParcel.a);
        kkx.q(parcel, 3, eventParcel.b, i);
        kkx.r(parcel, 4, eventParcel.c);
        kkx.g(parcel, 5, eventParcel.d);
        kkx.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        String strL = null;
        EventParams eventParams = null;
        String strL2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c == 3) {
                eventParams = (EventParams) kkw.h(parcel, i, EventParams.CREATOR);
            } else if (c == 4) {
                strL2 = kkw.l(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                jE = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new EventParcel(strL, eventParams, strL2, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EventParcel[i];
    }
}
