package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* renamed from: j$.nio.file.attribute.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0058s implements r {
    public final /* synthetic */ FileAttribute a;

    public C0058s(FileAttribute fileAttribute) {
        this.a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.r
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.r
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0040a.m((Set) this.a.value()));
    }
}
