package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC0002a;
import j$.nio.file.AbstractC0035i;
import j$.nio.file.B;
import j$.nio.file.C0031e;
import j$.nio.file.C0032f;
import j$.nio.file.C0033g;
import j$.nio.file.C0040n;
import j$.nio.file.C0043q;
import j$.nio.file.C0045t;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0028b;
import j$.nio.file.EnumC0038l;
import j$.nio.file.InterfaceC0041o;
import j$.nio.file.Path;
import j$.nio.file.attribute.A;
import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0004b;
import j$.nio.file.attribute.C0007e;
import j$.nio.file.attribute.C0008f;
import j$.nio.file.attribute.C0010h;
import j$.nio.file.attribute.C0013k;
import j$.nio.file.attribute.C0014l;
import j$.nio.file.attribute.C0024w;
import j$.nio.file.attribute.C0025x;
import j$.nio.file.attribute.C0027z;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.nio.file.attribute.InterfaceC0020s;
import j$.nio.file.attribute.InterfaceC0026y;
import j$.nio.file.attribute.K;
import j$.nio.file.attribute.L;
import j$.nio.file.attribute.S;
import j$.nio.file.attribute.T;
import j$.nio.file.r;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, EnumC0038l[] enumC0038lArr) throws IOException {
        this.b.setAttribute(r.i(path), str, AbstractC0002a.k(obj), B.k(enumC0038lArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, EnumC0028b[] enumC0028bArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = r.i(path);
        AccessMode[] accessModeArr = null;
        if (enumC0028bArr != null) {
            int length = enumC0028bArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0028b enumC0028b = enumC0028bArr[i];
                accessModeArr2[i] = enumC0028b == null ? null : enumC0028b == EnumC0028b.READ ? AccessMode.READ : enumC0028b == EnumC0028b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathI, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(r.i(path), r.i(path2), g.G(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, InterfaceC0020s[] interfaceC0020sArr) throws IOException {
        this.b.createDirectory(r.i(path), g.H(interfaceC0020sArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(r.i(path), r.i(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, InterfaceC0020s[] interfaceC0020sArr) throws IOException {
        this.b.createSymbolicLink(r.i(path), r.i(path2), g.H(interfaceC0020sArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof a) {
            obj = ((a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) throws IOException {
        this.b.delete(r.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(r.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InterfaceC0026y h(Path path, Class cls, EnumC0038l[] enumC0038lArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(r.i(path), AbstractC0002a.h(cls), B.k(enumC0038lArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C0025x) {
            return ((C0025x) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C0008f) {
                return ((C0008f) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
                return dosFileAttributeView instanceof C0014l ? ((C0014l) dosFileAttributeView).a : new C0013k(dosFileAttributeView);
            }
            if (!(basicFileAttributeView instanceof PosixFileAttributeView)) {
                return new C0007e(basicFileAttributeView);
            }
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) basicFileAttributeView;
            return posixFileAttributeView instanceof L ? ((L) posixFileAttributeView).a : new K(posixFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            if (!(fileAttributeView instanceof UserDefinedFileAttributeView)) {
                return new C0024w(fileAttributeView);
            }
            UserDefinedFileAttributeView userDefinedFileAttributeView = (UserDefinedFileAttributeView) fileAttributeView;
            return userDefinedFileAttributeView instanceof T ? ((T) userDefinedFileAttributeView).a : new S(userDefinedFileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof A) {
            return ((A) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) fileOwnerAttributeView;
            return aclFileAttributeView instanceof C0004b ? ((C0004b) aclFileAttributeView).a : new C0003a(aclFileAttributeView);
        }
        if (!(fileOwnerAttributeView instanceof PosixFileAttributeView)) {
            return new C0027z(fileOwnerAttributeView);
        }
        PosixFileAttributeView posixFileAttributeView2 = (PosixFileAttributeView) fileOwnerAttributeView;
        return posixFileAttributeView2 instanceof L ? ((L) posixFileAttributeView2).a : new K(posixFileAttributeView2);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ B i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(r.i(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C0032f ? ((C0032f) fileStore).a : new C0031e(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0035i j(URI uri) {
        return C0033g.k(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return C0043q.i(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(r.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(r.i(path), r.i(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(r.i(path), r.i(path2), g.G(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, InterfaceC0020s[] interfaceC0020sArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(r.i(path), AbstractC0002a.l(set), executorService, g.H(interfaceC0020sArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, InterfaceC0020s[] interfaceC0020sArr) {
        return this.b.newByteChannel(r.i(path), AbstractC0002a.l(set), g.H(interfaceC0020sArr));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, h hVar) {
        return new C0045t(this.b.newDirectoryStream(r.i(path), new h(1, hVar)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, InterfaceC0020s[] interfaceC0020sArr) {
        return this.b.newFileChannel(r.i(path), AbstractC0002a.l(set), g.H(interfaceC0020sArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0035i t(Path path, Map map) {
        return C0033g.k(this.b.newFileSystem(r.i(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0035i u(URI uri, Map map) {
        return C0033g.k(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, InterfaceC0041o[] interfaceC0041oArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = r.i(path);
        if (interfaceC0041oArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0041oArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0040n.a(interfaceC0041oArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathI, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, InterfaceC0041o[] interfaceC0041oArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = r.i(path);
        if (interfaceC0041oArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0041oArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0040n.a(interfaceC0041oArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathI, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InterfaceC0012j x(Path path, Class cls, EnumC0038l[] enumC0038lArr) {
        return C0010h.a(this.b.readAttributes(r.i(path), AbstractC0002a.i(cls), B.k(enumC0038lArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, EnumC0038l[] enumC0038lArr) {
        return AbstractC0002a.j(this.b.readAttributes(r.i(path), str, B.k(enumC0038lArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return C0043q.i(this.b.readSymbolicLink(r.i(path)));
    }
}
