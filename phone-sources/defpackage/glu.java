package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glu extends dam {
    public static final Parcelable.Creator<glu> CREATOR = new cqy(3);
    public int a;
    public Parcelable b;
    public ClassLoader c;

    public glu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.a = parcel.readInt();
        this.b = parcel.readParcelable(classLoader);
        this.c = classLoader;
    }

    public final String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public glu(Parcelable parcelable) {
        super(parcelable);
    }
}
