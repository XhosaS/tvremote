package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* renamed from: j$.nio.file.attribute.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0061v implements InterfaceC0063x {
    public final /* synthetic */ FileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof C0061v) {
            obj = ((C0061v) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0044d
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
