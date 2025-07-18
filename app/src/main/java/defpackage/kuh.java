package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuh {
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:61:0x0044, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: SQLiteException -> 0x00b4, LOOP:1: B:37:0x0085->B:42:0x0097, LOOP_START, PHI: r0
  0x0085: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x0083, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:61:0x0044, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0 A[Catch: SQLiteException -> 0x00b4, TryCatch #1 {SQLiteException -> 0x00b4, blocks: (B:27:0x0044, B:29:0x005c, B:31:0x006a, B:33:0x0072, B:34:0x0075, B:35:0x0082, B:37:0x0085, B:39:0x0088, B:41:0x0090, B:42:0x0097, B:43:0x009a, B:45:0x00a0, B:48:0x00af, B:49:0x00b3, B:28:0x0055), top: B:61:0x0044, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(defpackage.lab r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            if (r10 == 0) goto Lc5
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L31
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L31
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: android.database.sqlite.SQLiteException -> L2b java.lang.Throwable -> L2d
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L25 android.database.sqlite.SQLiteException -> L29
            if (r11 == 0) goto L22
            r11.close()
        L22:
            if (r0 != 0) goto L44
            goto L41
        L25:
            r0 = move-exception
            r10 = r0
            goto Lbe
        L29:
            r0 = move-exception
            goto L35
        L2b:
            r0 = move-exception
            goto L33
        L2d:
            r0 = move-exception
            r10 = r0
            goto Lbf
        L31:
            r0 = move-exception
            r2 = r11
        L33:
            r11 = r0
            r11 = r1
        L35:
            kzz r3 = r10.f     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "Error querying for table"
            r3.c(r4, r12, r0)     // Catch: java.lang.Throwable -> L25
            if (r11 == 0) goto L41
            r11.close()
        L41:
            r2.execSQL(r13)
        L44:
            java.util.HashSet r11 = new java.util.HashSet     // Catch: android.database.sqlite.SQLiteException -> Lb4
            r11.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb4
            java.lang.String r13 = "SELECT * FROM "
            java.lang.String r0 = " LIMIT 0"
            java.lang.String r13 = defpackage.a.e(r12, r13, r0)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            android.database.Cursor r13 = r2.rawQuery(r13, r1)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            java.lang.String[] r0 = r13.getColumnNames()     // Catch: java.lang.Throwable -> Lae
            java.util.Collections.addAll(r11, r0)     // Catch: java.lang.Throwable -> Lae
            r13.close()     // Catch: android.database.sqlite.SQLiteException -> Lb4
            java.lang.String r13 = ","
            java.lang.String[] r13 = r14.split(r13)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            int r14 = r13.length     // Catch: android.database.sqlite.SQLiteException -> Lb4
            r0 = 0
            r1 = r0
        L68:
            if (r1 >= r14) goto L83
            r3 = r13[r1]     // Catch: android.database.sqlite.SQLiteException -> Lb4
            boolean r4 = r11.remove(r3)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            if (r4 == 0) goto L75
            int r1 = r1 + 1
            goto L68
        L75:
            android.database.sqlite.SQLiteException r11 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> Lb4
            java.lang.String r13 = "Table "
            java.lang.String r14 = " is missing required column: "
            java.lang.String r13 = defpackage.a.s(r3, r12, r13, r14)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            r11.<init>(r13)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            throw r11     // Catch: android.database.sqlite.SQLiteException -> Lb4
        L83:
            if (r15 == 0) goto L9a
        L85:
            int r13 = r15.length     // Catch: android.database.sqlite.SQLiteException -> Lb4
            if (r0 >= r13) goto L9a
            r13 = r15[r0]     // Catch: android.database.sqlite.SQLiteException -> Lb4
            boolean r13 = r11.remove(r13)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            if (r13 != 0) goto L97
            int r13 = r0 + 1
            r13 = r15[r13]     // Catch: android.database.sqlite.SQLiteException -> Lb4
            r2.execSQL(r13)     // Catch: android.database.sqlite.SQLiteException -> Lb4
        L97:
            int r0 = r0 + 2
            goto L85
        L9a:
            boolean r13 = r11.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> Lb4
            if (r13 != 0) goto Lad
            kzz r13 = r10.f     // Catch: android.database.sqlite.SQLiteException -> Lb4
            java.lang.String r14 = "Table has extra columns. table, columns"
            java.lang.String r15 = ", "
            java.lang.String r11 = android.text.TextUtils.join(r15, r11)     // Catch: android.database.sqlite.SQLiteException -> Lb4
            r13.c(r14, r12, r11)     // Catch: android.database.sqlite.SQLiteException -> Lb4
        Lad:
            return
        Lae:
            r0 = move-exception
            r11 = r0
            r13.close()     // Catch: android.database.sqlite.SQLiteException -> Lb4
            throw r11     // Catch: android.database.sqlite.SQLiteException -> Lb4
        Lb4:
            r0 = move-exception
            r11 = r0
            kzz r10 = r10.c
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            r10.b(r13, r12)
            throw r11
        Lbe:
            r1 = r11
        Lbf:
            if (r1 == 0) goto Lc4
            r1.close()
        Lc4:
            throw r10
        Lc5:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Monitor must not be null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuh.a(lab, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    static void b(lab labVar, SQLiteDatabase sQLiteDatabase) {
        if (labVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        knz knzVar = kny.a;
        String path = sQLiteDatabase.getPath();
        int i = koc.b;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            labVar.f.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            labVar.f.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            labVar.f.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        labVar.f.a("Failed to turn on database write permission for owner");
    }
}
