package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwx extends bww {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public bwx(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new wx(0), new wx(0), new wx(0));
    }

    @Override // defpackage.bww
    public final boolean B() {
        return this.e.readInt() != 0;
    }

    @Override // defpackage.bww
    public final boolean D(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            Parcel parcel = this.e;
            parcel.setDataPosition(this.j);
            int i3 = parcel.readInt();
            this.k = parcel.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // defpackage.bww
    public final byte[] E() {
        Parcel parcel = this.e;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.bww
    public final int a() {
        return this.e.readInt();
    }

    @Override // defpackage.bww
    public final long c() {
        return this.e.readLong();
    }

    @Override // defpackage.bww
    public final Bundle d() {
        return this.e.readBundle(getClass().getClassLoader());
    }

    @Override // defpackage.bww
    public final IBinder e() {
        return this.e.readStrongBinder();
    }

    @Override // defpackage.bww
    public final Parcelable f() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // defpackage.bww
    protected final bww h() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        String str = this.h;
        return new bwx(parcel, iDataPosition, i, str.concat("  "), this.a, this.b, this.c);
    }

    @Override // defpackage.bww
    protected final CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.bww
    public final String m() {
        return this.e.readString();
    }

    @Override // defpackage.bww
    public final void o() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.d;
            Parcel parcel = this.e;
            int i2 = sparseIntArray.get(i);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // defpackage.bww
    public final void p(int i) {
        o();
        this.i = i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // defpackage.bww
    public final void r(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.bww
    public final void s(Bundle bundle) {
        this.e.writeBundle(bundle);
    }

    @Override // defpackage.bww
    public final void t(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
            return;
        }
        Parcel parcel = this.e;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    @Override // defpackage.bww
    public final void u(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.bww
    public final void v(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.bww
    public final void w(long j) {
        this.e.writeLong(j);
    }

    @Override // defpackage.bww
    public final void x(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.bww
    public final void y(String str) {
        this.e.writeString(str);
    }

    @Override // defpackage.bww
    public final void z(IBinder iBinder) {
        this.e.writeStrongBinder(iBinder);
    }

    private bwx(Parcel parcel, int i, int i2, String str, wx wxVar, wx wxVar2, wx wxVar3) {
        super(wxVar, wxVar2, wxVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
