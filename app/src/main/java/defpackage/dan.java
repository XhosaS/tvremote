package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dan implements daj {
    public final we b = new dpx();

    @Override // defpackage.daj
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            we weVar = this.b;
            if (i >= weVar.d) {
                return;
            }
            dam damVar = (dam) weVar.e(i);
            Object objH = weVar.h(i);
            dal dalVar = damVar.c;
            if (damVar.e == null) {
                damVar.e = damVar.d.getBytes(daj.a);
            }
            dalVar.a(damVar.e, objH, messageDigest);
            i++;
        }
    }

    public final Object b(dam damVar) {
        we weVar = this.b;
        return weVar.containsKey(damVar) ? weVar.get(damVar) : damVar.b;
    }

    public final void c(dan danVar) {
        this.b.j(danVar.b);
    }

    @Override // defpackage.daj
    public final boolean equals(Object obj) {
        if (obj instanceof dan) {
            return this.b.equals(((dan) obj).b);
        }
        return false;
    }

    @Override // defpackage.daj
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
