package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afi implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ afi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [anh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [ahn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ago, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [anh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [bxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [bxh, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        switch (this.b) {
            case 0:
                return Long.valueOf(this.a.a());
            case 1:
                return Long.valueOf(this.a.a());
            case 2:
                return new cmf(((cmg) this.a).d());
            case 3:
                cgf cgfVar = (cgf) ((cfx) this.a).a;
                if (cgfVar instanceof cge) {
                    try {
                        throw null;
                    } catch (IllegalArgumentException unused) {
                    }
                } else if (cgfVar instanceof cgd) {
                }
                return ygi.a;
            case 4:
                ajs ajsVar = (ajs) this.a;
                Object obj = ajsVar.d;
                cgz cgzVarK = ajsVar.k();
                return Boolean.valueOf(yks.e(obj, cgzVarK != null ? cgzVarK.a.a : null));
            case 5:
                return this.a.b();
            case 6:
                bvc bvcVar = (bvc) this.a.a();
                if (bvcVar != null) {
                    return bvcVar;
                }
                wv.b("Required value was null.");
                throw new yfs();
            case 7:
                this.a.a();
                return ygi.a;
            case 8:
                bvc bvcVar2 = (bvc) this.a.a();
                if (bvcVar2 != null) {
                    return bvcVar2;
                }
                wv.b("Required value was null.");
                throw new yfs();
            case 9:
                ?? r0 = this.a;
                return ((bko) r0).A ? ht.t(r0) : agk.a;
            case 10:
                bvc bvcVar3 = (bvc) this.a.a();
                if (bvcVar3 != null) {
                    return bvcVar3;
                }
                wv.b("Required value was null.");
                throw new yfs();
            case 11:
                return ((aiu) this.a).a();
            case 12:
                return ((ajq) this.a).a.d().toString();
            case 13:
                Object obj2 = this.a;
                ykr.q(((bko) obj2).F(), null, 0, new ajn((ajq) obj2, (yih) null, 0), 3);
                return true;
            case 14:
                Object obj3 = this.a;
                ykr.q(((bko) obj3).F(), null, 0, new qy((ajq) obj3, (yih) null, 20, (byte[]) null), 3);
                return true;
            case 15:
                ?? r02 = this.a;
                ajq ajqVar = (ajq) r02;
                ajqVar.i = (cdv) fh.P(r02, ccq.n);
                ajqVar.b.e = ajqVar.w();
                if (ajqVar.w() && ajqVar.j == null) {
                    ajqVar.j = ykr.q(((bko) r02).F(), null, 0, new ajn(ajqVar, (yih) null, 2, (char[]) null), 3);
                } else if (!ajqVar.w()) {
                    yqe yqeVar = ajqVar.j;
                    if (yqeVar != null) {
                        yqeVar.t(null);
                    }
                    ajqVar.j = null;
                }
                return ygi.a;
            case 16:
                fh.N(this.a);
                return ygi.a;
            case 17:
                fh.N(this.a);
                return ygi.a;
            case 18:
                return sq.a(this.a);
            case 19:
                return sq.a(this.a) != null ? ajl.b : ajl.a;
            default:
                ajq ajqVar2 = (ajq) this.a;
                return Boolean.valueOf(ajqVar2.A(ajqVar2.d.a()));
        }
    }
}
