package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class da implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentManager$LaunchedFragmentInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FragmentManager$LaunchedFragmentInfo[i];
    }
}
