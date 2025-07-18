package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ook implements ooe {
    private static final zdy a = zdy.h("com/google/android/libraries/geller/portable/database/GellerFileStorage");
    private final Context b;
    private final String c;
    private final acdh d;

    public ook(Context context, String str, acdh acdhVar) {
        this.b = context;
        this.c = str;
        this.d = acdhVar;
    }

    public static void k(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                k(file2);
            }
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "deleteFileRecursively", 55, "GellerFileStorage.java")).x("Failed to delete file: %s", file);
        }
    }

    static byte[][] l(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, yqt yqtVar) throws GellerException {
        List listD = ooj.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, yqt.i("timestamp_micro DESC"), yqtVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            yqt yqtVarP = p((String) it.next());
            if (yqtVarP.g()) {
                arrayList.add(yqtVarP.c());
            }
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    static long m(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, int i) {
        new ContentValues().put("delete_status", oob.a(i));
        return sQLiteDatabase.update("geller_file_table", r0, str, strArr);
    }

    private static long n(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        long jT = 0;
        for (String str2 : ooj.d(sQLiteDatabase, "geller_file_table", "file_path", str, strArr, yqt.i("timestamp_micro DESC"), ypv.a)) {
            if (r(str2)) {
                jT += t(sQLiteDatabase, new String[]{str2});
            }
        }
        return jT;
    }

    private final yqt o(String str, String str2, long j, byte[] bArr) throws IOException {
        File file = new File(this.b.getFilesDir(), zua.a("geller", this.c, str));
        if (!file.exists() && !file.mkdirs()) {
            ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 666, "GellerFileStorage.java")).u("Unable to create file directory.");
            return ypv.a;
        }
        File file2 = new File(file, str2 + "_" + j);
        file2.getAbsolutePath();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return yqt.i(file2.toString());
            } finally {
            }
        } catch (IOException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "createFile", 675, "GellerFileStorage.java")).x("Filed to write file: %s", file2);
            return ypv.a;
        }
    }

    private static yqt p(String str) throws GellerException {
        File file = new File(str);
        file.getAbsolutePath();
        try {
            return file.exists() ? yqt.i(zks.a(file)) : ypv.a;
        } catch (IOException | IllegalArgumentException | OutOfMemoryError | SecurityException e) {
            throw new GellerException(abqb.ABORTED, e.getMessage());
        }
    }

    private final boolean q(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, List list) throws IOException {
        Iterator it = list.iterator();
        boolean z2 = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            z2 = r(str2) ? z2 & (t(sQLiteDatabase, new String[]{str2}) > 0) : false;
        }
        if (!z2) {
            return false;
        }
        yqt yqtVarO = o(str, strArr[0], j, bArr);
        if (!yqtVarO.g()) {
            return false;
        }
        for (String str3 : strArr) {
            Object objC = yqtVarO.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", str3);
            contentValues.put("data_type", str);
            contentValues.put("timestamp_micro", Long.valueOf(j));
            contentValues.put("num_times_used", (Integer) 0);
            if (z) {
                contentValues.put("sync_status", "SYNCED");
            }
            contentValues.put("file_path", (String) objC);
            z2 &= sQLiteDatabase.insert("geller_file_table", null, contentValues) > 0;
        }
        return z2;
    }

    private static boolean r(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (RuntimeException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "removeFile", 704, "GellerFileStorage.java")).x("Failed to remove file: %s", str);
            return false;
        }
    }

    private final boolean s(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, long j, boolean z, byte[] bArr, String str2, String str3, String[] strArr2) throws IOException {
        if (!r(str2)) {
            return false;
        }
        yqt yqtVarO = o(str, strArr[0], j, bArr);
        if (!yqtVarO.g()) {
            return false;
        }
        Object objC = yqtVarO.c();
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("sync_status", "SYNCED");
        } else {
            contentValues.putNull("sync_status");
        }
        contentValues.putNull("delete_status");
        contentValues.put("num_times_used", (Long) 0L);
        contentValues.put("file_path", (String) objC);
        return ((long) sQLiteDatabase.update("geller_file_table", contentValues, str3, strArr2)) > 0;
    }

    private static long t(SQLiteDatabase sQLiteDatabase, String[] strArr) {
        sQLiteDatabase.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabase.delete("geller_file_table", "file_path = ?", strArr);
            sQLiteDatabase.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // defpackage.ooe
    public final /* synthetic */ accg a(yqt yqtVar, Set set) {
        return accg.a;
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
            long jN = 0;
            if (i == 1) {
                for (String str2 : ooj.h(((accj) gellerDeleteParams.d).b)) {
                    if (!str2.isEmpty()) {
                        jN += n((SQLiteDatabase) obj, "data_type = ? AND ".concat(String.valueOf(str2)), new String[]{str});
                    }
                }
            } else {
                if (i == 2) {
                    accn accnVar = (accn) gellerDeleteParams.d;
                    acdh acdhVar = this.d;
                    ooj.e(accnVar, acdhVar);
                    jN = n((SQLiteDatabase) obj, (accnVar.b.size() == 0 && accnVar.c.size() == 0) ? "data_type = ?" : "data_type = ? AND " + ooj.f(accnVar, acdhVar), new String[]{str});
                } else if (i == 4 && ((Boolean) gellerDeleteParams.d).booleanValue()) {
                    jN = n((SQLiteDatabase) obj, "data_type = ?", new String[]{str});
                }
            }
            ((SQLiteDatabase) obj).setTransactionSuccessful();
            return jN;
        } finally {
            ((SQLiteDatabase) obj).endTransaction();
        }
    }

    @Override // defpackage.ooe
    public final byte[][] d(yqt yqtVar, acdt acdtVar) {
        yqw.L(true);
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
            sb.append("AND key like ?");
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
                sb.append(" AND sync_status = ? ");
                arrayList.add("SYNCED");
            } else {
                sb.append(" AND sync_status IS NULL ");
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
        return l((SQLiteDatabase) ((yqz) yqtVar).a, sb.toString(), (String[]) arrayList.toArray(new String[0]), (1 & acdtVar.b) != 0 ? yqt.i(Integer.valueOf(acdtVar.e)) : ypv.a);
    }

    @Override // defpackage.ooe
    public final String[] e(yqt yqtVar, String str) {
        yqw.L(true);
        ypv ypvVar = ypv.a;
        return (String[]) ooj.d((SQLiteDatabase) ((yqz) yqtVar).a, "geller_file_table", "key", "data_type = ? AND timestamp_micro >= 0 AND delete_status IS NULL", new String[]{str}, ypvVar, ypvVar).toArray(new String[0]);
    }

    @Override // defpackage.ooe
    public final long f(yqt yqtVar, String str, acde acdeVar, yqt yqtVar2, yqt yqtVar3, yqt yqtVar4) throws IOException {
        String strC;
        yqw.L(true);
        String strA = ooj.a(yqtVar4);
        ArrayList arrayList = new ArrayList();
        arrayList.add("data_type = ?");
        if (!strA.isEmpty()) {
            arrayList.add(strA);
        }
        int i = acdeVar.b;
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((acdeVar.b == 1 ? (acdb) acdeVar.c : acdb.a).b);
            arrayList.add(ooj.g(arrayList2));
            strC = new yqn(" AND ").c(arrayList);
        } else {
            if (i != 2) {
                ((zdv) ((zdv) a.c()).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "updateElementStatus", 435, "GellerFileStorage.java")).u("Unexpected element_filtering in GellerElementSelectionParams.");
                return 0L;
            }
            acdd acddVar = (acdd) acdeVar.c;
            if (acddVar.b.size() != 0 || acddVar.c.size() != 0) {
                arrayList.add(ooj.i(acddVar.b, acddVar.c));
            }
            strC = new yqn(" AND ").c(arrayList);
        }
        ContentValues contentValues = new ContentValues();
        if (yqtVar2.g()) {
            ((Boolean) yqtVar2.c()).booleanValue();
            contentValues.put("sync_status", "SYNCED");
        }
        if (yqtVar3.g()) {
            ((Boolean) yqtVar3.c()).booleanValue();
            contentValues.put("deletion_sync_status", "DELETION_SYNCED");
        }
        if (yqtVar4.g()) {
            yqtVar4.c();
            yqtVar4.c();
            contentValues.put("delete_status", "PENDING_DELETE");
        }
        return ((SQLiteDatabase) ((yqz) yqtVar).a).update("geller_file_table", contentValues, strC, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.ooe
    public final boolean g(yqt yqtVar, String str, String[] strArr, long j, boolean z, byte[] bArr) throws Throwable {
        boolean zQ;
        yqw.L(yqtVar.g());
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) yqtVar.c();
        sQLiteDatabase.beginTransactionNonExclusive();
        boolean z2 = false;
        try {
            try {
                String str2 = "data_type = ? AND " + ooj.b("key", "IN", Arrays.asList(strArr)) + " AND timestamp_micro = ?";
                String[] strArr2 = {str, String.valueOf(j)};
                yqt yqtVarI = yqt.i("timestamp_micro DESC");
                ypv ypvVar = ypv.a;
                List listD = ooj.d(sQLiteDatabase, "geller_file_table", "file_path", str2, strArr2, yqtVarI, ypvVar);
                ?? r4 = 1;
                r4 = 1;
                try {
                    if (listD.size() == 1 && new HashSet(ooj.d(sQLiteDatabase, "geller_file_table", "key", "file_path = ?", new String[]{(String) listD.get(0)}, yqt.i("timestamp_micro DESC"), ypvVar)).equals(new HashSet(Arrays.asList(strArr)))) {
                        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                        zQ = s(sQLiteDatabase2, str, strArr, j, z, bArr, (String) listD.get(0), str2, strArr2);
                        sQLiteDatabase = sQLiteDatabase2;
                        sQLiteDatabase.setTransactionSuccessful();
                        r4 = sQLiteDatabase2;
                    } else {
                        SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
                        zQ = q(sQLiteDatabase3, str, strArr, j, z, bArr, listD);
                        sQLiteDatabase = sQLiteDatabase3;
                        sQLiteDatabase.setTransactionSuccessful();
                        r4 = sQLiteDatabase3;
                    }
                    z2 = zQ;
                } catch (IllegalStateException e) {
                    e = e;
                    sQLiteDatabase = r4;
                    ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerFileStorage", "write", ModuleDescriptor.MODULE_VERSION, "GellerFileStorage.java")).u("Failed to write file.");
                    sQLiteDatabase.endTransaction();
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = r4;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (IllegalStateException e2) {
                e = e2;
            }
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0145 A[Catch: IllegalStateException -> 0x01c0, all -> 0x01c2, TryCatch #0 {IllegalStateException -> 0x01c0, blocks: (B:11:0x00b2, B:13:0x00bd, B:14:0x00c1, B:16:0x00c7, B:18:0x00dc, B:19:0x00df, B:21:0x00f6, B:22:0x00f9, B:23:0x010f, B:25:0x0117, B:26:0x011a, B:27:0x0137, B:28:0x0140, B:31:0x0145, B:33:0x0163, B:35:0x0166, B:37:0x0177, B:38:0x017a, B:40:0x0191, B:41:0x0194, B:42:0x01ac, B:45:0x01b6, B:46:0x01bf), top: B:58:0x0064 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    @Override // defpackage.ooe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.acel h(defpackage.yqt r26, java.lang.String r27, java.lang.String[] r28, long r29, boolean r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ook.h(yqt, java.lang.String, java.lang.String[], long, boolean, byte[]):acel");
    }

    @Override // defpackage.ooe
    public final /* synthetic */ byte[][] i(yqt yqtVar, acdt acdtVar) {
        return d(yqtVar, acdtVar);
    }

    @Override // defpackage.ooe
    public final /* synthetic */ boolean j(yqt yqtVar, aceh acehVar) {
        return ood.a(this, yqtVar, acehVar);
    }
}
