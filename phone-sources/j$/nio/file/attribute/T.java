package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes4.dex */
public final /* synthetic */ class T implements V {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ T(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ V a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        return userPrincipal instanceof U ? ((U) userPrincipal).a : userPrincipal instanceof GroupPrincipal ? F.a((GroupPrincipal) userPrincipal) : new T(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof T) {
            obj = ((T) obj).a;
        }
        return userPrincipal.equals(obj);
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
