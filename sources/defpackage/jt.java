package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jt implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public jt(int i) {
        this.a = i;
    }

    public static final tr a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return tr.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? a(parcel, null) : new mt(parcel, null) : new it(parcel, null) : new ju(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new tr[i] : new mt[i] : new it[i] : new ju[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new ju(parcel, classLoader);
        }
        if (i != 1) {
            return i != 2 ? a(parcel, classLoader) : new mt(parcel, classLoader);
        }
        return new it(parcel, classLoader);
    }
}
