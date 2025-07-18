package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hll implements hlg {
    public final ir b = new hwd();

    @Override // defpackage.hlg
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            ir irVar = this.b;
            if (i >= irVar.d) {
                return;
            }
            hlk hlkVar = (hlk) irVar.d(i);
            Object objG = irVar.g(i);
            hlj hljVar = hlkVar.c;
            if (hlkVar.e == null) {
                hlkVar.e = hlkVar.d.getBytes(hlg.a);
            }
            hljVar.a(hlkVar.e, objG, messageDigest);
            i++;
        }
    }

    public final Object b(hlk hlkVar) {
        ir irVar = this.b;
        return irVar.containsKey(hlkVar) ? irVar.get(hlkVar) : hlkVar.b;
    }

    public final void c(hll hllVar) {
        this.b.i(hllVar.b);
    }

    public final void d(hlk hlkVar, Object obj) {
        this.b.put(hlkVar, obj);
    }

    @Override // defpackage.hlg
    public final boolean equals(Object obj) {
        if (obj instanceof hll) {
            return this.b.equals(((hll) obj).b);
        }
        return false;
    }

    @Override // defpackage.hlg
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
