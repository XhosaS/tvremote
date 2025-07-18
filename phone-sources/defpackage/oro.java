package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oro implements Parcelable {
    public final Parcelable b;
    final Object c;
    final int d;
    final float e;
    public static final oro a = new oro();
    public static final Parcelable.Creator<oro> CREATOR = new omd(14);

    public oro() {
        this.b = null;
        this.c = null;
        this.d = 0;
        this.e = 0.0f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object obj = this.c;
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Object obj = this.c;
        boolean z = obj instanceof Parcelable;
        parcel.writeByte(z ? (byte) 1 : (byte) 0);
        if (z) {
            parcel.writeParcelable((Parcelable) obj, i);
        } else {
            parcel.writeSerializable((Serializable) obj);
        }
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
    }

    public oro(Parcel parcel) {
        Parcelable parcelable = parcel.readParcelable(RecyclerView.class.getClassLoader());
        this.b = parcelable == null ? a : parcelable;
        this.c = parcel.readByte() == 1 ? parcel.readParcelable(oro.class.getClassLoader()) : parcel.readSerializable();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
    }
}
