package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qau {
    public static final tvn a = tvn.n("GnpSdk");

    public static int a(Cursor cursor, String str) throws qat {
        try {
            return cursor.getColumnIndexOrThrow(str);
        } catch (IllegalArgumentException e) {
            throw new qat(str, e);
        }
    }

    public static ImmutableList b(sfz sfzVar, String str, String[] strArr) {
        int length = strArr.length;
        if (length <= 900) {
            rzy rzyVar = new rzy((short[]) null);
            if (!c(sfzVar)) {
                rzyVar.E(sfzVar.a, sfzVar.a());
                rzyVar.D(" AND ");
            }
            rzyVar.E(g(str, length), strArr);
            return ImmutableList.of(rzyVar.C());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (true) {
            int length2 = strArr.length;
            if (i >= length2) {
                return builder.build();
            }
            int i2 = i + 900;
            String[] strArr2 = (String[]) Arrays.copyOfRange(strArr, i, Math.min(i2, length2));
            rzy rzyVar2 = new rzy((short[]) null);
            if (!c(sfzVar)) {
                rzyVar2.E(sfzVar.a, sfzVar.a());
                rzyVar2.D(" AND ");
            }
            rzyVar2.E(g(str, strArr2.length), strArr2);
            builder.add((ImmutableList.Builder) rzyVar2.C());
            i = i2;
        }
    }

    public static boolean c(sfz sfzVar) {
        return sfzVar == null || sfzVar.a.isEmpty();
    }

    public static void d(SQLiteDatabase sQLiteDatabase, String str, String str2) throws SQLException {
        rzy rzyVar = new rzy((short[]) null);
        rzyVar.D("ALTER TABLE ");
        rzyVar.D("threads");
        rzyVar.D(" ADD COLUMN ");
        rzyVar.D(str);
        rzyVar.D(" ");
        rzyVar.D(str2);
        sfz sfzVarC = rzyVar.C();
        sQLiteDatabase.execSQL(sfzVarC.a, sfzVarC.a());
    }

    public static vvj e(Cursor cursor, vvj vvjVar, String str) {
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null) {
                return vvjVar.dZ().f(blob).r();
            }
            return null;
        } catch (vuq e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessage", 153, "DatabaseHelper.java")).B("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
            return null;
        }
    }

    public static List f(Cursor cursor, vvj vvjVar, String str) {
        qrc qrcVar;
        ArrayList arrayList = new ArrayList();
        try {
            byte[] blob = cursor.getBlob(a(cursor, str));
            if (blob != null && (qrcVar = (qrc) ((vtw) qrc.a.m().f(blob)).r()) != null) {
                for (vsl vslVar : qrcVar.b) {
                    vvi vviVarDZ = vvjVar.dZ();
                    vviVarDZ.m(vslVar.c);
                    arrayList.add(vviVarDZ.r());
                }
            }
            return arrayList;
        } catch (vuq e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "safeParseMessageList", 176, "DatabaseHelper.java")).B("Error parsing column %s for notification %s", str, cursor.getString(a(cursor, "thread_id")));
            return arrayList;
        }
    }

    private static String g(String str, int i) {
        if (i <= 0 || TextUtils.isEmpty(str)) {
            ((tvk) ((tvk) ((tvk) a.g()).i(new Exception())).j("com/google/android/libraries/notifications/internal/storage/impl/DatabaseHelper", "getInClause", 136, "DatabaseHelper.java")).x("Error creating IN clause for number: [%d], column [%s]", i, str);
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" IN (");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append("?,");
        }
        sb.append("?)");
        return sb.toString();
    }
}
