package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0003a implements InterfaceC0005c {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // j$.nio.file.attribute.B
    public final /* synthetic */ void b(X x) throws IOException {
        this.a.setOwner(W.a(x));
    }

    public final /* synthetic */ List c() {
        return this.a.getAcl();
    }

    public final /* synthetic */ void d(List list) throws IOException {
        this.a.setAcl(list);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0003a) {
            obj = ((C0003a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
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
}
