package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class ako extends aib {
    final /* synthetic */ akp b;
    private final HashMap c = new HashMap();

    public ako(akp akpVar) {
        this.b = akpVar;
    }

    private final boolean e(aik aikVar) {
        return (aikVar.a.i() & 519) != 0;
    }

    @Override // defpackage.aib
    public final void a(aik aikVar) {
        if (!e(aikVar)) {
            return;
        }
        this.c.remove(aikVar);
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            akk akkVar = (akk) arrayList.get(size);
            int i = akkVar.c;
            int i2 = i - 1;
            akkVar.c = i2;
            if (i > 0 && i2 == 0) {
                akkVar.a();
            }
        }
    }

    @Override // defpackage.aib
    public final void b(aik aikVar) {
        if (!e(aikVar)) {
            return;
        }
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((akk) arrayList.get(size)).c++;
        }
    }

    @Override // defpackage.aib
    public final void c(ajc ajcVar, List list) {
        ArrayList arrayList;
        int size;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            aik aikVar = (aik) list.get(size2);
            Integer num = (Integer) this.c.get(aikVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fG = aikVar.a.g();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fG;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fG;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fG;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fG;
                }
            }
        }
        akp akpVar = this.b;
        akpVar.a(ajcVar);
        ArrayList arrayList2 = akpVar.b;
        int size3 = arrayList2.size();
        do {
            size3--;
            if (size3 < 0) {
                return;
            }
            arrayList = ((akk) arrayList2.get(size3)).a;
            size = arrayList.size() - 1;
        } while (size < 0);
        throw null;
    }

    @Override // defpackage.aib
    public final void d(aik aikVar, aia aiaVar) {
        if (e(aikVar)) {
            acs acsVar = aiaVar.b;
            acs acsVar2 = aiaVar.a;
            int i = acsVar.b != acsVar2.b ? 1 : 0;
            if (acsVar.c != acsVar2.c) {
                i |= 2;
            }
            if (acsVar.d != acsVar2.d) {
                i |= 4;
            }
            if (acsVar.e != acsVar2.e) {
                i |= 8;
            }
            this.c.put(aikVar, Integer.valueOf(i));
        }
    }
}
