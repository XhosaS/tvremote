package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.DogfoodsToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        byte[] bArrT = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                bArrT = kkw.t(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new DogfoodsToken(bArrT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DogfoodsToken[i];
    }
}
