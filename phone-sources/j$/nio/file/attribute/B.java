package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* loaded from: classes4.dex */
public final /* synthetic */ class B implements D {
    public final /* synthetic */ FileStoreAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStoreAttributeView fileStoreAttributeView = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return fileStoreAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0044d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
