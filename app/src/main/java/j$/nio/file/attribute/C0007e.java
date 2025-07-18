package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0007e implements InterfaceC0009g {
    public final /* synthetic */ BasicFileAttributeView a;

    @Override // j$.nio.file.attribute.InterfaceC0009g
    public final /* synthetic */ void a(G g, G g2, G g3) throws IOException {
        this.a.setTimes(AbstractC0023v.c(g), AbstractC0023v.c(g2), AbstractC0023v.c(g3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0007e) {
            obj = ((C0007e) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
