package j$.desugar.sun.nio.fs;

import java.io.IOException;
import java.nio.channels.FileLock;

/* loaded from: classes2.dex */
public final class b extends FileLock {
    public final FileLock a;

    public b(FileLock fileLock, a aVar) {
        super(aVar, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() throws IOException {
        this.a.release();
    }
}
