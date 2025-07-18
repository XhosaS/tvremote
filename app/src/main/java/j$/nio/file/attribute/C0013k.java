package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* renamed from: j$.nio.file.attribute.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0013k implements InterfaceC0015m {
    public final /* synthetic */ DosFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final /* synthetic */ void a(G g, G g2, G g3) throws IOException {
        this.a.setTimes(AbstractC0023v.c(g), AbstractC0023v.c(g2), AbstractC0023v.c(g3));
    }

    public final /* synthetic */ InterfaceC0018p c() throws IOException {
        DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof C0017o ? ((C0017o) attributes).a : new C0016n(attributes);
    }

    public final /* synthetic */ void d(boolean z) throws IOException {
        this.a.setArchive(z);
    }

    public final /* synthetic */ void e(boolean z) throws IOException {
        this.a.setHidden(z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0013k) {
            obj = ((C0013k) obj).a;
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

    @Override // j$.nio.file.attribute.InterfaceC0006d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final /* synthetic */ InterfaceC0012j readAttributes() {
        return C0010h.a(this.a.readAttributes());
    }
}
