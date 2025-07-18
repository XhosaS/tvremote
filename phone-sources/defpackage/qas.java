package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ObjectArrays;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qas {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final xbw c;
    private final HashMap d = new HashMap();

    public qas(Context context, xbw xbwVar) {
        this.b = context;
        this.c = xbwVar;
    }

    private final synchronized qao f(qen qenVar) {
        long j;
        HashMap map;
        Long lValueOf;
        if (qenVar != null) {
            try {
                j = qenVar.a;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = -1;
        }
        map = this.d;
        lValueOf = Long.valueOf(j);
        if (!map.containsKey(lValueOf)) {
            map.put(lValueOf, new qao(this.b, j));
        }
        return (qao) map.get(lValueOf);
    }

    private final synchronized ImmutableMap g(qen qenVar, SQLiteDatabase sQLiteDatabase, sfz sfzVar) {
        ImmutableMap immutableMapBuildOrThrow;
        Cursor cursorQuery = sQLiteDatabase.query("threads", null, sfzVar.a, sfzVar.a(), null, null, "last_notification_version DESC", null);
        try {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            while (cursorQuery.moveToNext()) {
                try {
                    qin qinVarV = osk.V();
                    qinVarV.j(cursorQuery.getString(qau.a(cursorQuery, "thread_id")));
                    qinVarV.v(vmb.b(cursorQuery.getInt(qau.a(cursorQuery, "read_state"))));
                    qinVarV.s(a.bm(cursorQuery.getInt(qau.a(cursorQuery, "count_behavior"))));
                    qinVarV.u(a.bm(cursorQuery.getInt(qau.a(cursorQuery, "system_tray_behavior"))));
                    qinVarV.m(cursorQuery.getLong(qau.a(cursorQuery, "last_updated__version")));
                    qinVarV.l(cursorQuery.getLong(qau.a(cursorQuery, "last_notification_version")));
                    qinVarV.q(cursorQuery.getString(qau.a(cursorQuery, "payload_type")));
                    qinVarV.n(qau.f(cursorQuery, vlp.a, "notification_metadata"));
                    List listF = qau.f(cursorQuery, vks.a, "actions");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listF.iterator();
                    while (it.hasNext()) {
                        tst tstVarA = qir.a((vks) it.next());
                        if (tstVarA.g()) {
                            arrayList.add(tstVarA.c());
                        }
                    }
                    qinVarV.b(arrayList);
                    qinVarV.d(cursorQuery.getLong(qau.a(cursorQuery, "creation_id")));
                    qinVarV.c((vld) qau.e(cursorQuery, vld.a, "rendered_message"));
                    qinVarV.p((vsl) qau.e(cursorQuery, vsl.a, "payload"));
                    qinVarV.r(cursorQuery.getString(qau.a(cursorQuery, "update_thread_state_token")));
                    qinVarV.i(cursorQuery.getString(qau.a(cursorQuery, "group_id")));
                    qinVarV.g(cursorQuery.getLong(qau.a(cursorQuery, "expiration_timestamp")));
                    qinVarV.f(cursorQuery.getLong(qau.a(cursorQuery, "expiration_duration_from_display_ms")));
                    qinVarV.k(cursorQuery.getLong(qau.a(cursorQuery, "thread_stored_timestamp")));
                    qinVarV.t(a.bm(cursorQuery.getInt(qau.a(cursorQuery, "storage_mode"))));
                    qinVarV.e(vll.b(cursorQuery.getInt(qau.a(cursorQuery, "deletion_status"))));
                    qinVarV.o(vsz.q(cursorQuery.getBlob(qau.a(cursorQuery, "opaque_backend_data"))));
                    String string = cursorQuery.getString(qau.a(cursorQuery, "external_experiment_ids"));
                    HashSet hashSet = new HashSet();
                    if (string != null) {
                        try {
                            for (String str : TextUtils.split(string, ",")) {
                                hashSet.add(Integer.valueOf(Integer.parseInt(str)));
                            }
                        } catch (NumberFormatException e) {
                            ((tvk) ((tvk) ((tvk) qau.a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseDelimitedString", R.styleable.AppCompatTheme_toolbarStyle, "DatabaseHelper.java")).v("Error parsing comma separated numbers to int list: %s", string);
                            hashSet = new HashSet();
                        }
                    }
                    qinVarV.h(hashSet);
                    builder.put(qinVarV.a(), Long.valueOf(cursorQuery.getLong(qau.a(cursorQuery, "reference"))));
                } catch (qat unused) {
                    pvh pvhVarA = ((pvg) this.c.b()).a(vhq.DATABASE_ERROR);
                    pvhVarA.e(qenVar);
                    pvhVarA.a();
                }
            }
            immutableMapBuildOrThrow = builder.buildOrThrow();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
        return immutableMapBuildOrThrow;
    }

    private final synchronized void h(qen qenVar, sfz sfzVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(qenVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sfz sfzVar2 = (sfz) it.next();
                        rzy rzyVar = new rzy((short[]) null);
                        rzyVar.D("UPDATE ");
                        rzyVar.D("threads");
                        rzyVar.D(" SET ");
                        rzyVar.D(sfzVar.a);
                        rzyVar.D(" WHERE ");
                        rzyVar.D(sfzVar2.a);
                        writableDatabase.execSQL(rzyVar.C().a, ObjectArrays.concat(sfzVar.a(), sfzVar2.a(), String.class));
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeUpdate", 163, "ChimeThreadStorageHelper.java")).B("Error updating ChimeThread for account. Set: %s, Queries: %s", sfzVar, list);
        }
    }

    public final synchronized ImmutableList a(qen qenVar, List list) {
        ImmutableList immutableListBuild;
        ImmutableList.Builder builder = ImmutableList.builder();
        try {
            SQLiteDatabase writableDatabase = f(qenVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        builder.addAll((Iterable) g(qenVar, writableDatabase, (sfz) it.next()).keySet());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    immutableListBuild = builder.build();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeQuery", R.styleable.AppCompatTheme_textAppearanceListItemSecondary, "ChimeThreadStorageHelper.java")).v("Error getting ChimeThreads for account. Queries: %s", list);
            return ImmutableList.of();
        }
        return immutableListBuild;
    }

    public final synchronized void b(qen qenVar, List list) {
        rzy rzyVar = new rzy((short[]) null);
        rzyVar.D("reference");
        rzyVar.D(" = ");
        rzyVar.D("reference");
        rzyVar.E(" & ~?", 1L);
        h(qenVar, rzyVar.C(), list);
    }

    public final synchronized Pair c(qen qenVar, qis qisVar, boolean z) {
        try {
            SQLiteDatabase writableDatabase = f(qenVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues(16);
                    String str = qisVar.a;
                    contentValues.put("thread_id", str);
                    boolean z2 = true;
                    contentValues.put("read_state", Integer.valueOf(qisVar.v - 1));
                    contentValues.put("count_behavior", Integer.valueOf(qisVar.s - 1));
                    contentValues.put("system_tray_behavior", Integer.valueOf(qisVar.t - 1));
                    long j = qisVar.c;
                    contentValues.put("last_updated__version", Long.valueOf(j));
                    contentValues.put("last_notification_version", Long.valueOf(qisVar.d));
                    contentValues.put("payload_type", qisVar.f);
                    contentValues.put("update_thread_state_token", qisVar.j);
                    contentValues.put("group_id", qisVar.n);
                    contentValues.put("expiration_timestamp", Long.valueOf(qisVar.o));
                    contentValues.put("expiration_duration_from_display_ms", Long.valueOf(qisVar.p));
                    contentValues.put("thread_stored_timestamp", Long.valueOf(Instant.now().toEpochMilli()));
                    contentValues.put("locally_removed", (Boolean) false);
                    contentValues.put("storage_mode", Integer.valueOf(qisVar.u - 1));
                    contentValues.put("creation_id", Long.valueOf(qisVar.e));
                    contentValues.put("reference", (Long) 1L);
                    contentValues.put("deletion_status", Integer.valueOf(qisVar.b.d));
                    contentValues.put("opaque_backend_data", qisVar.i.w());
                    contentValues.put("rendered_message", qisVar.l.h());
                    List<vlp> list = qisVar.m;
                    if (!list.isEmpty()) {
                        vtw vtwVarM = qrc.a.m();
                        for (vlp vlpVar : list) {
                            vtw vtwVarM2 = vsl.a.m();
                            vsz vszVarE = vlpVar.e();
                            if (!vtwVarM2.b.A()) {
                                vtwVarM2.u();
                            }
                            ((vsl) vtwVarM2.b).c = vszVarE;
                            vtwVarM.ai((vsl) vtwVarM2.r());
                        }
                        contentValues.put("notification_metadata", ((qrc) vtwVarM.r()).h());
                    }
                    List<qir> list2 = qisVar.r;
                    if (!list2.isEmpty()) {
                        vtw vtwVarM3 = qrc.a.m();
                        for (qir qirVar : list2) {
                            vtw vtwVarM4 = vsl.a.m();
                            vsz vszVarE2 = qirVar.b().e();
                            if (!vtwVarM4.b.A()) {
                                vtwVarM4.u();
                            }
                            ((vsl) vtwVarM4.b).c = vszVarE2;
                            vtwVarM3.ai((vsl) vtwVarM4.r());
                        }
                        contentValues.put("actions", ((qrc) vtwVarM3.r()).h());
                    }
                    vsl vslVar = qisVar.g;
                    if (vslVar != null) {
                        contentValues.put("payload", vslVar.h());
                    }
                    Set set = qisVar.k;
                    if (!set.isEmpty()) {
                        contentValues.put("external_experiment_ids", TextUtils.join(",", set));
                    }
                    rzy rzyVar = new rzy((short[]) null);
                    rzyVar.D("thread_id");
                    rzyVar.E(" = ?", str);
                    sfz sfzVarC = rzyVar.C();
                    ImmutableMap immutableMapG = g(qenVar, writableDatabase, sfzVarC);
                    if (immutableMapG.isEmpty()) {
                        writableDatabase.insertWithOnConflict("threads", null, contentValues, 4);
                        writableDatabase.setTransactionSuccessful();
                        Pair pair = new Pair(qak.INSERTED, trk.a);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return pair;
                    }
                    qis qisVar2 = (qis) immutableMapG.keySet().asList().get(0);
                    long j2 = qisVar2.c;
                    if (j2 != j || qisVar2.equals(qisVar)) {
                        z2 = false;
                    }
                    if (j2 >= j && (!z || !z2)) {
                        Pair pair2 = new Pair(qak.REJECTED_SAME_VERSION, trk.a);
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return pair2;
                    }
                    writableDatabase.update("threads", contentValues, sfzVarC.a, sfzVarC.a());
                    writableDatabase.setTransactionSuccessful();
                    qak qakVar = (((Long) immutableMapG.get(qisVar2)).longValue() & 1) > 0 ? qak.REPLACED : qak.INSERTED;
                    Pair pair3 = new Pair(qakVar, qakVar == qak.REPLACED ? tst.i(qisVar2) : trk.a);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return pair3;
                } finally {
                    writableDatabase.endTransaction();
                }
            } finally {
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "insertOrReplaceThread", 241, "ChimeThreadStorageHelper.java")).v("Error inserting ChimeThread for account, %s", qisVar);
            return new Pair(qak.REJECTED_DB_ERROR, trk.a);
        }
    }

    public final synchronized void d(qen qenVar) {
        try {
            this.b.deleteDatabase(f(qenVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "deleteDatabase", (char) 251, "ChimeThreadStorageHelper.java")).s("Error deleting database for account");
        }
    }

    public final synchronized void e(qen qenVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(qenVar).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        sfz sfzVar = (sfz) it.next();
                        writableDatabase.delete("threads", sfzVar.a, sfzVar.a());
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeThreadStorageHelper", "executeDelete", 183, "ChimeThreadStorageHelper.java")).v("Error deleting ChimeThreads for account. Queries: %s", list);
        }
    }
}
