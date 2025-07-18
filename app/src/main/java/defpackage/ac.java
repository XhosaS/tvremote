package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackRecordState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackStackRecordState[i];
    }
}
