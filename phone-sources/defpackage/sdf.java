package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdf implements Parcelable.ClassLoaderCreator {
    public static final sdg a(Parcel parcel, ClassLoader classLoader) {
        parcel.getClass();
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        return new sdg(i, iArr, parcel.readParcelableArray(classLoader));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sdg[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
