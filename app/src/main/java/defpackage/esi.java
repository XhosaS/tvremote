package defpackage;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.google.android.apps.inputmethod.libs.tvvoice.api.KeyboardEventData;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public class esi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) throws abxv {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null) {
            throw new ParcelFormatException("Attempt to read KeyboardEvent proto from null byte array.");
        }
        try {
            abxd abxdVarH = abxd.h(esk.a, bArrCreateByteArray, 0, bArrCreateByteArray.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            return new KeyboardEventData((esk) abxdVarH);
        } catch (abxv e) {
            ParcelFormatException parcelFormatException = new ParcelFormatException("Invalid attempt to read KeyboardEvent proto.");
            parcelFormatException.initCause(e);
            throw parcelFormatException;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyboardEventData[i];
    }
}
