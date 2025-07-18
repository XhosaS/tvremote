package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmh extends agtu implements agvb {
    final /* synthetic */ fmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmh(fmk fmkVar, agsw agswVar) {
        super(2, agswVar);
        this.a = fmkVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fmh) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ((zdv) fmk.a.b().q("com/google/android/apps/tvsearch/datastore/device/migrations/AppContextDataMigration$cleanup$1", "invokeSuspend", 129, "AppContextDataMigration.kt")).u("Cleaning up old data");
        Context context = this.a.b;
        context.getSharedPreferences("com.google.android.katniss.app.context", 0).edit().clear().commit();
        return Boolean.valueOf(context.deleteSharedPreferences("com.google.android.katniss.app.context"));
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new fmh(this.a, agswVar);
    }
}
