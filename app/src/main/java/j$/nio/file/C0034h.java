package j$.nio.file;

import j$.nio.file.attribute.Y;
import j$.nio.file.attribute.Z;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0034h extends FileSystem {
    public final /* synthetic */ AbstractC0035i a;

    public /* synthetic */ C0034h(AbstractC0035i abstractC0035i) {
        this.a = abstractC0035i;
    }

    public static /* synthetic */ FileSystem a(AbstractC0035i abstractC0035i) {
        if (abstractC0035i == null) {
            return null;
        }
        return abstractC0035i instanceof C0033g ? ((C0033g) abstractC0035i).a : new C0034h(abstractC0035i);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AbstractC0035i abstractC0035i = this.a;
        if (obj instanceof C0034h) {
            obj = ((C0034h) obj).a;
        }
        return abstractC0035i.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.a();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return r.i(this.a.b(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ PathMatcher getPathMatcher(String str) {
        y yVarC = this.a.c(str);
        if (yVarC == null) {
            return null;
        }
        return yVarC instanceof w ? ((w) yVarC).a : new x(yVarC);
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new C0046u(this.a.d());
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.e();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.desugar.sun.nio.fs.g gVarF = this.a.f();
        int i = Z.b;
        if (gVarF == null) {
            return null;
        }
        return gVarF instanceof Y ? ((Y) gVarF).a : new Z(gVarF);
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
        return P.a(this.a.h());
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
