package defpackage;

import android.database.Cursor;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faa implements agux {
    @Override // defpackage.agux
    public final /* synthetic */ Object a(Object obj) throws abxv {
        abuy abuyVar;
        xcj xcjVar;
        byte bByteValue;
        byte bByteValue2;
        Cursor cursor = ((vsx) obj).a;
        try {
            int columnIndex = cursor.getColumnIndex("config_data");
            int columnIndex2 = cursor.getColumnIndex("assistant_launcher_capabilities");
            if (columnIndex != -1) {
                byte[] bArrB = vsx.b(cursor, columnIndex);
                try {
                    abxd abxdVarH = abxd.h(abuy.a, bArrB, 0, bArrB.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH != null && (bByteValue2 = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue2 != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            abxdVarH.cM(2, true != zL ? null : abxdVarH);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                    abuyVar = (abuy) abxdVarH;
                } catch (abxv e) {
                    ((zdv) ((zdv) fab.a.d()).p(e).q("com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder", "parseLauncherConfigInfo", 227, "AtvAssistantParamsBuilder.kt")).u("Failed to parse client config.");
                }
            } else {
                abuyVar = null;
            }
            if (columnIndex2 != -1) {
                byte[] bArrB2 = vsx.b(cursor, columnIndex2);
                try {
                    abxd abxdVarH2 = abxd.h(xcj.a, bArrB2, 0, bArrB2.length, ExtensionRegistryLite.getGeneratedRegistry());
                    if (abxdVarH2 != null && (bByteValue = ((Byte) abxdVarH2.cM(1, null)).byteValue()) != 1) {
                        if (bByteValue != 0) {
                            boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                            abxdVarH2.cM(2, true != zL2 ? null : abxdVarH2);
                            if (zL2) {
                            }
                        }
                        throw new abzz().a();
                    }
                    xcjVar = (xcj) abxdVarH2;
                } catch (abxv e2) {
                    ((zdv) ((zdv) fab.a.d()).p(e2).q("com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder", "parseLauncherCapabilities", 237, "AtvAssistantParamsBuilder.kt")).u("Failed to parse LauncherCapabilities.");
                }
            } else {
                xcjVar = null;
            }
            return new ezs(abuyVar, xcjVar);
        } catch (RuntimeException e3) {
            ((zdv) ((zdv) fab.a.d()).p(e3).q("com/google/android/apps/tvsearch/app/params/atv/AtvAssistantParamsBuilder$queryLauncherXConfigContentProvider$2", "invoke-JfnmSAo", 281, "AtvAssistantParamsBuilder.kt")).u("Failed to read LauncherX config/capabilities.");
            return new ezs(null, null);
        }
    }
}
