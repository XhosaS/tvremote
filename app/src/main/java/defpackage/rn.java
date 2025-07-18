package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.StaggeredGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
