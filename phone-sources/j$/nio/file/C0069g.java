package j$.nio.file;

import j$.nio.file.attribute.W;
import j$.nio.file.attribute.X;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0069g extends AbstractC0071i {
    public final /* synthetic */ FileSystem a;

    public C0069g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ AbstractC0071i k(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0070h ? ((C0070h) fileSystem).a : new C0069g(fileSystem);
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ Iterable a() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ Path b(String str, String[] strArr) {
        return C0078p.i(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ x c(String str) {
        PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof w ? ((w) pathMatcher).a : new v(pathMatcher);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    @Override // j$.nio.file.AbstractC0071i
    public final Iterable d() {
        return new C0081t(this.a.getRootDirectories());
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ String e() {
        return this.a.getSeparator();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof C0069g) {
            obj = ((C0069g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ j$.desugar.sun.nio.fs.g f() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return userPrincipalLookupService instanceof X ? ((X) userPrincipalLookupService).a : new W(userPrincipalLookupService);
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ boolean g() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ P h() {
        return N.a(this.a.newWatchService());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ j$.nio.file.spi.c i() {
        FileSystemProvider fileSystemProviderProvider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (fileSystemProviderProvider == null) {
            return null;
        }
        return fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.AbstractC0071i
    public final /* synthetic */ Set j() {
        return this.a.supportedFileAttributeViews();
    }
}
