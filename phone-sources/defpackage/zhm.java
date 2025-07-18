package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface zhm extends Closeable, Flushable {
    zhq b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void eW(zgk zgkVar, long j);

    void flush();
}
