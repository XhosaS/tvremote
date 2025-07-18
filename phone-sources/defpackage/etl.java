package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etl implements Closeable {
    public final Cursor a;

    public etl(Cursor cursor) {
        this.a = cursor;
    }

    public final etn a() {
        return etm.b(this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
