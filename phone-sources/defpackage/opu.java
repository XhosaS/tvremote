package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class opu implements yjv {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ opu(String str, long j, int i, int i2) {
        this.d = i2;
        this.c = str;
        this.b = j;
        this.a = i;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        if (this.d != 0) {
            long j = ikt.a;
            ghi ghiVarA = ((gic) obj).a("SELECT DISTINCT * FROM search_history WHERE account_name = ? AND last_write_mills > ? ORDER BY last_write_mills DESC LIMIT ?");
            int i = this.a;
            long j2 = this.b;
            try {
                ghiVarA.i(1, (String) this.c);
                ghiVarA.g(2, j2);
                ghiVarA.g(3, i);
                int iJ = gez.J(ghiVarA, "account_name");
                int iJ2 = gez.J(ghiVarA, "query");
                int iJ3 = gez.J(ghiVarA, "last_write_mills");
                ArrayList arrayList = new ArrayList();
                while (ghiVarA.l()) {
                    arrayList.add(new imh(ghiVarA.d(iJ), ghiVarA.d(iJ2), ghiVarA.b(iJ3)));
                }
                return arrayList;
            } finally {
                ghiVarA.close();
            }
        }
        wcx wcxVar = (wcx) obj;
        wcxVar.getClass();
        vun vunVar = wcxVar.b;
        vunVar.getClass();
        boolean zIsEmpty = vunVar.isEmpty();
        int i2 = this.a;
        if (!zIsEmpty) {
            Iterator<E> it = vunVar.iterator();
            while (it.hasNext()) {
                if (((wcw) it.next()).c == i2) {
                    return wcxVar;
                }
            }
        }
        ((ylb) this.c).a = true;
        vtw vtwVarM = wcw.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wcw wcwVar = (wcw) vucVar;
        wcwVar.b = 1 | wcwVar.b;
        wcwVar.c = i2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        long j3 = this.b;
        wcw wcwVar2 = (wcw) vtwVarM.b;
        wcwVar2.b = 2 | wcwVar2.b;
        wcwVar2.d = j3;
        vuc vucVarR = vtwVarM.r();
        vucVarR.getClass();
        vtw vtwVar = (vtw) wcxVar.a(5, null);
        vtwVar.x(wcxVar);
        vtwVar.aB((wcw) vucVarR);
        return (wcx) vtwVar.r();
    }

    public /* synthetic */ opu(ylb ylbVar, int i, long j, int i2) {
        this.d = i2;
        this.c = ylbVar;
        this.a = i;
        this.b = j;
    }
}
