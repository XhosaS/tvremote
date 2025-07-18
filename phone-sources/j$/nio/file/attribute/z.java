package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* loaded from: classes4.dex */
public final /* synthetic */ class z implements FileOwnerAttributeView {
    public final /* synthetic */ A a;

    public final /* synthetic */ boolean equals(Object obj) {
        A a = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return a.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return U.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(T.a(userPrincipal));
    }
}
