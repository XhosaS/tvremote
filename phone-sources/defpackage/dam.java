package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dam implements Parcelable {
    private final Parcelable mSuperState;
    public static final dam EMPTY_STATE = new dal();
    public static final Parcelable.Creator<dam> CREATOR = new cqy(2);

    private dam() {
        this.mSuperState = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }

    protected dam(Parcel parcel) {
        this(parcel, null);
    }

    protected dam(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.mSuperState = parcelable == null ? EMPTY_STATE : parcelable;
    }

    protected dam(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    public /* synthetic */ dam(dal dalVar) {
        this();
    }
}
