package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oog implements ooe {
    private static final zdy a = zdy.h("com/google/android/libraries/geller/portable/database/GellerDataTableStorage");
    private final boolean b;
    private final acdh c;

    public oog(boolean z, acdh acdhVar) {
        this.b = z;
        this.c = acdhVar;
    }

    static byte[][] k(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr) {
        if (!z) {
            return t(sQLiteDatabase, false, str, strArr, -1);
        }
        String str2 = String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", "geller_data_table.data", String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro"), "geller_data_table", "distinct_data_ids.data_id", "geller_data_table._id", "timestamp_micro");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str2, strArr);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("data");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getBlob(columnIndexOrThrow));
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    static byte[][] l(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, acdh acdhVar) {
        int iA;
        ((zdv) ((zdv) a.b()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readDataAsElementId", 752, "GellerDataTableStorage.java")).u("readDataAsElementId");
        if (!acdhVar.y && !z) {
            return t(sQLiteDatabase, false, str, strArr, -1);
        }
        String str2 = String.format("SELECT DISTINCT %s, %s AS %s FROM %s WHERE %s ORDER BY %s DESC", "data_id", "timestamp_micro", "timestamp_micro", "geller_key_table", str, "timestamp_micro");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(str2, strArr);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("data_id");
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("timestamp_micro");
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(columnIndexOrThrow);
                long j = cursorRawQuery.getLong(columnIndexOrThrow2);
                acgi acgiVar = acgi.a;
                acgh acghVar = new acgh();
                if ((acghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acghVar.y();
                }
                acgi acgiVar2 = (acgi) acghVar.b;
                string.getClass();
                acgiVar2.b |= 4;
                acgiVar2.d = string;
                aceu aceuVar = aceu.a;
                acet acetVar = new acet();
                if ((acetVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acetVar.y();
                }
                aceu aceuVar2 = (aceu) acetVar.b;
                aceuVar2.b |= 1;
                aceuVar2.c = j;
                aceu aceuVar3 = (aceu) acetVar.v();
                if ((acghVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acghVar.y();
                }
                acgi acgiVar3 = (acgi) acghVar.b;
                aceuVar3.getClass();
                acgiVar3.c = aceuVar3;
                acgiVar3.b |= 1;
                acgi acgiVar4 = (acgi) acghVar.v();
                try {
                    int i = acgiVar4.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(acgiVar4.getClass()).a(acgiVar4);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(acgiVar4.getClass()).a(acgiVar4);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            acgiVar4.memoizedSerializedSize = (acgiVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z2 = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(acgiVar4.getClass()).m(acgiVar4, abwa.a(abvwVar));
                    abvwVar.K();
                    arrayList.add(bArr);
                } catch (IOException e) {
                    throw new RuntimeException(a.C(acgiVar4, "byte array"), e);
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static long m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabase.delete("geller_data_table", str, strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        try {
            sQLiteDatabase.beginTransactionNonExclusive();
            sQLiteDatabase.execSQL(String.format("DELETE FROM %s WHERE %s IN (SELECT %s FROM %s WHERE %s)", "geller_data_table", "_id", "data_id", "geller_key_table", str), strArr);
            long jLongForQuery = DatabaseUtils.longForQuery(sQLiteDatabase, "SELECT changes()", null);
            sQLiteDatabase.setTransactionSuccessful();
            return jLongForQuery;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static long o(SQLiteDatabase sQLiteDatabase, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data", bArr);
        return sQLiteDatabase.insertOrThrow("geller_data_table", null, contentValues);
    }

    private static long p(SQLiteDatabase sQLiteDatabase, String str, List list, long j, List list2, byte[] bArr) {
        long jO = o(sQLiteDatabase, bArr);
        Iterator it = list.iterator();
        long jUpdate = 0;
        while (it.hasNext()) {
            String[] strArr = {str, (String) it.next(), String.valueOf(j)};
            new ContentValues().put("data_id", Long.valueOf(jO));
            jUpdate += sQLiteDatabase.update("geller_key_table", r4, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
        }
        m(sQLiteDatabase, ooj.b("_id", "IN", list2), null);
        return jUpdate;
    }

    private static ContentValues q(yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        ContentValues contentValues = new ContentValues();
        if (yqtVar.g()) {
            ((Boolean) yqtVar.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (yqtVar2.g()) {
            ((Boolean) yqtVar2.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (yqtVar3.g()) {
            yqtVar3.c();
            yqtVar3.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return contentValues;
    }

    private static oof r(acdt acdtVar) {
        StringBuilder sb = new StringBuilder("timestamp_micro >= 0");
        ArrayList arrayList = new ArrayList();
        if ((acdtVar.b & 4) != 0) {
            sb.append(" AND data_type = ?");
            arrayList.add(acdtVar.g);
        }
        int i = acdtVar.c;
        if (i == 1) {
            sb.append(" AND key = ?");
            arrayList.add(acdtVar.c == 1 ? (String) acdtVar.d : "");
        } else if (i == 9) {
            sb.append(" AND key like ?");
            arrayList.add(String.valueOf(acdtVar.c == 9 ? (String) acdtVar.d : "").concat("%"));
        }
        if ((acdtVar.b & 2) != 0) {
            sb.append(" AND timestamp_micro >= ? AND timestamp_micro <= ?");
            acds acdsVar = acdtVar.f;
            if (acdsVar == null) {
                acdsVar = acds.a;
            }
            arrayList.add(String.valueOf(acdsVar.b));
            acds acdsVar2 = acdtVar.f;
            if (acdsVar2 == null) {
                acdsVar2 = acds.a;
            }
            arrayList.add(String.valueOf(acdsVar2.c));
        }
        if ((acdtVar.b & 8) != 0) {
            if (acdtVar.h) {
                sb.append(" AND sync_status = ?");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL");
            }
        }
        if ((acdtVar.b & 16) != 0) {
            if (acdtVar.i) {
                sb.append(" AND delete_status IS NOT NULL");
            } else {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((acdtVar.b & 64) != 0) {
            int iA = acdq.a(acdtVar.k);
            if (iA == 0) {
                iA = 1;
            }
            int i2 = iA - 1;
            if (i2 == 1) {
                sb.append(" AND ( delete_status = ? OR delete_status = ? )");
                arrayList.add("PENDING_DELETE");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 2) {
                sb.append(" AND delete_status = ?");
                arrayList.add("PENDING_DELETE");
            } else if (i2 == 3) {
                sb.append(" AND delete_status = ?");
                arrayList.add("DELETION_PROCESSED");
            } else if (i2 == 4) {
                sb.append(" AND delete_status IS NULL");
            }
        }
        if ((acdtVar.b & 32) != 0) {
            if (acdtVar.j) {
                sb.append(" AND deletion_sync_status = ?");
                arrayList.add("DELETION_SYNCED");
            } else {
                sb.append(" AND deletion_sync_status IS NULL");
            }
        }
        return new oof(sb.toString(), arrayList);
    }

    private static void s(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, yqt yqtVar, yqt yqtVar2) throws SQLException {
        long jO = o(sQLiteDatabase, bArr);
        for (String str2 : strArr) {
            Long lValueOf = Long.valueOf(j);
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str2);
            contentValues.put("data_id", Long.valueOf(jO));
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", lValueOf);
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            if (yqtVar.g()) {
                if (((Boolean) yqtVar.c()).booleanValue()) {
                    contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                } else {
                    contentValues.putNull("deletion_sync_status");
                }
            }
            if (yqtVar2.g()) {
                contentValues.put("delete_status", (String) yqtVar2.c());
            }
            sQLiteDatabase.insertOrThrow("geller_key_table", null, contentValues);
        }
    }

    private static byte[][] t(SQLiteDatabase sQLiteDatabase, boolean z, String str, String[] strArr, int i) {
        char c;
        String strConcat;
        String[] strArr2 = strArr;
        ArrayList arrayList = new ArrayList();
        String strConcat2 = String.format("SELECT DISTINCT %s, %s FROM ( SELECT %s, %s, ROW_NUMBER() OVER ( PARTITION BY %s ORDER BY %s DESC ) row_index FROM %s  WHERE (%s))", "data_id", "timestamp_micro", "data_id", "timestamp_micro", "key", "timestamp_micro", "geller_key_table", str);
        if (i >= 0) {
            c = 2;
            strConcat2 = String.valueOf(strConcat2).concat(String.valueOf(String.format(" WHERE row_index <= %s", String.valueOf(i))));
        } else {
            c = 2;
        }
        String strValueOf = String.valueOf(String.format(" ORDER BY %s DESC", "timestamp_micro"));
        if (z) {
            String strValueOf2 = String.valueOf(i);
            Object[] objArr = new Object[14];
            objArr[0] = "data_id";
            objArr[1] = "timestamp_micro";
            objArr[c] = "timestamp_micro";
            objArr[3] = "geller_key_table";
            objArr[4] = str;
            objArr[5] = "data_id";
            objArr[6] = "data_id";
            objArr[7] = "geller_key_table";
            objArr[8] = str;
            objArr[9] = "key";
            objArr[10] = "key";
            objArr[11] = "timestamp_micro";
            objArr[12] = strValueOf2;
            objArr[13] = "timestamp_micro";
            strConcat = String.format("SELECT DISTINCT %s, %s as %s FROM %s T1 WHERE (%s) AND %s IN (SELECT %s FROM %s WHERE (%s) AND %s = T1.%s ORDER BY %s DESC LIMIT %s) ORDER BY %s DESC", objArr);
            int i2 = yyk.e;
            yyf yyfVar = new yyf(4);
            int length = strArr2.length;
            yyfVar.a(strArr2, length);
            yyfVar.a(strArr2, length);
            strArr2 = (String[]) yyfVar.f().toArray(new String[0]);
        } else {
            strConcat = String.valueOf(strConcat2).concat(strValueOf);
        }
        Object[] objArr2 = new Object[6];
        objArr2[0] = "geller_data_table.data";
        objArr2[1] = strConcat;
        objArr2[c] = "geller_data_table";
        objArr2[3] = "distinct_data_ids.data_id";
        objArr2[4] = "geller_data_table._id";
        objArr2[5] = "timestamp_micro";
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s FROM (%s) distinct_data_ids INNER JOIN %s ON %s = %s ORDER BY %s DESC", objArr2), strArr2);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow("data");
            while (cursorRawQuery.moveToNext()) {
                arrayList.add(cursorRawQuery.getBlob(columnIndexOrThrow));
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return (byte[][]) arrayList.toArray(new byte[0][]);
        } finally {
        }
    }

    private static List u(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabase.query(true, "geller_key_table", new String[]{"data_id"}, str, strArr, "data_id", null, "timestamp_micro DESC", null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("data_id"))));
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "readNumberFromKeyTable", (char) 705, "GellerDataTableStorage.java")).u("Column doesn't exist");
            return arrayList;
        }
    }

    private static long v(SQLiteDatabase sQLiteDatabase, String[] strArr, String str) {
        ContentValues contentValues = new ContentValues();
        if (str != null) {
            contentValues.put("delete_status", str);
        } else {
            contentValues.putNull("delete_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    private static long w(SQLiteDatabase sQLiteDatabase, String[] strArr, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        return sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[Catch: all -> 0x0245, SYNTHETIC, TRY_LEAVE, TryCatch #2 {all -> 0x0245, blocks: (B:6:0x004e, B:85:0x0244, B:84:0x0241, B:64:0x0220, B:81:0x023c), top: B:92:0x004e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ooe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.accg a(defpackage.yqt r24, java.util.Set r25) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oog.a(yqt, java.util.Set):accg");
    }

    @Override // defpackage.ooe
    public final /* synthetic */ acge b() {
        return acge.CUSTOM_STORAGE_TYPE_UNKNOWN;
    }

    @Override // defpackage.ooe
    public final long c(yqt yqtVar, GellerDeleteParams gellerDeleteParams) {
        if ((gellerDeleteParams.b & 1) == 0) {
            throw new IllegalArgumentException("The `dataType` field is required in GellerDeleteParams.");
        }
        String str = gellerDeleteParams.e;
        yqw.L(true);
        Object obj = ((yqz) yqtVar).a;
        try {
            ((SQLiteDatabase) obj).beginTransactionNonExclusive();
            int i = gellerDeleteParams.c;
            long jM = 0;
            if (i == 1) {
                for (String str2 : ooj.h(((accj) gellerDeleteParams.d).b)) {
                    if (!str2.isEmpty()) {
                        jM += n((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str2)), new String[]{str});
                    }
                }
            } else if (i == 2) {
                accn accnVar = (accn) gellerDeleteParams.d;
                acdh acdhVar = this.c;
                String str3 = "data_type = ?";
                if (accnVar.b.size() == 0 && accnVar.c.size() == 0) {
                    ooj.e(accnVar, acdhVar);
                } else {
                    str3 = "data_type = ? AND " + ooj.f(accnVar, acdhVar);
                }
                jM = n((SQLiteDatabase) obj, str3, new String[]{str});
            } else if (i == 4 && ((Boolean) gellerDeleteParams.d).booleanValue()) {
                jM = m((SQLiteDatabase) obj, String.format("%s IN (SELECT %s FROM %s WHERE %s = ?)", "_id", "data_id", "geller_key_table", "data_type"), new String[]{str});
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return jM;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.ooe
    public final byte[][] d(yqt yqtVar, acdt acdtVar) {
        yqw.L(true);
        oof oofVarR = r(acdtVar);
        String[] strArr = (String[]) oofVarR.b.toArray(new String[0]);
        if ((1 & acdtVar.b) != 0) {
            return t((SQLiteDatabase) ((yqz) yqtVar).a, this.b, oofVarR.a, strArr, acdtVar.e);
        }
        return k((SQLiteDatabase) ((yqz) yqtVar).a, this.b, oofVarR.a, strArr);
    }

    @Override // defpackage.ooe
    public final String[] e(yqt yqtVar, String str) {
        yqw.L(true);
        ypv ypvVar = ypv.a;
        return (String[]) ooj.d((SQLiteDatabase) ((yqz) yqtVar).a, "geller_key_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, ypvVar, ypvVar).toArray(new String[0]);
    }

    @Override // defpackage.ooe
    public final long f(yqt yqtVar, String str, acde acdeVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4) {
        yqw.L(true);
        String strA = ooj.a(yqtVar4);
        int i = acdeVar.b;
        long jUpdate = 0;
        if (i != 1) {
            if (i != 2) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateElementStatus", 499, "GellerDataTableStorage.java")).u("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            acdd acddVar = (acdd) acdeVar.c;
            String strConcat = (acddVar.b.size() == 0 && acddVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND ".concat(ooj.i(acddVar.b, acddVar.c));
            ArrayList arrayList = new ArrayList();
            arrayList.add(strConcat);
            if (!strA.isEmpty()) {
                arrayList.add(strA);
            }
            return ((SQLiteDatabase) ((yqz) yqtVar).a).update("geller_key_table", q(yqtVar2, yqtVar3, yqtVar4), new yqn(" AND ").c(arrayList), new String[]{str});
        }
        for (String str2 : ooj.h(((acdb) acdeVar.c).b)) {
            if (!str2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("data_type = ?");
                arrayList2.add(str2);
                if (!strA.isEmpty()) {
                    arrayList2.add(strA);
                }
                jUpdate += ((SQLiteDatabase) ((yqz) yqtVar).a).update("geller_key_table", q(yqtVar2, yqtVar3, yqtVar4), new yqn(" AND ").c(arrayList2), new String[]{str});
            }
        }
        return jUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.ooe
    public final boolean g(yqt yqtVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws Throwable {
        List listU;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3 = "data_type = ? AND ";
        yqw.L(yqtVar.g());
        SQLiteDatabase sQLiteDatabase4 = (SQLiteDatabase) yqtVar.c();
        if (bArr.length > 2000000) {
            ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 104, "GellerDataTableStorage.java")).v("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
            return false;
        }
        sQLiteDatabase4.beginTransactionNonExclusive();
        try {
            try {
                listU = u(sQLiteDatabase4, "data_type = ? AND " + ooj.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
            } catch (IllegalStateException e) {
                e = e;
                listU = sQLiteDatabase4;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase3 = sQLiteDatabase4;
                sQLiteDatabase3.endTransaction();
                throw th;
            }
            try {
                if (listU.size() == 1) {
                    String[] strArr2 = {String.valueOf(listU.get(0))};
                    ypv ypvVar = ypv.a;
                    List listD = ooj.d(sQLiteDatabase4, "geller_key_table", "key", "data_id = ?", strArr2, ypvVar, ypvVar);
                    if (new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                        sQLiteDatabase2 = sQLiteDatabase4;
                        if (p(sQLiteDatabase2, str, listD, j, listU, bArr) <= 0) {
                            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 141, "GellerDataTableStorage.java")).u("Failed to update data.");
                        } else {
                            Iterator it = listD.iterator();
                            while (it.hasNext()) {
                                String[] strArr3 = {str, (String) it.next(), String.valueOf(j)};
                                if (w(sQLiteDatabase2, strArr3, z) <= 0 || v(sQLiteDatabase2, strArr3, null) <= 0) {
                                    ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 150, "GellerDataTableStorage.java")).u("Failed to update key.");
                                }
                            }
                        }
                        sQLiteDatabase2.endTransaction();
                        return false;
                    }
                    sQLiteDatabase2 = sQLiteDatabase4;
                    m(sQLiteDatabase2, "_id = ?", strArr2);
                    s(sQLiteDatabase2, str, strArr, j, z, bArr, ypvVar, ypvVar);
                } else {
                    sQLiteDatabase2 = sQLiteDatabase4;
                    if (listU.isEmpty()) {
                        ypv ypvVar2 = ypv.a;
                        s(sQLiteDatabase2, str, strArr, j, z, bArr, ypvVar2, ypvVar2);
                    } else {
                        m(sQLiteDatabase2, ooj.b("_id", "IN", listU), null);
                        ypv ypvVar3 = ypv.a;
                        s(sQLiteDatabase2, str, strArr, j, z, bArr, ypvVar3, ypvVar3);
                    }
                }
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase = sQLiteDatabase2;
            } catch (IllegalStateException e2) {
                e = e2;
                ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "write", 196, "GellerDataTableStorage.java")).u("Failed to write to data table.");
                sQLiteDatabase = listU;
                sQLiteDatabase.endTransaction();
                return true;
            }
            sQLiteDatabase.endTransaction();
            return true;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase3.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.ooe
    public final acel h(yqt yqtVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws GellerException {
        yqw.L(true);
        int i = 0;
        if (bArr.length > 2000000) {
            throw new GellerException(abqb.UNKNOWN, String.format("Unable to write data: data size must be less than or equal to %s bytes", 2000000));
        }
        Object obj = ((yqz) yqtVar).a;
        acel acelVar = acel.a;
        acei aceiVar = new acei();
        acek acekVar = acek.a;
        acej acejVar = new acej();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            try {
                List listU = u((SQLiteDatabase) obj, "data_type = ? AND " + ooj.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                if (listU.size() == 1) {
                    String[] strArr2 = {String.valueOf(listU.get(0))};
                    ypv ypvVar = ypv.a;
                    List<String> listD = ooj.d((SQLiteDatabase) obj, "geller_key_table", "key", "data_id = ?", strArr2, ypvVar, ypvVar);
                    if (!new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                        m((SQLiteDatabase) obj, "_id = ?", strArr2);
                        s((SQLiteDatabase) obj, str, strArr, j, z, bArr, ypvVar, ypvVar);
                        int length = strArr.length;
                        while (i < length) {
                            String str2 = strArr[i];
                            acby acbyVar = acby.a;
                            acbx acbxVar = new acbx();
                            if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acbxVar.y();
                            }
                            acby acbyVar2 = (acby) acbxVar.b;
                            str2.getClass();
                            acbyVar2.b |= 2;
                            acbyVar2.d = str2;
                            if ((acbxVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acbxVar.y();
                            }
                            acby acbyVar3 = (acby) acbxVar.b;
                            acbyVar3.b |= 1;
                            acbyVar3.c = j;
                            acejVar.b((acby) acbxVar.v());
                            i++;
                        }
                    } else {
                        if (p((SQLiteDatabase) obj, str, listD, j, listU, bArr) <= 0) {
                            throw new GellerException(abqb.UNKNOWN, "Failed to update data.");
                        }
                        for (String str3 : listD) {
                            String[] strArr3 = {str, str3, String.valueOf(j)};
                            if (w((SQLiteDatabase) obj, strArr3, z) <= 0 || v((SQLiteDatabase) obj, strArr3, null) <= 0) {
                                throw new GellerException(abqb.UNKNOWN, "Failed to update key metadata.");
                            }
                            acby acbyVar4 = acby.a;
                            acbx acbxVar2 = new acbx();
                            if ((acbxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acbxVar2.y();
                            }
                            acby acbyVar5 = (acby) acbxVar2.b;
                            str3.getClass();
                            acbyVar5.b |= 2;
                            acbyVar5.d = str3;
                            if ((acbxVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acbxVar2.y();
                            }
                            acby acbyVar6 = (acby) acbxVar2.b;
                            acbyVar6.b |= 1;
                            acbyVar6.c = j;
                            acejVar.b((acby) acbxVar2.v());
                        }
                    }
                } else if (listU.isEmpty()) {
                    ypv ypvVar2 = ypv.a;
                    s((SQLiteDatabase) obj, str, strArr, j, z, bArr, ypvVar2, ypvVar2);
                    int length2 = strArr.length;
                    while (i < length2) {
                        String str4 = strArr[i];
                        acby acbyVar7 = acby.a;
                        acbx acbxVar3 = new acbx();
                        if ((acbxVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acbxVar3.y();
                        }
                        acby acbyVar8 = (acby) acbxVar3.b;
                        str4.getClass();
                        acbyVar8.b |= 2;
                        acbyVar8.d = str4;
                        if ((acbxVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acbxVar3.y();
                        }
                        acby acbyVar9 = (acby) acbxVar3.b;
                        acbyVar9.b |= 1;
                        acbyVar9.c = j;
                        acejVar.a((acby) acbxVar3.v());
                        i++;
                    }
                } else {
                    m((SQLiteDatabase) obj, ooj.b("_id", "IN", listU), null);
                    ypv ypvVar3 = ypv.a;
                    s((SQLiteDatabase) obj, str, strArr, j, z, bArr, ypvVar3, ypvVar3);
                    int length3 = strArr.length;
                    while (i < length3) {
                        String str5 = strArr[i];
                        acby acbyVar10 = acby.a;
                        acbx acbxVar4 = new acbx();
                        if ((acbxVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acbxVar4.y();
                        }
                        acby acbyVar11 = (acby) acbxVar4.b;
                        str5.getClass();
                        acbyVar11.b |= 2;
                        acbyVar11.d = str5;
                        if ((acbxVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acbxVar4.y();
                        }
                        acby acbyVar12 = (acby) acbxVar4.b;
                        acbyVar12.b |= 1;
                        acbyVar12.c = j;
                        acejVar.b((acby) acbxVar4.v());
                        i++;
                    }
                }
                if ((aceiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    aceiVar.y();
                }
                acel acelVar2 = (acel) aceiVar.b;
                acek acekVar2 = (acek) acejVar.v();
                acekVar2.getClass();
                acelVar2.e = acekVar2;
                acelVar2.b |= 2;
                ((SQLiteDatabase) obj).setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return (acel) aceiVar.v();
            } catch (IllegalStateException e) {
                throw new GellerException(abqb.UNKNOWN, "Failed to write to DB.", e);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // defpackage.ooe
    public final byte[][] i(yqt yqtVar, acdt acdtVar) {
        yqw.L(true);
        oof oofVarR = r(acdtVar);
        return l((SQLiteDatabase) ((yqz) yqtVar).a, this.b, oofVarR.a, (String[]) oofVarR.b.toArray(new String[0]), this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v41, types: [int] */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v50 */
    @Override // defpackage.ooe
    public final boolean j(yqt yqtVar, aceh acehVar) {
        boolean z;
        boolean z2;
        int iA;
        String strName;
        yqt yqtVarI;
        boolean z3;
        yqw.L(yqtVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) yqtVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z4 = true;
        try {
            try {
                for (aceg acegVar : acehVar.b) {
                    int i = acegVar.b;
                    if ((i & 8) != 0 && ((i & 1) != 0 || (i & 64) != 0)) {
                        if ((i & 2) != 0) {
                            acgi acgiVar = acegVar.g;
                            if (acgiVar == null) {
                                acgiVar = acgi.a;
                            }
                            try {
                                int i2 = acgiVar.memoizedSerializedSize;
                                if ((i2 & Integer.MIN_VALUE) != 0) {
                                    iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                    if (iA < 0) {
                                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                    }
                                } else {
                                    iA = i2 & Integer.MAX_VALUE;
                                    if (iA == Integer.MAX_VALUE) {
                                        iA = abza.a.a(acgiVar.getClass()).a(acgiVar);
                                        if (iA < 0) {
                                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                                        }
                                        acgiVar.memoizedSerializedSize = (Integer.MIN_VALUE & acgiVar.memoizedSerializedSize) | iA;
                                    }
                                }
                                byte[] bArr = new byte[iA];
                                boolean z5 = abvz.e;
                                abvw abvwVar = new abvw(bArr, 0, iA);
                                abza.a.a(acgiVar.getClass()).m(acgiVar, abwa.a(abvwVar));
                                abvwVar.K();
                                if ((acegVar.b & 64) != 0) {
                                    strName = acegVar.j;
                                } else {
                                    acgd acgdVarB = acgd.b(acegVar.c);
                                    if (acgdVarB == null) {
                                        acgdVarB = acgd.UNKNOWN;
                                    }
                                    strName = acgdVarB.name();
                                }
                                String str = strName;
                                if (iA > 2000000) {
                                    ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 625, "GellerDataTableStorage.java")).v("Unable to write data: data size must be less than or equal to %s bytes", 2000000);
                                    z2 = false;
                                } else {
                                    yqt yqtVarI2 = (acegVar.b & 16) != 0 ? yqt.i(Boolean.valueOf(acegVar.h)) : ypv.a;
                                    if ((acegVar.b & 32) != 0) {
                                        int iB = aceq.b(acegVar.i);
                                        ?? r6 = iB;
                                        if (iB == 0) {
                                            r6 = z4;
                                        }
                                        yqtVarI = yqt.i(aceq.a(r6));
                                    } else {
                                        yqtVarI = ypv.a;
                                    }
                                    yqt yqtVar2 = yqtVarI;
                                    String[] strArr = (String[]) ooj.c(acegVar.d).toArray(new String[0]);
                                    long j = acegVar.e;
                                    boolean z6 = acegVar.f;
                                    List listU = u(sQLiteDatabase, "data_type = ? AND " + ooj.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?", new String[]{str, String.valueOf(j)});
                                    if (listU.size() == z4) {
                                        String[] strArr2 = {String.valueOf(listU.get(0))};
                                        ypv ypvVar = ypv.a;
                                        z2 = false;
                                        List listD = ooj.d(sQLiteDatabase, "geller_key_table", "key", "data_id = ?", strArr2, ypvVar, ypvVar);
                                        if (new HashSet(listD).equals(new HashSet(Arrays.asList(strArr)))) {
                                            String str2 = str;
                                            if (p(sQLiteDatabase, str2, listD, j, listU, bArr) <= 0) {
                                                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1162, "GellerDataTableStorage.java")).u("Failed to update data.");
                                            } else {
                                                String str3 = (String) yqtVar2.f();
                                                Iterator it = listD.iterator();
                                                while (it.hasNext()) {
                                                    String[] strArr3 = {str2, (String) it.next(), String.valueOf(j)};
                                                    if (w(sQLiteDatabase, strArr3, z6) <= 0 || v(sQLiteDatabase, strArr3, str3) <= 0) {
                                                        ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "updateDataAndKey", 1172, "GellerDataTableStorage.java")).u("Failed to update key.");
                                                    } else if (yqtVarI2.g()) {
                                                        boolean zBooleanValue = ((Boolean) yqtVarI2.c()).booleanValue();
                                                        z = z4;
                                                        try {
                                                            String str4 = str2;
                                                            ContentValues contentValues = new ContentValues();
                                                            Iterator it2 = it;
                                                            if (zBooleanValue) {
                                                                contentValues.put("deletion_sync_status", "DELETION_SYNCED");
                                                            } else {
                                                                contentValues.putNull("deletion_sync_status");
                                                            }
                                                            if (sQLiteDatabase.update("geller_key_table", contentValues, "data_type = ? AND key = ? AND timestamp_micro = ?", strArr3) > 0) {
                                                                it = it2;
                                                                z4 = z;
                                                                str2 = str4;
                                                            }
                                                        } catch (IllegalStateException e) {
                                                            e = e;
                                                            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 655, "GellerDataTableStorage.java")).u("Failed to write to data table.");
                                                            return z;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z3 = z4;
                                            m(sQLiteDatabase, "_id = ?", strArr2);
                                            s(sQLiteDatabase, str, strArr, j, z6, bArr, yqtVarI2, yqtVar2);
                                        }
                                    } else {
                                        z3 = z4;
                                        if (listU.isEmpty()) {
                                            s(sQLiteDatabase, str, strArr, j, z6, bArr, yqtVarI2, yqtVar2);
                                        } else {
                                            m(sQLiteDatabase, ooj.b("_id", "IN", listU), null);
                                            s(sQLiteDatabase, str, strArr, j, z6, bArr, yqtVarI2, yqtVar2);
                                        }
                                    }
                                    z4 = z3;
                                }
                                return z2;
                            } catch (IOException e2) {
                                throw new RuntimeException(a.C(acgiVar, "byte array"), e2);
                            }
                        }
                    }
                    z2 = false;
                    ((zdv) ((zdv) a.d()).q("com/google/android/libraries/geller/portable/database/GellerDataTableStorage", "batchWrite", 616, "GellerDataTableStorage.java")).u("Invalid write params");
                    return z2;
                }
                z = z4;
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z = true;
        }
        return z;
    }
}
