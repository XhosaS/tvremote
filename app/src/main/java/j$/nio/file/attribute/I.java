package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements GroupPrincipal {
    public final /* synthetic */ J a;

    public /* synthetic */ I(J j) {
        this.a = j;
    }

    public static /* synthetic */ GroupPrincipal a(J j) {
        if (j == null) {
            return null;
        }
        return j instanceof H ? ((H) j).a : new I(j);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        J j = this.a;
        if (obj instanceof I) {
            obj = ((I) obj).a;
        }
        return j.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((H) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((H) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((H) this.a).toString();
    }
}
