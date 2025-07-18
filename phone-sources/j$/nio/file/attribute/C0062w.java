package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* renamed from: j$.nio.file.attribute.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0062w implements FileAttributeView {
    public final /* synthetic */ InterfaceC0063x a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0063x interfaceC0063x = this.a;
        if (obj instanceof C0062w) {
            obj = ((C0062w) obj).a;
        }
        return interfaceC0063x.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
