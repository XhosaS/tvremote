package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ans {
    public static final ans a = new ans();

    private ans() {
    }

    private final IOException b(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public final IOException a(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? b(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : parentFile.canWrite() ? b(file, iOException) : b(file, iOException) : b(file, iOException);
    }
}
