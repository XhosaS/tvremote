package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvm extends agtu implements agvb {
    final /* synthetic */ fvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvm(fvp fvpVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fvpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvm) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) fvp.a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/HomeGraphDataMigration$cleanup$1", "invokeSuspend", 98, "HomeGraphDataMigration.kt")).u("Cleaning up old data");
        SharedPreferences sharedPreferences = this.a.b.getSharedPreferences("com.google.android.katniss.setting", 0);
        Set<String> setKeySet = sharedPreferences.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setKeySet) {
            String str = (String) obj2;
            if (!agvy.c(str, "fcm_settings_updated_accounts")) {
                str.getClass();
                if (str.startsWith("home_graph_id_")) {
                }
            }
            arrayList.add(obj2);
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvm(this.a, agswVar);
    }
}
