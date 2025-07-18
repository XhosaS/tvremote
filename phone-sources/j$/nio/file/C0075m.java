package j$.nio.file;

import java.nio.file.OpenOption;

/* renamed from: j$.nio.file.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0075m implements OpenOption {
    public final /* synthetic */ InterfaceC0076n a;

    public /* synthetic */ C0075m(InterfaceC0076n interfaceC0076n) {
        this.a = interfaceC0076n;
    }

    public static /* synthetic */ OpenOption a(InterfaceC0076n interfaceC0076n) {
        if (interfaceC0076n == null) {
            return null;
        }
        return interfaceC0076n instanceof C0074l ? ((C0074l) interfaceC0076n).a : interfaceC0076n instanceof LinkOption ? AbstractC0040a.c((LinkOption) interfaceC0076n) : interfaceC0076n instanceof y ? AbstractC0040a.e((y) interfaceC0076n) : new C0075m(interfaceC0076n);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0076n interfaceC0076n = this.a;
        if (obj instanceof C0075m) {
            obj = ((C0075m) obj).a;
        }
        return interfaceC0076n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
