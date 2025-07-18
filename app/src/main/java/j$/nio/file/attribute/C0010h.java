package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* renamed from: j$.nio.file.attribute.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0010h implements InterfaceC0012j {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C0010h(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC0012j a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C0011i) {
            return ((C0011i) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            DosFileAttributes dosFileAttributes = (DosFileAttributes) basicFileAttributes;
            return dosFileAttributes instanceof C0017o ? ((C0017o) dosFileAttributes).a : new C0016n(dosFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C0010h(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof O ? ((O) posixFileAttributes).a : new N(posixFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0012j
    public final /* synthetic */ G creationTime() {
        return AbstractC0023v.b(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0010h) {
            obj = ((C0010h) obj).a;
        }
        return basicFileAttributes.equals(obj);
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
