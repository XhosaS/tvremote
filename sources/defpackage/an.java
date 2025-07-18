package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class an implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e(3);
    ArrayList a;
    ArrayList b;
    d[] c;
    int d;
    String e;
    ArrayList f;
    ArrayList g;
    ArrayList h;

    public an() {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }

    public an(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (d[]) parcel.createTypedArray(d.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(f.CREATOR);
        this.h = parcel.createTypedArrayList(ai.CREATOR);
    }
}
