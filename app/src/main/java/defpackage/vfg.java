package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vfg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return AccountId.b(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountId[i];
    }
}
