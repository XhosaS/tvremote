package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.tvsearch.common.parcelable.ParcelableByteArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fek implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new ParcelableByteArray(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableByteArray[i];
    }
}
