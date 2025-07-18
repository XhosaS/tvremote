package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cs implements Parcelable {
    public static final Parcelable.Creator<cs> CREATOR = new av(3);
    ArrayList a;
    ArrayList b;
    au[] c;
    int d;
    String e;
    ArrayList f;
    ArrayList g;
    ArrayList h;

    public cs() {
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

    public cs(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = parcel.createStringArrayList();
        this.b = parcel.createStringArrayList();
        this.c = (au[]) parcel.createTypedArray(au.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(aw.CREATOR);
        this.h = parcel.createTypedArrayList(cm.CREATOR);
    }
}
