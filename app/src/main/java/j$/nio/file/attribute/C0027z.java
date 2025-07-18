package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* renamed from: j$.nio.file.attribute.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0027z implements B {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // j$.nio.file.attribute.B
    public final /* synthetic */ void b(X x) throws IOException {
        this.a.setOwner(W.a(x));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof C0027z) {
            obj = ((C0027z) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
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
