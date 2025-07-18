package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0054n implements DosFileAttributes {
    public final /* synthetic */ InterfaceC0055o a;

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return AbstractC0060u.c(((C0053m) this.a).creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0055o interfaceC0055o = this.a;
        if (obj instanceof C0054n) {
            obj = ((C0054n) obj).a;
        }
        return interfaceC0055o.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return ((C0053m) this.a).fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isArchive() {
        return ((C0053m) this.a).a();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return ((C0053m) this.a).isDirectory();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isHidden() {
        return ((C0053m) this.a).b();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return ((C0053m) this.a).isOther();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isReadOnly() {
        return ((C0053m) this.a).c();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return ((C0053m) this.a).isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return ((C0053m) this.a).isSymbolicLink();
    }

    @Override // java.nio.file.attribute.DosFileAttributes
    public final /* synthetic */ boolean isSystem() {
        return ((C0053m) this.a).d();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return AbstractC0060u.c(((C0053m) this.a).lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return AbstractC0060u.c(((C0053m) this.a).lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return ((C0053m) this.a).size();
    }
}
