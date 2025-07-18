package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        ArrayList arrayListO = null;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListO = kkw.o(parcel, i, ConsentInformation.AccountConsentInformation.CREATOR);
            } else if (c == 2) {
                zS = kkw.s(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                zS2 = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ConsentInformation(arrayListO, zS, zS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentInformation[i];
    }
}
