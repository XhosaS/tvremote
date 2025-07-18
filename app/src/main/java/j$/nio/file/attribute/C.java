package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ FileStoreAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileStoreAttributeView fileStoreAttributeView = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return fileStoreAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0006d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
