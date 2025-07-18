package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmp extends zix {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private zmp(zjm zjmVar) {
        Enumeration enumerationF = zjmVar.f();
        while (enumerationF.hasMoreElements()) {
            Object objNextElement = enumerationF.nextElement();
            boolean z = objNextElement instanceof zmo;
            zjb zjbVar = zmo.a;
            zmo zmoVar = z ? (zmo) objNextElement : objNextElement != null ? new zmo(zjm.j(objNextElement)) : null;
            if (this.a.containsKey(zmoVar.r) && !zxp.b("org.bouncycastle.x509.ignore_repeated_extensions")) {
                throw new IllegalArgumentException("repeated extension found: ".concat(String.valueOf(String.valueOf(zmoVar.r))));
            }
            this.a.put(zmoVar.r, zmoVar);
            this.b.addElement(zmoVar.r);
        }
    }

    public static zmp c(Object obj) {
        if (obj instanceof zmp) {
            return (zmp) obj;
        }
        if (obj != null) {
            return new zmp(zjm.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        return this.b.elements();
    }

    public final zmo b(zjb zjbVar) {
        return (zmo) this.a.get(zjbVar);
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(this.b.size());
        Enumeration enumerationElements = this.b.elements();
        while (enumerationElements.hasMoreElements()) {
            ziiVar.b((zmo) this.a.get((zjb) enumerationElements.nextElement()));
        }
        return new zkq(ziiVar);
    }
}
