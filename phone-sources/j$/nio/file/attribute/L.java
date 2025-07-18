package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* loaded from: classes4.dex */
public final /* synthetic */ class L implements N {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ L(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public final /* synthetic */ H a() {
        return F.a(this.a.group());
    }

    public final /* synthetic */ V b() {
        return T.a(this.a.owner());
    }

    public final /* synthetic */ Set c() {
        return AbstractC0040a.m(this.a.permissions());
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0060u.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return posixFileAttributes.equals(obj);
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
