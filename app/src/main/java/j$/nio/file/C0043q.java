package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0043q implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ C0043q(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path i(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof r ? ((r) path).a : new C0043q(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path A(Path path) {
        return i(this.a.relativize(r.i(path)));
    }

    @Override // j$.nio.file.Path, j$.nio.file.U
    public final /* synthetic */ N c(Q q, E[] eArr, H[] hArr) {
        return L.b(this.a.register(P.a(q), B.l(eArr), B.m(hArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) AbstractC0002a.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof C0043q) {
            obj = ((C0043q) obj).a;
        }
        return path.equals(obj);
    }

    @Override // j$.nio.file.Path, j$.nio.file.U
    public final /* synthetic */ N f(Q q, E[] eArr) {
        return L.b(this.a.register(P.a(q), B.l(eArr)));
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return i(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ AbstractC0035i getFileSystem() {
        return C0033g.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return i(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return i(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return i(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new v(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(Path path) {
        return i(this.a.resolve(r.i(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path k(EnumC0038l[] enumC0038lArr) {
        return i(this.a.toRealPath(B.k(enumC0038lArr)));
    }

    @Override // j$.nio.file.Path
    /* renamed from: n */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(r.i(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return i(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean p(Path path) {
        return this.a.startsWith(r.i(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return i(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return i(this.a.resolveSibling(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean s(Path path) {
        return this.a.endsWith(r.i(path));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.G.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return i(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return i(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path u(Path path) {
        return i(this.a.resolveSibling(r.i(path)));
    }
}
