package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddy extends czr {
    public static final czv a;
    public static final czv b;
    public static final czv c;
    public static final czv d;
    public static final czv e;
    public static final czv f;
    private Hashtable g = new Hashtable();
    private Vector h = new Vector();

    static {
        new czv("2.5.29.9");
        a = new czv("2.5.29.14");
        b = new czv("2.5.29.15");
        new czv("2.5.29.16");
        c = new czv("2.5.29.17");
        new czv("2.5.29.18");
        d = new czv("2.5.29.19");
        new czv("2.5.29.20");
        new czv("2.5.29.21");
        new czv("2.5.29.23");
        new czv("2.5.29.24");
        new czv("2.5.29.27");
        new czv("2.5.29.28");
        new czv("2.5.29.29");
        new czv("2.5.29.30");
        new czv("2.5.29.31");
        new czv("2.5.29.32");
        new czv("2.5.29.33");
        e = new czv("2.5.29.35");
        new czv("2.5.29.36");
        f = new czv("2.5.29.37");
        new czv("2.5.29.46");
        new czv("2.5.29.54");
        new czv("1.3.6.1.5.5.7.1.1");
        new czv("1.3.6.1.5.5.7.1.11");
        new czv("1.3.6.1.5.5.7.1.12");
        new czv("1.3.6.1.5.5.7.1.2");
        new czv("1.3.6.1.5.5.7.1.3");
        new czv("1.3.6.1.5.5.7.1.4");
        new czv("2.5.29.56");
        new czv("2.5.29.55");
    }

    public ddy(Vector vector, Hashtable hashtable) {
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            this.h.addElement(czv.h(enumerationElements.nextElement()));
        }
        Enumeration enumerationElements2 = this.h.elements();
        while (enumerationElements2.hasMoreElements()) {
            czv czvVarH = czv.h(enumerationElements2.nextElement());
            this.g.put(czvVarH, (ddx) hashtable.get(czvVarH));
        }
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(this.h.size());
        Enumeration enumerationElements = this.h.elements();
        while (enumerationElements.hasMoreElements()) {
            czc czcVar2 = new czc(3);
            czv czvVar = (czv) enumerationElements.nextElement();
            ddx ddxVar = (ddx) this.g.get(czvVar);
            czcVar2.b(czvVar);
            if (ddxVar.a) {
                czcVar2.b(cyz.b);
            }
            czcVar2.b(ddxVar.b);
            czcVar.b(new dbk(czcVar2));
        }
        return new dbk(czcVar);
    }
}
