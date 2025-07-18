package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0046f implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0047g a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0047g interfaceC0047g = this.a;
        if (obj instanceof C0046f) {
            obj = ((C0046f) obj).a;
        }
        return interfaceC0047g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return C0049i.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.a.a(AbstractC0060u.b(fileTime), AbstractC0060u.b(fileTime2), AbstractC0060u.b(fileTime3));
    }
}
