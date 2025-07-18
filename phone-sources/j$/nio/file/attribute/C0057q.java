package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* renamed from: j$.nio.file.attribute.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0057q implements FileAttribute {
    public final /* synthetic */ r a;

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.a;
        if (obj instanceof C0057q) {
            obj = ((C0057q) obj).a;
        }
        return rVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
