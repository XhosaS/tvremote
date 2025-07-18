package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqz implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public gqz(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, leu] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Future, uhp] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r1v27, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, yih] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yoe] */
    @Override // java.lang.Runnable
    public final void run() throws SQLException {
        switch (this.a) {
            case 0:
                ?? r0 = this.b;
                if (r0.isCancelled()) {
                    this.c.e(null);
                    return;
                }
                try {
                    this.c.resumeWith(gsc.b(r0));
                    return;
                } catch (ExecutionException e) {
                    this.c.resumeWith(ybn.e(gsc.c(e)));
                    return;
                }
            case 1:
                ?? r02 = this.b;
                if (r02.isCancelled()) {
                    this.c.e(null);
                    return;
                }
                try {
                    ?? r1 = this.c;
                    int i = col.c;
                    r1.resumeWith(a.G(r02));
                    return;
                } catch (ExecutionException e2) {
                    this.c.resumeWith(ybn.e(cme.t(e2)));
                    return;
                }
            case 2:
                try {
                    this.c.run();
                    Object obj = this.b;
                    synchronized (((gvq) obj).b) {
                        ((gvq) obj).a();
                    }
                    return;
                } catch (Throwable th) {
                    Object obj2 = this.b;
                    synchronized (((gvq) obj2).b) {
                        ((gvq) obj2).a();
                        throw th;
                    }
                }
            case 3:
                Object obj3 = this.c;
                synchronized (((gvy) obj3).c) {
                    Map map = ((gvy) obj3).a;
                    Object obj4 = this.b;
                    if (((gqz) map.remove(obj4)) != null) {
                        gvx gvxVar = (gvx) ((gvy) obj3).b.remove(obj4);
                        if (gvxVar != null) {
                            gvxVar.b((gun) obj4);
                        }
                    } else {
                        gpn.b();
                        String.format("Timer with %s is already marked as complete.", obj4);
                    }
                }
                return;
            case 4:
                this.b.a();
                SQLiteDatabase sQLiteDatabaseA = ((lyz) this.c).a();
                try {
                    sQLiteDatabaseA.delete("cached_items", null, null);
                    return;
                } finally {
                    ((lyz) this.c).e(sQLiteDatabaseA, true);
                }
            case 5:
                ?? r03 = this.b;
                if (!r03.getBoolean(krh.INITIAL_SYNC_COMPLETED, false)) {
                    r03.edit().putBoolean(krh.INITIAL_SYNC_COMPLETED, true).apply();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = r03.getLong(krh.LAST_ANALYZE_TIMESTAMP, 0L);
                if (j >= jCurrentTimeMillis || j + 604800000 < jCurrentTimeMillis) {
                    ((lyz) this.c).a.getWritableDatabase().execSQL("ANALYZE");
                    r03.edit().putLong(krh.LAST_ANALYZE_TIMESTAMP, jCurrentTimeMillis).apply();
                    return;
                }
                return;
            case 6:
                this.b.c(this.c.a());
                return;
            case 7:
                ListView listView = (ListView) this.b;
                ListAdapter adapter = listView.getAdapter();
                if (adapter != null) {
                    for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                        if (adapter.getItem(i2) == this.c) {
                            listView.setSelection(i2);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                this.b.d((yot) this.c, ygi.a);
                return;
            default:
                ?? r04 = this.b;
                if (r04.isCancelled()) {
                    this.c.e(null);
                    return;
                }
                try {
                    this.c.resumeWith(a.G(r04));
                    return;
                } catch (ExecutionException e3) {
                    this.c.resumeWith(ybn.e(wae.V(e3)));
                    return;
                }
        }
    }

    public gqz(Object obj, Object obj2, int i, byte[] bArr) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public gqz(uhp uhpVar, yoe yoeVar, int i) {
        this.a = i;
        this.b = uhpVar;
        this.c = yoeVar;
    }

    public gqz(yot yotVar, yoe yoeVar, int i) {
        this.a = i;
        this.c = yotVar;
        this.b = yoeVar;
    }

    public gqz(idy idyVar, ieh iehVar, int i) {
        this.a = i;
        this.b = idyVar;
        iehVar.getClass();
        this.c = iehVar;
    }
}
