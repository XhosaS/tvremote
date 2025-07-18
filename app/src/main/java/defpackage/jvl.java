package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.LayoutParams(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FlexboxLayoutManager.LayoutParams[i];
    }
}
