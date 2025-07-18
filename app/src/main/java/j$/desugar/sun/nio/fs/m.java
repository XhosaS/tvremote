package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.AbstractC0035i;
import j$.nio.file.B;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0028b;
import j$.nio.file.EnumC0038l;
import j$.nio.file.Files;
import j$.nio.file.InterfaceC0041o;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.G;
import j$.nio.file.attribute.InterfaceC0009g;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.nio.file.attribute.InterfaceC0020s;
import j$.nio.file.attribute.InterfaceC0026y;
import j$.nio.file.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class m extends j$.nio.file.spi.c {
    public final String b;
    public final String c = "/";
    public volatile i d;

    public m(String str) {
        this.b = str;
    }

    public static void B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    public static boolean C(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.c
    public final void A(Path path, String str, Object obj, EnumC0038l... enumC0038lArr) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            str = str.substring(iIndexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((G) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (G) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.c
    public final void a(Path path, EnumC0028b... enumC0028bArr) throws IOException {
        boolean zCanRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC0028b enumC0028b : enumC0028bArr) {
            int i = j.a[enumC0028b.ordinal()];
            if (i == 1) {
                zCanRead = file.canRead();
            } else if (i == 2) {
                zCanRead = file.canWrite();
            } else if (i == 3) {
                zCanRead = file.canExecute();
            }
            z &= zCanRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.c
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new EnumC0038l[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr, 0, 8192);
                    if (i < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.c
    public final void c(Path path, InterfaceC0020s... interfaceC0020sArr) throws NoSuchFileException, FileAlreadyExistsException {
        if (path.getParent() != null && !Files.b(path.getParent(), new EnumC0038l[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void e(Path path, Path path2, InterfaceC0020s... interfaceC0020sArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void f(Path path) throws NoSuchFileException {
        try {
            a(path, new EnumC0028b[0]);
            g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.c
    public final InterfaceC0026y h(Path path, Class cls, EnumC0038l... enumC0038lArr) {
        cls.getClass();
        if (cls == InterfaceC0009g.class) {
            return (InterfaceC0026y) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.c
    public final B i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.c
    public final AbstractC0035i j(URI uri) {
        i iVar;
        B(uri);
        i iVar2 = this.d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.d;
                if (iVar == null) {
                    iVar = new i(this, this.b, this.c);
                    this.d = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.c
    public final Path k(URI uri) {
        byte bA;
        i iVar = this.d;
        String str = this.b;
        String str2 = this.c;
        char[] cArr = p.c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArrCopyOf = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = rawPath.charAt(i);
            if (cCharAt == '%') {
                int i4 = i + 2;
                i += 3;
                bA = (byte) ((p.a(rawPath.charAt(i3)) << 4) | p.a(rawPath.charAt(i4)));
                if (bA == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (cCharAt == 0 || cCharAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                bA = (byte) cCharAt;
                i = i3;
            }
            bArrCopyOf[i2] = bA;
            i2++;
        }
        if (i2 != length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
        }
        return new o(iVar, new String(bArrCopyOf, q.a), str, str2);
    }

    @Override // j$.nio.file.spi.c
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.c
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.c
    public final boolean n(Path path, Path path2) throws IOException {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC0028b[0]);
        a(path2, new EnumC0028b[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) throws FileAlreadyExistsException {
        if (!C(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new EnumC0038l[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, InterfaceC0020s... interfaceC0020sArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final SeekableByteChannel q(Path path, Set set, InterfaceC0020s... interfaceC0020sArr) {
        return s(path, set, interfaceC0020sArr);
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, h hVar) {
        k kVar = new k();
        kVar.a = new l(this, path, hVar);
        return kVar;
    }

    @Override // j$.nio.file.spi.c
    public final FileChannel s(Path path, Set set, InterfaceC0020s... interfaceC0020sArr) throws IOException {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((InterfaceC0041o) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(z.CREATE_NEW) && set.contains(z.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(z.CREATE) && !set.contains(z.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(z.READ) && set.contains(z.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        z zVar = z.APPEND;
        if (set.contains(zVar) && set.contains(z.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        z zVar2 = z.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(zVar2) || set.contains(zVar)) ? set.contains(z.SYNC) ? "rws" : set.contains(z.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(z.TRUNCATE_EXISTING) && set.contains(zVar2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(zVar) && !set.contains(z.DELETE_ON_CLOSE)) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary instanceof e) {
            fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((e) fileChannelConvertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, set.contains(z.DELETE_ON_CLOSE), set.contains(zVar), path);
    }

    @Override // j$.nio.file.spi.c
    public final AbstractC0035i u(URI uri, Map map) {
        B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.c
    public final InterfaceC0012j x(Path path, Class cls, EnumC0038l... enumC0038lArr) {
        if (cls == InterfaceC0012j.class) {
            return (InterfaceC0012j) cls.cast(((InterfaceC0009g) h(path, InterfaceC0009g.class, enumC0038lArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final Map y(Path path, String str, EnumC0038l... enumC0038lArr) {
        String[] strArrSplit;
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            strArrSplit = str.split(",");
        } else {
            String strSubstring = str.substring(0, iIndexOf);
            if (!"basic".equals(strSubstring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + strSubstring + " is not available.");
            }
            strArrSplit = str.substring(iIndexOf + 1).split(",");
        }
        b bVar = new b(path);
        HashSet hashSet = b.b;
        a aVar = new a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : strArrSplit) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                aVar.a.add(str2);
            }
        }
        InterfaceC0012j attributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((c) attributes).h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((c) attributes).c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((c) attributes).b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((c) attributes).a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((c) attributes).i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((c) attributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((c) attributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((c) attributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((c) attributes).g), "isOther");
        }
        return Collections.unmodifiableMap(aVar.b);
    }

    @Override // j$.nio.file.spi.c
    public final Path z(Path path) {
        return new o(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }
}
