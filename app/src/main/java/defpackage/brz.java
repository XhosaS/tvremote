package defpackage;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brz implements brm {
    public static final bry a = new bry();
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final agpc d = agpd.a(3, new agum() { // from class: brw
        @Override // defpackage.agum
        public final Object a() {
            bry bryVar = brz.a;
            try {
                Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public static final agpc e = agpd.a(3, new agum() { // from class: brx
        @Override // defpackage.agum
        public final Object a() {
            Class<?> returnType;
            bry bryVar = brz.a;
            try {
                Method methodB = brz.a.b();
                if (methodB == null || (returnType = methodB.getReturnType()) == null) {
                    return null;
                }
                Class<?> cls = Integer.TYPE;
                return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
            } catch (Throwable unused) {
                return null;
            }
        }
    });
    public final SQLiteDatabase f;

    public brz(SQLiteDatabase sQLiteDatabase) {
        this.f = sQLiteDatabase;
    }

    @Override // defpackage.brm
    public final boolean a() {
        return this.f.isOpen();
    }

    @Override // defpackage.brm
    public final bsj b(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.f.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new bsj(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.brm
    public final void c(Object[] objArr) throws SQLException {
        this.f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }
}
