package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lti implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SessionZwiebackToken(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionZwiebackToken[i];
    }
}
