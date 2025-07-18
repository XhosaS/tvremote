package j$.nio.file.attribute;

/* renamed from: j$.nio.file.attribute.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0049i implements java.nio.file.attribute.BasicFileAttributes {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C0049i(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ java.nio.file.attribute.BasicFileAttributes a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0048h) {
            return ((C0048h) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof InterfaceC0055o) {
            InterfaceC0055o interfaceC0055o = (InterfaceC0055o) basicFileAttributes;
            return interfaceC0055o instanceof C0053m ? ((C0053m) interfaceC0055o).a : new C0054n(interfaceC0055o);
        }
        if (!(basicFileAttributes instanceof N)) {
            return new C0049i(basicFileAttributes);
        }
        N n = (N) basicFileAttributes;
        return n instanceof L ? ((L) n).a : new M(n);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime creationTime() {
        return AbstractC0060u.c(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0049i) {
            obj = ((C0049i) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastAccessTime() {
        return AbstractC0060u.c(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ java.nio.file.attribute.FileTime lastModifiedTime() {
        return AbstractC0060u.c(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
