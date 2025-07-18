package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kjf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iB = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleF = kkw.f(parcel, i);
            } else if (c == 2) {
                featureArr = (Feature[]) kkw.v(parcel, i, Feature.CREATOR);
            } else if (c == 3) {
                iB = kkw.b(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) kkw.h(parcel, i, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new ConnectionInfo(bundleF, featureArr, iB, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
