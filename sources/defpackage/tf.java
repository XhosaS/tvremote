package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tf extends rg {
    final /* synthetic */ tg b;
    private final HashMap c = new HashMap();

    public tf(tg tgVar) {
        this.b = tgVar;
    }

    private static final boolean e(apl aplVar) {
        return (aplVar.f() & 519) != 0;
    }

    @Override // defpackage.rg
    public final void a(sf sfVar, List list) {
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            apl aplVar = (apl) list.get(size);
            Integer num = (Integer) this.c.get(aplVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fG = ((ro) aplVar.a).g();
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
        tg tgVar = this.b;
        tg.a(sfVar);
        ArrayList arrayList = tgVar.b;
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                tc.b((tc) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.rg
    public final void b(apl aplVar) {
        if (!e(aplVar)) {
            return;
        }
        this.c.remove(aplVar);
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            tc tcVar = (tc) arrayList.get(size);
            int i = tcVar.c;
            int i2 = i - 1;
            tcVar.c = i2;
            if (i > 0 && i2 == 0) {
                tc.b(tcVar);
            }
        }
    }

    @Override // defpackage.rg
    public final void c(apl aplVar) {
        if (!e(aplVar)) {
            return;
        }
        ArrayList arrayList = this.b.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((tc) arrayList.get(size)).c++;
        }
    }

    @Override // defpackage.rg
    public final void d(apl aplVar, rf rfVar) {
        if (e(aplVar)) {
            nt ntVar = rfVar.b;
            nt ntVar2 = rfVar.a;
            int i = ntVar.b != ntVar2.b ? 1 : 0;
            if (ntVar.c != ntVar2.c) {
                i |= 2;
            }
            if (ntVar.d != ntVar2.d) {
                i |= 4;
            }
            if (ntVar.e != ntVar2.e) {
                i |= 8;
            }
            this.c.put(aplVar, Integer.valueOf(i));
        }
    }
}
