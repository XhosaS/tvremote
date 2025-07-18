package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* renamed from: j$.nio.file.attribute.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0019q implements InterfaceC0020s {
    public final /* synthetic */ FileAttribute a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof C0019q) {
            obj = ((C0019q) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0020s
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.InterfaceC0020s
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
