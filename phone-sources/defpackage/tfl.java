package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tfl implements ont {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ tfl(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ont
    public final void a(onz onzVar) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            Object obj2 = ((tfs) obj).e;
            Object obj3 = this.b;
            synchronized (obj2) {
                ((tfs) obj).d.remove(obj3);
            }
            return;
        }
        if (i != 1) {
            ((uoj) this.a).g((Intent) this.b);
            return;
        }
        boolean zI = onzVar.i();
        Object obj4 = this.b;
        Object obj5 = this.a;
        if (!zI) {
            ((phz) obj5).d.j((oyd) obj4, pfq.FAILED_UNKNOWN);
        } else {
            phz phzVar = (phz) obj5;
            ufn.j(phzVar.d.j((oyd) obj4, pfq.SUCCESS), new pap(obj5, obj4, 4), phzVar.b);
        }
    }
}
