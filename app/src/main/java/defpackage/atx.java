package defpackage;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class atx extends atn {
    public ayo ai;
    public boolean ak;
    public boolean am;
    public awl an;
    public awk ao;
    public qk ap;
    public ArrayList aq;
    private int st;
    public boolean aj = true;
    private int su = Integer.MIN_VALUE;
    public final boolean al = true;
    private final aym sv = new att(this);

    public static azw aG(ayo ayoVar) {
        if (ayoVar == null) {
            return null;
        }
        return ((azx) ayoVar.s).y(ayoVar.t);
    }

    public static void aH(ayo ayoVar, boolean z) {
        ((azx) ayoVar.s).B(ayoVar.t, z);
    }

    public static void aI(ayo ayoVar, boolean z, boolean z2) {
        atw atwVar = (atw) ayoVar.v;
        TimeAnimator timeAnimator = atwVar.d;
        timeAnimator.end();
        float f = true != z ? 0.0f : 1.0f;
        if (z2) {
            atwVar.b.C(atwVar.c, f);
        } else {
            azx azxVar = atwVar.b;
            azk azkVar = atwVar.c;
            if (azxVar.y(azkVar).p != f) {
                float f2 = azxVar.y(azkVar).p;
                atwVar.g = f2;
                atwVar.h = f - f2;
                timeAnimator.start();
            }
        }
        azx azxVar2 = (azx) ayoVar.s;
        azw azwVarY = azxVar2.y(ayoVar.t);
        azwVarY.m = z;
        azxVar2.i(azwVarY, z);
    }

    @Override // defpackage.atn
    public final void aB() {
        ayq ayqVar = this.c;
        ayqVar.s(((atn) this).a);
        ayqVar.e = null;
        ayqVar.a.a();
        if (this.b != null) {
            dT();
        }
        this.ai = null;
        this.ak = false;
        if (ayqVar != null) {
            ayqVar.g = this.sv;
        }
    }

    public final void aJ(int i, azl azlVar) {
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView == null) {
            return;
        }
        atv atvVar = new atv(azlVar);
        qv qvVarK = verticalGridView.k(i, false);
        if (qvVarK == null || verticalGridView.as()) {
            verticalGridView.ad.K(new awe(verticalGridView, i, atvVar));
        } else {
            atvVar.a(qvVarK);
        }
        verticalGridView.setSelectedPositionSmooth(i);
    }

    @Override // defpackage.bq
    public void aa(View view, Bundle bundle) {
        if (bundle != null) {
            this.d = bundle.getInt("currentSelectedPosition", -1);
        }
        dT();
        VerticalGridView verticalGridView = this.b;
        verticalGridView.ad.ai(this.ah);
        this.b.setItemAlignmentViewId(R.id.row_content);
        this.b.setSaveChildrenPolicy(2);
        int i = this.su;
        if (i != Integer.MIN_VALUE) {
            this.su = i;
            VerticalGridView verticalGridView2 = this.b;
            if (verticalGridView2 != null) {
                verticalGridView2.setItemAlignmentOffset(0);
                verticalGridView2.setItemAlignmentOffsetPercent(-1.0f);
                verticalGridView2.aD(true);
                verticalGridView2.setWindowAlignmentOffset(this.su);
                verticalGridView2.setWindowAlignmentOffsetPercent(-1.0f);
                verticalGridView2.setWindowAlignment(0);
            }
        }
        this.ap = null;
        this.aq = null;
    }

    public final azw dO(int i) {
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView == null) {
            return null;
        }
        return aG((ayo) verticalGridView.j(i));
    }

    @Override // defpackage.atn
    public final VerticalGridView dP(View view) {
        return (VerticalGridView) view.findViewById(R.id.container_list);
    }

    @Override // defpackage.atn
    public final void dQ(qv qvVar, int i) {
        ayo ayoVar = this.ai;
        if (ayoVar == qvVar && this.st == i) {
            return;
        }
        this.st = i;
        if (ayoVar != null) {
            aI(ayoVar, false, false);
        }
        ayo ayoVar2 = (ayo) qvVar;
        this.ai = ayoVar2;
        if (ayoVar2 != null) {
            aI(ayoVar2, true, false);
        }
    }

    @Override // defpackage.atn
    public final void dR() {
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView == null) {
            this.e = true;
            return;
        }
        verticalGridView.aB(false);
        this.b.ad.bz(false);
        this.am = true;
        VerticalGridView verticalGridView2 = this.b;
        if (verticalGridView2 != null) {
            int childCount = verticalGridView2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ayo ayoVar = (ayo) verticalGridView2.l(verticalGridView2.getChildAt(i));
                azx azxVar = (azx) ayoVar.s;
                azxVar.e(azxVar.y(ayoVar.t), true);
            }
        }
    }

    @Override // defpackage.atn
    public final /* bridge */ /* synthetic */ void dS(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView == null || this.f.a) {
            return;
        }
        verticalGridView.setSelectedPositionSmooth(i);
    }

    @Override // defpackage.bq
    public void e() {
        this.ak = false;
        this.ai = null;
        this.ap = null;
        this.P = true;
        this.f.f();
        VerticalGridView verticalGridView = this.b;
        if (verticalGridView != null) {
            verticalGridView.az(null);
            this.b = null;
        }
    }
}
