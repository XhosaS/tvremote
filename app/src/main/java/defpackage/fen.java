package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fen {
    public static final abvo a(final Intent intent) {
        return (abvo) b(new agux() { // from class: fel
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Parcel parcel = (Parcel) obj;
                parcel.getClass();
                intent.writeToParcel(parcel, 0);
                byte[] bArrMarshall = parcel.marshall();
                bArrMarshall.getClass();
                return abvo.u(bArrMarshall, 0, bArrMarshall.length);
            }
        });
    }

    public static final Object b(agux aguxVar) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.getClass();
            return aguxVar.a(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final Object c(final byte[] bArr, final Parcelable.Creator creator) {
        return b(new agux() { // from class: fem
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Parcel parcel = (Parcel) obj;
                parcel.getClass();
                byte[] bArr2 = bArr;
                parcel.unmarshall(bArr2, 0, bArr2.length);
                parcel.setDataPosition(0);
                return creator.createFromParcel(parcel);
            }
        });
    }
}
