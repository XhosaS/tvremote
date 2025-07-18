package defpackage;

import android.database.sqlite.SQLiteProgram;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bsi implements brs {
    public final SQLiteProgram a;

    public bsi(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.brs
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.brs
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.brs
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.brs
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.brs
    public final void e(int i, String str) {
        this.a.bindString(i, str);
    }
}
