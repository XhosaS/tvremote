package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qan implements qai {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final HashMap c = new HashMap();

    public qan(Context context) {
        this.b = context;
    }

    private final synchronized qam e(qen qenVar) {
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
        map = this.c;
        lValueOf = Long.valueOf(j);
        if (!map.containsKey(lValueOf)) {
            map.put(lValueOf, new qam(this.b, j));
        }
        return (qam) map.get(lValueOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:10:0x0040, B:21:0x006e, B:27:0x0077, B:28:0x007a), top: B:35:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #3 {, blocks: (B:10:0x0040, B:21:0x006e, B:27:0x0077, B:28:0x007a), top: B:35:0x0004 }] */
    @Override // defpackage.qai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.qah a(defpackage.qen r7, int r8, byte[] r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "ChimeTaskDataStorageImpl.java"
            r1 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            r3 = 2
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r3 = "job_type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r3 = "payload"
            r2.put(r3, r9)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            qam r7 = r6.e(r7)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            android.database.sqlite.SQLiteDatabase r7 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4a
            java.lang.String r3 = "tasks"
            long r2 = r7.insert(r3, r1, r2)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6c
            uod r4 = new uod     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            r4.<init>()     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            r4.d(r2)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            r4.e(r8)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            r4.f(r9)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            qah r8 = r4.c()     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L73
            if (r7 == 0) goto L43
            r7.close()     // Catch: java.lang.Throwable -> L7b
        L43:
            monitor-exit(r6)
            return r8
        L45:
            r9 = move-exception
            goto L4d
        L47:
            r7 = move-exception
            r8 = r7
            goto L75
        L4a:
            r7 = move-exception
            r9 = r7
            r7 = r1
        L4d:
            tvn r2 = defpackage.qan.a     // Catch: java.lang.Throwable -> L73
            tuv r2 = r2.f()     // Catch: java.lang.Throwable -> L73
            tvk r2 = (defpackage.tvk) r2     // Catch: java.lang.Throwable -> L73
            tuv r9 = r2.i(r9)     // Catch: java.lang.Throwable -> L73
            tvk r9 = (defpackage.tvk) r9     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl"
            java.lang.String r3 = "insertTaskData"
            r4 = 67
            tuv r9 = r9.j(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L73
            tvk r9 = (defpackage.tvk) r9     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "Error inserting ChimeTaskData %d for account"
            r9.t(r0, r8)     // Catch: java.lang.Throwable -> L73
        L6c:
            if (r7 == 0) goto L71
            r7.close()     // Catch: java.lang.Throwable -> L7b
        L71:
            monitor-exit(r6)
            return r1
        L73:
            r8 = move-exception
            r1 = r7
        L75:
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.lang.Throwable -> L7b
        L7a:
            throw r8     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qan.a(qen, int, byte[]):qah");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:20:0x00ad, B:22:0x00b2, B:26:0x00b9, B:28:0x00be, B:29:0x00c1), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:20:0x00ad, B:22:0x00b2, B:26:0x00b9, B:28:0x00be, B:29:0x00c1), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9 A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:20:0x00ad, B:22:0x00b2, B:26:0x00b9, B:28:0x00be, B:29:0x00c1), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[Catch: all -> 0x00c2, TryCatch #1 {, blocks: (B:3:0x0001, B:20:0x00ad, B:22:0x00b2, B:26:0x00b9, B:28:0x00be, B:29:0x00c1), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[Catch: all -> 0x00c2, SYNTHETIC, TryCatch #1 {, blocks: (B:3:0x0001, B:20:0x00ad, B:22:0x00b2, B:26:0x00b9, B:28:0x00be, B:29:0x00c1), top: B:36:0x0001 }] */
    @Override // defpackage.qai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List b(defpackage.qen r14, int r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            rzy r0 = new rzy     // Catch: java.lang.Throwable -> Lc2
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch: java.lang.Throwable -> Lc2
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc2
            r3 = 0
            r2[r3] = r15     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r15 = "job_type=?"
            r0.E(r15, r2)     // Catch: java.lang.Throwable -> Lc2
            sfz r15 = r0.C()     // Catch: java.lang.Throwable -> Lc2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc2
            r2.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = "ChimeTaskDataStorageImpl.java"
            qam r14 = r13.e(r14)     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7f
            android.database.sqlite.SQLiteDatabase r4 = r14.getReadableDatabase()     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7f
            java.lang.String r5 = "tasks"
            java.lang.String r7 = r15.a     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            java.lang.String[] r8 = r15.a()     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            java.lang.String r11 = "_id ASC"
            r12 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
        L3b:
            boolean r14 = r1.moveToNext()     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            if (r14 == 0) goto Lab
            uod r14 = new uod     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            r14.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            long r5 = r1.getLong(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            r14.d(r5)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            java.lang.String r0 = "job_type"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            r14.e(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            java.lang.String r0 = "payload"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            byte[] r0 = r1.getBlob(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            r14.f(r0)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            qah r14 = r14.c()     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            r2.add(r14)     // Catch: java.lang.Throwable -> L75 java.lang.RuntimeException -> L78
            goto L3b
        L75:
            r0 = move-exception
            r14 = r0
            goto Lb7
        L78:
            r0 = move-exception
            r14 = r0
            goto L82
        L7b:
            r0 = move-exception
            r14 = r0
            r4 = r1
            goto Lb7
        L7f:
            r0 = move-exception
            r14 = r0
            r4 = r1
        L82:
            tvn r0 = defpackage.qan.a     // Catch: java.lang.Throwable -> L75
            tuv r0 = r0.f()     // Catch: java.lang.Throwable -> L75
            tvk r0 = (defpackage.tvk) r0     // Catch: java.lang.Throwable -> L75
            tuv r14 = r0.i(r14)     // Catch: java.lang.Throwable -> L75
            tvk r14 = (defpackage.tvk) r14     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl"
            java.lang.String r5 = "executeQuery"
            r6 = 126(0x7e, float:1.77E-43)
            tuv r14 = r14.j(r0, r5, r6, r3)     // Catch: java.lang.Throwable -> L75
            tvk r14 = (defpackage.tvk) r14     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "Error getting ChimeTaskData for account. Query: %s %s"
            java.lang.String r3 = r15.a     // Catch: java.lang.Throwable -> L75
            java.lang.String[] r15 = r15.a()     // Catch: java.lang.Throwable -> L75
            java.lang.String r15 = java.util.Arrays.toString(r15)     // Catch: java.lang.Throwable -> L75
            r14.B(r0, r3, r15)     // Catch: java.lang.Throwable -> L75
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()     // Catch: java.lang.Throwable -> Lc2
        Lb0:
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lc2
        Lb5:
            monitor-exit(r13)
            return r2
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()     // Catch: java.lang.Throwable -> Lc2
        Lbc:
            if (r4 == 0) goto Lc1
            r4.close()     // Catch: java.lang.Throwable -> Lc2
        Lc1:
            throw r14     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r0 = move-exception
            r14 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lc2
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qan.b(qen, int):java.util.List");
    }

    @Override // defpackage.qai
    public final void c(qen qenVar) {
        try {
            this.b.deleteDatabase(e(qenVar).getDatabaseName());
        } catch (RuntimeException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "deleteDatabase", 'e', "ChimeTaskDataStorageImpl.java")).s("Error deleting database for account");
        }
    }

    @Override // defpackage.qai
    public final synchronized void d(qen qenVar, List list) {
        if (!list.isEmpty()) {
            String[] strArr = new String[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                strArr[i] = Long.toString(((qah) it.next()).a);
                i++;
            }
            SQLiteDatabase writableDatabase = null;
            ImmutableList<sfz> immutableListB = qau.b(null, "_id", strArr);
            try {
                try {
                    writableDatabase = e(qenVar).getWritableDatabase();
                    writableDatabase.beginTransaction();
                } catch (RuntimeException e) {
                    ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/ChimeTaskDataStorageImpl", "executeDelete", 156, "ChimeTaskDataStorageImpl.java")).s("Error deleting ChimeTaskData for account");
                }
                try {
                    for (sfz sfzVar : immutableListB) {
                        writableDatabase.delete("tasks", sfzVar.a, sfzVar.a());
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } finally {
                if (0 != 0) {
                    writableDatabase.close();
                }
            }
        }
    }
}
