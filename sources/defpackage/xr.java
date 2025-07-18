package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xr implements xd {
    private final /* synthetic */ int a;
    private final Object b;

    public xr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, wx] */
    @Override // defpackage.xd
    public final void a(xf xfVar, xa xaVar) {
        wx[] wxVarArr;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ?? r4 = this.b;
                r4.a();
                r4.a();
                return;
            }
            new HashMap();
            int i2 = 0;
            while (true) {
                wxVarArr = (wx[]) this.b;
                if (i2 >= wxVarArr.length) {
                    break;
                }
                wxVarArr[i2].a();
                i2++;
            }
            for (wx wxVar : wxVarArr) {
                wxVar.a();
            }
            return;
        }
        if (xaVar != xa.ON_CREATE) {
            Objects.toString(xaVar);
            throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(xaVar.toString()));
        }
        xfVar.m().c(this);
        xv xvVar = (xv) this.b;
        if (xvVar.a) {
            return;
        }
        Bundle bundleC = xvVar.c.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleD = mo.D((csa[]) Arrays.copyOf(new csa[0], 0));
        Bundle bundle = xvVar.b;
        if (bundle != null) {
            bundleD.putAll(bundle);
        }
        if (bundleC != null) {
            bundleD.putAll(bundleC);
        }
        xvVar.b = bundleD;
        xvVar.a = true;
        xvVar.b();
    }
}
