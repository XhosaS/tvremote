package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0051k implements DosFileAttributeView {
    public final /* synthetic */ InterfaceC0052l a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0052l interfaceC0052l = this.a;
        if (obj instanceof C0051k) {
            obj = ((C0051k) obj).a;
        }
        return interfaceC0052l.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0050j) this.a).name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return C0049i.a(((C0050j) this.a).readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        ((C0050j) this.a).d(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        ((C0050j) this.a).e(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        ((C0050j) this.a).f(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        ((C0050j) this.a).g(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) throws IOException {
        ((C0050j) this.a).a(AbstractC0060u.b(fileTime), AbstractC0060u.b(fileTime2), AbstractC0060u.b(fileTime3));
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() throws IOException {
        InterfaceC0055o interfaceC0055oC = ((C0050j) this.a).c();
        if (interfaceC0055oC == null) {
            return null;
        }
        return interfaceC0055oC instanceof C0053m ? ((C0053m) interfaceC0055oC).a : new C0054n(interfaceC0055oC);
    }
}
