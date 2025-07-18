package defpackage;

import android.view.View;
import com.google.android.katniss.R;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqx extends sx {
    public final List a;
    public int b;
    private final oal c;
    private final nzu d;
    private final oaa e;
    private final agfx f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mqx(defpackage.oal r4, defpackage.nzu r5, defpackage.ngd r6, defpackage.oaa r7, defpackage.agfx r8) {
        /*
            r3 = this;
            boolean r0 = r6.s()
            if (r0 == 0) goto L21
            nfz r0 = r6.i()
            mii r1 = defpackage.njf.Q
            boolean r0 = r0.b(r1)
            r1 = 15
            if (r0 != 0) goto L2c
            nfz r0 = r6.i()
            mii r2 = defpackage.njb.P
            boolean r0 = r0.b(r2)
            if (r0 == 0) goto L21
            goto L2c
        L21:
            int r6 = r6.A()
            r0 = 2
            if (r6 != r0) goto L2b
            r1 = 12
            goto L2c
        L2b:
            r1 = 3
        L2c:
            r3.<init>(r1)
            r6 = -1
            r3.b = r6
            r3.c = r4
            r3.d = r5
            r3.e = r7
            r3.f = r8
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqx.<init>(oal, nzu, ngd, oaa, agfx):void");
    }

    @Override // defpackage.st
    public final void c(qv qvVar) {
        View view = qvVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            int[] iArr = ahj.a;
            ahc.j(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        int iCs = qvVar.cs();
        int i = this.b;
        if (i != -1 && i != iCs) {
            mqq mqqVar = (mqq) this.d;
            mqqVar.a.moveItem(i, iCs);
            ogq ogqVar = mqqVar.c;
            CommandOuterClass$Command commandOuterClass$CommandA = ogqVar != null ? ogqVar.a() : null;
            int i2 = this.b;
            if (commandOuterClass$CommandA != null) {
                nzv nzvVarP = nzx.p();
                SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
                acyk acykVar = new acyk();
                abxc abxcVar = acvo.b;
                acvn acvnVar = new acvn();
                if ((acvnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvnVar.y();
                }
                acvo acvoVar = (acvo) acvnVar.b;
                acvoVar.c |= 2;
                acvoVar.d = i2;
                if ((acvnVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    acvnVar.y();
                }
                acvo acvoVar2 = (acvo) acvnVar.b;
                acvoVar2.c |= 4;
                acvoVar2.e = iCs;
                acykVar.f(abxcVar, (acvo) acvnVar.v());
                ((nyu) nzvVarP).c = (SenderStateOuterClass$SenderState) acykVar.v();
                aggi aggiVarK = this.e.a(commandOuterClass$CommandA, nzvVarP.e()).j(this.f).k();
                aghb aghbVar = ((nyx) this.c).f;
                if (aghbVar != null) {
                    aghbVar.a(aggiVarK);
                }
            }
        }
        this.b = -1;
    }
}
