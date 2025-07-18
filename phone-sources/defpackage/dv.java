package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class dv implements Parcelable {
    public static final Parcelable.Creator<dv> CREATOR = new av(7);
    public Object a;
    private final int b;
    private final float c;

    public dv(int i, float f) {
        this.b = i;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.b);
        sb.append(" rating=");
        float f = this.c;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
    }
}
