package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.A;
import j$.nio.file.AbstractC0040a;
import j$.nio.file.C0065c;
import j$.nio.file.C0067e;
import j$.nio.file.C0068f;
import j$.nio.file.C0070h;
import j$.nio.file.C0074l;
import j$.nio.file.C0078p;
import j$.nio.file.C0079q;
import j$.nio.file.C0080s;
import j$.nio.file.EnumC0064b;
import j$.nio.file.InterfaceC0076n;
import j$.nio.file.attribute.C0041a;
import j$.nio.file.attribute.C0042b;
import j$.nio.file.attribute.C0045e;
import j$.nio.file.attribute.C0046f;
import j$.nio.file.attribute.C0049i;
import j$.nio.file.attribute.C0050j;
import j$.nio.file.attribute.C0051k;
import j$.nio.file.attribute.C0061v;
import j$.nio.file.attribute.C0062w;
import j$.nio.file.attribute.I;
import j$.nio.file.attribute.InterfaceC0043c;
import j$.nio.file.attribute.InterfaceC0047g;
import j$.nio.file.attribute.InterfaceC0052l;
import j$.nio.file.attribute.InterfaceC0063x;
import j$.nio.file.attribute.J;
import j$.nio.file.attribute.K;
import j$.nio.file.attribute.P;
import j$.nio.file.attribute.Q;
import j$.nio.file.attribute.S;
import j$.nio.file.attribute.y;
import j$.nio.file.attribute.z;
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

/* loaded from: classes4.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        EnumC0064b[] enumC0064bArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0078p.i(path);
        if (accessModeArr == null) {
            enumC0064bArr = null;
        } else {
            int length = accessModeArr.length;
            EnumC0064b[] enumC0064bArr2 = new EnumC0064b[length];
            for (int i = 0; i < length; i++) {
                enumC0064bArr2[i] = AbstractC0040a.a(accessModeArr[i]);
            }
            enumC0064bArr = enumC0064bArr2;
        }
        cVar.a(pathI, enumC0064bArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0078p.i(path);
        j$.nio.file.Path pathI2 = C0078p.i(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0065c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(pathI, pathI2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(C0078p.i(path), g.D(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(C0078p.i(path), C0078p.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(C0078p.i(path), C0078p.i(path2), g.D(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(C0078p.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(C0078p.i(path));
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
        InterfaceC0063x interfaceC0063xH = this.a.h(C0078p.i(path), AbstractC0040a.h(cls), A.h(linkOptionArr));
        if (interfaceC0063xH == null) {
            return null;
        }
        if (interfaceC0063xH instanceof C0061v) {
            return ((C0061v) interfaceC0063xH).a;
        }
        if (interfaceC0063xH instanceof InterfaceC0047g) {
            InterfaceC0047g interfaceC0047g = (InterfaceC0047g) interfaceC0063xH;
            if (interfaceC0047g instanceof C0045e) {
                return ((C0045e) interfaceC0047g).a;
            }
            if (interfaceC0047g instanceof InterfaceC0052l) {
                InterfaceC0052l interfaceC0052l = (InterfaceC0052l) interfaceC0047g;
                return interfaceC0052l instanceof C0050j ? ((C0050j) interfaceC0052l).a : new C0051k(interfaceC0052l);
            }
            if (!(interfaceC0047g instanceof K)) {
                return new C0046f(interfaceC0047g);
            }
            K k = (K) interfaceC0047g;
            return k instanceof I ? ((I) k).a : new J(k);
        }
        if (!(interfaceC0063xH instanceof j$.nio.file.attribute.A)) {
            if (!(interfaceC0063xH instanceof S)) {
                return new C0062w(interfaceC0063xH);
            }
            S s = (S) interfaceC0063xH;
            return s instanceof P ? ((P) s).a : new Q(s);
        }
        j$.nio.file.attribute.A a = (j$.nio.file.attribute.A) interfaceC0063xH;
        if (a instanceof y) {
            return ((y) a).a;
        }
        if (a instanceof InterfaceC0043c) {
            InterfaceC0043c interfaceC0043c = (InterfaceC0043c) a;
            return interfaceC0043c instanceof C0041a ? ((C0041a) interfaceC0043c).a : new C0042b(interfaceC0043c);
        }
        if (!(a instanceof K)) {
            return new z(a);
        }
        K k2 = (K) a;
        return k2 instanceof I ? ((I) k2).a : new J(k2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        A aI = this.a.i(C0078p.i(path));
        int i = C0068f.b;
        if (aI == null) {
            return null;
        }
        return aI instanceof C0067e ? ((C0067e) aI).e : new C0068f(aI);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0070h.a(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return C0079q.i(this.a.k(uri));
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
        return this.a.m(C0078p.i(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(C0078p.i(path), C0078p.i(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0078p.i(path);
        j$.nio.file.Path pathI2 = C0078p.i(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0065c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(pathI, pathI2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.c cVarP = this.a.p(C0078p.i(path), AbstractC0040a.l(set), executorService, g.D(fileAttributeArr));
        int i = j$.nio.channels.b.b;
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarP).a : new j$.nio.channels.b(cVarP);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(C0078p.i(path), AbstractC0040a.l(set), g.D(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new C0080s(this.a.r(C0078p.i(path), new h(1, filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(C0078p.i(path), AbstractC0040a.l(set), g.D(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0070h.a(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0076n[] interfaceC0076nArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0078p.i(path);
        if (openOptionArr == null) {
            interfaceC0076nArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0076n[] interfaceC0076nArr2 = new InterfaceC0076n[length];
            for (int i = 0; i < length; i++) {
                interfaceC0076nArr2[i] = C0074l.a(openOptionArr[i]);
            }
            interfaceC0076nArr = interfaceC0076nArr2;
        }
        return cVar.v(pathI, interfaceC0076nArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        InterfaceC0076n[] interfaceC0076nArr;
        c cVar = this.a;
        j$.nio.file.Path pathI = C0078p.i(path);
        if (openOptionArr == null) {
            interfaceC0076nArr = null;
        } else {
            int length = openOptionArr.length;
            InterfaceC0076n[] interfaceC0076nArr2 = new InterfaceC0076n[length];
            for (int i = 0; i < length; i++) {
                interfaceC0076nArr2[i] = C0074l.a(openOptionArr[i]);
            }
            interfaceC0076nArr = interfaceC0076nArr2;
        }
        return cVar.w(pathI, interfaceC0076nArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0049i.a(this.a.x(C0078p.i(path), AbstractC0040a.i(cls), A.h(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return C0079q.i(this.a.z(C0078p.i(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(C0078p.i(path), str, AbstractC0040a.k(obj), A.h(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0070h.a(this.a.t(C0078p.i(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return AbstractC0040a.j(this.a.y(C0078p.i(path), str, A.h(linkOptionArr)));
    }
}
