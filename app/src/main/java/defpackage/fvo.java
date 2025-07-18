package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvo extends agtu implements agvb {
    final /* synthetic */ fvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvo(fvp fvpVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fvpVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvo) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        boolean z = false;
        Set<String> setKeySet = this.a.b.getSharedPreferences("com.google.android.katniss.setting", 0).getAll().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String str : setKeySet) {
                if (!agvy.c(str, "fcm_settings_updated_accounts")) {
                    str.getClass();
                    if (str.startsWith("home_graph_id_")) {
                    }
                }
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        boolValueOf.getClass();
        ((zdv) fvp.a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/HomeGraphDataMigration$shouldMigrate$1", "invokeSuspend", 64, "HomeGraphDataMigration.kt")).x("PDS migration required: %s", Boolean.valueOf(z));
        return boolValueOf;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvo(this.a, agswVar);
    }
}
