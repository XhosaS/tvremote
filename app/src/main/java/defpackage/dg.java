package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentManagerState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
