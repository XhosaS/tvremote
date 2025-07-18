package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubu implements vuh {
    private final /* synthetic */ int v;
    public static final vuh u = new ubu(20);
    public static final vuh t = new ubu(19);
    public static final vuh s = new ubu(18);
    public static final vuh r = new ubu(17);
    public static final vuh q = new ubu(16);
    public static final vuh p = new ubu(15);
    public static final vuh o = new ubu(14);
    public static final vuh n = new ubu(13);
    public static final vuh m = new ubu(12);
    public static final vuh l = new ubu(11);
    public static final vuh k = new ubu(10);
    public static final vuh j = new ubu(9);
    public static final vuh i = new ubu(8);
    public static final vuh h = new ubu(7);
    public static final vuh g = new ubu(6);
    static final vuh f = new ubu(5);
    static final vuh e = new ubu(4);
    static final vuh d = new ubu(3);
    static final vuh c = new ubu(2);
    static final vuh b = new ubu(1);
    static final vuh a = new ubu(0);

    private ubu(int i2) {
        this.v = i2;
    }

    @Override // defpackage.vuh
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return a.bp(i2);
            case 1:
                return a.bt(i2);
            case 2:
                return a.bq(i2);
            case 3:
                return a.bg(i2) != 0;
            case 4:
                return a.br(i2);
            case 5:
                return a.bh(i2) != 0;
            case 6:
                return a.br(i2);
            case 7:
                return a.bt(i2);
            case 8:
                return sfy.aA(i2) != 0;
            case 9:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return true;
                    default:
                        return false;
                }
            case 10:
                return a.bt(i2);
            case 11:
                return sfy.aA(i2) != 0;
            case 12:
                return a.br(i2);
            case 13:
                return uck.b(i2) != null;
            case 14:
                return a.bp(i2);
            case 15:
                return a.br(i2);
            case 16:
                return sfy.az(i2) != 0;
            case 17:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 18:
                return uis.b(i2) != null;
            case 19:
                return a.bq(i2);
            default:
                return a.bp(i2);
        }
    }
}
