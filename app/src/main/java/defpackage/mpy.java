package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mpy {
    public static float a(dru druVar, float f) {
        return f / druVar.a.getResources().getDisplayMetrics().density;
    }

    public static void b(oal oalVar) {
        acxn acxnVarQ = oalVar.Q();
        ocq ocqVarP = oalVar.P();
        if (ocqVarP == null || acxnVarQ == null) {
            return;
        }
        ocqVarP.a(acxnVarQ, 3);
    }

    public static void c(View view, oaa oaaVar, CommandOuterClass$Command commandOuterClass$Command, ocj ocjVar, obz obzVar, acyb acybVar, acys acysVar, float f) {
        float width;
        float height;
        nzv nzvVarP = nzx.p();
        nzvVarP.f(view);
        nyu nyuVar = (nyu) nzvVarP;
        nyuVar.e = ocjVar;
        nyuVar.d = obzVar;
        if (acybVar != null) {
            int[] iArr = ahj.a;
            float measuredWidth = view.getLayoutDirection() == 0 ? acybVar.c : (acysVar.c - (view.getMeasuredWidth() / f)) - acybVar.c;
            acyh acyhVar = acyh.a;
            acyg acygVar = new acyg();
            if ((acygVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acygVar.y();
            }
            acyh acyhVar2 = (acyh) acygVar.b;
            acyhVar2.d = acybVar;
            acyhVar2.c |= 1;
            if ((acygVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acygVar.y();
            }
            acyh acyhVar3 = (acyh) acygVar.b;
            acysVar.getClass();
            acyhVar3.e = acysVar;
            acyhVar3.c |= 2;
            if ((acygVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acygVar.y();
            }
            acyh acyhVar4 = (acyh) acygVar.b;
            acyhVar4.c |= 4;
            acyhVar4.f = measuredWidth;
            acyh acyhVar5 = (acyh) acygVar.v();
            Object parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                width = view2.getWidth();
                height = view2.getHeight();
            } else {
                width = 0.0f;
                height = 0.0f;
            }
            view.getWindowVisibleDisplayFrame(new Rect());
            actl actlVar = actl.a;
            actk actkVar = new actk();
            acub acubVar = acub.a;
            acua acuaVar = new acua();
            acys acysVar2 = acys.a;
            acyr acyrVar = new acyr();
            float measuredWidth2 = view.getMeasuredWidth() / f;
            if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar.y();
            }
            acys acysVar3 = (acys) acyrVar.b;
            acysVar3.b |= 1;
            acysVar3.c = measuredWidth2;
            float measuredHeight = view.getMeasuredHeight() / f;
            if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar.y();
            }
            acys acysVar4 = (acys) acyrVar.b;
            acysVar4.b |= 2;
            acysVar4.d = measuredHeight;
            acys acysVar5 = (acys) acyrVar.v();
            if ((acuaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acuaVar.y();
            }
            acub acubVar2 = (acub) acuaVar.b;
            acysVar5.getClass();
            acubVar2.c = acysVar5;
            acubVar2.b |= 1;
            acub acubVar3 = (acub) acuaVar.v();
            if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                actkVar.y();
            }
            actl actlVar2 = (actl) actkVar.b;
            acubVar3.getClass();
            actlVar2.d = acubVar3;
            actlVar2.c |= 1;
            acua acuaVar2 = new acua();
            acyr acyrVar2 = new acyr();
            float f2 = width / f;
            if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar2.y();
            }
            acys acysVar6 = (acys) acyrVar2.b;
            acysVar6.b |= 1;
            acysVar6.c = f2;
            float f3 = height / f;
            if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar2.y();
            }
            acys acysVar7 = (acys) acyrVar2.b;
            acysVar7.b |= 2;
            acysVar7.d = f3;
            acys acysVar8 = (acys) acyrVar2.v();
            if ((acuaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acuaVar2.y();
            }
            acub acubVar4 = (acub) acuaVar2.b;
            acysVar8.getClass();
            acubVar4.c = acysVar8;
            acubVar4.b |= 1;
            acub acubVar5 = (acub) acuaVar2.v();
            if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                actkVar.y();
            }
            actl actlVar3 = (actl) actkVar.b;
            acubVar5.getClass();
            actlVar3.e = acubVar5;
            actlVar3.c |= 2;
            acua acuaVar3 = new acua();
            acyr acyrVar3 = new acyr();
            float fWidth = r5.width() / f;
            if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar3.y();
            }
            acys acysVar9 = (acys) acyrVar3.b;
            acysVar9.b |= 1;
            acysVar9.c = fWidth;
            float fHeight = r5.height() / f;
            if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar3.y();
            }
            acys acysVar10 = (acys) acyrVar3.b;
            acysVar10.b |= 2;
            acysVar10.d = fHeight;
            acys acysVar11 = (acys) acyrVar3.v();
            if ((acuaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acuaVar3.y();
            }
            acub acubVar6 = (acub) acuaVar3.b;
            acysVar11.getClass();
            acubVar6.c = acysVar11;
            acubVar6.b |= 1;
            acub acubVar7 = (acub) acuaVar3.v();
            if ((actkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                actkVar.y();
            }
            actl actlVar4 = (actl) actkVar.b;
            acubVar7.getClass();
            actlVar4.f = acubVar7;
            actlVar4.c |= 4;
            actl actlVar5 = (actl) actkVar.v();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = SenderStateOuterClass$SenderState.a;
            acyk acykVar = new acyk();
            acykVar.f(acyh.b, acyhVar5);
            acykVar.f(actl.b, actlVar5);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar.v();
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState3 = nyuVar.c;
            if (senderStateOuterClass$SenderState3 != null) {
                acyk acykVar2 = new acyk();
                acykVar2.B(senderStateOuterClass$SenderState3);
                acykVar2.B(senderStateOuterClass$SenderState2);
                senderStateOuterClass$SenderState2 = (SenderStateOuterClass$SenderState) acykVar2.v();
            }
            nyuVar.c = senderStateOuterClass$SenderState2;
        }
        oaaVar.a(commandOuterClass$Command, nzvVarP.e()).k();
    }

    public static int d(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return 2;
    }
}
