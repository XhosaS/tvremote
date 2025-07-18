package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0016n implements InterfaceC0018p {
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

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ G creationTime() {
        return AbstractC0023v.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean d() {
        return this.a.isSystem();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof C0016n) {
            obj = ((C0016n) obj).a;
        }
        return dosFileAttributes.equals(obj);
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
