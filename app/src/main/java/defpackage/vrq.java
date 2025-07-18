package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vrq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableFuture(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableFuture[i];
    }
}
