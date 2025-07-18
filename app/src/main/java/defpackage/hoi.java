package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.tvsearch.results.searchentity.info.EntityInfo;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws abxv {
        adyf adyfVar;
        adwo adwoVar;
        byte bByteValue;
        byte bByteValue2;
        parcel.getClass();
        String string = parcel.readString();
        String str = string == null ? "" : string;
        String string2 = parcel.readString();
        String str2 = string2 == null ? "" : string2;
        int i = parcel.readInt();
        if (i > 0) {
            byte[] bArr = new byte[i];
            parcel.readByteArray(bArr);
            try {
                adyf adyfVar2 = adyf.a;
                ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
                abza abzaVar = abza.a;
                abxd abxdVarH = abxd.h(adyfVar2, bArr, 0, i, ExtensionRegistryLite.a);
                if (abxdVarH != null && (bByteValue2 = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue2 != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                adyfVar = (adyf) abxdVarH;
            } catch (abxv e) {
                ((zdv) ((zdv) EntityInfo.a.c()).p(e).q("com/google/android/apps/tvsearch/results/searchentity/info/EntityInfo$Companion$CREATOR$1", "createFromParcel", 64, "EntityInfo.kt")).u("Wrong KnowledgePanelMetaData proto.");
            }
        } else {
            adyfVar = null;
        }
        int i2 = parcel.readInt();
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            parcel.readByteArray(bArr2);
            try {
                adwo adwoVar2 = adwo.a;
                ExtensionRegistryLite extensionRegistryLite2 = ExtensionRegistryLite.a;
                abza abzaVar2 = abza.a;
                abxd abxdVarH2 = abxd.h(adwoVar2, bArr2, 0, i2, ExtensionRegistryLite.a);
                if (abxdVarH2 != null && (bByteValue = ((Byte) abxdVarH2.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                        abxdVarH2.cM(2, true != zL2 ? null : abxdVarH2);
                        if (zL2) {
                        }
                    }
                    throw new abzz().a();
                }
                adwoVar = (adwo) abxdVarH2;
            } catch (abxv e2) {
                ((zdv) ((zdv) EntityInfo.a.c()).p(e2).q("com/google/android/apps/tvsearch/results/searchentity/info/EntityInfo$Companion$CREATOR$1", "createFromParcel", 81, "EntityInfo.kt")).u("Wrong AppMetaData proto.");
            }
        } else {
            adwoVar = null;
        }
        String string3 = parcel.readString();
        return new EntityInfo(str, str2, adyfVar, adwoVar, string3 == null ? "" : string3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new EntityInfo[i];
    }
}
