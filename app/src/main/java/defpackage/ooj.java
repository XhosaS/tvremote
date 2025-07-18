package defpackage;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ooj {
    public static final zdy a = zdy.h("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil");

    static String a(yqt yqtVar) {
        if (!yqtVar.g()) {
            return "";
        }
        yqtVar.c();
        return String.format("(%s IS NULL)", "delete_status");
    }

    static String b(String str, String str2, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        Iterator it = iterable.iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            sb.append(true != z ? ", " : "(");
            if (next instanceof Number) {
                sb.append(next);
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, String.valueOf(next));
            }
            z = false;
        }
        if (z) {
            sb.append("(");
        }
        sb.append(")");
        return sb.toString();
    }

    static List c(List list) {
        return list.isEmpty() ? yyk.o("") : list;
    }

    static List d(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr, yqt yqtVar, yqt yqtVar2) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = sQLiteDatabase.query(true, str, new String[]{str2}, str3, strArr, null, null, (String) yqtVar.f(), yqtVar2.g() ? ((Integer) yqtVar2.c()).toString() : null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(str2)));
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) ((zdv) a.c()).p(e)).q("com/google/android/libraries/geller/portable/database/GellerDatabaseUtil", "readStringFromTable", '=', "GellerDatabaseUtil.java")).u("Column doesn't exist");
            return arrayList;
        }
    }

    static void e(accn accnVar, acdh acdhVar) throws GellerException {
        if (accnVar.b.size() == 0 && accnVar.c.size() == 0 && acdhVar.k) {
            throw new GellerException(abqb.UNKNOWN, "Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
    }

    static String f(accn accnVar, acdh acdhVar) {
        if (accnVar.b.size() == 0 && accnVar.c.size() == 0 && acdhVar.k) {
            throw new UnsupportedOperationException("Deleting all data via an empty deletion selection is no longer supported. Please use delete_all instead.");
        }
        String strConcat = accnVar.b.size() != 0 ? "".concat(b("timestamp_micro", "IN", accnVar.b)) : "";
        if (accnVar.c.size() == 0) {
            return strConcat;
        }
        if (!strConcat.isEmpty()) {
            strConcat = strConcat.concat(" AND ");
        }
        return strConcat.concat(b("key", "IN", accnVar.c));
    }

    static String g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acby acbyVar = (acby) it.next();
            if (!acbyVar.d.isEmpty() || acbyVar.c != 0) {
                ArrayList arrayList2 = new ArrayList();
                if ((acbyVar.b & 1) != 0) {
                    long j = acbyVar.c;
                    if (j >= 0) {
                        arrayList2.add(b("timestamp_micro", "=", yyk.o(Long.valueOf(j))));
                    }
                }
                if (!acbyVar.d.isEmpty()) {
                    arrayList2.add(b("key", "=", yyk.o(acbyVar.d)));
                }
                arrayList.add(String.format("(%s)", new yqn(" AND ").c(arrayList2)));
            }
        }
        return String.format("(%s)", new yqn(" OR ").c(arrayList));
    }

    static List h(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = Lists.e(list).iterator();
        while (it.hasNext()) {
            arrayList.add(g((List) it.next()));
        }
        return arrayList;
    }

    static String i(List list, List list2) {
        String strConcat = list.isEmpty() ? "" : "".concat(b("timestamp_micro", "IN", list));
        if (list2.isEmpty()) {
            return strConcat;
        }
        if (!strConcat.isEmpty()) {
            strConcat = strConcat.concat(" AND ");
        }
        return strConcat.concat(b("key", "IN", list2));
    }
}
