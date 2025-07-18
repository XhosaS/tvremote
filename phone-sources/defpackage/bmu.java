package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmu extends ykt implements yjv {
    final /* synthetic */ bmr a;
    final /* synthetic */ bmr b;
    final /* synthetic */ int c;
    final /* synthetic */ yjv d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmu(ydk ydkVar, bmr bmrVar, bmr bmrVar2, bmr bmrVar3, int i, yjv yjvVar, int i2) {
        super(1);
        this.g = i2;
        this.f = ydkVar;
        this.a = bmrVar;
        this.e = bmrVar2;
        this.b = bmrVar3;
        this.c = i;
        this.d = yjvVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [bxv, java.lang.Object] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        if (this.g != 0) {
            buj bujVar = (buj) obj;
            int i = ((ydk) this.f).a;
            ?? r0 = this.e;
            if (this.a != ((cbc) fh.K(r0)).K.e) {
                return true;
            }
            boolean zF = d.F((bmr) r0, this.b, this.c, this.d);
            Boolean boolValueOf = Boolean.valueOf(zF);
            boolValueOf.getClass();
            if (zF || !bujVar.a()) {
                return boolValueOf;
            }
            return null;
        }
        buj bujVar2 = (buj) obj;
        int i2 = ((ydk) this.e).a;
        bmr bmrVar = this.b;
        if (this.a != ((cbc) fh.K(bmrVar)).K.e) {
            return true;
        }
        boolean zC = d.C(bmrVar, (bmy) this.f, this.c, this.d);
        Boolean boolValueOf2 = Boolean.valueOf(zC);
        boolValueOf2.getClass();
        if (zC || !bujVar2.a()) {
            return boolValueOf2;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmu(ydk ydkVar, bmr bmrVar, bmr bmrVar2, bmy bmyVar, int i, yjv yjvVar, int i2) {
        super(1);
        this.g = i2;
        this.e = ydkVar;
        this.a = bmrVar;
        this.b = bmrVar2;
        this.f = bmyVar;
        this.c = i;
        this.d = yjvVar;
    }
}
