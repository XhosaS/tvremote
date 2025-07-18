package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0028b;
import j$.nio.file.Path;
import j$.nio.file.attribute.G;
import j$.nio.file.attribute.InterfaceC0009g;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class b implements InterfaceC0009g {
    public static final HashSet b;
    public final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = q.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final void a(G g, G g2, G g3) {
        long jConvert;
        if (g == null && g2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().i().a(path, EnumC0028b.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        g.getClass();
        Objects.a(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = timeUnit.convert(g.a, timeUnit);
        } else {
            long jConvert2 = timeUnit.convert(g.b.getEpochSecond(), TimeUnit.SECONDS);
            if (jConvert2 == Long.MIN_VALUE || jConvert2 == Long.MAX_VALUE) {
                jConvert = jConvert2;
            } else {
                long jConvert3 = timeUnit.convert(g.b.getNano(), TimeUnit.NANOSECONDS);
                long j = jConvert2 + jConvert3;
                jConvert = ((jConvert3 ^ j) & (jConvert2 ^ j)) < 0 ? jConvert2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j;
            }
        }
        if (!file.setLastModified(jConvert)) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.InterfaceC0006d
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final InterfaceC0012j readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().i().a(path, new EnumC0028b[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.a(TimeUnit.MILLISECONDS, "unit");
        G g = new G(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(g, g, g, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
