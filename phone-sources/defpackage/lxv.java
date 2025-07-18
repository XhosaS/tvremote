package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxv implements idf {
    private final idf a;
    private final idf b;
    private final idf c;

    public lxv(idf idfVar, idf idfVar2, idf idfVar3) {
        this.a = idfVar;
        this.b = idfVar2;
        this.c = idfVar3;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        Object objB;
        Object objB2;
        String str;
        ieg iegVarC;
        xax xaxVar = (xax) obj;
        int i = xaxVar.b;
        if ((i & 16) == 0 || (i & 1) == 0 || (i & 2) == 0) {
            return ieg.b(new RuntimeException("Incomplete show asset resource:".concat(String.valueOf(String.valueOf(xaxVar)))));
        }
        xaz xazVar = xaxVar.c;
        if (xazVar == null) {
            xazVar = xaz.a;
        }
        if ((xazVar.b & 8) != 0) {
            xay xayVarB = xay.b(xazVar.f);
            if (xayVarB == null) {
                xayVarB = xay.ANDROID_APP;
            }
            if (xayVarB == xay.SEASON) {
                xar xarVar = xaxVar.g;
                if (xarVar == null) {
                    xarVar = xar.a;
                }
                xaz xazVar2 = xaxVar.d;
                if (xazVar2 == null) {
                    xazVar2 = xaz.a;
                }
                String str2 = xazVar2.c;
                if ((xarVar.b & 8192) != 0) {
                    xap xapVar = xarVar.r;
                    if (xapVar == null) {
                        xapVar = xap.a;
                    }
                    objB = this.b.b(xapVar.d);
                    objB2 = this.c.b(xapVar.d);
                    str = xapVar.b;
                } else {
                    ieg iegVar = (ieg) this.a.b(ksy.l(str2));
                    if (iegVar.k() || (((xax) iegVar.g()).b & 16) == 0) {
                        return ieg.b;
                    }
                    xar xarVar2 = ((xax) iegVar.g()).g;
                    if (xarVar2 == null) {
                        xarVar2 = xar.a;
                    }
                    objB = this.b.b(xarVar2.h);
                    objB2 = this.c.b(xarVar2.h);
                    str = xarVar2.c;
                }
                String str3 = xazVar.c;
                String str4 = xarVar.c;
                String str5 = xarVar.i;
                if ((xarVar.b & 65536) != 0) {
                    xaq xaqVar = xarVar.u;
                    if (xaqVar == null) {
                        xaqVar = xaq.a;
                    }
                    iegVarC = ksh.c(xaqVar.b);
                } else {
                    iegVarC = ieg.a;
                }
                xaq xaqVar2 = xarVar.u;
                if (xaqVar2 == null) {
                    xaqVar2 = xaq.a;
                }
                boolean z = xaqVar2.c;
                kwk kwkVarC = kwl.c(ksy.k(str3), ksy.l(str2));
                kwkVarC.k(str4);
                kwkVarC.j(str);
                kwkVarC.f((Uri) objB);
                kwkVarC.i((Uri) objB2);
                kwkVarC.h(str5);
                kwkVarC.e(ieg.f(kzj.b.b(xaxVar.j)));
                ArrayList arrayList = new ArrayList(xaxVar.e.size());
                Iterator<E> it = xaxVar.e.iterator();
                while (it.hasNext()) {
                    arrayList.add(ksy.b((xaz) it.next()));
                }
                kwkVarC.c(ImmutableList.copyOf((Collection) arrayList));
                kwkVarC.g(iegVarC);
                kwkVarC.d(z);
                kwkVarC.b(ktc.e(xaxVar.q));
                return ieg.f(kwkVarC.a());
            }
        }
        return ieg.b(new RuntimeException("Asset resource not season: ".concat(String.valueOf(String.valueOf(xaxVar)))));
    }
}
