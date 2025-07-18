package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghu implements ghk {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final yft b = ybn.g(3, new gel(4));
    public static final yft c = ybn.g(3, new gel(5));

    public ghu(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.ghk
    public final Cursor a(ghq ghqVar) {
        final ghs ghsVar = new ghs(ghqVar, 0);
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ght
            /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor, java.lang.Object] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = ghu.a;
                return ghsVar.a(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ghqVar.f(), e, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.ghk
    public final String b() {
        return this.d.getPath();
    }

    @Override // defpackage.ghk
    public final void c() {
        this.d.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.ghk
    public final void d() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.ghk
    public final void e() {
        this.d.endTransaction();
    }

    @Override // defpackage.ghk
    public final void f(String str) throws SQLException {
        this.d.execSQL(str);
    }

    @Override // defpackage.ghk
    public final void g() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.ghk
    public final boolean h() {
        return this.d.inTransaction();
    }

    @Override // defpackage.ghk
    public final boolean i() {
        return this.d.isOpen();
    }

    @Override // defpackage.ghk
    public final gib j(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new gib(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.ghk
    public final void k(Object[] objArr) throws SQLException {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
