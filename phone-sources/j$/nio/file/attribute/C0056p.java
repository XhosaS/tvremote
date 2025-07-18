package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* renamed from: j$.nio.file.attribute.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0056p implements r {
    public final /* synthetic */ FileAttribute a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof C0056p) {
            obj = ((C0056p) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
