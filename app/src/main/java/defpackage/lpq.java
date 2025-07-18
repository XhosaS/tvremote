package defpackage;

import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.MatrixCursorParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lpq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        int i2 = parcel.readInt();
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (i == 0 && i2 == 0) {
            matrixCursor = null;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                matrixCursor.addRow(parcel.readArray(Object.class.getClassLoader()));
            }
        }
        return new MatrixCursorParcelable(matrixCursor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MatrixCursorParcelable[i];
    }
}
