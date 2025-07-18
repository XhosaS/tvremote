package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
public final /* synthetic */ class F implements H {
    public final /* synthetic */ GroupPrincipal a;

    public /* synthetic */ F(GroupPrincipal groupPrincipal) {
        this.a = groupPrincipal;
    }

    public static /* synthetic */ H a(GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return groupPrincipal instanceof G ? ((G) groupPrincipal).a : new F(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        GroupPrincipal groupPrincipal = this.a;
        if (obj instanceof F) {
            obj = ((F) obj).a;
        }
        return groupPrincipal.equals(obj);
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
