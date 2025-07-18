package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import com.google.common.collect.Lists;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.assistant.portable.geller.GellerDeleteParams;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooh extends SQLiteOpenHelper implements GellerDatabase {
    public static final zdy c = zdy.h("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl");
    private final boolean d;
    private final Context e;
    private final oog f;
    private final ook g;
    private final ool h;
    private final yqt i;
    private final Map j;
    private final String k;
    private int l;
    private final acdh m;

    public ooh(Context context, String str, boolean z, boolean z2, int i, yqt yqtVar, Map map, acdh acdhVar) {
        super(context, String.format("portable_geller_%s.db", str.replace(File.separator, "_")), (SQLiteDatabase.CursorFactory) null, 9);
        this.l = 9;
        this.e = context;
        this.k = str;
        setWriteAheadLoggingEnabled(true);
        d();
        this.d = z2;
        this.f = new oog(z2, acdhVar);
        this.g = new ook(context, str, acdhVar);
        this.h = new ool();
        this.i = yqtVar;
        this.j = map;
        this.m = acdhVar;
        ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "<init>", 178, "GellerDatabaseImpl.java")).x("Setting isLegacySQLite mode to %s.", Boolean.valueOf(z2));
    }

    private final int g(String str) throws abxv, SQLException, GellerException {
        acoe acoeVarJ = j();
        if (acoeVarJ == null) {
            ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1484, "GellerDatabaseImpl.java")).x("The GellerConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
            return 0;
        }
        acow acowVar = acoeVarJ.c;
        if (acowVar == null) {
            acowVar = acow.a;
        }
        for (acov acovVar : acowVar.b) {
            acgd acgdVarB = acgd.b(acovVar.b);
            if (acgdVarB == null) {
                acgdVarB = acgd.UNKNOWN;
            }
            if (ypx.d(acgdVarB.name(), str)) {
                acos acosVar = acovVar.c;
                if (acosVar == null) {
                    acosVar = acos.a;
                }
                return acosVar.b;
            }
        }
        ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGcLimit", 1495, "GellerDatabaseImpl.java")).x("The Geller StorageConfig is not present, defaulting getGCLimit for corpus %s to 0.", str);
        return 0;
    }

    private final long h(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return 0L;
        }
        sQLiteDatabaseD.beginTransactionNonExclusive();
        try {
            long jDelete = sQLiteDatabaseD.delete("geller_metadata_table", str, strArr);
            sQLiteDatabaseD.setTransactionSuccessful();
            return jDelete;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    private final ooe i(String str) {
        if (b.contains(str)) {
            return this.h;
        }
        Map map = this.j;
        return !map.containsKey(str) ? ((zdd) a).b.equals(str) ? this.g : this.f : (ooe) map.get(str);
    }

    private final acoe j() throws abxv, SQLException, GellerException {
        int iA;
        byte[][] all;
        byte bByteValue;
        byte bByteValue2;
        String strName = acgd.GELLER_CONFIG.name();
        acdt acdtVar = acdt.a;
        acdo acdoVar = new acdo();
        if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acdoVar.y();
        }
        acdt acdtVar2 = (acdt) acdoVar.b;
        acdtVar2.b |= 1;
        acdtVar2.e = 1;
        acdt acdtVar3 = (acdt) acdoVar.v();
        try {
            int i = acdtVar3.memoizedSerializedSize;
            if ((i & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(acdtVar3.getClass()).a(acdtVar3);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(acdtVar3.getClass()).a(acdtVar3);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    acdtVar3.memoizedSerializedSize = (acdtVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(acdtVar3.getClass()).m(acdtVar3, abwa.a(abvwVar));
            abvwVar.K();
            abxd abxdVar = null;
            try {
                abxd abxdVarH = abxd.h(acdt.a, bArr, 0, iA, ExtensionRegistryLite.getGeneratedRegistry());
                if (abxdVarH != null && (bByteValue2 = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue2 != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        abxdVarH.cM(2, true != zL ? null : abxdVarH);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
                acdt acdtVar4 = (acdt) abxdVarH;
                SQLiteDatabase sQLiteDatabaseD = d();
                if (sQLiteDatabaseD == null) {
                    all = new byte[0][];
                } else {
                    acdo acdoVar2 = new acdo();
                    acdoVar2.B(acdtVar4);
                    if ((acdoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acdoVar2.y();
                    }
                    acdt acdtVar5 = (acdt) acdoVar2.b;
                    strName.getClass();
                    acdtVar5.b |= 4;
                    acdtVar5.g = strName;
                    int i2 = acdtVar4.b;
                    if ((i2 & 16) == 0 && (i2 & 64) == 0) {
                        if ((acdoVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            acdoVar2.y();
                        }
                        acdt acdtVar6 = (acdt) acdoVar2.b;
                        acdtVar6.b |= 16;
                        acdtVar6.i = false;
                    }
                    try {
                        all = i(strName).d(yqt.i(sQLiteDatabaseD), (acdt) acdoVar2.v());
                    } catch (SQLiteException | IllegalStateException e) {
                        e(e);
                        throw new GellerException(abqb.ABORTED, e.getMessage(), e);
                    }
                }
            } catch (abxv e2) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 442, "GellerDatabaseImpl.java")).u("Failed to parse GellerReadParams bytes");
                all = readAll(strName);
            }
            if (all.length == 0) {
                ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getGellerConfigClientConfig", 1424, "GellerDatabaseImpl.java")).u("The GellerConfig is not present, returning null.");
                return null;
            }
            ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
            try {
                byte[] bArr2 = all[0];
                acgi acgiVar = acgi.a;
                abxd abxdVarH2 = abxd.h(acgiVar, bArr2, 0, bArr2.length, generatedRegistry);
                if (abxdVarH2 != null && (bByteValue = ((Byte) abxdVarH2.cM(1, null)).byteValue()) != 1) {
                    if (bByteValue != 0) {
                        boolean zL2 = abza.a.a(abxdVarH2.getClass()).l(abxdVarH2);
                        if (true == zL2) {
                            abxdVar = abxdVarH2;
                        }
                        abxdVarH2.cM(2, abxdVar);
                        if (zL2) {
                        }
                    }
                    throw new abzz().a();
                }
                acgi acgiVar2 = (acgi) abxdVarH2;
                abxc abxcVar = acoe.b;
                if (abxcVar.a != acgiVar) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                if (acgiVar2.n.n(abxcVar.d)) {
                    abxc abxcVar2 = acoe.b;
                    if (abxcVar2.a != acgi.a) {
                        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                    }
                    Object objK = acgiVar2.n.k(abxcVar2.d);
                    return (acoe) (objK == null ? abxcVar2.b : abxcVar2.b(objK));
                }
                try {
                    abuy abuyVar = acgiVar2.e;
                    if (abuyVar == null) {
                        abuyVar = abuy.a;
                    }
                    abvt abvtVarK = abuyVar.c.k();
                    acoe acoeVar = new acoe();
                    try {
                        try {
                            try {
                                abzj abzjVarA = abza.a.a(acoeVar.getClass());
                                abzjVarA.i(acoeVar, abvu.p(abvtVarK), generatedRegistry);
                                abzjVarA.g(acoeVar);
                                try {
                                    abvtVarK.z(0);
                                    Byte b = (byte) 1;
                                    b.getClass();
                                    return acoeVar;
                                } catch (abxv e3) {
                                    throw e3;
                                }
                            } catch (IOException e4) {
                                if (e4.getCause() instanceof abxv) {
                                    throw ((abxv) e4.getCause());
                                }
                                throw new abxv(e4);
                            } catch (RuntimeException e5) {
                                if (e5.getCause() instanceof abxv) {
                                    throw ((abxv) e5.getCause());
                                }
                                throw e5;
                            }
                        } catch (abxv e6) {
                            if (e6.a) {
                                throw new abxv(e6);
                            }
                            throw e6;
                        }
                    } catch (abzz e7) {
                        throw e7.a();
                    }
                } catch (abxv e8) {
                    throw new IllegalStateException("Failed to unpack GellerClientConfig.", e8);
                }
            } catch (abxv e9) {
                throw new IllegalStateException("Failed to parse an element.", e9);
            }
        } catch (IOException e10) {
            throw new RuntimeException(a.u(acdtVar3, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    private final String k(String str) {
        ((zdd) a).b.equals(str);
        return "key";
    }

    private final boolean l(String str) throws abxv, SQLException, GellerException {
        acoe acoeVarJ = j();
        if (acoeVarJ == null) {
            ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1459, "GellerDatabaseImpl.java")).x("The GellerConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
            return true;
        }
        acpc acpcVar = acoeVarJ.d;
        if (acpcVar == null) {
            acpcVar = acpc.a;
        }
        for (acpb acpbVar : acpcVar.b) {
            acgd acgdVarB = acgd.b(acpbVar.b);
            if (acgdVarB == null) {
                acgdVarB = acgd.UNKNOWN;
            }
            if (ypx.d(acgdVarB.name(), str)) {
                acoy acoyVar = acpbVar.c;
                if (acoyVar == null) {
                    acoyVar = acoy.a;
                }
                acoo acooVar = acoyVar.b;
                if (acooVar == null) {
                    acooVar = acoo.a;
                }
                return acooVar.b;
            }
        }
        ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "isUploadEnabled", 1470, "GellerDatabaseImpl.java")).x("The Geller SyncConfig is not present, defaulting isUploadEnabled for corpus %s to true.", str);
        return true;
    }

    private final long m(String str, String[] strArr, int i) {
        if (d() == null) {
            return 0L;
        }
        new ContentValues().put("delete_status", oob.a(i));
        return r0.update("geller_key_table", r1, str, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(java.lang.String r21, defpackage.acdl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooh.a(java.lang.String, acdl):long");
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final /* bridge */ /* synthetic */ Map b() {
        yyn yynVar = new yyn(4);
        for (Map.Entry entry : this.j.entrySet()) {
            acge acgeVarB = ((ooe) entry.getValue()).b();
            if (acgeVarB != acge.CUSTOM_STORAGE_TYPE_UNKNOWN) {
                yynVar.c((String) entry.getKey(), acgeVarB);
            }
        }
        return yynVar.a(true);
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final void c() {
        close();
    }

    public final synchronized SQLiteDatabase d() {
        try {
        } catch (SQLiteException e) {
            if (e.getMessage().contains("Can't upgrade read-only database")) {
                return null;
            }
            ((zdv) ((zdv) ((zdv) c.d()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getSQLiteDatabase", (char) 1637, "GellerDatabaseImpl.java")).u("Failed to get geller database.");
            return null;
        }
        return getWritableDatabase();
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str) {
        zdy zdyVar = c;
        ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 824, "GellerDatabaseImpl.java")).x("Deleting all data for %s", str);
        SQLiteDatabase sQLiteDatabaseD = d();
        long jC = 0;
        try {
            if (sQLiteDatabaseD == null) {
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 827, "GellerDatabaseImpl.java")).u("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            try {
                sQLiteDatabaseD.beginTransactionNonExclusive();
                h("data_type = ?", new String[]{str});
                ooe ooeVarI = i(str);
                yqt yqtVarI = yqt.i(sQLiteDatabaseD);
                GellerDeleteParams gellerDeleteParams = GellerDeleteParams.a;
                acch acchVar = new acch();
                if ((acchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acchVar.y();
                }
                GellerDeleteParams gellerDeleteParams2 = (GellerDeleteParams) acchVar.b;
                str.getClass();
                gellerDeleteParams2.b |= 1;
                gellerDeleteParams2.e = str;
                if ((acchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acchVar.y();
                }
                GellerDeleteParams gellerDeleteParams3 = (GellerDeleteParams) acchVar.b;
                gellerDeleteParams3.c = 4;
                gellerDeleteParams3.d = true;
                jC = ooeVarI.c(yqtVarI, (GellerDeleteParams) acchVar.v());
                sQLiteDatabaseD.setTransactionSuccessful();
            } catch (SQLiteException | IllegalStateException e) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 843, "GellerDatabaseImpl.java")).x("Delete %s failed", str);
                e(e);
            }
            return jC;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long deleteMetadata(String str, String str2) throws SQLException {
        try {
            return h("data_type = ? AND key = ?", new String[]{str, str2});
        } catch (SQLiteException | IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "deleteMetadata", 906, "GellerDatabaseImpl.java")).F("Delete metadata %s : %s failed", str, str2);
            e(e);
            return 0L;
        }
    }

    final void e(Exception exc) throws SQLException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            ((zdv) ((zdv) ((zdv) c.c()).p(exc)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1530, "GellerDatabaseImpl.java")).u("An error occurred. No action was taken because the database was null.");
            return;
        }
        if ((exc instanceof IllegalStateException) || (exc instanceof SQLiteDatabaseLockedException) || (exc instanceof SQLiteDiskIOException) || (exc instanceof SQLiteFullException) || (exc instanceof SQLiteOutOfMemoryException) || (exc instanceof SQLiteTableLockedException)) {
            ((zdv) ((zdv) ((zdv) c.c()).p(exc)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "handleException", (char) 1533, "GellerDatabaseImpl.java")).u("An error occurred. No action was taken because the exception was not actionable.");
            return;
        }
        int i = yyk.e;
        yyf yyfVar = new yyf(4);
        yyfVar.g("geller_key_table");
        yyfVar.g("geller_data_table");
        if (this.l >= 5) {
            yyfVar.g("geller_file_table");
        }
        if (this.l >= 8) {
            yyfVar.g("geller_metadata_table");
        }
        yyk yykVarF = yyfVar.f();
        Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery(String.format("SELECT count(*) FROM %s WHERE %s", "sqlite_master", "type = ? AND ".concat(ooj.b("name", "IN", yykVarF))), new String[]{"table"});
        try {
            cursorRawQuery.moveToFirst();
            int i2 = cursorRawQuery.getInt(0);
            int i3 = ((zcg) yykVarF).d;
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            if (i2 == i3) {
                ((zdv) ((zdv) ((zdv) c.c()).p(exc)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1549, "GellerDatabaseImpl.java")).u("An error occurred. No action was taken because the error reason is unknown.");
            } else {
                ((zdv) ((zdv) ((zdv) c.c()).p(exc)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "validateTableSchema", (char) 1545, "GellerDatabaseImpl.java")).u("An error occurred. Dropping existing data and recreating all tables.");
                f(sQLiteDatabaseD);
            }
        } finally {
        }
    }

    final void f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    String string = cursorRawQuery.getString(0);
                    sQLiteDatabase.execSQL(a.j(string, "DROP TABLE IF EXISTS "));
                    ((zdv) ((zdv) c.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "dropAllTables", 1671, "GellerDatabaseImpl.java")).x("Dropped table %s", string);
                } finally {
                }
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            ook.k(new File(this.e.getFilesDir(), "geller"));
            onCreate(sQLiteDatabase);
        } catch (SQLiteException e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "recreateTables", (char) 1652, "GellerDatabaseImpl.java")).u("Failed to recreate tables");
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats() throws SQLException {
        int iA;
        HashMap map = new HashMap();
        map.put(this.g, new HashSet());
        map.put(this.f, new HashSet());
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            map.put((ooe) it.next(), new HashSet());
        }
        accg accgVar = accg.a;
        accf accfVar = new accf();
        yqt yqtVarI = yqt.i(d());
        try {
            for (Map.Entry entry : map.entrySet()) {
                Iterator it2 = ((ooe) entry.getKey()).a(yqtVarI, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    accfVar.a((acce) it2.next());
                }
            }
            accg accgVar2 = (accg) accfVar.v();
            try {
                int i = accgVar2.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(accgVar2.getClass()).a(accgVar2);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(accgVar2.getClass()).a(accgVar2);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        accgVar2.memoizedSerializedSize = (Integer.MIN_VALUE & accgVar2.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(accgVar2.getClass()).m(accgVar2, abwa.a(abvwVar));
                abvwVar.K();
                return bArr;
            } catch (IOException e) {
                throw new RuntimeException(a.C(accgVar2, "byte array"), e);
            }
        } catch (SQLiteException | IllegalStateException e2) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1074, "GellerDatabaseImpl.java")).u("GetCorpusStats failed");
            e(e2);
            return new byte[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0331 A[Catch: IOException -> 0x0393, TRY_ENTER, TryCatch #3 {IOException -> 0x0393, blocks: (B:128:0x0329, B:131:0x0331, B:143:0x0374, B:134:0x0342, B:135:0x034b, B:136:0x034c, B:138:0x0352, B:140:0x0362, B:141:0x036a, B:142:0x0373), top: B:152:0x0329 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034c A[Catch: IOException -> 0x0393, TryCatch #3 {IOException -> 0x0393, blocks: (B:128:0x0329, B:131:0x0331, B:143:0x0374, B:134:0x0342, B:135:0x034b, B:136:0x034c, B:138:0x0352, B:140:0x0362, B:141:0x036a, B:142:0x0373), top: B:152:0x0329 }] */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] getSnapshot(java.lang.String[] r27, int r28, boolean r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooh.getSnapshot(java.lang.String[], int, boolean):byte[]");
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long markSyncStatus(String str, byte[] bArr) throws abxv {
        try {
            abxd abxdVarH = abxd.h(acdl.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            return a(str, (acdl) abxdVarH);
        } catch (abxv e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "markSyncStatus", (char) 1089, "GellerDatabaseImpl.java")).u("Failed to parse GellerMarkSyncStatusParams.");
            return 0L;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_data_table (_id INTEGER PRIMARY KEY, data BLOB NOT NULL);");
        int i = this.l;
        if (i == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else if (i <= 5) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_key_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, data_id INTEGER NOT NULL,  FOREIGN KEY (data_id) REFERENCES geller_data_table (_id) ON DELETE CASCADE );");
        }
        sQLiteDatabase.execSQL("CREATE INDEX datatype_key_dataid ON geller_key_table (data_type, key, delete_status, data_id);");
        if (this.l >= 3) {
            sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
        }
        int i2 = this.l;
        if (i2 >= 5 && i2 <= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
        }
        if (this.l >= 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
        }
        if (this.l >= 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, deletion_sync_status TEXT, file_path TEXT NOT NULL);");
        }
        if (this.l >= 9) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
            sQLiteDatabase.execSQL(ooi.a);
        }
        sQLiteDatabase.setVersion(this.l);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        this.l = i2;
        f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        while (i < i2) {
            switch (i) {
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN num_times_used INTEGER;");
                    break;
                case 2:
                    sQLiteDatabase.execSQL("CREATE INDEX datatype_dataid ON geller_key_table (data_type, data_id);");
                    break;
                case 4:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_file_table (data_type TEXT NOT NULL, key TEXT NOT NULL, timestamp_micro INTEGER NOT NULL, sync_status TEXT, delete_status TEXT, num_times_used INTEGER, file_path TEXT NOT NULL);");
                    break;
                case 5:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_key_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 6:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_metadata_table (data_type TEXT NOT NULL, key TEXT NOT NULL, metadata TEXT NOT NULL);");
                    break;
                case 7:
                    sQLiteDatabase.execSQL("ALTER TABLE geller_file_table ADD COLUMN deletion_sync_status TEXT;");
                    break;
                case 8:
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS geller_database_info_table (key TEXT NOT NULL, info TEXT NOT NULL);");
                    sQLiteDatabase.execSQL(ooi.a);
                    break;
            }
            i++;
        }
        this.l = i2;
        sQLiteDatabase.setVersion(i2);
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, boolean z, boolean z2) throws SQLException, GellerException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return new byte[0][];
        }
        try {
            ooe ooeVarI = i(str);
            yqt yqtVarI = yqt.i(sQLiteDatabaseD);
            acdt acdtVar = acdt.a;
            acdo acdoVar = new acdo();
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar2 = (acdt) acdoVar.b;
            str.getClass();
            acdtVar2.b |= 4;
            acdtVar2.g = str;
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar3 = (acdt) acdoVar.b;
            acdtVar3.b |= 8;
            acdtVar3.h = z;
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar4 = (acdt) acdoVar.b;
            acdtVar4.b |= 16;
            acdtVar4.i = z2;
            return ooeVarI.d(yqtVarI, (acdt) acdoVar.v());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(abqb.ABORTED, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readAll(String str) throws SQLException, GellerException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            return new byte[0][];
        }
        try {
            ooe ooeVarI = i(str);
            yqt yqtVarI = yqt.i(sQLiteDatabaseD);
            acdt acdtVar = acdt.a;
            acdo acdoVar = new acdo();
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar2 = (acdt) acdoVar.b;
            str.getClass();
            acdtVar2.b |= 4;
            acdtVar2.g = str;
            return ooeVarI.d(yqtVarI, (acdt) acdoVar.v());
        } catch (SQLiteException | IllegalStateException e) {
            e(e);
            throw new GellerException(abqb.ABORTED, e.getMessage(), e);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readDatabaseInfo(String str) throws SQLException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ypv ypvVar = ypv.a;
                return (String[]) ooj.d(sQLiteDatabaseD, "geller_database_info_table", "info", "key = ?", new String[]{str}, ypvVar, ypvVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readDatabaseInfo", (char) 625, "GellerDatabaseImpl.java")).u("Read database info failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readElementIds(String str, byte[] bArr) throws abxv, SQLException, GellerException {
        try {
            abxd abxdVarH = abxd.h(acdt.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            acdt acdtVar = (acdt) abxdVarH;
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                return new byte[0][];
            }
            acdo acdoVar = new acdo();
            acdoVar.B(acdtVar);
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar2 = (acdt) acdoVar.b;
            str.getClass();
            acdtVar2.b |= 4;
            acdtVar2.g = str;
            int i = acdtVar.b;
            if ((i & 16) == 0 && (i & 64) == 0) {
                if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acdoVar.y();
                }
                acdt acdtVar3 = (acdt) acdoVar.b;
                acdtVar3.b |= 16;
                acdtVar3.i = false;
            }
            try {
                return i(str).i(yqt.i(sQLiteDatabaseD), (acdt) acdoVar.v());
            } catch (SQLiteException | IllegalStateException e) {
                e(e);
                throw new GellerException(abqb.ABORTED, e.getMessage(), e);
            }
        } catch (abxv e2) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readElementIds", (char) 474, "GellerDatabaseImpl.java")).u("Failed to parse GellerReadParams bytes");
            return readAll(str);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readKeys(String str) throws SQLException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                return i(str).e(yqt.i(sQLiteDatabaseD), str);
            } catch (SQLiteException | IllegalStateException e) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readKeys", (char) 552, "GellerDatabaseImpl.java")).u("Read keys failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final String[] readMetadata(String str, String str2) throws SQLException {
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ypv ypvVar = ypv.a;
                return (String[]) ooj.d(sQLiteDatabaseD, "geller_metadata_table", "metadata", "data_type = ? AND key = ?", new String[]{str, str2}, ypvVar, ypvVar).toArray(new String[0]);
            } catch (SQLiteException | IllegalStateException e) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadata", (char) 577, "GellerDatabaseImpl.java")).u("Read metadata failed");
                e(e);
            }
        }
        return new String[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] readMetadataForAllCorpora(String str) throws SQLException {
        acbz acbzVar;
        int iA;
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                String[] strArr = {"data_type", "metadata"};
                acca accaVar = acca.a;
                acbz acbzVar2 = new acbz();
                try {
                    Cursor cursorQuery = sQLiteDatabaseD.query(true, "geller_metadata_table", strArr, "key = ?", new String[]{str}, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            accc acccVar = accc.a;
                            accb accbVar = new accb();
                            String string = cursorQuery.getString(0);
                            if ((accbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                accbVar.y();
                            }
                            accc acccVar2 = (accc) accbVar.b;
                            string.getClass();
                            acccVar2.b |= 1;
                            acccVar2.c = string;
                            if ((accbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                accbVar.y();
                            }
                            accc acccVar3 = (accc) accbVar.b;
                            str.getClass();
                            acccVar3.b |= 2;
                            acccVar3.d = str;
                            String string2 = cursorQuery.getString(1);
                            if ((accbVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                accbVar.y();
                            }
                            accc acccVar4 = (accc) accbVar.b;
                            string2.getClass();
                            acccVar4.b |= 4;
                            acccVar4.e = string2;
                            accc acccVar5 = (accc) accbVar.v();
                            if ((acbzVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                acbzVar2.y();
                            }
                            acca accaVar2 = (acca) acbzVar2.b;
                            acccVar5.getClass();
                            abxs abxsVar = accaVar2.b;
                            if (!abxsVar.c()) {
                                int size = abxsVar.size();
                                accaVar2.b = abxsVar.d(size + size);
                            }
                            accaVar2.b.add(acccVar5);
                        } finally {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    acbzVar = acbzVar2;
                } catch (IllegalArgumentException e) {
                    acbzVar = acbzVar2;
                    ((zdv) ((zdv) ((zdv) ooj.a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readMetadataFromTable", '`', "GellerDatabaseUtil.java")).u("Column doesn't exist");
                }
                acca accaVar3 = (acca) acbzVar.v();
                try {
                    int i = accaVar3.memoizedSerializedSize;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iA = abza.a.a(accaVar3.getClass()).a(accaVar3);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    } else {
                        iA = i & Integer.MAX_VALUE;
                        if (iA == Integer.MAX_VALUE) {
                            iA = abza.a.a(accaVar3.getClass()).a(accaVar3);
                            if (iA < 0) {
                                throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                            }
                            accaVar3.memoizedSerializedSize = (accaVar3.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        }
                    }
                    byte[] bArr = new byte[iA];
                    boolean z = abvz.e;
                    abvw abvwVar = new abvw(bArr, 0, iA);
                    abza.a.a(accaVar3.getClass()).m(accaVar3, abwa.a(abvwVar));
                    abvwVar.K();
                    return bArr;
                } catch (IOException e2) {
                    throw new RuntimeException(a.C(accaVar3, "byte array"), e2);
                }
            } catch (SQLiteException | IllegalStateException e3) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e3)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readMetadataForAllCorpora", (char) 600, "GellerDatabaseImpl.java")).u("Read metadata failed");
                e(e3);
            }
        }
        return new byte[0];
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] readOutdatedData(String str) throws SQLException {
        if (this.m.s) {
            boolean zEquals = ((zdd) a).b.equals(str);
            String str2 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            arrayList.add("DELETION_PROCESSED");
            try {
                if (l(str)) {
                    arrayList.add("DELETION_SYNCED");
                    str2 = (str2 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                SQLiteDatabase sQLiteDatabaseD = d();
                if (sQLiteDatabaseD != null) {
                    try {
                        return zEquals ? ook.l(sQLiteDatabaseD, str2, strArr, ypv.a) : oog.l(sQLiteDatabaseD, this.d, str2, strArr, this.m);
                    } catch (SQLiteException | IllegalStateException e) {
                        ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", (char) 1404, "GellerDatabaseImpl.java")).u("Read outdated data failed.");
                        e(e);
                    }
                }
                return new byte[0][];
            } catch (IllegalStateException e2) {
                ((zdv) ((zdv) ((zdv) c.d()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedDataElementIds", 1374, "GellerDatabaseImpl.java")).x("There was an error determining whether corpus %s supports upload.", str);
                return new byte[0][];
            }
        }
        boolean zEquals2 = ((zdd) a).b.equals(str);
        String str3 = "data_type = ? AND timestamp_micro >= 0 AND delete_status = ?";
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        arrayList2.add("DELETION_PROCESSED");
        try {
            if (l(str)) {
                arrayList2.add("DELETION_SYNCED");
                str3 = (str3 + " AND (( deletion_sync_status = ? )") + " OR ( deletion_sync_status IS NULL AND sync_status IS NULL ))";
            }
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            SQLiteDatabase sQLiteDatabaseD2 = d();
            if (sQLiteDatabaseD2 != null) {
                try {
                    return zEquals2 ? ook.l(sQLiteDatabaseD2, str3, strArr2, ypv.a) : oog.k(sQLiteDatabaseD2, this.d, str3, strArr2);
                } catch (SQLiteException | IllegalStateException e3) {
                    ((zdv) ((zdv) ((zdv) c.c()).p(e3)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", (char) 683, "GellerDatabaseImpl.java")).u("Read outdated data failed.");
                    e(e3);
                }
            }
            return new byte[0][];
        } catch (IllegalStateException e4) {
            ((zdv) ((zdv) ((zdv) c.d()).p(e4)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "readOutdatedData", 654, "GellerDatabaseImpl.java")).x("There was an error determining whether corpus %s supports upload.", str);
            return new byte[0][];
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long setDeletionProcessed(byte[] bArr) throws abxv {
        long j;
        abxv abxvVar;
        long j2;
        long j3;
        long j4;
        Iterator it;
        long jM;
        long jM2;
        boolean z;
        List list;
        omw omwVarA;
        SQLiteDatabase sQLiteDatabaseD = d();
        long j5 = 0;
        if (sQLiteDatabaseD == null) {
            ((zdv) ((zdv) c.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1171, "GellerDatabaseImpl.java")).u("The Geller SQLiteDatabase is null, skipping setting DELETION_PROCESSED status.");
            return 0L;
        }
        try {
            abxd abxdVarH = abxd.h(acct.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            boolean z2 = true;
            if (abxdVarH != null) {
                abxd abxdVar = null;
                try {
                    byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                    if (bByteValue != 1) {
                        if (bByteValue != 0) {
                            boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                            if (true == zL) {
                                abxdVar = abxdVarH;
                            }
                            abxdVarH.cM(2, abxdVar);
                            if (zL) {
                            }
                        }
                        throw new abzz().a();
                    }
                } catch (abxv e) {
                    abxvVar = e;
                    j = 0;
                    ((zdv) ((zdv) ((zdv) c.c()).p(abxvVar)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", (char) 1182, "GellerDatabaseImpl.java")).u("Failed to parse GellerDeletedElements bytes");
                    return j;
                }
            }
            try {
                acct acctVar = (acct) abxdVarH;
                try {
                    sQLiteDatabaseD.beginTransactionNonExclusive();
                    Iterator it2 = acctVar.b.iterator();
                    long j6 = 0;
                    while (it2.hasNext()) {
                        try {
                            accs accsVar = (accs) it2.next();
                            acgd acgdVarB = acgd.b(accsVar.c);
                            if (acgdVarB == null) {
                                acgdVarB = acgd.UNKNOWN;
                            }
                            String strName = acgdVarB.name();
                            long j7 = j5;
                            Object obj = ((zdd) a).b;
                            boolean zEquals = obj.equals(strName);
                            boolean z3 = z2;
                            if (accsVar.d.size() != 0) {
                                obj.equals(strName);
                                k(strName);
                                ArrayList arrayList = new ArrayList();
                                for (accr accrVar : accsVar.d) {
                                    omt omtVar = new omt();
                                    Iterator it3 = it2;
                                    omtVar.b(accrVar.d);
                                    if ((accrVar.b & 1) != 0) {
                                        j4 = j6;
                                        try {
                                            omtVar.a = yqt.i(Long.valueOf(accrVar.c));
                                            omwVarA = omtVar.a();
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            j2 = j4;
                                            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).u("Failed to set DELETION_PROCESSED status.");
                                            e(e);
                                            j3 = j2;
                                            return j3;
                                        } catch (IllegalStateException e3) {
                                            e = e3;
                                            j2 = j4;
                                            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).u("Failed to set DELETION_PROCESSED status.");
                                            e(e);
                                            j3 = j2;
                                            return j3;
                                        }
                                    } else {
                                        j4 = j6;
                                        omwVarA = omtVar.a();
                                    }
                                    arrayList.add(omwVarA);
                                    it2 = it3;
                                    j6 = j4;
                                }
                                it = it2;
                                long j8 = j6;
                                ArrayList<String> arrayList2 = new ArrayList();
                                Iterator it4 = Lists.e(arrayList).iterator();
                                while (it4.hasNext()) {
                                    StringBuilder sb = new StringBuilder();
                                    Iterator it5 = it4;
                                    int i = 0;
                                    for (List list2 = (List) it4.next(); i < list2.size(); list2 = list) {
                                        String strConcat = "( ";
                                        if (i == 0) {
                                            sb.append("( ");
                                            z = zEquals;
                                        } else {
                                            z = zEquals;
                                            sb.append(" OR ");
                                        }
                                        omw omwVar = (omw) list2.get(i);
                                        if (!omwVar.b().isEmpty() || omwVar.a().g()) {
                                            if (!omwVar.a().g() || ((Long) omwVar.a().c()).longValue() < j7) {
                                                list = list2;
                                            } else {
                                                list = list2;
                                                strConcat = "( ".concat(ooj.b("timestamp_micro", "=", yyk.o(omwVar.a().c())));
                                            }
                                            if (omwVar.a().g() && ((Long) omwVar.a().c()).longValue() >= j7 && !omwVar.b().isEmpty()) {
                                                strConcat = strConcat.concat(" AND");
                                            }
                                            if (!omwVar.b().isEmpty()) {
                                                strConcat = strConcat + " " + ooj.b("key", "=", yyk.o(omwVar.b()));
                                            }
                                            sb.append(strConcat.concat(" )"));
                                            if (i == list.size() - 1) {
                                                sb.append(" )");
                                            }
                                        } else {
                                            list = list2;
                                        }
                                        i++;
                                        zEquals = z;
                                    }
                                    arrayList2.add(sb.toString());
                                    it4 = it5;
                                    zEquals = zEquals;
                                }
                                boolean z4 = zEquals;
                                j6 = j8;
                                for (String str : arrayList2) {
                                    try {
                                        if (!str.isEmpty()) {
                                            String strI = a.i(str, "data_type = ?", " AND ");
                                            if (z4) {
                                                acgd acgdVarB2 = acgd.b(accsVar.c);
                                                if (acgdVarB2 == null) {
                                                    acgdVarB2 = acgd.UNKNOWN;
                                                }
                                                jM2 = ook.m(sQLiteDatabaseD, strI, new String[]{acgdVarB2.name()}, 2);
                                            } else {
                                                acgd acgdVarB3 = acgd.b(accsVar.c);
                                                if (acgdVarB3 == null) {
                                                    acgdVarB3 = acgd.UNKNOWN;
                                                }
                                                jM2 = m(strI, new String[]{acgdVarB3.name()}, 2);
                                            }
                                            j6 += jM2;
                                        }
                                    } catch (SQLiteException | IllegalStateException e4) {
                                        e = e4;
                                        j2 = j6;
                                        ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "setDeletionProcessed", 1231, "GellerDatabaseImpl.java")).u("Failed to set DELETION_PROCESSED status.");
                                        e(e);
                                        j3 = j2;
                                        return j3;
                                    }
                                }
                            } else {
                                it = it2;
                                long j9 = j6;
                                if (zEquals) {
                                    acgd acgdVarB4 = acgd.b(accsVar.c);
                                    if (acgdVarB4 == null) {
                                        acgdVarB4 = acgd.UNKNOWN;
                                    }
                                    jM = ook.m(sQLiteDatabaseD, "data_type = ?", new String[]{acgdVarB4.name()}, 2);
                                } else {
                                    acgd acgdVarB5 = acgd.b(accsVar.c);
                                    if (acgdVarB5 == null) {
                                        acgdVarB5 = acgd.UNKNOWN;
                                    }
                                    jM = m("data_type = ?", new String[]{acgdVarB5.name()}, 2);
                                }
                                j6 = j9 + jM;
                            }
                            z2 = z3;
                            j5 = j7;
                            it2 = it;
                        } catch (SQLiteException | IllegalStateException e5) {
                            e = e5;
                            j4 = j6;
                        }
                    }
                    j4 = j6;
                    sQLiteDatabaseD.setTransactionSuccessful();
                    j3 = j4;
                } catch (SQLiteException | IllegalStateException e6) {
                    e = e6;
                    j2 = 0;
                }
                return j3;
            } finally {
                sQLiteDatabaseD.endTransaction();
            }
        } catch (abxv e7) {
            j = 0;
            abxvVar = e7;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:99|7|(5:9|(1:11)(1:12)|13|(1:15)|16)(2:18|(2:27|(17:29|(4:31|(1:33)(1:34)|35|(2:37|(1:39)(2:40|41)))|42|(1:44)(1:45)|46|(1:48)|49|(1:51)|52|(1:54)(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65)(4:66|(1:68)(1:69)|70|(4:72|(1:74)(1:75)|76|(1:78)(1:79))(5:81|100|82|95|96)))(3:22|(1:24)|25))|26|100|82|95|96) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0279, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x027b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0284, code lost:
    
        ((defpackage.zdv) ((defpackage.zdv) ((defpackage.zdv) defpackage.ooh.c.c()).p(r0)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "softDelete", 1029, "GellerDatabaseImpl.java")).u("Soft-deletion failed.");
        e(r0);
     */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long softDelete(java.lang.String r18, com.google.protos.assistant.portable.geller.GellerDeleteParams r19) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooh.softDelete(java.lang.String, com.google.protos.assistant.portable.geller.GellerDeleteParams):long");
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean write(String str, String[] strArr, long j, boolean z, byte[] bArr) throws SQLException {
        int length = strArr.length;
        if (length == 0) {
            ((zdv) ((zdv) c.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 305, "GellerDatabaseImpl.java")).u("Unable to write data: empty key list");
            return false;
        }
        zdy zdyVar = c;
        ((zdv) ((zdv) ((zdv) zdyVar.b()).n(1, TimeUnit.SECONDS)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 309, "GellerDatabaseImpl.java")).J("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        Arrays.toString(strArr);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 316, "GellerDatabaseImpl.java")).u("Writing to geller db is null");
            return false;
        }
        try {
            return i(str).g(yqt.i(sQLiteDatabaseD), str, strArr, j, z, bArr);
        } catch (SQLiteException e) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", (char) 323, "GellerDatabaseImpl.java")).u("Failed to write data");
            e(e);
            return false;
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final boolean writeMetadata(String str, String str2, String str3) throws SQLException {
        ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", 416, "GellerDatabaseImpl.java")).F("Writing metadata key: %s, corpus: %s", str2, str);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("data_type", str);
                contentValues.put("key", str2);
                contentValues.put("metadata", str3);
                return sQLiteDatabaseD.insertOrThrow("geller_metadata_table", null, contentValues) >= 0;
            } catch (SQLiteException e) {
                ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeMetadata", (char) 426, "GellerDatabaseImpl.java")).u("Failed to write metadata");
                e(e);
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] writeWithResult(String str, String[] strArr, long j, boolean z, byte[] bArr) throws SQLException, GellerException {
        int iA;
        int length = strArr.length;
        if (length == 0) {
            throw new GellerException(abqb.ABORTED, "Unable to write data: empty key list.");
        }
        ((zdv) ((zdv) ((zdv) c.b()).n(1, TimeUnit.SECONDS)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "writeWithResult", 338, "GellerDatabaseImpl.java")).J("Writing data of size=%d bytes with N=%d keys to Geller corpus %s at ts=%d", Integer.valueOf(bArr.length), Integer.valueOf(length), str, Long.valueOf(j));
        Arrays.toString(strArr);
        SQLiteDatabase sQLiteDatabaseD = d();
        if (sQLiteDatabaseD == null) {
            throw new GellerException(abqb.ABORTED, "Unable to write data: geller db is null.");
        }
        try {
            acel acelVarH = i(str).h(yqt.i(sQLiteDatabaseD), str, strArr, j, z, bArr);
            try {
                int i = acelVarH.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acelVarH.getClass()).a(acelVarH);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acelVarH.getClass()).a(acelVarH);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        acelVarH.memoizedSerializedSize = (Integer.MIN_VALUE & acelVarH.memoizedSerializedSize) | iA;
                    }
                }
                byte[] bArr2 = new byte[iA];
                boolean z2 = abvz.e;
                abvw abvwVar = new abvw(bArr2, 0, iA);
                abza.a.a(acelVarH.getClass()).m(acelVarH, abwa.a(abvwVar));
                abvwVar.K();
                return bArr2;
            } catch (IOException e) {
                throw new RuntimeException(a.C(acelVarH, "byte array"), e);
            }
        } catch (SQLiteException e2) {
            e(e2);
            throw new GellerException(abqb.ABORTED, e2.getMessage(), e2);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] write(byte[] bArr) throws abxv, SQLException, GellerException {
        int iA;
        String strName;
        try {
            abxd abxdVarH = abxd.h(aceh.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            aceh acehVar = (aceh) abxdVarH;
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (aceg acegVar : acehVar.b) {
                if ((acegVar.b & 64) != 0) {
                    strName = acegVar.j;
                } else {
                    acgd acgdVarB = acgd.b(acegVar.c);
                    if (acgdVarB == null) {
                        acgdVarB = acgd.UNKNOWN;
                    }
                    strName = acgdVarB.name();
                }
                List listC = ooj.c(acegVar.d);
                if (!map.containsKey(strName)) {
                    map.put(strName, new acee());
                }
                acee aceeVar = (acee) map.get(strName);
                if ((Integer.MIN_VALUE & aceeVar.b.memoizedSerializedSize) == 0) {
                    aceeVar.y();
                }
                aceh acehVar2 = (aceh) aceeVar.b;
                acegVar.getClass();
                abxs abxsVar = acehVar2.b;
                if (!abxsVar.c()) {
                    int size = abxsVar.size();
                    acehVar2.b = abxsVar.d(size + size);
                }
                acehVar2.b.add(acegVar);
                if (!map2.containsKey(strName)) {
                    map2.put(strName, new ArrayList());
                }
                ((ArrayList) map2.get(strName)).addAll(listC);
            }
            ((zdv) ((zdv) c.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "write", 388, "GellerDatabaseImpl.java")).x("Writing data for these Geller corpora: %s", TextUtils.join(",", map.keySet()));
            int i = yyk.e;
            yyf yyfVar = new yyf(4);
            SQLiteDatabase sQLiteDatabaseD = d();
            int size2 = 0;
            for (Map.Entry entry : map.entrySet()) {
                aceh acehVar3 = (aceh) ((acee) entry.getValue()).v();
                String str = (String) entry.getKey();
                if (i(str).j(yqt.h(sQLiteDatabaseD), acehVar3)) {
                    yyfVar.h((Iterable) map2.get(str));
                    size2 += acehVar3.b.size();
                }
            }
            acel acelVar = acel.a;
            acei aceiVar = new acei();
            yyk yykVarF = yyfVar.f();
            if ((aceiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aceiVar.y();
            }
            acel acelVar2 = (acel) aceiVar.b;
            abxs abxsVar2 = acelVar2.c;
            if (!abxsVar2.c()) {
                int size3 = abxsVar2.size();
                acelVar2.c = abxsVar2.d(size3 + size3);
            }
            abus.m(yykVarF, acelVar2.c);
            long j = size2;
            if ((aceiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aceiVar.y();
            }
            acel acelVar3 = (acel) aceiVar.b;
            acelVar3.b = 1 | acelVar3.b;
            acelVar3.d = j;
            acel acelVar4 = (acel) aceiVar.v();
            try {
                int i2 = acelVar4.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(acelVar4.getClass()).a(acelVar4);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i2 & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(acelVar4.getClass()).a(acelVar4);
                        if (iA >= 0) {
                            acelVar4.memoizedSerializedSize = (acelVar4.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                        } else {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    }
                }
                byte[] bArr2 = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr2, 0, iA);
                abza.a.a(acelVar4.getClass()).m(acelVar4, abwa.a(abvwVar));
                abvwVar.K();
                return bArr2;
            } catch (IOException e) {
                throw new RuntimeException(a.u(acelVar4, " to a byte array threw an IOException (should never happen)."), e);
            }
        } catch (abxv e2) {
            e(e2);
            throw new GellerException(abqb.ABORTED, e2.getMessage(), e2);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[][] read(String str, byte[] bArr) throws abxv, SQLException, GellerException {
        try {
            abxd abxdVarH = abxd.h(acdt.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            acdt acdtVar = (acdt) abxdVarH;
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                return new byte[0][];
            }
            acdo acdoVar = new acdo();
            acdoVar.B(acdtVar);
            if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acdoVar.y();
            }
            acdt acdtVar2 = (acdt) acdoVar.b;
            str.getClass();
            acdtVar2.b |= 4;
            acdtVar2.g = str;
            int i = acdtVar.b;
            if ((i & 16) == 0 && (i & 64) == 0) {
                if ((acdoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acdoVar.y();
                }
                acdt acdtVar3 = (acdt) acdoVar.b;
                acdtVar3.b |= 16;
                acdtVar3.i = false;
            }
            try {
                return i(str).d(yqt.i(sQLiteDatabaseD), (acdt) acdoVar.v());
            } catch (SQLiteException | IllegalStateException e) {
                e(e);
                throw new GellerException(abqb.ABORTED, e.getMessage(), e);
            }
        } catch (abxv e2) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "read", (char) 442, "GellerDatabaseImpl.java")).u("Failed to parse GellerReadParams bytes");
            return readAll(str);
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final long delete(String str, byte[] bArr) throws abxv {
        accn accnVar;
        accn accnVar2;
        long j = 0;
        try {
            abxd abxdVarH = abxd.h(GellerDeleteParams.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null) {
                abxd abxdVar = null;
                byte bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue != 0) {
                        boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                        if (true == zL) {
                            abxdVar = abxdVarH;
                        }
                        abxdVarH.cM(2, abxdVar);
                        if (zL) {
                        }
                    }
                    throw new abzz().a();
                }
            }
            GellerDeleteParams gellerDeleteParams = (GellerDeleteParams) abxdVarH;
            zdy zdyVar = c;
            ((zdv) ((zdv) zdyVar.b()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 863, "GellerDatabaseImpl.java")).x("Deleting with GellerDeleteParams:\n %s", gellerDeleteParams);
            SQLiteDatabase sQLiteDatabaseD = d();
            if (sQLiteDatabaseD == null) {
                ((zdv) ((zdv) zdyVar.d()).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 867, "GellerDatabaseImpl.java")).u("The Geller SQLiteDatabase is null, skipping deletion.");
                return 0L;
            }
            String[] strArr = {str};
            try {
                try {
                    sQLiteDatabaseD.beginTransactionNonExclusive();
                    if (gellerDeleteParams.c == 2 && ((accn) gellerDeleteParams.d).b.size() == 0) {
                        if (gellerDeleteParams.c == 2) {
                            accnVar = (accn) gellerDeleteParams.d;
                        } else {
                            accnVar = accn.a;
                        }
                        if (accnVar.c.size() == 0) {
                            if (gellerDeleteParams.c == 2) {
                                accnVar2 = (accn) gellerDeleteParams.d;
                            } else {
                                accnVar2 = accn.a;
                            }
                            ooj.e(accnVar2, this.m);
                            h("data_type = ?", strArr);
                        }
                    }
                    ooe ooeVarI = i(str);
                    yqt yqtVarI = yqt.i(sQLiteDatabaseD);
                    acch acchVar = new acch();
                    acchVar.B(gellerDeleteParams);
                    if ((acchVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        acchVar.y();
                    }
                    GellerDeleteParams gellerDeleteParams2 = (GellerDeleteParams) acchVar.b;
                    str.getClass();
                    gellerDeleteParams2.b = 1 | gellerDeleteParams2.b;
                    gellerDeleteParams2.e = str;
                    long jC = ooeVarI.c(yqtVarI, (GellerDeleteParams) acchVar.v());
                    sQLiteDatabaseD.setTransactionSuccessful();
                    j = jC;
                } catch (SQLiteException | IllegalStateException e) {
                    ((zdv) ((zdv) ((zdv) c.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", 891, "GellerDatabaseImpl.java")).u("Delete failed");
                    e(e);
                }
                return j;
            } finally {
                sQLiteDatabaseD.endTransaction();
            }
        } catch (abxv e2) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "delete", (char) 860, "GellerDatabaseImpl.java")).u("Failed to parse GellerDeleteParams.");
            return 0L;
        }
    }

    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    public final byte[] getCorpusStats(String[] strArr) throws SQLException {
        int iA;
        HashMap map = new HashMap();
        if (strArr.length == 0) {
            map.put(this.g, new HashSet());
            map.put(this.f, new HashSet());
            Iterator it = this.j.values().iterator();
            while (it.hasNext()) {
                map.put((ooe) it.next(), new HashSet());
            }
        } else {
            for (String str : strArr) {
                ooe ooeVarI = i(str);
                if (!map.containsKey(ooeVarI)) {
                    map.put(ooeVarI, new HashSet());
                }
                ((Set) map.get(ooeVarI)).add(str);
            }
        }
        accg accgVar = accg.a;
        accf accfVar = new accf();
        yqt yqtVarI = yqt.i(d());
        try {
            for (Map.Entry entry : map.entrySet()) {
                Iterator it2 = ((ooe) entry.getKey()).a(yqtVarI, (Set) entry.getValue()).c.iterator();
                while (it2.hasNext()) {
                    accfVar.a((acce) it2.next());
                }
            }
            accg accgVar2 = (accg) accfVar.v();
            try {
                int i = accgVar2.memoizedSerializedSize;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(accgVar2.getClass()).a(accgVar2);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(accgVar2.getClass()).a(accgVar2);
                        if (iA >= 0) {
                            accgVar2.memoizedSerializedSize = (Integer.MIN_VALUE & accgVar2.memoizedSerializedSize) | iA;
                        } else {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(accgVar2.getClass()).m(accgVar2, abwa.a(abvwVar));
                abvwVar.K();
                return bArr;
            } catch (IOException e) {
                throw new RuntimeException(a.C(accgVar2, "byte array"), e);
            }
        } catch (SQLiteException | IllegalStateException e2) {
            ((zdv) ((zdv) ((zdv) c.c()).p(e2)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseImpl", "getCorpusStats", (char) 1074, "GellerDatabaseImpl.java")).u("GetCorpusStats failed");
            e(e2);
            return new byte[0];
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:133|28)|(5:30|(1:32)(1:33)|34|(1:36)|37)(4:39|(3:134|41|(3:43|(1:45)|46)(2:48|(17:50|(4:52|(1:54)(1:55)|56|(2:58|(1:60)(2:61|62)))|63|(1:65)(1:66)|67|(1:69)|70|(1:72)|73|(1:75)(1:76)|77|(1:79)|80|(1:82)|83|(1:85)|86)(4:87|(1:89)(1:90)|91|(4:93|(1:95)(1:96)|97|(1:99)(1:100))(3:102|136|103))))(0)|104|122)|47|136|103|104|122) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163 A[Catch: SQLiteException -> 0x02c9, IllegalStateException -> 0x02cb, all -> 0x02cd, TryCatch #8 {all -> 0x02cd, blocks: (B:28:0x00a8, B:30:0x00b1, B:32:0x00c7, B:34:0x00ce, B:36:0x00e1, B:37:0x00e4, B:103:0x02be, B:120:0x02d6, B:33:0x00cc, B:41:0x010f, B:43:0x0119, B:45:0x0139, B:46:0x013c, B:48:0x0163, B:50:0x0167, B:52:0x0173, B:54:0x0177, B:56:0x017e, B:58:0x0186, B:60:0x018c, B:61:0x0198, B:62:0x019f, B:55:0x017c, B:63:0x01a0, B:65:0x01b6, B:67:0x01bd, B:69:0x01c7, B:70:0x01ca, B:72:0x01d6, B:73:0x01e1, B:75:0x01ea, B:77:0x01f1, B:79:0x01fb, B:80:0x01fe, B:82:0x020a, B:83:0x0215, B:85:0x0228, B:86:0x022b, B:76:0x01ef, B:66:0x01bb, B:89:0x0254, B:91:0x025b, B:93:0x0260, B:95:0x0281, B:97:0x0288, B:99:0x02a0, B:100:0x02ae, B:96:0x0286, B:90:0x0259), top: B:133:0x00a8 }] */
    @Override // com.google.android.libraries.geller.portable.database.GellerDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long softDelete(java.lang.String r20, byte[] r21) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ooh.softDelete(java.lang.String, byte[]):long");
    }
}
