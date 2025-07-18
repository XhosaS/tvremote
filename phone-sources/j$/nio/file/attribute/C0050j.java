package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0050j implements InterfaceC0052l {
    public final /* synthetic */ DosFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(AbstractC0060u.c(fileTime), AbstractC0060u.c(fileTime2), AbstractC0060u.c(fileTime3));
    }

    public final /* synthetic */ InterfaceC0055o c() throws IOException {
        DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof C0054n ? ((C0054n) attributes).a : new C0053m(attributes);
    }

    public final /* synthetic */ void d(boolean z) throws IOException {
        this.a.setArchive(z);
    }

    public final /* synthetic */ void e(boolean z) throws IOException {
        this.a.setHidden(z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0050j) {
            obj = ((C0050j) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ void f(boolean z) throws IOException {
        this.a.setReadOnly(z);
    }

    public final /* synthetic */ void g(boolean z) throws IOException {
        this.a.setSystem(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0044d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0048h.a(this.a.readAttributes());
    }
}
