package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gf implements yjk {
    private final /* synthetic */ int a;

    public /* synthetic */ gf(int i) {
        this.a = i;
    }

    @Override // defpackage.yjk
    public final Object a() {
        long j = 0;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                return null;
            case 3:
                return gt.c();
            case 4:
                yjv yjvVar = pi.a;
                bji bjiVar = new bji(new ga(4));
                bjiVar.d();
                return bjiVar;
            case 5:
                return rc.a;
            case 6:
                return new sa(bny.j(4284900966L), wv.s(0.0f, 3));
            case 7:
                return new sj(0);
            case 8:
                return null;
            case 9:
                return true;
            case 10:
                return new yi(0);
            case 11:
                aai aaiVar = aao.a;
                return new aan(0, 0);
            case 12:
                abj abjVar = aby.a;
                return new abw(0, 0);
            case 13:
                return null;
            case 14:
                return new cmf(j);
            case 15:
                return new cmf(j);
            case 16:
            case 17:
                return null;
            case 18:
                yot yotVar = ypk.a;
                return yya.a;
            case 19:
                return null;
            default:
                return anl.b;
        }
    }
}
