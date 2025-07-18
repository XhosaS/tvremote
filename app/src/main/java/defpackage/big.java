package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class big implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }
}
