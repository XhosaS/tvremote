package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnq extends agtu implements agvb {
    final /* synthetic */ gnr a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnq(gnr gnrVar, String str, String str2, int i, agsw agswVar) {
        super(2, agswVar);
        this.a = gnrVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // defpackage.agvb
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gnq) c((ahbt) obj, (agsw) obj2)).b(agpu.a);
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        agpl.b(obj);
        gnr gnrVar = this.a;
        Instant instantA = gnrVar.d.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("search_term", this.b);
        contentValues.put("timestamp", Long.valueOf(instantA.toEpochMilli()));
        contentValues.put("package_name", this.c);
        contentValues.put("number_of_results", Integer.valueOf(this.d));
        try {
            gnrVar.c.b.getWritableDatabase().insert("on_device_impressions", null, contentValues);
        } catch (SQLiteException unused) {
            ((zdv) ((zdv) gni.a.d()).q("com/google/android/apps/tvsearch/logging/userbehavior/OnDeviceImpressionsProvider", "insert", 111, "OnDeviceImpressionsProvider.java")).u("Failed to insert on-device impression");
        }
        return agpu.a;
    }

    @Override // defpackage.agto
    public final agsw c(Object obj, agsw agswVar) {
        return new gnq(this.a, this.b, this.c, this.d, agswVar);
    }
}
