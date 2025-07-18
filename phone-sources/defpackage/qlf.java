package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlf implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public qlf(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                SharedPreferences sharedPreferences = ((rgq) this.a).a().getSharedPreferences("registration_data", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 1:
                xbw xbwVarA = xcl.a(this.a);
                xbwVarA.getClass();
                return new cb(xbwVarA, (byte[]) null);
            case 2:
                return new aafi(yfm.p(new sjr(new upc(((rgq) this.a).a()))));
            case 3:
                xzg xzgVar = new xzg();
                xzgVar.a = (qse) this.a.b();
                return xzgVar;
            case 4:
                return new cb((qbd) this.a.b());
            case 5:
                return new cb(((qsv) this.a).b(), (byte[]) null);
            case 6:
                return new qwo((qth) this.a.b());
            case 7:
                return new rja(((rgq) this.a).a());
            default:
                rrj rrjVar = (rrj) rrx.N((tst) ((xcn) this.a).a, new pep(8));
                rrjVar.getClass();
                return rrjVar;
        }
    }
}
