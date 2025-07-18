package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.LongSparseArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdh extends LongSparseArray implements Parcelable {
    public static final sde CREATOR = new sde();

    public sdh() {
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        sdg sdgVar = (sdg) get(viewHolder.getItemId());
        if (sdgVar == null) {
            sdgVar = new sdg();
        }
        View view = viewHolder.itemView;
        view.getClass();
        sdgVar.b(view);
        put(viewHolder.getItemId(), sdgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int size = size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(keyAt(i2));
            parcel.writeParcelable((Parcelable) valueAt(i2), 0);
        }
    }

    public sdh(int i) {
        super(i);
    }
}
