package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: j$.nio.file.attribute.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0023v {
    public static InterfaceC0020s a(FileAttribute fileAttribute) {
        if (fileAttribute == null) {
            return null;
        }
        return d(fileAttribute.value()) ? new C0021t(fileAttribute) : fileAttribute instanceof r ? ((r) fileAttribute).a : new C0019q(fileAttribute);
    }

    public static G b(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new G(millis);
    }

    public static FileTime c(G g) {
        long nano;
        if (g == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            nano = timeUnit.toMillis(g.a);
        } else {
            long epochSecond = g.b.getEpochSecond();
            long j = epochSecond * 1000;
            nano = (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) ? (g.b.getNano() / 1000000) + j : epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return FileTime.fromMillis(nano);
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
        return (next instanceof Q) || (next instanceof PosixFilePermission);
    }
}
