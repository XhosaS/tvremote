package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bht implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EditTextPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EditTextPreference.SavedState[i];
    }
}
