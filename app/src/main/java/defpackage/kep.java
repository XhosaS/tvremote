package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kep implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        boolean zS = true;
        int iB2 = 0;
        int iB3 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                iB2 = kkw.b(parcel, i);
            } else if (c == 3) {
                iB3 = kkw.b(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                zS = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ComplianceOptions(iB, iB2, iB3, zS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ComplianceOptions[i];
    }
}
