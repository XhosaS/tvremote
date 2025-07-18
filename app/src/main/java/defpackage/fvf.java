package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvf extends agtu implements agvb {
    public fvf(agsw agswVar) {
        super(2, agswVar);
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new fvf((agsw) obj2).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) fvi.a.b().q("com/google/android/apps/tvsearch/datastore/user/migrations/AppsSearchDisabledMigration$cleanup$1", "invokeSuspend", 98, "AppsSearchDisabledMigration.kt")).u("Cleaning up old data");
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fvf(agswVar);
    }
}
