package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.EventParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kup implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                bundleF = kkw.f(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new EventParams(bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EventParams[i];
    }
}
