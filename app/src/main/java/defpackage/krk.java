package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.internal.InitializationParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        String strL = null;
        boolean zS = false;
        long jE = 0;
        long jE2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jE = kkw.e(parcel, i);
            } else if (c == 2) {
                jE2 = kkw.e(parcel, i);
            } else if (c == 3) {
                zS = kkw.s(parcel, i);
            } else if (c == 7) {
                bundleF = kkw.f(parcel, i);
            } else if (c != '\b') {
                kkw.r(parcel, i);
            } else {
                strL = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new InitializationParams(jE, jE2, zS, bundleF, strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitializationParams[i];
    }
}
