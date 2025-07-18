package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* loaded from: classes4.dex */
public final /* synthetic */ class I implements K {
    public final /* synthetic */ PosixFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0047g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(AbstractC0060u.c(fileTime), AbstractC0060u.c(fileTime2), AbstractC0060u.c(fileTime3));
    }

    @Override // j$.nio.file.attribute.A
    public final /* synthetic */ void b(V v) throws IOException {
        this.a.setOwner(U.a(v));
    }

    public final /* synthetic */ N c() throws IOException {
        PosixFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof M ? ((M) attributes).a : new L(attributes);
    }

    public final /* synthetic */ void d(H h) throws IOException {
        this.a.setGroup(G.a(h));
    }

    public final /* synthetic */ void e(Set set) throws IOException {
        this.a.setPermissions(AbstractC0040a.m(set));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.A
    public final /* synthetic */ V getOwner() {
        return T.a(this.a.getOwner());
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
