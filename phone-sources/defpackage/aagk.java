package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aagk implements vuh {
    private final /* synthetic */ int f;
    static final vuh e = new aagk(4);
    static final vuh d = new aagk(3);
    static final vuh c = new aagk(2);
    static final vuh b = new aagk(1);
    static final vuh a = new aagk(0);

    private aagk(int i) {
        this.f = i;
    }

    @Override // defpackage.vuh
    public final boolean a(int i) {
        int i2 = this.f;
        if (i2 == 0) {
            switch (i) {
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
                    return true;
                default:
                    return false;
            }
        }
        if (i2 == 1) {
            return a.aT(i) != 0;
        }
        if (i2 == 2) {
            return a.bt(i);
        }
        if (i2 != 3) {
            return a.bs(i);
        }
        switch (i) {
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
            case 23:
            case 24:
            case 25:
                return true;
            default:
                return false;
        }
    }
}
