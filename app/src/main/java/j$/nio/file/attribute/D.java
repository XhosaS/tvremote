package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class D implements FileStoreAttributeView {
    public final /* synthetic */ E a;

    public final /* synthetic */ boolean equals(Object obj) {
        E e = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((C) this.a).name();
    }
}
