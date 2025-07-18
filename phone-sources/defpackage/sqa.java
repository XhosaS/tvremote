package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqa extends dam {
    public static final Parcelable.Creator<sqa> CREATOR = new spm(2);
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public sqa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
    }

    @Override // defpackage.dam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public sqa(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.y;
        this.b = bottomSheetBehavior.e;
        this.c = bottomSheetBehavior.c;
        this.d = bottomSheetBehavior.v;
        this.e = bottomSheetBehavior.w;
    }
}
