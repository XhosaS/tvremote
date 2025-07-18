package j$.nio.file.attribute;

import j$.nio.file.AbstractC0040a;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* renamed from: j$.nio.file.attribute.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0059t implements FileAttribute {
    public final /* synthetic */ r a;

    public C0059t(r rVar) {
        this.a = rVar;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC0040a.m((Set) this.a.value()));
    }
}
