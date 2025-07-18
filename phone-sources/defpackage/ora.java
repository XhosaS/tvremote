package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableList;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ora extends oqk {
    public ora() {
        super(ngl.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.oqk
    public final oqp a(oqp oqpVar, tst tstVar) {
        long jCount;
        if (tstVar.g()) {
            int i = 6;
            if (((ngy) tstVar.c()).b == 6) {
                Context contextCreateDeviceProtectedStorageContext = oqpVar.b;
                ngy ngyVar = (ngy) tstVar.c();
                ngv ngvVar = ngyVar.b == 6 ? (ngv) ngyVar.c : ngv.a;
                if (ngvVar.b) {
                    contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                }
                boolean z = false;
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(ngvVar.c, 0);
                vun<String> vunVar = ngvVar.d;
                vun vunVar2 = ngvVar.e;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                for (String str : vunVar) {
                    if (sharedPreferences.contains(str)) {
                        editorEdit.remove(str);
                        z = true;
                    }
                }
                if (vunVar2.isEmpty()) {
                    jCount = 0;
                } else {
                    Stream streamFilter = Collection.EL.stream(sharedPreferences.getAll().keySet()).filter(new ldw((ImmutableList) Collection.EL.stream(vunVar2).map(new nrc(2)).collect(ImmutableList.toImmutableList()), i));
                    editorEdit.getClass();
                    jCount = streamFilter.map(new opy(editorEdit, 2)).count();
                }
                if (!z && jCount <= 0) {
                    return oqpVar;
                }
                editorEdit.commit();
                return oqpVar;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.oqk
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
