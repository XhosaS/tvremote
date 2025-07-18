package j$.nio.file;

import java.nio.file.OpenOption;

/* renamed from: j$.nio.file.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0040n implements OpenOption {
    public final /* synthetic */ InterfaceC0041o a;

    public /* synthetic */ C0040n(InterfaceC0041o interfaceC0041o) {
        this.a = interfaceC0041o;
    }

    public static /* synthetic */ OpenOption a(InterfaceC0041o interfaceC0041o) {
        if (interfaceC0041o == null) {
            return null;
        }
        return interfaceC0041o instanceof C0039m ? ((C0039m) interfaceC0041o).a : interfaceC0041o instanceof EnumC0038l ? AbstractC0002a.c((EnumC0038l) interfaceC0041o) : interfaceC0041o instanceof z ? AbstractC0002a.e((z) interfaceC0041o) : new C0040n(interfaceC0041o);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0041o interfaceC0041o = this.a;
        if (obj instanceof C0040n) {
            obj = ((C0040n) obj).a;
        }
        return interfaceC0041o.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
