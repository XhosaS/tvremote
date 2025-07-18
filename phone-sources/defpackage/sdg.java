package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdg extends SparseArray implements Parcelable {
    public static final sdf CREATOR = new sdf();

    public sdg() {
    }

    public final void a(View view) {
        int id = view.getId();
        if (view.getId() == -1) {
            view.setId(R.id.view_holder_state_saving_view_id);
        }
        view.restoreHierarchyState(this);
        view.setId(id);
    }

    public final void b(View view) {
        int id = view.getId();
        if (view.getId() == -1) {
            view.setId(R.id.view_holder_state_saving_view_id);
        }
        view.saveHierarchyState(this);
        view.setId(id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public sdg(int i, int[] iArr, Parcelable[] parcelableArr) {
        super(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            parcelableArr.getClass();
            put(i3, parcelableArr[i2]);
        }
    }
}
