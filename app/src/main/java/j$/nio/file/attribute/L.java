package j$.nio.file.attribute;

import j$.nio.file.AbstractC0002a;
import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements PosixFileAttributeView {
    public final /* synthetic */ M a;

    public final /* synthetic */ boolean equals(Object obj) {
        M m = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return m.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return W.a(((K) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ String name() {
        return ((K) this.a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0011i.a(((K) this.a).readAttributes());
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((K) this.a).d(H.a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((K) this.a).b(V.a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(Set set) throws IOException {
        ((K) this.a).e(AbstractC0002a.m(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        ((K) this.a).a(AbstractC0023v.b(fileTime), AbstractC0023v.b(fileTime2), AbstractC0023v.b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ PosixFileAttributes readAttributes() throws IOException {
        P pC = ((K) this.a).c();
        if (pC == null) {
            return null;
        }
        return pC instanceof N ? ((N) pC).a : new O(pC);
    }
}
