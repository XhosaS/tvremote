package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjk implements vuh {
    private final /* synthetic */ int v;
    public static final vuh u = new wjk(20);
    public static final vuh t = new wjk(19);
    public static final vuh s = new wjk(18);
    public static final vuh r = new wjk(17);
    public static final vuh q = new wjk(16);
    public static final vuh p = new wjk(15);
    public static final vuh o = new wjk(14);
    public static final vuh n = new wjk(13);
    public static final vuh m = new wjk(12);
    public static final vuh l = new wjk(11);
    public static final vuh k = new wjk(10);
    public static final vuh j = new wjk(9);
    public static final vuh i = new wjk(8);
    public static final vuh h = new wjk(7);
    public static final vuh g = new wjk(6);
    public static final vuh f = new wjk(5);
    public static final vuh e = new wjk(4);
    public static final vuh d = new wjk(3);
    public static final vuh c = new wjk(2);
    static final vuh b = new wjk(1);
    static final vuh a = new wjk(0);

    private wjk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.vuh
    public final boolean a(int i2) {
        wjo wjoVar;
        switch (this.v) {
            case 0:
                return a.bv(i2);
            case 1:
                return a.bp(i2);
            case 2:
                switch (i2) {
                    case 0:
                        wjoVar = wjo.ANDROID_SURFACE_UNSPECIFIED;
                        break;
                    case 1:
                        wjoVar = wjo.MOBILE;
                        break;
                    case 2:
                        wjoVar = wjo.ATV;
                        break;
                    case 3:
                        wjoVar = wjo.GTV;
                        break;
                    case 4:
                        wjoVar = wjo.XR;
                        break;
                    case 5:
                        wjoVar = wjo.DESKTOP;
                        break;
                    case 6:
                        wjoVar = wjo.CAR;
                        break;
                    default:
                        wjoVar = null;
                        break;
                }
                return wjoVar != null;
            case 3:
                return a.bt(i2);
            case 4:
                return wkf.b(i2) != null;
            case 5:
                return wkw.b(i2) != null;
            case 6:
                return a.bv(i2);
            case 7:
                return a.br(i2);
            case 8:
                return a.br(i2);
            case 9:
                return a.bq(i2);
            case 10:
                return a.bt(i2);
            case 11:
                return a.bp(i2);
            case 12:
                return a.bp(i2);
            case 13:
                return a.bp(i2);
            case 14:
                return a.bp(i2);
            case 15:
                return a.bp(i2);
            case 16:
                return a.aN(i2) != 0;
            case 17:
                return a.bv(i2);
            case 18:
                return a.bq(i2);
            case 19:
                return a.bt(i2);
            default:
                return xai.b(i2) != null;
        }
    }
}
