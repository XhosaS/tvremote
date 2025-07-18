package j$.nio.file;

import j$.lang.Iterable$EL;
import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0079q implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    public /* synthetic */ C0079q(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path i(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C0078p ? ((C0078p) path).a : new C0079q(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(AbstractC0040a.g(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof C0079q) {
            obj = ((C0079q) obj).a;
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
        return C0070h.a(this.a.getFileSystem());
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
        return new u(this.a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return i(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return L.a(this.a.f(N.a(watchService), A.i(kindArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return i(this.a.y(C0078p.i(path)));
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
    public final /* synthetic */ Spliterator<java.nio.file.Path> spliterator() {
        return j$.util.J.a(Iterable$EL.spliterator(this.a));
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
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return i(this.a.k(A.h(linkOptionArr)));
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
        return this.a.compareTo(C0078p.i(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.s(C0078p.i(path));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        return L.a(this.a.c(N.a(watchService), A.i(kindArr), A.j(modifierArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return i(this.a.j(C0078p.i(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return i(this.a.u(C0078p.i(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.q(C0078p.i(path));
    }
}
