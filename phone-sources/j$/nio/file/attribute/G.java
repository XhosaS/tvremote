package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
public final /* synthetic */ class G implements GroupPrincipal {
    public final /* synthetic */ H a;

    public /* synthetic */ G(H h) {
        this.a = h;
    }

    public static /* synthetic */ GroupPrincipal a(H h) {
        if (h == null) {
            return null;
        }
        return h instanceof F ? ((F) h).a : new G(h);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        H h = this.a;
        if (obj instanceof G) {
            obj = ((G) obj).a;
        }
        return h.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((F) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((F) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((F) this.a).toString();
    }
}
