package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.A;
import j$.nio.file.AbstractC0040a;
import j$.nio.file.AbstractC0071i;
import j$.nio.file.C0067e;
import j$.nio.file.C0068f;
import j$.nio.file.C0069g;
import j$.nio.file.C0075m;
import j$.nio.file.C0078p;
import j$.nio.file.C0079q;
import j$.nio.file.C0080s;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0064b;
import j$.nio.file.InterfaceC0076n;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.C0041a;
import j$.nio.file.attribute.C0042b;
import j$.nio.file.attribute.C0045e;
import j$.nio.file.attribute.C0046f;
import j$.nio.file.attribute.C0048h;
import j$.nio.file.attribute.C0050j;
import j$.nio.file.attribute.C0051k;
import j$.nio.file.attribute.C0061v;
import j$.nio.file.attribute.C0062w;
import j$.nio.file.attribute.I;
import j$.nio.file.attribute.InterfaceC0063x;
import j$.nio.file.attribute.J;
import j$.nio.file.attribute.P;
import j$.nio.file.attribute.Q;
import j$.nio.file.attribute.r;
import j$.nio.file.attribute.y;
import j$.nio.file.attribute.z;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) throws IOException {
        this.b.setAttribute(C0079q.i(path), str, AbstractC0040a.k(obj), A.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, EnumC0064b[] enumC0064bArr) throws IOException {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = C0079q.i(path);
        AccessMode[] accessModeArr = null;
        if (enumC0064bArr != null) {
            int length = enumC0064bArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0064b enumC0064b = enumC0064bArr[i];
                accessModeArr2[i] = enumC0064b == null ? null : enumC0064b == EnumC0064b.READ ? AccessMode.READ : enumC0064b == EnumC0064b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(pathI, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.copy(C0079q.i(path), C0079q.i(path2), g.E(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, r[] rVarArr) throws IOException {
        this.b.createDirectory(C0079q.i(path), g.F(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) throws IOException {
        this.b.createLink(C0079q.i(path), C0079q.i(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, r[] rVarArr) throws IOException {
        this.b.createSymbolicLink(C0079q.i(path), C0079q.i(path2), g.F(rVarArr));
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
        this.b.delete(C0079q.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(C0079q.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InterfaceC0063x h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(C0079q.i(path), AbstractC0040a.h(cls), A.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof C0062w) {
            return ((C0062w) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            if (basicFileAttributeView instanceof C0046f) {
                return ((C0046f) basicFileAttributeView).a;
            }
            if (basicFileAttributeView instanceof DosFileAttributeView) {
                DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) basicFileAttributeView;
                return dosFileAttributeView instanceof C0051k ? ((C0051k) dosFileAttributeView).a : new C0050j(dosFileAttributeView);
            }
            if (!(basicFileAttributeView instanceof PosixFileAttributeView)) {
                return new C0045e(basicFileAttributeView);
            }
            PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) basicFileAttributeView;
            return posixFileAttributeView instanceof J ? ((J) posixFileAttributeView).a : new I(posixFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            if (!(fileAttributeView instanceof UserDefinedFileAttributeView)) {
                return new C0061v(fileAttributeView);
            }
            UserDefinedFileAttributeView userDefinedFileAttributeView = (UserDefinedFileAttributeView) fileAttributeView;
            return userDefinedFileAttributeView instanceof Q ? ((Q) userDefinedFileAttributeView).a : new P(userDefinedFileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        if (fileOwnerAttributeView instanceof z) {
            return ((z) fileOwnerAttributeView).a;
        }
        if (fileOwnerAttributeView instanceof AclFileAttributeView) {
            AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) fileOwnerAttributeView;
            return aclFileAttributeView instanceof C0042b ? ((C0042b) aclFileAttributeView).a : new C0041a(aclFileAttributeView);
        }
        if (!(fileOwnerAttributeView instanceof PosixFileAttributeView)) {
            return new y(fileOwnerAttributeView);
        }
        PosixFileAttributeView posixFileAttributeView2 = (PosixFileAttributeView) fileOwnerAttributeView;
        return posixFileAttributeView2 instanceof J ? ((J) posixFileAttributeView2).a : new I(posixFileAttributeView2);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ A i(Path path) throws IOException {
        FileStore fileStore = this.b.getFileStore(C0079q.i(path));
        if (fileStore == null) {
            return null;
        }
        return fileStore instanceof C0068f ? ((C0068f) fileStore).a : new C0067e(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0071i j(URI uri) {
        return C0069g.k(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return C0078p.i(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(C0079q.i(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(C0079q.i(path), C0079q.i(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) throws IOException {
        this.b.move(C0079q.i(path), C0079q.i(path2), g.E(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, r[] rVarArr) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelNewAsynchronousFileChannel = this.b.newAsynchronousFileChannel(C0079q.i(path), AbstractC0040a.l(set), executorService, g.F(rVarArr));
        if (asynchronousFileChannelNewAsynchronousFileChannel == null) {
            return null;
        }
        return asynchronousFileChannelNewAsynchronousFileChannel instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelNewAsynchronousFileChannel).a : new j$.nio.channels.a(asynchronousFileChannelNewAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, r[] rVarArr) {
        return this.b.newByteChannel(C0079q.i(path), AbstractC0040a.l(set), g.F(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, h hVar) {
        return new C0080s(this.b.newDirectoryStream(C0079q.i(path), new h(1, hVar)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, r[] rVarArr) {
        return this.b.newFileChannel(C0079q.i(path), AbstractC0040a.l(set), g.F(rVarArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0071i t(Path path, Map map) {
        return C0069g.k(this.b.newFileSystem(C0079q.i(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ AbstractC0071i u(URI uri, Map map) {
        return C0069g.k(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, InterfaceC0076n[] interfaceC0076nArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = C0079q.i(path);
        if (interfaceC0076nArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0076nArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0075m.a(interfaceC0076nArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newInputStream(pathI, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, InterfaceC0076n[] interfaceC0076nArr) {
        OpenOption[] openOptionArr;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path pathI = C0079q.i(path);
        if (interfaceC0076nArr == null) {
            openOptionArr = null;
        } else {
            int length = interfaceC0076nArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = C0075m.a(interfaceC0076nArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        return fileSystemProvider.newOutputStream(pathI, openOptionArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0048h.a(this.b.readAttributes(C0079q.i(path), AbstractC0040a.i(cls), A.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0040a.j(this.b.readAttributes(C0079q.i(path), str, A.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return C0078p.i(this.b.readSymbolicLink(C0079q.i(path)));
    }
}
