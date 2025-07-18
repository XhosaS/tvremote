package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListN = null;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListN = kkw.n(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                strL = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new RecordConsentByConsentResultResponse(arrayListN, strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecordConsentByConsentResultResponse[i];
    }
}
