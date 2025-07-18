package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        byte[] bArrT = null;
        ArrayList arrayListM = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                bArrT = kkw.t(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                arrayListM = kkw.m(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ConsentInformation.AccountConsentInformation(strL, bArrT, arrayListM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentInformation.AccountConsentInformation[i];
    }
}
