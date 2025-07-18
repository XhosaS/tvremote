package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long epochMilli = Instant.now().toEpochMilli();
        byte[] bArrT = null;
        SyncOptions syncOptions = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                bArrT = kkw.t(parcel, i);
            } else if (c == 3) {
                syncOptions = (SyncOptions) kkw.h(parcel, i, SyncOptions.CREATOR);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                epochMilli = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new SyncRequest(iB, bArrT, syncOptions, epochMilli);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncRequest[i];
    }
}
