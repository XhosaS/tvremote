package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrU = null;
        int[] iArrU2 = null;
        boolean zS = false;
        boolean zS2 = false;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) kkw.h(parcel, i, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zS = kkw.s(parcel, i);
                    break;
                case 3:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 4:
                    iArrU = kkw.u(parcel, i);
                    break;
                case 5:
                    iB = kkw.b(parcel, i);
                    break;
                case 6:
                    iArrU2 = kkw.u(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zS, zS2, iArrU, iB, iArrU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
