package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.A;
import j$.nio.file.AbstractC0071i;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0064b;
import j$.nio.file.Files;
import j$.nio.file.InterfaceC0076n;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.InterfaceC0063x;
import j$.nio.file.attribute.r;
import j$.nio.file.y;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Set a = g.C(new Object[]{y.CREATE, y.TRUNCATE_EXISTING, y.WRITE});

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    public abstract void a(Path path, EnumC0064b... enumC0064bArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, r... rVarArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, r... rVarArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract InterfaceC0063x h(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract A i(Path path);

    public abstract AbstractC0071i j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, r... rVarArr);

    public abstract SeekableByteChannel q(Path path, Set set, r... rVarArr);

    public abstract DirectoryStream r(Path path, h hVar);

    public abstract FileChannel s(Path path, Set set, r... rVarArr);

    public AbstractC0071i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0071i u(URI uri, Map map);

    public InputStream v(Path path, InterfaceC0076n... interfaceC0076nArr) {
        Set set;
        if (interfaceC0076nArr.length > 0) {
            for (InterfaceC0076n interfaceC0076n : interfaceC0076nArr) {
                if (interfaceC0076n == y.APPEND || interfaceC0076n == y.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(interfaceC0076n) + "' not allowed");
                }
            }
        }
        int i = Files.a;
        if (interfaceC0076nArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC0076nArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.c(path).q(path, set, new r[0]));
    }

    public OutputStream w(Path path, InterfaceC0076n... interfaceC0076nArr) {
        Set set;
        if (interfaceC0076nArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC0076n interfaceC0076n : interfaceC0076nArr) {
                if (interfaceC0076n == y.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC0076n);
            }
            hashSet.add(y.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new r[0]));
    }

    public abstract BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr);

    public abstract Map y(Path path, String str, LinkOption... linkOptionArr);

    public abstract Path z(Path path);
}
