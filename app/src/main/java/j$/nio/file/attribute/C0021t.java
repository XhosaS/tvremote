package j$.nio.file.attribute;

import j$.nio.file.AbstractC0002a;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* renamed from: j$.nio.file.attribute.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0021t implements InterfaceC0020s {
    public final /* synthetic */ FileAttribute a;

    public C0021t(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.InterfaceC0020s
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.InterfaceC0020s
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0002a.m((Set) this.a.value()));
    }
}
