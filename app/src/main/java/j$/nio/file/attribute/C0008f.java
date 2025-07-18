package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0008f implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0009g a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0009g interfaceC0009g = this.a;
        if (obj instanceof C0008f) {
            obj = ((C0008f) obj).a;
        }
        return interfaceC0009g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0011i.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC0023v.b(fileTime), AbstractC0023v.b(fileTime2), AbstractC0023v.b(fileTime3));
    }
}
