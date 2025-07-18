package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* loaded from: classes4.dex */
public final /* synthetic */ class M implements PosixFileAttributes {
    public final /* synthetic */ N a;

    public /* synthetic */ M(N n) {
        this.a = n;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return AbstractC0060u.c(((L) this.a).creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        N n = this.a;
        if (obj instanceof M) {
            obj = ((M) obj).a;
        }
        return n.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return ((L) this.a).fileKey();
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ GroupPrincipal group() {
        return G.a(((L) this.a).a());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((L) this.a).isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((L) this.a).isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((L) this.a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((L) this.a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return AbstractC0060u.c(((L) this.a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return AbstractC0060u.c(((L) this.a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ UserPrincipal owner() {
        return U.a(((L) this.a).b());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ Set permissions() {
        return AbstractC0040a.m(((L) this.a).c());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((L) this.a).size();
    }
}
