package j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* loaded from: classes3.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, U {
    Path A(Path path);

    N c(Q q, E[] eArr, H... hArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    N f(Q q, E... eArr);

    Path getFileName();

    AbstractC0035i getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    boolean isAbsolute();

    Iterator iterator();

    Path j(Path path);

    Path k(EnumC0038l... enumC0038lArr);

    int n(Path path);

    Path normalize();

    boolean p(Path path);

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
}
