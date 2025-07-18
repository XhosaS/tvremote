package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class sw implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ sw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v24, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = 4;
        switch (this.b) {
            case 0:
                int i2 = sy.a;
                this.a.a();
                return ygi.a;
            case 1:
                ?? r0 = this.a;
                qk qkVar = (qk) fh.P(r0, sc.a);
                sk skVar = (sk) r0;
                skVar.a = qkVar;
                qk qkVar2 = skVar.a;
                skVar.b = qkVar2 != null ? qkVar2.a() : null;
                return ygi.a;
            case 2:
                yrz yrzVar = ((ty) this.a).d;
                if (yrzVar != null) {
                    yrzVar.b(tk.a);
                }
                return ygi.a;
            case 3:
                return Boolean.valueOf(!((ty) this.a).v());
            case 4:
                return (un) ysd.a(this.a.m());
            case 5:
                return Boolean.valueOf(((bko) this.a).A);
            case 6:
                return new aad((yjv) this.a.a());
            case 7:
                return new aaz((yjv) this.a.a());
            case 8:
                return (acy) ((yjk) this.a.a()).a();
            case 9:
                return Float.valueOf(((adp) this.a).b.b());
            case 10:
                return Float.valueOf(((adp) this.a).b.a());
            case 11:
                adp adpVar = (adp) this.a;
                return Float.valueOf(adpVar.b.d() - adpVar.b.c());
            case 12:
                return this.a;
            case 13:
                ((aeg) this.a).k.a(Boolean.valueOf(!r0.j));
                return ygi.a;
            case 14:
                ahy ahyVar = afc.a;
                return ((alg) this.a).d(false);
            case 15:
                ahy ahyVar2 = afc.a;
                return ((alg) this.a).e(true, false);
            case 16:
                ahy ahyVar3 = afc.a;
                return ((alg) this.a).e(false, false);
            case 17:
                return this.a;
            case 18:
                Object obj = this.a;
                return Boolean.valueOf(obj != null ? ((Boolean) new afi(obj, i).a()).booleanValue() : false);
            case 19:
                Object obj2 = this.a;
                return Boolean.valueOf(obj2 != null ? ((Boolean) new afi(obj2, i).a()).booleanValue() : false);
            default:
                ?? r02 = this.a;
                if (r02 != 0) {
                    return (List) r02.a();
                }
                return null;
        }
    }
}
