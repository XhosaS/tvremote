package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnc extends agtu implements agvb {
    final /* synthetic */ gnd a;
    final /* synthetic */ gnf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnc(gnd gndVar, gnf gnfVar, agsw agswVar) {
        super(2, agswVar);
        this.a = gndVar;
        this.b = gnfVar;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnc) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        ContentValues contentValues = new ContentValues();
        gnf gnfVar = this.b;
        contentValues.put("timestamp", Long.valueOf(gnfVar.a.toEpochMilli()));
        contentValues.put("package_name", gnfVar.b);
        contentValues.put("item_type", Integer.valueOf(gnfVar.c));
        try {
            this.a.b.b.getWritableDatabase().insert("browse_history", null, contentValues);
        } catch (SQLiteException e) {
            ((zdv) ((zdv) ((zdv) gng.a.d()).p(e)).q("com/google/android/apps/tvsearch/logging/userbehavior/BrowseHistoryProvider", "insert", 68, "BrowseHistoryProvider.java")).x("Failed to insert browse history: %s", contentValues);
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gnc(this.a, this.b, agswVar);
    }
}
