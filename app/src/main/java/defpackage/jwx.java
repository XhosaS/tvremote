package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AppRestrictionState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        boolean zS2 = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zS = kkw.s(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                zS2 = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new AppRestrictionState(zS, zS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRestrictionState[i];
    }
}
