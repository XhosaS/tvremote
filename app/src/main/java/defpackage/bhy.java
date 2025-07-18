package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bhy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ListPreference.SavedState[i];
    }
}
