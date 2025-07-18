package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        while (parcel.dataPosition() < iD) {
            kkw.r(parcel, parcel.readInt());
        }
        kkw.p(parcel, iD);
        return new SyncOptions();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncOptions[i];
    }
}
