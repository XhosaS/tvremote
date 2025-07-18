package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbs extends afmw {
    public static final ahwx a = new ahwx();
    public final afil b;
    public final String c;
    public final afzw d;
    public final String e;
    public final agbr f;
    public final boolean g;
    private final agbq h;
    private final afeh i;

    public agbs(afil afilVar, afih afihVar, agbg agbgVar, agca agcaVar, agco agcoVar, Object obj, int i, int i2, String str, String str2, afzw afzwVar, agae agaeVar, afem afemVar) {
        super(new agcj(), afzwVar, agaeVar, afihVar, afemVar);
        this.h = new agbq(this);
        this.g = false;
        this.d = afzwVar;
        this.b = afilVar;
        this.e = str;
        this.c = str2;
        this.i = agcaVar.q;
        this.f = new agbr(this, i, afzwVar, obj, agbgVar, agcoVar, agcaVar, i2);
    }

    @Override // defpackage.afoe
    public final afeh a() {
        return this.i;
    }

    @Override // defpackage.afmw
    protected final /* synthetic */ afmt b() {
        return this.h;
    }

    @Override // defpackage.afmw
    protected final /* synthetic */ afmv g() {
        return this.f;
    }

    @Override // defpackage.afmw, defpackage.afna
    public final /* synthetic */ afmz j() {
        return this.f;
    }
}
