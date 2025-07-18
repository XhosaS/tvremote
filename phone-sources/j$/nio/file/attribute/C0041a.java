package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0041a implements InterfaceC0043c {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // j$.nio.file.attribute.A
    public final /* synthetic */ void b(V v) throws IOException {
        this.a.setOwner(U.a(v));
    }

    public final /* synthetic */ List c() {
        return this.a.getAcl();
    }

    public final /* synthetic */ void d(List list) throws IOException {
        this.a.setAcl(list);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0041a) {
            obj = ((C0041a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
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
}
