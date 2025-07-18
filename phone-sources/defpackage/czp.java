package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czp extends cxj {
    final /* synthetic */ czq a;
    private final HashMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czp(czq czqVar) {
        super(0);
        this.a = czqVar;
        this.d = new HashMap();
    }

    private static final boolean e(nxb nxbVar) {
        return (nxbVar.o() & 519) != 0;
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            nxb nxbVar = (nxb) list.get(size);
            Integer num = (Integer) this.d.get(nxbVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fM = nxbVar.m();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fM;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fM;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fM;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fM;
                }
            }
        }
        czq czqVar = this.a;
        czq.a(cyhVar);
        ArrayList arrayList = czqVar.b;
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return cyhVar;
            }
            fqv.f((fqv) arrayList.get(size2));
        }
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        if (e(nxbVar)) {
            csr csrVar = cxiVar.b;
            csr csrVar2 = cxiVar.a;
            int i = csrVar.b != csrVar2.b ? 1 : 0;
            if (csrVar.c != csrVar2.c) {
                i |= 2;
            }
            if (csrVar.d != csrVar2.d) {
                i |= 4;
            }
            if (csrVar.e != csrVar2.e) {
                i |= 8;
            }
            this.d.put(nxbVar, Integer.valueOf(i));
        }
        return cxiVar;
    }

    @Override // defpackage.cxj
    public final void c(nxb nxbVar) {
        if (!e(nxbVar)) {
            return;
        }
        this.d.remove(nxbVar);
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            fqv fqvVar = (fqv) arrayList.get(size);
            int i = fqvVar.b;
            int i2 = i - 1;
            fqvVar.b = i2;
            if (i > 0 && i2 == 0) {
                fqv.f(fqvVar);
            }
        }
    }

    @Override // defpackage.cxj
    public final void d(nxb nxbVar) {
        if (!e(nxbVar)) {
            return;
        }
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((fqv) arrayList.get(size)).b++;
        }
    }
}
