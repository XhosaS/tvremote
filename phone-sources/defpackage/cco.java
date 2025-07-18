package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cco extends ykt implements yjk {
    private final /* synthetic */ int v;
    public static final cco u = new cco(20);
    public static final cco t = new cco(19);
    public static final cco s = new cco(18);
    public static final cco r = new cco(17);
    public static final cco q = new cco(16);
    public static final cco p = new cco(15);
    public static final cco o = new cco(14);
    public static final cco n = new cco(13);
    public static final cco m = new cco(12);
    public static final cco l = new cco(11);
    public static final cco k = new cco(10);
    public static final cco j = new cco(9);
    public static final cco i = new cco(8);
    public static final cco h = new cco(7);
    public static final cco g = new cco(6);
    public static final cco f = new cco(5);
    public static final cco e = new cco(4);
    public static final cco d = new cco(3);
    public static final cco c = new cco(2);
    public static final cco b = new cco(1);
    public static final cco a = new cco(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cco(int i2) {
        super(0);
        this.v = i2;
    }

    @Override // defpackage.yjk
    public final /* synthetic */ Object a() {
        int i2 = this.v;
        Float fValueOf = Float.valueOf(0.0f);
        switch (i2) {
            case 0:
                ccq.a("LocalFontFamilyResolver");
                throw new yfs();
            case 1:
                ccq.a("LocalFocusManager");
                throw new yfs();
            case 2:
                ccq.a("LocalFontLoader");
                throw new yfs();
            case 3:
                ccq.a("LocalGraphicsContext");
                throw new yfs();
            case 4:
                ccq.a("LocalHapticFeedback");
                throw new yfs();
            case 5:
                ccq.a("LocalInputManager");
                throw new yfs();
            case 6:
                ccq.a("LocalLayoutDirection");
                throw new yfs();
            case 7:
                return null;
            case 8:
                return a.p();
            case 9:
            case 10:
                return null;
            case 11:
                ccq.a("LocalTextToolbar");
                throw new yfs();
            case 12:
                ccq.a("LocalUriHandler");
                throw new yfs();
            case 13:
                ccq.a("LocalViewConfiguration");
                throw new yfs();
            case 14:
                ccq.a("LocalWindowInfo");
                throw new yfs();
            case 15:
                return a.p();
            case 16:
                return null;
            case 17:
                return a.p();
            case 18:
                return a.p();
            case 19:
            default:
                return fValueOf;
        }
    }
}
