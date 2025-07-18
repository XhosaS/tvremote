package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.katniss.data.UserAssistantSettings;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws abxv {
        try {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            lxp lxpVar = lxp.a;
            int length = bArrCreateByteArray.length;
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            abxd abxdVarH = abxd.h(lxpVar, bArrCreateByteArray, 0, length, ExtensionRegistryLite.a);
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
            return new UserAssistantSettings((lxp) abxdVarH);
        } catch (abxv e) {
            throw new IllegalArgumentException("Attempted to restore UserAssistantSettings from parcel but failed.", e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAssistantSettings[i];
    }
}
