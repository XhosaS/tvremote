package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.function.Consumer;

/* renamed from: j$.nio.file.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0078p implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ C0078p(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path i(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C0079q ? ((C0079q) path).a : new C0078p(path);
    }

    @Override // j$.nio.file.Path, j$.nio.file.T
    public final /* synthetic */ M c(P p, D[] dArr, G[] gArr) {
        return K.b(this.a.register(O.a(p), A.l(dArr), A.m(gArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) AbstractC0040a.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof C0078p) {
            obj = ((C0078p) obj).a;
        }
        return path.equals(obj);
    }

    @Override // j$.nio.file.Path, j$.nio.file.T
    public final /* synthetic */ M f(P p, D[] dArr) {
        return K.b(this.a.register(O.a(p), A.l(dArr)));
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
    public final /* synthetic */ AbstractC0071i getFileSystem() {
        return C0069g.k(this.a.getFileSystem());
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
        return new u(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(Path path) {
        return i(this.a.resolve(C0079q.i(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path k(LinkOption[] linkOptionArr) {
        return i(this.a.toRealPath(A.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return i(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    /* renamed from: o */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(C0079q.i(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean q(Path path) {
        return this.a.startsWith(C0079q.i(path));
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
        return this.a.endsWith(C0079q.i(path));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.I.a(this.a.spliterator());
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
        return i(this.a.resolveSibling(C0079q.i(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path y(Path path) {
        return i(this.a.relativize(C0079q.i(path)));
    }
}
