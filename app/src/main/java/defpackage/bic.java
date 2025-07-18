package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bic implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MultiSelectListPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MultiSelectListPreference.SavedState[i];
    }
}
