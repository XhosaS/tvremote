package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddi extends czr {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private ddi(dag dagVar) {
        Enumeration enumerationF = dagVar.f();
        while (enumerationF.hasMoreElements()) {
            Object objNextElement = enumerationF.nextElement();
            boolean z = objNextElement instanceof ddh;
            czv czvVar = ddh.a;
            ddh ddhVar = z ? (ddh) objNextElement : objNextElement != null ? new ddh(dag.j(objNextElement)) : null;
            if (this.a.containsKey(ddhVar.r) && !doh.b("org.bouncycastle.x509.ignore_repeated_extensions")) {
                throw new IllegalArgumentException("repeated extension found: ".concat(String.valueOf(String.valueOf(ddhVar.r))));
            }
            this.a.put(ddhVar.r, ddhVar);
            this.b.addElement(ddhVar.r);
        }
    }

    public static ddi c(Object obj) {
        if (obj instanceof ddi) {
            return (ddi) obj;
        }
        if (obj != null) {
            return new ddi(dag.j(obj));
        }
        return null;
    }

    public final Enumeration a() {
        return this.b.elements();
    }

    public final ddh b(czv czvVar) {
        return (ddh) this.a.get(czvVar);
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(this.b.size());
        Enumeration enumerationElements = this.b.elements();
        while (enumerationElements.hasMoreElements()) {
            czcVar.b((ddh) this.a.get((czv) enumerationElements.nextElement()));
        }
        return new dbk(czcVar);
    }
}
