package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlowLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FlowLayoutManager.SavedState[i];
    }
}
