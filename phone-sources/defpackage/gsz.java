package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsz extends yiz implements yka {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public gsz(yih yihVar) {
        super(3, yihVar);
    }

    @Override // defpackage.yka
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        gsz gszVar = new gsz((yih) obj3);
        gszVar.c = (ysy) obj;
        gszVar.b = (Object[]) obj2;
        return gszVar.invokeSuspend(ygi.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, ysy] */
    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        fki fkiVar;
        yio yioVar = yio.a;
        int i = this.a;
        ybn.f(obj);
        if (i == 0) {
            ?? r7 = this.c;
            fki[] fkiVarArr = (fki[]) this.b;
            int length = fkiVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    fkiVar = null;
                    break;
                }
                fkiVar = fkiVarArr[i2];
                if (!yks.e(fkiVar, gss.a)) {
                    break;
                }
                i2++;
            }
            if (fkiVar == null) {
                fkiVar = gss.a;
            }
            this.a = 1;
            if (r7.emit(fkiVar, this) == yioVar) {
                return yioVar;
            }
        }
        return ygi.a;
    }
}
