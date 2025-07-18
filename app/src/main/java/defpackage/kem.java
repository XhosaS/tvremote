package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kem implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApiMetadata createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                complianceOptions = (ComplianceOptions) kkw.h(parcel, i, ComplianceOptions.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new ApiMetadata(complianceOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
