package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class znf extends zix {
    public static final zjb a;
    public static final zjb b;
    public static final zjb c;
    public static final zjb d;
    public static final zjb e;
    public static final zjb f;
    private Hashtable g = new Hashtable();
    private Vector h = new Vector();

    static {
        new zjb("2.5.29.9");
        a = new zjb("2.5.29.14");
        b = new zjb("2.5.29.15");
        new zjb("2.5.29.16");
        c = new zjb("2.5.29.17");
        new zjb("2.5.29.18");
        d = new zjb("2.5.29.19");
        new zjb("2.5.29.20");
        new zjb("2.5.29.21");
        new zjb("2.5.29.23");
        new zjb("2.5.29.24");
        new zjb("2.5.29.27");
        new zjb("2.5.29.28");
        new zjb("2.5.29.29");
        new zjb("2.5.29.30");
        new zjb("2.5.29.31");
        new zjb("2.5.29.32");
        new zjb("2.5.29.33");
        e = new zjb("2.5.29.35");
        new zjb("2.5.29.36");
        f = new zjb("2.5.29.37");
        new zjb("2.5.29.46");
        new zjb("2.5.29.54");
        new zjb("1.3.6.1.5.5.7.1.1");
        new zjb("1.3.6.1.5.5.7.1.11");
        new zjb("1.3.6.1.5.5.7.1.12");
        new zjb("1.3.6.1.5.5.7.1.2");
        new zjb("1.3.6.1.5.5.7.1.3");
        new zjb("1.3.6.1.5.5.7.1.4");
        new zjb("2.5.29.56");
        new zjb("2.5.29.55");
    }

    public znf(Vector vector, Hashtable hashtable) {
        Enumeration enumerationElements = vector.elements();
        while (enumerationElements.hasMoreElements()) {
            this.h.addElement(zjb.h(enumerationElements.nextElement()));
        }
        Enumeration enumerationElements2 = this.h.elements();
        while (enumerationElements2.hasMoreElements()) {
            zjb zjbVarH = zjb.h(enumerationElements2.nextElement());
            this.g.put(zjbVarH, (zne) hashtable.get(zjbVarH));
        }
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(this.h.size());
        Enumeration enumerationElements = this.h.elements();
        while (enumerationElements.hasMoreElements()) {
            zii ziiVar2 = new zii(3);
            zjb zjbVar = (zjb) enumerationElements.nextElement();
            zne zneVar = (zne) this.g.get(zjbVar);
            ziiVar2.b(zjbVar);
            if (zneVar.a) {
                ziiVar2.b(zif.b);
            }
            ziiVar2.b(zneVar.b);
            ziiVar.b(new zkq(ziiVar2));
        }
        return new zkq(ziiVar);
    }
}
