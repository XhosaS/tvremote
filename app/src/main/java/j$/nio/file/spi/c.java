package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.desugar.sun.nio.fs.h;
import j$.nio.file.AbstractC0035i;
import j$.nio.file.B;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0028b;
import j$.nio.file.EnumC0038l;
import j$.nio.file.Files;
import j$.nio.file.InterfaceC0041o;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0012j;
import j$.nio.file.attribute.InterfaceC0020s;
import j$.nio.file.attribute.InterfaceC0026y;
import j$.nio.file.z;
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

/* loaded from: classes3.dex */
public abstract class c {
    public static final Set a = g.D(new Object[]{z.CREATE, z.TRUNCATE_EXISTING, z.WRITE});

    public c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, EnumC0038l... enumC0038lArr);

    public abstract void a(Path path, EnumC0028b... enumC0028bArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, InterfaceC0020s... interfaceC0020sArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, InterfaceC0020s... interfaceC0020sArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract InterfaceC0026y h(Path path, Class cls, EnumC0038l... enumC0038lArr);

    public abstract B i(Path path);

    public abstract AbstractC0035i j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.c p(Path path, Set set, ExecutorService executorService, InterfaceC0020s... interfaceC0020sArr);

    public abstract SeekableByteChannel q(Path path, Set set, InterfaceC0020s... interfaceC0020sArr);

    public abstract DirectoryStream r(Path path, h hVar);

    public abstract FileChannel s(Path path, Set set, InterfaceC0020s... interfaceC0020sArr);

    public AbstractC0035i t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract AbstractC0035i u(URI uri, Map map);

    public InputStream v(Path path, InterfaceC0041o... interfaceC0041oArr) {
        Set set;
        if (interfaceC0041oArr.length > 0) {
            for (InterfaceC0041o interfaceC0041o : interfaceC0041oArr) {
                if (interfaceC0041o == z.APPEND || interfaceC0041o == z.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(interfaceC0041o) + "' not allowed");
                }
            }
        }
        int i = Files.a;
        if (interfaceC0041oArr.length == 0) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC0041oArr);
            set = hashSet;
        }
        return Channels.newInputStream(Files.c(path).q(path, set, new InterfaceC0020s[0]));
    }

    public OutputStream w(Path path, InterfaceC0041o... interfaceC0041oArr) {
        Set set;
        if (interfaceC0041oArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC0041o interfaceC0041o : interfaceC0041oArr) {
                if (interfaceC0041o == z.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC0041o);
            }
            hashSet.add(z.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new InterfaceC0020s[0]));
    }

    public abstract InterfaceC0012j x(Path path, Class cls, EnumC0038l... enumC0038lArr);

    public abstract Map y(Path path, String str, EnumC0038l... enumC0038lArr);

    public abstract Path z(Path path);
}
