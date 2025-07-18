package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whb {
    public final String a(String str) {
        return str == null ? "103243289" : "103243289_".concat(new agyu("[^A-Za-z0-9\\-_:]").a(str, "_"));
    }

    public final void b(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }
}
