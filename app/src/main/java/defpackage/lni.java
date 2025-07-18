package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lni implements AutoCloseable {
    public lni(String str) {
        Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Trace.endSection();
    }
}
