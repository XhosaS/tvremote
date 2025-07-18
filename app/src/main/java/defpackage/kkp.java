package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        boolean zS = false;
        boolean zS2 = false;
        int iB2 = 0;
        int iB3 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                zS = kkw.s(parcel, i);
            } else if (c == 3) {
                zS2 = kkw.s(parcel, i);
            } else if (c == 4) {
                iB2 = kkw.b(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                iB3 = kkw.b(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new RootTelemetryConfiguration(iB, zS, zS2, iB2, iB3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
