package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        sdh sdhVar = new sdh(i);
        for (int i2 = 0; i2 < i; i2++) {
            long j = parcel.readLong();
            if (((sdg) parcel.readParcelable(sdg.class.getClassLoader())) == null) {
                sdhVar.put(j, null);
            }
        }
        return sdhVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sdh[i];
    }
}
