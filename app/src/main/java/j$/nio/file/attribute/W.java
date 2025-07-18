package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements UserPrincipal {
    public final /* synthetic */ X a;

    public /* synthetic */ W(X x) {
        this.a = x;
    }

    public static /* synthetic */ UserPrincipal a(X x) {
        if (x == null) {
            return null;
        }
        return x instanceof V ? ((V) x).a : x instanceof J ? I.a((J) x) : new W(x);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        X x = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return x.equals(obj);
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
