package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0064b;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.attribute.InterfaceC0047g;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b implements InterfaceC0047g {
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

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        long jConvert;
        if (fileTime == null && fileTime2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().i().a(path, EnumC0064b.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fileTime.getClass();
        Objects.a(timeUnit, "unit");
        if (timeUnit != null) {
            jConvert = timeUnit.convert(fileTime.a, timeUnit);
        } else {
            long jConvert2 = timeUnit.convert(fileTime.b.getEpochSecond(), TimeUnit.SECONDS);
            if (jConvert2 == Long.MIN_VALUE || jConvert2 == Long.MAX_VALUE) {
                jConvert = jConvert2;
            } else {
                long jConvert3 = timeUnit.convert(fileTime.b.getNano(), TimeUnit.NANOSECONDS);
                long j = jConvert2 + jConvert3;
                jConvert = ((jConvert3 ^ j) & (jConvert2 ^ j)) < 0 ? jConvert2 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j;
            }
        }
        if (!file.setLastModified(jConvert)) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.InterfaceC0044d
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final BasicFileAttributes readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().i().a(path, new EnumC0064b[0]);
        File file = path.toFile();
        long jLastModified = file.lastModified();
        Objects.a(TimeUnit.MILLISECONDS, "unit");
        FileTime fileTime = new FileTime(jLastModified);
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(fileTime, fileTime, fileTime, zIsFile, zIsDirectory, z, (zIsFile || zIsDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
