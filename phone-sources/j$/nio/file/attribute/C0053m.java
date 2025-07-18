package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0053m implements InterfaceC0055o {
    public final /* synthetic */ DosFileAttributes a;

    public final /* synthetic */ boolean a() {
        return this.a.isArchive();
    }

    public final /* synthetic */ boolean b() {
        return this.a.isHidden();
    }

    public final /* synthetic */ boolean c() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0060u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean d() {
        return this.a.isSystem();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof C0053m) {
            obj = ((C0053m) obj).a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC0060u.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC0060u.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
