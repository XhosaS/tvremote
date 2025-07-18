package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* renamed from: j$.nio.file.attribute.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0048h implements BasicFileAttributes {
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes a;

    public /* synthetic */ C0048h(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ BasicFileAttributes a(java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0049i) {
            return ((C0049i) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            DosFileAttributes dosFileAttributes = (DosFileAttributes) basicFileAttributes;
            return dosFileAttributes instanceof C0054n ? ((C0054n) dosFileAttributes).a : new C0053m(dosFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C0048h(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof M ? ((M) posixFileAttributes).a : new L(posixFileAttributes);
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0060u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.attribute.BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0048h) {
            obj = ((C0048h) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
