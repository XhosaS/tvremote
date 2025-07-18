package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class biv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PreferenceGroup.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PreferenceGroup.SavedState[i];
    }
}
