package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* loaded from: classes4.dex */
public final /* synthetic */ class C implements FileStoreAttributeView {
    public final /* synthetic */ D a;

    public final /* synthetic */ boolean equals(Object obj) {
        D d = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return d.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((B) this.a).name();
    }
}
