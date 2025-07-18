package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* loaded from: classes4.dex */
public final /* synthetic */ class y implements A {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.A
    public final /* synthetic */ void b(V v) throws IOException {
        this.a.setOwner(U.a(v));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
