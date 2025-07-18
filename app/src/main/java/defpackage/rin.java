package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class rin extends rhz {
    private String a;
    private Object b;

    public rin(String str, rkq rkqVar) {
        super("com.google.android.katniss.oobe", str, rkqVar);
        this.a = rla.b;
        this.b = null;
    }

    private final riy m(String str) {
        riy riyVarL;
        synchronized (this) {
            String str2 = this.a;
            if (str2 == rla.b) {
                riyVarL = l();
                this.a = str;
                this.b = riyVarL;
            } else {
                String str3 = rla.a;
                if (str2 == str3) {
                    Object obj = this.b;
                    obj.getClass();
                    wx wxVar = (wx) obj;
                    riy riyVarL2 = (riy) wxVar.get(str);
                    if (riyVarL2 == null) {
                        riyVarL2 = l();
                        wxVar.put(str, riyVarL2);
                    }
                    riyVarL = riyVarL2;
                } else if (str.equals(str2)) {
                    Object obj2 = this.b;
                    obj2.getClass();
                    riyVarL = (riy) obj2;
                } else {
                    riyVarL = l();
                    wx wxVar2 = new wx(0);
                    String str4 = this.a;
                    Object obj3 = this.b;
                    obj3.getClass();
                    wxVar2.put(str4, (riy) obj3);
                    wxVar2.put(str, riyVarL);
                    this.a = str3;
                    this.b = wxVar2;
                }
            }
        }
        return riyVarL;
    }

    @Override // defpackage.rhz
    protected final Object h(rfr rfrVar) {
        return g(m(""), rfrVar, "");
    }

    @Override // defpackage.rhz
    protected final Object i(rfr rfrVar, String str) {
        Object objG = g(m(str), rfrVar, str);
        objG.getClass();
        return objG;
    }

    protected abstract riy l();
}
