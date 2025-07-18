package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uro implements Closeable {
    final SQLiteDatabase a;
    final /* synthetic */ urq b;

    public uro(urq urqVar, SQLiteDatabase sQLiteDatabase) {
        this.b = urqVar;
        this.a = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        urq urqVar = this.b;
        synchronized (urqVar.b) {
            int i = urqVar.c - 1;
            urqVar.c = i;
            if (i == 0) {
                this.a.close();
            }
        }
    }
}
