package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class upq extends SQLiteException {
    public upq(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
