package defpackage;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doy {
    public final dfl a;
    public final ddw b;
    public czv c;
    public dcw d;
    public String e;
    public final dka f;

    public doy() {
        new asv((char[]) null);
        this.a = new dfl();
        this.b = new ddw();
        this.f = new dka();
    }

    public final void a(czv czvVar, boolean z, czb czbVar) {
        czv czvVar2 = new czv(czvVar.b());
        dka dkaVar = this.f;
        try {
            byte[] bArrU = czbVar.p().u();
            Object obj = dkaVar.a;
            if (((Hashtable) obj).containsKey(czvVar2)) {
                throw new IllegalArgumentException(b.c(czvVar2.b(), "extension ", " already added"));
            }
            ((Vector) dkaVar.b).addElement(czvVar2);
            ((Hashtable) obj).put(czvVar2, new ddx(z, new dbh(bArrU)));
        } catch (IOException e) {
            throw new IllegalArgumentException("error encoding value: ".concat(e.toString()));
        }
    }
}
