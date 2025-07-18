package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zcn implements Closeable {
    public abstract long a();

    public abstract zcg b();

    public abstract zgm c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zgm zgmVarC = c();
        byte[] bArr = zcr.a;
        a.af(zgmVarC);
    }
}
