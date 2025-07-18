package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements FileAttribute {
    public final /* synthetic */ InterfaceC0020s a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0020s interfaceC0020s = this.a;
        if (obj instanceof r) {
            obj = ((r) obj).a;
        }
        return interfaceC0020s.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
