package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqy implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public cqy(int i) {
        this.a = i;
    }

    public static final dam a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return dam.EMPTY_STATE;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new syq(parcel, null) : new syl(parcel, null) : new gmv(parcel, null) : new glu(parcel, null) : a(parcel, null) : new bu(parcel, null) : new cqz(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? new syq[i] : new syl[i] : new gmv[i] : new glu[i] : new dam[i] : new bu[i] : new cqz[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new cqz(parcel, classLoader);
        }
        if (i == 1) {
            return new bu(parcel, classLoader);
        }
        if (i == 2) {
            return a(parcel, classLoader);
        }
        if (i == 3) {
            return new glu(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? new syq(parcel, classLoader) : new syl(parcel, classLoader);
        }
        return new gmv(parcel, classLoader);
    }
}
