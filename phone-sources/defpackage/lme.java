package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lme {
    public final Context a;
    public final int b;
    public lex c;
    public vtw d;

    public lme(Context context, lfn lfnVar) {
        this.a = context;
        this.b = lfnVar.o();
    }

    public static void a(vtw vtwVar, vtw vtwVar2, long j) {
        if (vtwVar2.a.A()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        vtwVar2.b = vtwVar2.q();
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        ldp ldpVar = (ldp) vtwVar2.b;
        ldp ldpVar2 = ldp.a;
        ldpVar.b |= 1;
        ldpVar.c = j;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        ldp ldpVar3 = (ldp) vtwVar2.b;
        ldpVar3.b |= 2;
        ldpVar3.d = 0;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        ldr ldrVar = (ldr) vtwVar.b;
        ldp ldpVar4 = (ldp) vtwVar2.r();
        ldr ldrVar2 = ldr.a;
        ldpVar4.getClass();
        ldrVar.b();
        ldrVar.d.add(ldpVar4);
    }
}
