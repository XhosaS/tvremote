package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new e(8);
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;

    public jj() {
    }

    public final void a() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }

    public final void b() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.g);
    }

    public jj(jj jjVar) {
        this.c = jjVar.c;
        this.a = jjVar.a;
        this.b = jjVar.b;
        this.d = jjVar.d;
        this.e = jjVar.e;
        this.f = jjVar.f;
        this.h = jjVar.h;
        this.i = jjVar.i;
        this.j = jjVar.j;
        this.g = jjVar.g;
    }

    public jj(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        int i = parcel.readInt();
        this.c = i;
        if (i > 0) {
            int[] iArr = new int[i];
            this.d = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        this.e = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            this.f = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt() == 1;
        this.j = parcel.readInt() == 1;
        this.g = parcel.readArrayList(ji.class.getClassLoader());
    }
}
