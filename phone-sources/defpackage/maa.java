package defpackage;

import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.OperationCanceledException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class maa implements lzz {
    public static final int[] a = {0, 2, 3};
    public static final int[] b = {0, 4, 5};
    public final Executor c;
    public final lyz d;
    private boolean e;
    private boolean f;
    private String[] g;
    private String h;

    public maa(Executor executor, lyz lyzVar) {
        lyzVar.getClass();
        this.d = lyzVar;
        executor.getClass();
        this.c = executor;
    }

    private final synchronized String d(String str, String str2) {
        if (this.e && str2 != null) {
            return "(" + str + ") AND (" + (this.f ? str2.concat(" IS NULL OR ") : "") + str2 + " " + this.h + ")";
        }
        return str;
    }

    @Override // defpackage.lzz
    public final ieg a(lzy lzyVar) {
        if (lzyVar == lzy.a) {
            return ieg.a;
        }
        SQLiteDatabase sQLiteDatabaseB = this.d.b();
        if (sQLiteDatabaseB == null) {
            return ieg.a;
        }
        try {
            boolean z = lzyVar.b;
            String str = lzyVar.c;
            String[] strArr = lzyVar.d;
            String strD = d(lzyVar.f, lzyVar.e);
            String str2 = lzyVar.h;
            String str3 = lzyVar.i;
            String str4 = lzyVar.j;
            int i = lzyVar.k;
            return ieg.f(sQLiteDatabaseB.rawQuery(SQLiteQueryBuilder.buildQueryString(false, str, strArr, strD, str2, null, str4, null), lzyVar.g));
        } catch (OperationCanceledException e) {
            return ieg.b(e);
        }
    }

    @Override // defpackage.lzz
    public final synchronized boolean b() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return true;
    }

    @Override // defpackage.lzz
    public final synchronized boolean c(String[] strArr, boolean z) {
        if (this.e && z == this.f && Arrays.equals(strArr, this.g)) {
            return false;
        }
        this.e = true;
        this.g = strArr;
        this.f = z;
        if (strArr.length == 0) {
            this.h = "IN ()";
        } else {
            StringBuilder sb = new StringBuilder("IN (");
            DatabaseUtils.appendEscapedSQLString(sb, strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(',');
                DatabaseUtils.appendEscapedSQLString(sb, strArr[i]);
            }
            sb.append(')');
            this.h = sb.toString();
        }
        return true;
    }
}
