package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

/* renamed from: j$.nio.file.attribute.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0004b implements AclFileAttributeView {
    public final /* synthetic */ InterfaceC0005c a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0005c interfaceC0005c = this.a;
        if (obj instanceof C0004b) {
            obj = ((C0004b) obj).a;
        }
        return interfaceC0005c.equals(obj);
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ List getAcl() {
        return ((C0003a) this.a).c();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return W.a(((C0003a) this.a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView, java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C0003a) this.a).name();
    }

    @Override // java.nio.file.attribute.AclFileAttributeView
    public final /* synthetic */ void setAcl(List list) throws IOException {
        ((C0003a) this.a).d(list);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((C0003a) this.a).b(V.a(userPrincipal));
    }
}
