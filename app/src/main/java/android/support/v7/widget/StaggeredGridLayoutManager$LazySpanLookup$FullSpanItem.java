package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rl;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rl();
    public int a;
    int b;
    int[] c;
    boolean d;

    StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d ? 1 : 0);
        int[] iArr = this.c;
        if (iArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.c);
        }
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            this.c = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
