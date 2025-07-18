package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.AdditionalConsentConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        String strL5 = null;
        Bundle bundleF = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 4:
                    strL3 = kkw.l(parcel, i);
                    break;
                case 5:
                    strL4 = kkw.l(parcel, i);
                    break;
                case 6:
                    strL5 = kkw.l(parcel, i);
                    break;
                case 7:
                    bundleF = kkw.f(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new AdditionalConsentConfig(strL, strL2, strL3, strL4, strL5, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdditionalConsentConfig[i];
    }
}
