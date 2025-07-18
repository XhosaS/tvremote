package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzq {
    public final String a;
    public final ttm b;
    final /* synthetic */ rzr c;

    public rzq(rzr rzrVar, String str, final int i, final int i2) {
        this.c = rzrVar;
        this.a = str;
        this.b = new rzn(new ttm() { // from class: rzp
            @Override // defpackage.ttm
            public final Object get() throws Resources.NotFoundException, IOException {
                vtw vtwVarM = uit.a.m();
                rzq rzqVar = this.a;
                int i3 = i;
                try {
                    Resources resourcesA = rzqVar.c.a();
                    if (resourcesA == null) {
                        return null;
                    }
                    rzqVar.a(vtwVarM, resourcesA, i3);
                    long jLongValue = ((Long) rzqVar.c.c.get()).longValue();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uit uitVar = (uit) vtwVarM.b;
                    uitVar.b |= 128;
                    uitVar.l = jLongValue;
                    String strV = nuh.v(uitVar.g);
                    String str2 = rzqVar.a;
                    sij.z(strV.equals(str2), "Resource package does not match expected package, expected package: %s", str2);
                    uit uitVar2 = (uit) vtwVarM.b;
                    String strCq = uitVar2.g;
                    rzr rzrVar2 = rzqVar.c;
                    boolean z = uitVar2.h;
                    if (strCq.isEmpty()) {
                        throw new IllegalArgumentException("Empty configuration package");
                    }
                    String str3 = rzrVar2.a;
                    if (z) {
                        if (strCq.indexOf(35) >= 0) {
                            throw new IllegalArgumentException(String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', strCq));
                        }
                        strCq = a.cq(str3, strCq, "#");
                    }
                    if (((uit) vtwVarM.b).c != 2) {
                        Integer num = (Integer) rzrVar2.d.get();
                        num.intValue();
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        uit uitVar3 = (uit) vtwVarM.b;
                        uitVar3.c = 2;
                        uitVar3.d = num;
                    }
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar = vtwVarM.b;
                    uit uitVar4 = (uit) vucVar;
                    strCq.getClass();
                    uitVar4.b = 1 | uitVar4.b;
                    uitVar4.g = strCq;
                    if (!vucVar.A()) {
                        vtwVarM.u();
                    }
                    vuc vucVar2 = vtwVarM.b;
                    uit uitVar5 = (uit) vucVar2;
                    str3.getClass();
                    uitVar5.e = 7;
                    uitVar5.f = str3;
                    if (!vucVar2.A()) {
                        vtwVarM.u();
                    }
                    int i4 = i2;
                    uit uitVar6 = (uit) vtwVarM.b;
                    uitVar6.k = 3;
                    uitVar6.b |= 32;
                    if (i4 == 0) {
                        return (uit) vtwVarM.r();
                    }
                    vtw vtwVarM2 = rzl.a.m();
                    rzqVar.a(vtwVarM2, resourcesA, i4);
                    String str4 = ((rzl) vtwVarM2.b).c;
                    String str5 = rzqVar.a;
                    sij.A(str4.equals(str5), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((rzl) vtwVarM2.b).c, str5);
                    if (!vtwVarM2.b.A()) {
                        vtwVarM2.u();
                    }
                    rzl rzlVar = (rzl) vtwVarM2.b;
                    rzlVar.b &= -2;
                    rzlVar.c = rzl.a.c;
                    vsz vszVarE = ((rzl) vtwVarM2.r()).e();
                    if (!vtwVarM.b.A()) {
                        vtwVarM.u();
                    }
                    uit uitVar7 = (uit) vtwVarM.b;
                    uitVar7.b |= 256;
                    uitVar7.m = vszVarE;
                    return (uit) vtwVarM.r();
                } catch (PackageManager.NameNotFoundException | IOException | NullPointerException unused) {
                    return null;
                }
            }
        });
    }

    public final void a(vvi vviVar, Resources resources, int i) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            this.c.f.a++;
            vte vteVarN = vte.N(inputStreamOpenRawResource, Math.max(512, Math.min(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, inputStreamOpenRawResource.available())));
            vtp vtpVar = vtp.a;
            vvs vvsVar = vvs.a;
            ((vtw) vviVar).i(vteVarN, vtp.a);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
