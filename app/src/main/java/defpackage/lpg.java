package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFullScreenImageData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                fA = kkw.a(parcel, i);
            } else if (c == 2) {
                fA2 = kkw.a(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                fA3 = kkw.a(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new CallingCardFullScreenImageData(fA, fA2, fA3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardFullScreenImageData[i];
    }
}
