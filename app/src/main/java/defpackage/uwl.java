package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwl implements oeb {
    public final oaa a;
    public final uwm b;

    public uwl(oaa oaaVar, uwm uwmVar) {
        this.a = oaaVar;
        this.b = uwmVar;
    }

    @Override // defpackage.oeb
    public final abwk a() {
        return addh.b;
    }

    @Override // defpackage.oee
    public final /* bridge */ /* synthetic */ void b(dru druVar, oal oalVar, String str, Object obj, obz obzVar, nzw nzwVar) {
        addh addhVar = (addh) obj;
        boolean z = true;
        if (!addhVar.d) {
            int i = addhVar.c;
            if ((i & 2) == 0 && (i & 4) == 0 && (i & 8) == 0) {
                z = false;
            }
        }
        obzVar.a().P(z);
        if ((addhVar.c & 8) != 0) {
            obzVar.n(new uwi(this, addhVar));
        }
        if ((addhVar.c & 2) != 0) {
            obzVar.n(new uwj(this, addhVar, obzVar));
        }
        if ((addhVar.c & 4) != 0) {
            obzVar.n(new uwk(this, addhVar, obzVar));
        }
    }

    @Override // defpackage.oee
    public final /* synthetic */ void c(dru druVar, oal oalVar, String str, niv nivVar, Object obj, obz obzVar, nzw nzwVar) {
        throw null;
    }
}
