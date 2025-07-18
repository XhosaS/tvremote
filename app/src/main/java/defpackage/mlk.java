package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* compiled from: PG */
/* loaded from: classes.dex */
class mlk extends qi implements nzw {
    private final float a;
    private final boolean b;
    private final eeo c;
    private int d;
    private int e;
    private final int f;

    public mlk(ngd ngdVar, Context context, eeo eeoVar) {
        Resources resources = context.getResources();
        this.a = resources.getDisplayMetrics().density;
        this.b = oha.a(resources);
        this.f = ngdVar.C();
        this.c = eeoVar;
    }

    @Override // defpackage.nzw
    public final nzv a(nzv nzvVar) {
        float width;
        float height;
        acyk acykVar;
        RecyclerView recyclerViewC = this.c.c();
        if (recyclerViewC == null) {
            return nzvVar;
        }
        float fComputeHorizontalScrollOffset = recyclerViewC.computeHorizontalScrollOffset();
        float fComputeVerticalScrollOffset = recyclerViewC.computeVerticalScrollOffset();
        float fComputeHorizontalScrollRange = recyclerViewC.computeHorizontalScrollRange();
        float fComputeVerticalScrollRange = recyclerViewC.computeVerticalScrollRange();
        float measuredWidth = recyclerViewC.getMeasuredWidth();
        float measuredHeight = recyclerViewC.getMeasuredHeight();
        pq adapter = recyclerViewC.getAdapter();
        int iA = adapter != null ? adapter.a() : 0;
        boolean z = this.b;
        float f = z ? ((fComputeHorizontalScrollRange - measuredWidth) - fComputeHorizontalScrollOffset) / this.a : fComputeHorizontalScrollOffset / this.a;
        acta actaVar = acta.a;
        acsz acszVar = new acsz();
        acyb acybVar = acyb.a;
        acya acyaVar = new acya();
        float f2 = this.a;
        float f3 = fComputeHorizontalScrollOffset / f2;
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar2 = (acyb) acyaVar.b;
        acybVar2.b |= 1;
        acybVar2.c = f3;
        float f4 = fComputeVerticalScrollOffset / f2;
        if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar.y();
        }
        acyb acybVar3 = (acyb) acyaVar.b;
        acybVar3.b |= 2;
        acybVar3.d = f4;
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar2 = (acta) acszVar.b;
        acyb acybVar4 = (acyb) acyaVar.v();
        acybVar4.getClass();
        actaVar2.d = acybVar4;
        actaVar2.c |= 1;
        int i = this.f;
        String str = mll.a;
        int iK = -1;
        if (i == 2) {
            View viewO = recyclerViewC.o(recyclerViewC.getWidth() / 2, recyclerViewC.getHeight() / 2);
            if (viewO != null) {
                iK = recyclerViewC.d(viewO);
            }
        } else {
            qd layoutManager = recyclerViewC.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iK = (z && linearLayoutManager.k == 0) ? linearLayoutManager.N() : linearLayoutManager.L();
            } else if (layoutManager instanceof FlowLayoutManager) {
                FlowLayoutManager flowLayoutManager = (FlowLayoutManager) layoutManager;
                iK = (z && flowLayoutManager.a == 0) ? flowLayoutManager.k() : flowLayoutManager.i();
            }
        }
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar3 = (acta) acszVar.b;
        actaVar3.c |= 4;
        actaVar3.f = iK;
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar4 = (acta) acszVar.b;
        actaVar4.c |= 8;
        actaVar4.g = iA;
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar5 = (acta) acszVar.b;
        actaVar5.c |= 32;
        actaVar5.i = f;
        acys acysVar = acys.a;
        acyr acyrVar = new acyr();
        float f5 = fComputeVerticalScrollRange / f2;
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar2 = (acys) acyrVar.b;
        acysVar2.b |= 2;
        acysVar2.d = f5;
        float f6 = fComputeHorizontalScrollRange / f2;
        if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar.y();
        }
        acys acysVar3 = (acys) acyrVar.b;
        acysVar3.b |= 1;
        acysVar3.c = f6;
        acys acysVar4 = (acys) acyrVar.v();
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar6 = (acta) acszVar.b;
        acysVar4.getClass();
        actaVar6.h = acysVar4;
        actaVar6.c |= 16;
        acya acyaVar2 = new acya();
        float f7 = this.d / f2;
        if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar2.y();
        }
        acyb acybVar5 = (acyb) acyaVar2.b;
        acybVar5.b |= 1;
        acybVar5.c = f7;
        float f8 = this.e / f2;
        if ((acyaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyaVar2.y();
        }
        acyb acybVar6 = (acyb) acyaVar2.b;
        acybVar6.b |= 2;
        acybVar6.d = f8;
        if ((acszVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acszVar.y();
        }
        acta actaVar7 = (acta) acszVar.b;
        acyb acybVar7 = (acyb) acyaVar2.v();
        acybVar7.getClass();
        actaVar7.e = acybVar7;
        actaVar7.c |= 2;
        Object parent = recyclerViewC.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            width = view.getWidth();
            height = view.getHeight();
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        recyclerViewC.getWindowVisibleDisplayFrame(new Rect());
        actl actlVar = actl.a;
        actk actkVar = new actk();
        acub acubVar = acub.a;
        acua acuaVar = new acua();
        acyr acyrVar2 = new acyr();
        float f9 = measuredWidth / f2;
        if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar2.y();
        }
        acys acysVar5 = (acys) acyrVar2.b;
        acysVar5.b |= 1;
        acysVar5.c = f9;
        float f10 = measuredHeight / f2;
        if ((acyrVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar2.y();
        }
        acys acysVar6 = (acys) acyrVar2.b;
        acysVar6.b |= 2;
        acysVar6.d = f10;
        acys acysVar7 = (acys) acyrVar2.v();
        if ((acuaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar.y();
        }
        acub acubVar2 = (acub) acuaVar.b;
        acysVar7.getClass();
        acubVar2.c = acysVar7;
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
        acyr acyrVar3 = new acyr();
        float f11 = width / f2;
        if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar3.y();
        }
        acys acysVar8 = (acys) acyrVar3.b;
        acysVar8.b |= 1;
        acysVar8.c = f11;
        float f12 = height / f2;
        if ((acyrVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar3.y();
        }
        acys acysVar9 = (acys) acyrVar3.b;
        acysVar9.b |= 2;
        acysVar9.d = f12;
        acys acysVar10 = (acys) acyrVar3.v();
        if ((acuaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar2.y();
        }
        acub acubVar4 = (acub) acuaVar2.b;
        acysVar10.getClass();
        acubVar4.c = acysVar10;
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
        acyr acyrVar4 = new acyr();
        float fWidth = r4.width() / f2;
        if ((acyrVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar4.y();
        }
        acys acysVar11 = (acys) acyrVar4.b;
        acysVar11.b |= 1;
        acysVar11.c = fWidth;
        float fHeight = r4.height() / f2;
        if ((acyrVar4.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acyrVar4.y();
        }
        acys acysVar12 = (acys) acyrVar4.b;
        acysVar12.b |= 2;
        acysVar12.d = fHeight;
        acys acysVar13 = (acys) acyrVar4.v();
        if ((acuaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acuaVar3.y();
        }
        acub acubVar6 = (acub) acuaVar3.b;
        acysVar13.getClass();
        acubVar6.c = acysVar13;
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
        nyu nyuVar = (nyu) nzvVar;
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = nyuVar.c;
        if (senderStateOuterClass$SenderState != null) {
            acykVar = new acyk();
            acykVar.B(senderStateOuterClass$SenderState);
        } else {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = SenderStateOuterClass$SenderState.a;
            acykVar = new acyk();
        }
        acykVar.f(acta.b, (acta) acszVar.v());
        acykVar.f(actl.b, actlVar5);
        nyuVar.c = (SenderStateOuterClass$SenderState) acykVar.v();
        return nzvVar;
    }

    @Override // defpackage.qi
    public final void d(RecyclerView recyclerView, int i, int i2) {
        this.d = i;
        this.e = i2;
    }
}
