package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
public final /* synthetic */ class U implements UserPrincipal {
    public final /* synthetic */ V a;

    public /* synthetic */ U(V v) {
        this.a = v;
    }

    public static /* synthetic */ UserPrincipal a(V v) {
        if (v == null) {
            return null;
        }
        return v instanceof T ? ((T) v).a : v instanceof H ? G.a((H) v) : new U(v);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        V v = this.a;
        if (obj instanceof U) {
            obj = ((U) obj).a;
        }
        return v.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
