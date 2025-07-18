package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class snd implements sna {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.sna
    public final uvf a() {
        vtw vtwVarM = uvd.a.m();
        for (int i = 0; i < this.b; i++) {
            vtw vtwVarM2 = uvc.a.m();
            double d = this.a[i];
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            vuc vucVar = vtwVarM2.b;
            uvc uvcVar = (uvc) vucVar;
            uvcVar.b |= 1;
            uvcVar.c = d;
            if (!vucVar.A()) {
                vtwVarM2.u();
            }
            uvc uvcVar2 = (uvc) vtwVarM2.b;
            uvcVar2.b |= 2;
            uvcVar2.d = 1L;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uvd uvdVar = (uvd) vtwVarM.b;
            uvc uvcVar3 = (uvc) vtwVarM2.r();
            uvcVar3.getClass();
            vun vunVar = uvdVar.b;
            if (!vunVar.c()) {
                uvdVar.b = vuc.s(vunVar);
            }
            uvdVar.b.add(uvcVar3);
        }
        vtw vtwVarM3 = uvf.a.m();
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        uvf uvfVar = (uvf) vtwVarM3.b;
        uvd uvdVar2 = (uvd) vtwVarM.r();
        uvdVar2.getClass();
        uvfVar.c = uvdVar2;
        uvfVar.b = 3;
        return (uvf) vtwVarM3.r();
    }

    @Override // defpackage.sna
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
