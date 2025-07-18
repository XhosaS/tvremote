package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* renamed from: j$.nio.file.attribute.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0024w implements InterfaceC0026y {
    public final /* synthetic */ FileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof C0024w) {
            obj = ((C0024w) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0006d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
