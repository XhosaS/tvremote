package j$.nio.file.attribute;

import j$.nio.file.AbstractC0002a;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class N implements P {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ N(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    public final /* synthetic */ J a() {
        return H.a(this.a.group());
    }

    public final /* synthetic */ X b() {
        return V.a(this.a.owner());
    }

    public final /* synthetic */ Set c() {
        return AbstractC0002a.m(this.a.permissions());
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ G creationTime() {
        return AbstractC0023v.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof N) {
            obj = ((N) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ G lastAccessTime() {
        return AbstractC0023v.b(this.a.lastAccessTime());
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ G lastModifiedTime() {
        return AbstractC0023v.b(this.a.lastModifiedTime());
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
