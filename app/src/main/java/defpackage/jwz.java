package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.AppRestriction;
import com.google.android.gms.auth.aang.AppRestrictionInfo;
import com.google.android.gms.auth.aang.AppRestrictionState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        AppRestrictionState appRestrictionState = null;
        AppRestrictionInfo appRestrictionInfo = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                appRestrictionState = (AppRestrictionState) kkw.h(parcel, i, AppRestrictionState.CREATOR);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                appRestrictionInfo = (AppRestrictionInfo) kkw.h(parcel, i, AppRestrictionInfo.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new AppRestriction(appRestrictionState, appRestrictionInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppRestriction[i];
    }
}
