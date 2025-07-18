package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bib implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public bib(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? new bje(parcel, null) : new bii(parcel, null) : new bhb(parcel, null) : new bic(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new bje[i] : new bii[i] : new bhb[i] : new bic[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new bic(parcel, classLoader);
        }
        if (i != 1) {
            return i != 2 ? new bje(parcel, classLoader) : new bii(parcel, classLoader);
        }
        return new bhb(parcel, classLoader);
    }
}
