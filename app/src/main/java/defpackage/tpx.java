package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.licenses.License;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tpx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new License(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new License[i];
    }
}
