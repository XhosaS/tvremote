package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0011i implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC0012j a;

    public /* synthetic */ C0011i(InterfaceC0012j interfaceC0012j) {
        this.a = interfaceC0012j;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC0012j interfaceC0012j) {
        if (interfaceC0012j == null) {
            return null;
        }
        if (interfaceC0012j instanceof C0010h) {
            return ((C0010h) interfaceC0012j).a;
        }
        if (interfaceC0012j instanceof InterfaceC0018p) {
            InterfaceC0018p interfaceC0018p = (InterfaceC0018p) interfaceC0012j;
            return interfaceC0018p instanceof C0016n ? ((C0016n) interfaceC0018p).a : new C0017o(interfaceC0018p);
        }
        if (!(interfaceC0012j instanceof P)) {
            return new C0011i(interfaceC0012j);
        }
        P p = (P) interfaceC0012j;
        return p instanceof N ? ((N) p).a : new O(p);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC0023v.c(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0012j interfaceC0012j = this.a;
        if (obj instanceof C0011i) {
            obj = ((C0011i) obj).a;
        }
        return interfaceC0012j.equals(obj);
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
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC0023v.c(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC0023v.c(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
