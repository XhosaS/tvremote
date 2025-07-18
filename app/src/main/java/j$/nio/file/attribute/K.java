package j$.nio.file.attribute;

import j$.nio.file.AbstractC0002a;
import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class K implements M {
    public final /* synthetic */ PosixFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final /* synthetic */ void a(G g, G g2, G g3) throws IOException {
        this.a.setTimes(AbstractC0023v.c(g), AbstractC0023v.c(g2), AbstractC0023v.c(g3));
    }

    @Override // j$.nio.file.attribute.B
    public final /* synthetic */ void b(X x) throws IOException {
        this.a.setOwner(W.a(x));
    }

    public final /* synthetic */ P c() throws IOException {
        PosixFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof O ? ((O) attributes).a : new N(attributes);
    }

    public final /* synthetic */ void d(J j) throws IOException {
        this.a.setGroup(I.a(j));
    }

    public final /* synthetic */ void e(Set set) throws IOException {
        this.a.setPermissions(AbstractC0002a.m(set));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof K) {
            obj = ((K) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.B
    public final /* synthetic */ X getOwner() {
        return V.a(this.a.getOwner());
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
