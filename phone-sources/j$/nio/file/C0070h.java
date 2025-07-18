package j$.nio.file;

import j$.nio.file.attribute.W;
import j$.nio.file.attribute.X;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0070h extends FileSystem {
    public final /* synthetic */ AbstractC0071i a;

    public /* synthetic */ C0070h(AbstractC0071i abstractC0071i) {
        this.a = abstractC0071i;
    }

    public static /* synthetic */ FileSystem a(AbstractC0071i abstractC0071i) {
        if (abstractC0071i == null) {
            return null;
        }
        return abstractC0071i instanceof C0069g ? ((C0069g) abstractC0071i).a : new C0070h(abstractC0071i);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0071i abstractC0071i = this.a;
        if (obj instanceof C0070h) {
            obj = ((C0070h) obj).a;
        }
        return abstractC0071i.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return C0079q.i(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        x xVarC = this.a.c(str);
        if (xVarC == null) {
            return null;
        }
        return xVarC instanceof v ? ((v) xVarC).a : new w(xVarC);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C0081t(this.a.d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.desugar.sun.nio.fs.g gVarF = this.a.f();
        int i = X.b;
        if (gVarF == null) {
            return null;
        }
        return gVarF instanceof W ? ((W) gVarF).a : new X(gVarF);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.g();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        return O.a(this.a.h());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c cVarI = this.a.i();
        int i = j$.nio.file.spi.b.b;
        if (cVarI == null) {
            return null;
        }
        return cVarI instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) cVarI).b : new j$.nio.file.spi.b(cVarI);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.j();
    }
}
