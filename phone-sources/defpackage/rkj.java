package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class rkj implements ufw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ rkj(pro proVar, prt prtVar, prk prkVar, int i, int i2) {
        this.e = i2;
        this.b = proVar;
        this.d = prtVar;
        this.c = prkVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rkh] */
    @Override // defpackage.ufw
    public final uhp a(Object obj) throws IOException {
        if (this.e == 0) {
            rkk rkkVar = (rkk) this.b;
            rkkVar.g((rkd) obj);
            return this.c.a(rkkVar.a, (String) this.d, this.a);
        }
        tst tstVar = (tst) obj;
        boolean zG = tstVar.g();
        Object obj2 = this.c;
        if (!zG) {
            return ((pro) this.b).b((prk) obj2, this.a);
        }
        if (pro.j((prt) this.d, (prk) obj2)) {
            return sfy.C((InputStream) tstVar.c());
        }
        ocv.bB((InputStream) tstVar.c());
        return sfy.B(new prl());
    }

    public /* synthetic */ rkj(rkk rkkVar, rkh rkhVar, String str, int i, int i2) {
        this.e = i2;
        this.b = rkkVar;
        this.c = rkhVar;
        this.d = str;
        this.a = i;
    }
}
