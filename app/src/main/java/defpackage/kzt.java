package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzt extends ksw {
    public static final String[] a = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final kzr b;
    private boolean c;

    public kzt(lbk lbkVar) {
        super(lbkVar);
        lbk lbkVar2 = this.y;
        Context context = lbkVar2.a;
        ktx ktxVar = lbkVar2.d;
        this.b = new kzr(this, context);
    }

    @Override // defpackage.ksw
    protected final boolean f() {
        return false;
    }

    final SQLiteDatabase h() {
        if (this.c) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.c = true;
        return null;
    }

    public final void i() {
        int iDelete;
        g();
        try {
            SQLiteDatabase sQLiteDatabaseH = h();
            if (sQLiteDatabaseH == null || (iDelete = sQLiteDatabaseH.delete("messages", null, null)) <= 0) {
                return;
            }
            lbk lbkVar = this.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            lbk lbkVar2 = this.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Error resetting local analytics data. error", e);
        }
    }

    final boolean j() {
        lbk lbkVar = this.y;
        ktx ktxVar = lbkVar.d;
        return lbkVar.a.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[Catch: SQLiteException -> 0x007a, SQLiteDatabaseLockedException -> 0x007f, SQLiteFullException -> 0x0083, all -> 0x0139, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x0139, blocks: (B:23:0x006f, B:25:0x0075, B:34:0x0091, B:36:0x009a, B:38:0x00b7, B:40:0x00d0, B:61:0x0103, B:63:0x0109, B:64:0x010c, B:81:0x0140, B:71:0x0129), top: B:96:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135 A[PHI: r8 r10 r16
  0x0135: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:67:0x0121, B:84:0x0155, B:75:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v7 android.database.sqlite.SQLiteDatabase)
  (r10v9 android.database.sqlite.SQLiteDatabase)
 binds: [B:67:0x0121, B:84:0x0155, B:75:0x0133] A[DONT_GENERATE, DONT_INLINE]
  0x0135: PHI (r16v7 boolean) = (r16v4 boolean), (r16v5 boolean), (r16v8 boolean) binds: [B:67:0x0121, B:84:0x0155, B:75:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(int r20, byte[] r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzt.k(int, byte[]):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ed A[Catch: SQLiteDatabaseLockedException -> 0x01af, SQLiteException -> 0x0240, SQLiteFullException -> 0x0243, all -> 0x035b, TryCatch #39 {all -> 0x035b, blocks: (B:32:0x00bc, B:34:0x00c2, B:36:0x00d5, B:41:0x00eb, B:44:0x0100, B:46:0x0105, B:48:0x010b, B:187:0x0321, B:189:0x0327, B:190:0x032a, B:198:0x034b, B:209:0x0367, B:61:0x013c, B:62:0x013f, B:56:0x0131, B:81:0x0170, B:83:0x0184, B:90:0x019e, B:91:0x01a7, B:92:0x01aa, B:88:0x0198, B:101:0x01b7, B:105:0x01cd, B:115:0x01ed, B:116:0x01f7, B:117:0x01fa, B:113:0x01e7, B:120:0x0200, B:124:0x0214, B:134:0x0232, B:135:0x023c, B:136:0x023f, B:132:0x022c, B:143:0x024a, B:144:0x0259, B:146:0x0278, B:148:0x0295, B:149:0x02a3), top: B:241:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0232 A[Catch: SQLiteException -> 0x02b2, SQLiteFullException -> 0x02b5, SQLiteDatabaseLockedException -> 0x034a, all -> 0x035b, TryCatch #39 {all -> 0x035b, blocks: (B:32:0x00bc, B:34:0x00c2, B:36:0x00d5, B:41:0x00eb, B:44:0x0100, B:46:0x0105, B:48:0x010b, B:187:0x0321, B:189:0x0327, B:190:0x032a, B:198:0x034b, B:209:0x0367, B:61:0x013c, B:62:0x013f, B:56:0x0131, B:81:0x0170, B:83:0x0184, B:90:0x019e, B:91:0x01a7, B:92:0x01aa, B:88:0x0198, B:101:0x01b7, B:105:0x01cd, B:115:0x01ed, B:116:0x01f7, B:117:0x01fa, B:113:0x01e7, B:120:0x0200, B:124:0x0214, B:134:0x0232, B:135:0x023c, B:136:0x023f, B:132:0x022c, B:143:0x024a, B:144:0x0259, B:146:0x0278, B:148:0x0295, B:149:0x02a3), top: B:241:0x0321 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0357 A[PHI: r2 r11 r13 r17 r20 r21
  0x0357: PHI (r2v13 int) = (r2v7 int), (r2v9 int), (r2v14 int) binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0357: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0357: PHI (r13v9 android.database.sqlite.SQLiteDatabase) = 
  (r13v5 android.database.sqlite.SQLiteDatabase)
  (r13v7 android.database.sqlite.SQLiteDatabase)
  (r13v10 android.database.sqlite.SQLiteDatabase)
 binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0357: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0357: PHI (r20v8 int) = (r20v3 int), (r20v5 int), (r20v9 int) binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]
  0x0357: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:193:0x033e, B:212:0x037b, B:202:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0321 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x037e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x037e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x037e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzt.l():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[PHI: r3
  0x0066: PHI (r3v3 int) = (r3v1 int), (r3v1 int), (r3v4 int) binds: [B:25:0x005d, B:32:0x0079, B:28:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r9 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r9.g()
            boolean r1 = r9.c
            if (r1 == 0) goto Lb
            goto L93
        Lb:
            boolean r1 = r9.j()
            if (r1 == 0) goto L93
            r1 = 5
            r2 = 0
            r3 = r1
        L14:
            if (r2 >= r1) goto L85
            r4 = 1
            r5 = 0
            android.database.sqlite.SQLiteDatabase r5 = r9.h()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            if (r5 != 0) goto L22
            r9.c = r4     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            goto L93
        L22:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            java.lang.String r6 = "messages"
            java.lang.String r7 = "type == ?"
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            r5.delete(r6, r7, r8)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41 android.database.sqlite.SQLiteDatabaseLockedException -> L5e android.database.sqlite.SQLiteFullException -> L6a
            r5.close()
            return
        L3f:
            r0 = move-exception
            goto L7f
        L41:
            r6 = move-exception
            if (r5 == 0) goto L4d
            boolean r7 = r5.inTransaction()     // Catch: java.lang.Throwable -> L3f
            if (r7 == 0) goto L4d
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3f
        L4d:
            lbk r7 = r9.y     // Catch: java.lang.Throwable -> L3f
            lab r8 = r7.f     // Catch: java.lang.Throwable -> L3f
            r7.o(r8)     // Catch: java.lang.Throwable -> L3f
            kzz r7 = r8.c     // Catch: java.lang.Throwable -> L3f
            r7.b(r0, r6)     // Catch: java.lang.Throwable -> L3f
            r9.c = r4     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7c
            goto L66
        L5e:
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L3f
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L3f
            int r3 = r3 + 20
            if (r5 == 0) goto L7c
        L66:
            r5.close()
            goto L7c
        L6a:
            r6 = move-exception
            lbk r7 = r9.y     // Catch: java.lang.Throwable -> L3f
            lab r8 = r7.f     // Catch: java.lang.Throwable -> L3f
            r7.o(r8)     // Catch: java.lang.Throwable -> L3f
            kzz r7 = r8.c     // Catch: java.lang.Throwable -> L3f
            r7.b(r0, r6)     // Catch: java.lang.Throwable -> L3f
            r9.c = r4     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L7c
            goto L66
        L7c:
            int r2 = r2 + 1
            goto L14
        L7f:
            if (r5 == 0) goto L84
            r5.close()
        L84:
            throw r0
        L85:
            lbk r0 = r9.y
            lab r1 = r0.f
            r0.o(r1)
            kzz r0 = r1.f
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kzt.m():void");
    }
}
