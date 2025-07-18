package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC0002a;
import j$.nio.file.B;
import j$.nio.file.C0029c;
import j$.nio.file.C0031e;
import j$.nio.file.C0032f;
import j$.nio.file.C0034h;
import j$.nio.file.C0039m;
import j$.nio.file.C0043q;
import j$.nio.file.C0045t;
import j$.nio.file.EnumC0028b;
import j$.nio.file.InterfaceC0041o;
import j$.nio.file.attribute.A;
import j$.nio.file.attribute.C0003a;
import j$.nio.file.attribute.C0004b;
import j$.nio.file.attribute.C0007e;
import j$.nio.file.attribute.C0008f;
import j$.nio.file.attribute.C0011i;
import j$.nio.file.attribute.C0013k;
import j$.nio.file.attribute.C0014l;
import j$.nio.file.attribute.C0024w;
import j$.nio.file.attribute.C0025x;
import j$.nio.file.attribute.C0027z;
import j$.nio.file.attribute.InterfaceC0005c;
import j$.nio.file.attribute.InterfaceC0009g;
import j$.nio.file.attribute.InterfaceC0015m;
import j$.nio.file.attribute.InterfaceC0026y;
import j$.nio.file.attribute.K;
import j$.nio.file.attribute.L;
import j$.nio.file.attribute.M;
import j$.nio.file.attribute.S;
import j$.nio.file.attribute.T;
import j$.nio.file.attribute.U;
import j$.nio.file.r;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC0028b[] enumC0028bArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0043q.i(path);
        if (accessModeArr == null) {
            enumC0028bArr = null;
        } else {
            int length = accessModeArr.length;
            EnumC0028b[] enumC0028bArr2 = new EnumC0028b[length];
            for (int i = 0; i < length; i++) {
                enumC0028bArr2[i] = AbstractC0002a.a(accessModeArr[i]);
            }
            enumC0028bArr = enumC0028bArr2;
        }
        cVar.a(pathI, enumC0028bArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0043q.i(path);
        j$.nio.file.Path pathI2 = C0043q.i(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0029c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathI, pathI2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(C0043q.i(path), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(C0043q.i(path), C0043q.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(C0043q.i(path), C0043q.i(path2), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(C0043q.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(C0043q.i(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        InterfaceC0026y interfaceC0026yH = this.a.h(C0043q.i(path), AbstractC0002a.h(cls), B.h(linkOptionArr));
        if (interfaceC0026yH == null) {
            return null;
        }
        if (interfaceC0026yH instanceof C0024w) {
            return ((C0024w) interfaceC0026yH).a;
        }
        if (interfaceC0026yH instanceof InterfaceC0009g) {
            InterfaceC0009g interfaceC0009g = (InterfaceC0009g) interfaceC0026yH;
            if (interfaceC0009g instanceof C0007e) {
                return ((C0007e) interfaceC0009g).a;
            }
            if (interfaceC0009g instanceof InterfaceC0015m) {
                InterfaceC0015m interfaceC0015m = (InterfaceC0015m) interfaceC0009g;
                return interfaceC0015m instanceof C0013k ? ((C0013k) interfaceC0015m).a : new C0014l(interfaceC0015m);
            }
            if (!(interfaceC0009g instanceof M)) {
                return new C0008f(interfaceC0009g);
            }
            M m = (M) interfaceC0009g;
            return m instanceof K ? ((K) m).a : new L(m);
        }
        if (!(interfaceC0026yH instanceof j$.nio.file.attribute.B)) {
            if (!(interfaceC0026yH instanceof U)) {
                return new C0025x(interfaceC0026yH);
            }
            U u = (U) interfaceC0026yH;
            return u instanceof S ? ((S) u).a : new T(u);
        }
        j$.nio.file.attribute.B b2 = (j$.nio.file.attribute.B) interfaceC0026yH;
        if (b2 instanceof C0027z) {
            return ((C0027z) b2).a;
        }
        if (b2 instanceof InterfaceC0005c) {
            InterfaceC0005c interfaceC0005c = (InterfaceC0005c) b2;
            return interfaceC0005c instanceof C0003a ? ((C0003a) interfaceC0005c).a : new C0004b(interfaceC0005c);
        }
        if (!(b2 instanceof M)) {
            return new A(b2);
        }
        M m2 = (M) b2;
        return m2 instanceof K ? ((K) m2).a : new L(m2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        B bI = this.a.i(C0043q.i(path));
        int i = C0032f.b;
        if (bI == null) {
            return null;
        }
        return bI instanceof C0031e ? ((C0031e) bI).e : new C0032f(bI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0034h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return r.i(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(C0043q.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(C0043q.i(path), C0043q.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0043q.i(path);
        j$.nio.file.Path pathI2 = C0043q.i(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0029c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathI, pathI2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarP = this.a.p(C0043q.i(path), AbstractC0002a.l(set), executorService, g.F(fileAttributeArr));
        int i = j$.nio.channels.b.b;
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarP).a : new j$.nio.channels.b(cVarP);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(C0043q.i(path), AbstractC0002a.l(set), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C0045t(this.a.r(C0043q.i(path), new h(1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(C0043q.i(path), AbstractC0002a.l(set), g.F(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0034h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0041o[] interfaceC0041oArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0043q.i(path);
        if (openOptionArr == null) {
            interfaceC0041oArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0041o[] interfaceC0041oArr2 = new InterfaceC0041o[length];
            for (int i = 0; i < length; i++) {
                interfaceC0041oArr2[i] = C0039m.a(openOptionArr[i]);
            }
            interfaceC0041oArr = interfaceC0041oArr2;
        }
        return cVar.v(pathI, interfaceC0041oArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0041o[] interfaceC0041oArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0043q.i(path);
        if (openOptionArr == null) {
            interfaceC0041oArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0041o[] interfaceC0041oArr2 = new InterfaceC0041o[length];
            for (int i = 0; i < length; i++) {
                interfaceC0041oArr2[i] = C0039m.a(openOptionArr[i]);
            }
            interfaceC0041oArr = interfaceC0041oArr2;
        }
        return cVar.w(pathI, interfaceC0041oArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0011i.a(this.a.x(C0043q.i(path), AbstractC0002a.i(cls), B.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return r.i(this.a.z(C0043q.i(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(C0043q.i(path), str, AbstractC0002a.k(obj), B.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0034h.a(this.a.t(C0043q.i(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0002a.j(this.a.y(C0043q.i(path), str, B.h(linkOptionArr)));
    }
}
