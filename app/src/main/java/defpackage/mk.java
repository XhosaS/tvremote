package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner$SavedState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppCompatSpinner$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppCompatSpinner$SavedState[i];
    }
}
