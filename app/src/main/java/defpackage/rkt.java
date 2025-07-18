package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rkt implements rkq {
    private String a = rla.b;
    private Object b = null;
    private final rkq c;

    public rkt(rkq rkqVar) {
        this.c = rkqVar;
    }

    @Override // defpackage.rkq
    public final rkp a(rfr rfrVar, String str) {
        rkp rkpVarA;
        synchronized (this) {
            String str2 = this.a;
            if (str2 == rla.b) {
                rkpVarA = ((rkr) this.c).a.a(rfrVar, str);
                this.a = str;
                this.b = rkpVarA;
            } else {
                String str3 = rla.a;
                if (str2 == str3) {
                    Object obj = this.b;
                    obj.getClass();
                    wx wxVar = (wx) obj;
                    rkp rkpVar = (rkp) wxVar.get(str);
                    if (rkpVar == null) {
                        rkpVarA = ((rkr) this.c).a.a(rfrVar, str);
                        wxVar.put(str, rkpVarA);
                    } else {
                        rkpVarA = rkpVar;
                    }
                } else if (str.equals(str2)) {
                    Object obj2 = this.b;
                    obj2.getClass();
                    rkpVarA = (rkp) obj2;
                } else {
                    rkpVarA = ((rkr) this.c).a.a(rfrVar, str);
                    wx wxVar2 = new wx(0);
                    String str4 = this.a;
                    Object obj3 = this.b;
                    obj3.getClass();
                    wxVar2.put(str4, (rkp) obj3);
                    wxVar2.put(str, rkpVarA);
                    this.a = str3;
                    this.b = wxVar2;
                }
            }
        }
        return rkpVarA;
    }
}
