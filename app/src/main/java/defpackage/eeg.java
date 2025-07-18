package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeg extends drn {
    public final eei a;
    final dru d;
    public final BitSet e;
    private final String[] f;

    public eeg(dru druVar, eei eeiVar) {
        super(druVar, eeiVar);
        this.f = new String[]{"section"};
        BitSet bitSet = new BitSet(1);
        this.e = bitSet;
        this.a = eeiVar;
        this.d = druVar;
        bitSet.clear();
    }

    @Override // defpackage.drn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eei a() {
        j(1, this.e, this.f);
        eei eeiVar = this.a;
        dtx dtxVarQ = eeiVar.H;
        if (dtxVarQ == null) {
            dtxVarQ = eei.q(this.d, eeiVar, -1505688212);
        }
        eeiVar.H = dtxVarQ;
        dtx dtxVarQ2 = eeiVar.I;
        if (dtxVarQ2 == null) {
            dtxVarQ2 = eei.q(this.d, eeiVar, -238194236);
        }
        eeiVar.I = dtxVarQ2;
        dtx dtxVarQ3 = eeiVar.J;
        if (dtxVarQ3 == null) {
            dtxVarQ3 = eei.q(this.d, eeiVar, -1017305181);
        }
        eeiVar.J = dtxVarQ3;
        return eeiVar;
    }

    public final void c(float f) {
        dxl dxlVar = this.b;
        this.a.a = dxlVar.a(f);
    }

    @Override // defpackage.drn
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void r() {
        this.a.d = false;
    }

    public final void e(float f) {
        dxl dxlVar = this.b;
        this.a.y = dxlVar.a(f);
    }

    public final void f(qi qiVar) {
        if (qiVar == null) {
            return;
        }
        eei eeiVar = this.a;
        if (eeiVar.B == Collections.EMPTY_LIST) {
            eeiVar.B = new ArrayList();
        }
        eeiVar.B.add(qiVar);
    }

    public final void g(float f) {
        dxl dxlVar = this.b;
        this.a.E = dxlVar.a(f);
    }

    public final void h(float f) {
        dxl dxlVar = this.b;
        this.a.G = dxlVar.a(f);
    }

    @Override // defpackage.drn
    public final /* synthetic */ void q(boolean z) {
        this.a.c = z;
    }
}
