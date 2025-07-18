package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class btk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SwipeRefreshLayout$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SwipeRefreshLayout$SavedState[i];
    }
}
