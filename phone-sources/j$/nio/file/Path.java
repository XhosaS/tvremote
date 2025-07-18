package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes4.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, T {
    M c(P p, D[] dArr, G... gArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    M f(P p, D... dArr);

    Path getFileName();

    AbstractC0071i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    Path j(Path path);

    Path k(LinkOption... linkOptionArr);

    Path normalize();

    int o(Path path);

    boolean q(Path path);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean s(Path path);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    Path u(Path path);

    Path y(Path path);
}
