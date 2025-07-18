package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.C0000do;
import defpackage.ab;
import defpackage.ac;
import defpackage.bq;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ac();
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public BackStackRecordState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(ab abVar) {
        int size = abVar.d.size();
        this.a = new int[size * 6];
        if (abVar.j) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0000do c0000do = (C0000do) abVar.d.get(i2);
                int i3 = i + 1;
                this.a[i] = c0000do.a;
                ArrayList arrayList = this.b;
                bq bqVar = c0000do.b;
                arrayList.add(bqVar != null ? bqVar.m : null);
                int[] iArr = this.a;
                iArr[i3] = c0000do.c ? 1 : 0;
                iArr[i + 2] = c0000do.d;
                iArr[i + 3] = c0000do.e;
                int i4 = i + 5;
                iArr[i + 4] = c0000do.f;
                i += 6;
                iArr[i4] = c0000do.g;
                this.c[i2] = c0000do.h.ordinal();
                this.d[i2] = c0000do.i.ordinal();
            }
            this.e = abVar.i;
            this.f = abVar.l;
            this.g = abVar.c;
            this.h = abVar.m;
            this.i = abVar.n;
            this.j = abVar.o;
            this.k = abVar.p;
            this.l = abVar.q;
            this.m = abVar.r;
            this.n = abVar.s;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
