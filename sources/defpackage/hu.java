package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e(6);
    public int a;
    public int b;
    public boolean c;

    public hu() {
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public hu(hu huVar) {
        this.a = huVar.a;
        this.b = huVar.b;
        this.c = huVar.c;
    }

    public hu(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 1;
    }
}
