package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: j$.nio.file.attribute.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0060u {
    public static r a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return d(fileAttribute.value()) ? new C0058s(fileAttribute) : fileAttribute instanceof C0057q ? ((C0057q) fileAttribute).a : new C0056p(fileAttribute);
    }

    public static FileTime b(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new FileTime(millis);
    }

    public static java.nio.file.attribute.FileTime c(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static boolean d(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof O) || (next instanceof PosixFilePermission);
    }
}
