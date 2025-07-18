package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* renamed from: j$.nio.file.attribute.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0025x implements FileAttributeView {
    public final /* synthetic */ InterfaceC0026y a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0026y interfaceC0026y = this.a;
        if (obj instanceof C0025x) {
            obj = ((C0025x) obj).a;
        }
        return interfaceC0026y.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
