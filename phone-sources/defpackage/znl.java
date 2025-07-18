package defpackage;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znl extends Permission {
    private final Set a;

    public znl(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof znl) && this.a.equals(((znl) obj).a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof znl)) {
            return false;
        }
        znl znlVar = (znl) permission;
        return getName().equals(znlVar.getName()) || this.a.containsAll(znlVar.a);
    }
}
