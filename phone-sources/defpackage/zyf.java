package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyf {
    public final zou a;
    public final znd b;
    public zjb c;
    public zmd d;
    public String e;
    public final ztj f;

    public zyf() {
        new zyt();
        this.a = new zou();
        this.b = new znd();
        this.f = new ztj();
    }

    public final void a(zjb zjbVar, boolean z, zih zihVar) {
        zjb zjbVar2 = new zjb(zjbVar.b());
        ztj ztjVar = this.f;
        try {
            byte[] bArrU = zihVar.p().u();
            Object obj = ztjVar.a;
            if (((Hashtable) obj).containsKey(zjbVar2)) {
                throw new IllegalArgumentException(a.cg(zjbVar2.b(), "extension ", " already added"));
            }
            ((Vector) ztjVar.b).addElement(zjbVar2);
            ((Hashtable) obj).put(zjbVar2, new zne(z, new zkn(bArrU)));
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding value: ".concat(e.toString()));
        }
    }
}
