package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aop extends anx {
    public aop() {
        super(aco.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.anx
    public final aod a(aod aodVar, byg bygVar) {
        int i;
        long jCount;
        if (!bygVar.f() || ((adb) bygVar.b()).b != 6) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = aodVar.b;
        adb adbVar = (adb) bygVar.b();
        acy acyVar = adbVar.b == 6 ? (acy) adbVar.c : acy.a;
        if (acyVar.b) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        boolean z = false;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(acyVar.c, 0);
        cme cmeVar = acyVar.d;
        cme cmeVar2 = acyVar.e;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = cmeVar.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (sharedPreferences.contains(str)) {
                editorEdit.remove(str);
                z = true;
            }
        }
        if (cmeVar2.isEmpty()) {
            jCount = 0;
        } else {
            Stream map = Collection.EL.stream(cmeVar2).map(new aro(1));
            int i2 = bzs.d;
            Stream streamFilter = Collection.EL.stream(sharedPreferences.getAll().keySet()).filter(new aoo((bzs) map.collect(bza.a), i));
            editorEdit.getClass();
            jCount = streamFilter.map(new bsv(editorEdit, 1)).count();
        }
        if ((z || jCount > 0) && editorEdit.commit()) {
            Log.i("SPDeletionFix", "Preferences were deleted.");
            return aodVar;
        }
        Log.i("SPDeletionFix", "No preferences were deleted.");
        return aodVar;
    }

    @Override // defpackage.anx
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
