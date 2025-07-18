package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjd implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bje createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        int i = parcel.readInt();
        bct bctVar = new bct(parcel, classLoader, 4, null);
        if (i == 0) {
            return new bje();
        }
        bgl bglVarJ = bgp.a.j();
        for (int i2 = 0; i2 < i; i2++) {
            bglVarJ.add(bctVar.a(Integer.valueOf(i2)));
        }
        return new bje(bglVarJ.c());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bje[i];
    }
}
