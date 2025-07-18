package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swb implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public swb(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? new tal(parcel) : new sop(parcel) : new swc(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? new tal[i] : new sop[i] : new swc[i];
    }
}
