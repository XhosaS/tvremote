package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmj extends agtu implements agvb {
    final /* synthetic */ fmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmj(fmk fmkVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fmkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fmj) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        Map<String, ?> all = this.a.b.getSharedPreferences("com.google.android.katniss.app.context", 0).getAll();
        all.getClass();
        boolean z = !all.isEmpty();
        Boolean boolValueOf = Boolean.valueOf(z);
        boolValueOf.getClass();
        ((zdv) fmk.a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/AppContextDataMigration$shouldMigrate$1", "invokeSuspend", 62, "AppContextDataMigration.kt")).x("PDS migration required: %s", Boolean.valueOf(z));
        return boolValueOf;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fmj(this.a, agswVar);
    }
}
