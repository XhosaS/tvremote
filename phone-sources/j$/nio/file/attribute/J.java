package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.io.IOException;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* loaded from: classes4.dex */
public final /* synthetic */ class J implements PosixFileAttributeView {
    public final /* synthetic */ K a;

    public final /* synthetic */ boolean equals(Object obj) {
        K k = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return k.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return U.a(((I) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ String name() {
        return ((I) this.a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return C0049i.a(((I) this.a).readAttributes());
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((I) this.a).d(F.a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((I) this.a).b(T.a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(Set set) throws IOException {
        ((I) this.a).e(AbstractC0040a.m(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) throws IOException {
        ((I) this.a).a(AbstractC0060u.b(fileTime), AbstractC0060u.b(fileTime2), AbstractC0060u.b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ PosixFileAttributes readAttributes() throws IOException {
        N nC = ((I) this.a).c();
        if (nC == null) {
            return null;
        }
        return nC instanceof L ? ((L) nC).a : new M(nC);
    }
}
