package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvh extends agtu implements agvb {
    final /* synthetic */ fvi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvh(fvi fviVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fviVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        boolean z = false;
        Set<String> setKeySet = this.a.b.getSharedPreferences("com.google.android.katniss.setting", 0).getAll().keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<T> it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                str.getClass();
                if (str.startsWith("search_disabled_packages:")) {
                    z = true;
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        boolValueOf.getClass();
        ((zdv) fvi.a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/AppsSearchDisabledMigration$shouldMigrate$1", "invokeSuspend", 65, "AppsSearchDisabledMigration.kt")).x("PDS migration required: %s", Boolean.valueOf(z));
        return boolValueOf;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvh(this.a, agswVar);
    }
}
