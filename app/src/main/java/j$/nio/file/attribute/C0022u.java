package j$.nio.file.attribute;

import j$.nio.file.AbstractC0002a;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* renamed from: j$.nio.file.attribute.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0022u implements FileAttribute {
    public final /* synthetic */ InterfaceC0020s a;

    public C0022u(InterfaceC0020s interfaceC0020s) {
        this.a = interfaceC0020s;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0002a.m((Set) this.a.value()));
    }
}
