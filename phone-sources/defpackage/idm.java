package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idm implements idf {
    private final /* synthetic */ int a;
    private final Object b;

    public idm(ieh iehVar, int i) {
        this.a = i;
        this.b = iehVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ieh, java.lang.Object] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        if (this.a == 0) {
            return this.b.a();
        }
        int i = 0;
        while (true) {
            idf[] idfVarArr = (idf[]) this.b;
            if (i >= idfVarArr.length) {
                return obj;
            }
            obj = idfVarArr[i].b(obj);
            i++;
        }
    }

    public idm(idf[] idfVarArr, int i) {
        this.a = i;
        idfVarArr.getClass();
        this.b = idfVarArr;
    }
}
