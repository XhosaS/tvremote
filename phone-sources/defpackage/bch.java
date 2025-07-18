package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bch implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bci createFromParcel(Parcel parcel, ClassLoader classLoader) {
        bcz bczVar;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            bczVar = bcz.b;
        } else if (i == 1) {
            bczVar = bcz.c;
        } else {
            if (i != 2) {
                throw new IllegalStateException(a.cd(i, "Unsupported MutableState policy ", " was restored"));
            }
            bczVar = bcz.a;
        }
        return new bci(value, bczVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new bci[i];
    }
}
