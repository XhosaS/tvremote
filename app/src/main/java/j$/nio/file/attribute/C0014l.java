package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0014l implements DosFileAttributeView {
    public final /* synthetic */ InterfaceC0015m a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0015m interfaceC0015m = this.a;
        if (obj instanceof C0014l) {
            obj = ((C0014l) obj).a;
        }
        return interfaceC0015m.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0013k) this.a).name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0011i.a(((C0013k) this.a).readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        ((C0013k) this.a).d(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        ((C0013k) this.a).e(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        ((C0013k) this.a).f(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        ((C0013k) this.a).g(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((C0013k) this.a).a(AbstractC0023v.b(fileTime), AbstractC0023v.b(fileTime2), AbstractC0023v.b(fileTime3));
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() throws IOException {
        InterfaceC0018p interfaceC0018pC = ((C0013k) this.a).c();
        if (interfaceC0018pC == null) {
            return null;
        }
        return interfaceC0018pC instanceof C0016n ? ((C0016n) interfaceC0018pC).a : new C0017o(interfaceC0018pC);
    }
}
