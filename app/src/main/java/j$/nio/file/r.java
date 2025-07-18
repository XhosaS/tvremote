package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterators;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    public /* synthetic */ r(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path i(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C0043q ? ((C0043q) path).a : new r(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(AbstractC0002a.g(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return i(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C0034h.a(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return i(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return i(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return i(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new v(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return i(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return M.a(this.a.f(O.a(watchService), B.i(kindArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return i(this.a.A(C0043q.i(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return i(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return i(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable
    public final Spliterator<java.nio.file.Path> spliterator() {
        j$.util.Spliterator nVar;
        j$.util.Spliterator spliterator$default$spliterator;
        Iterable iterable = this.a;
        if (iterable instanceof j$.lang.a) {
            spliterator$default$spliterator = ((j$.lang.a) iterable).spliterator();
        } else if (iterable instanceof LinkedHashSet) {
            spliterator$default$spliterator = Spliterators.spliterator((LinkedHashSet) iterable, 17);
        } else {
            if (iterable instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) iterable;
                nVar = new j$.util.u(sortedSet, sortedSet);
            } else if (iterable instanceof Set) {
                spliterator$default$spliterator = Spliterators.spliterator((Set) iterable, 1);
            } else if (iterable instanceof List) {
                spliterator$default$spliterator = List.CC.$default$spliterator((java.util.List) iterable);
            } else if (iterable instanceof Collection) {
                spliterator$default$spliterator = Collection.CC.$default$spliterator((java.util.Collection) iterable);
            } else {
                Iterator it = iterable.iterator();
                it.getClass();
                nVar = new j$.time.format.n(it);
            }
            spliterator$default$spliterator = nVar;
        }
        return j$.util.H.a(spliterator$default$spliterator);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return i(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return i(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(LinkOption[] linkOptionArr) {
        return i(this.a.k(B.h(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(C0043q.i(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.s(C0043q.i(path));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return M.a(this.a.c(O.a(watchService), B.i(kindArr), B.j(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return i(this.a.j(C0043q.i(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return i(this.a.u(C0043q.i(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.p(C0043q.i(path));
    }
}
