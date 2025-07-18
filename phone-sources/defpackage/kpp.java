package defpackage;

import android.content.Context;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpp implements yjz {
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kpp(boolean z, arl arlVar, yjz yjzVar, int i) {
        this.d = i;
        this.a = z;
        this.b = arlVar;
        this.c = yjzVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yjz] */
    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            bao baoVar = (bao) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && baoVar.K()) {
                baoVar.t();
            } else {
                bkp bkpVarV = this.a ? wv.v(bkp.g, 16.0f, 0.0f, 0.0f, 6.0f, 6) : wv.v(bkp.g, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                Object obj3 = this.c;
                kuw kuwVar = ((CompanionBarFragment) obj3).i;
                if (kuwVar == null) {
                    yks.c("composeThemeProvider");
                    kuwVar = null;
                }
                kuwVar.a(null, null, false, bga.k(727429470, new ano(obj3, this.b, bkpVarV, 8, (short[]) null), baoVar), baoVar, 35840, 7);
            }
            return ygi.a;
        }
        bao baoVar2 = (bao) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && baoVar2.K()) {
            baoVar2.t();
        } else if (this.a) {
            baoVar2.x(-834803188);
            rdd.O((arl) this.b, null, null, rdd.K(), this.c, baoVar2, 0);
            baoVar2.p();
        } else {
            baoVar2.x(-834610430);
            chc chcVar = ppp.a;
            chc chcVar2 = ppp.d;
            chc chcVar3 = ppp.e;
            chc chcVar4 = ppp.f;
            chc chcVar5 = ppp.g;
            chc chcVar6 = ppp.h;
            chc chcVar7 = ppp.i;
            chc chcVar8 = ppp.m;
            chc chcVar9 = ppp.n;
            chc chcVar10 = ppp.o;
            chc chcVar11 = ppp.a;
            chc chcVar12 = ppp.b;
            chc chcVar13 = ppp.c;
            chc chcVar14 = ppp.j;
            chc chcVar15 = ppp.k;
            chc chcVar16 = ppp.l;
            chc chcVar17 = ppo.a;
            chc chcVar18 = ppo.d;
            chc chcVar19 = ppo.e;
            chc chcVar20 = ppo.f;
            chc chcVar21 = ppo.g;
            chc chcVar22 = ppo.h;
            chc chcVar23 = ppo.i;
            chc chcVar24 = ppo.m;
            chc chcVar25 = ppo.n;
            chc chcVar26 = ppo.o;
            chc chcVar27 = ppo.a;
            chc chcVar28 = ppo.b;
            chc chcVar29 = ppo.c;
            chc chcVar30 = ppo.j;
            chc chcVar31 = ppo.k;
            chc chcVar32 = ppo.l;
            chcVar2.getClass();
            chcVar3.getClass();
            chcVar4.getClass();
            chcVar5.getClass();
            chcVar6.getClass();
            chcVar7.getClass();
            chcVar8.getClass();
            chcVar9.getClass();
            chcVar10.getClass();
            chcVar11.getClass();
            chcVar12.getClass();
            chcVar13.getClass();
            chcVar14.getClass();
            chcVar15.getClass();
            chcVar16.getClass();
            chcVar18.getClass();
            chcVar19.getClass();
            chcVar20.getClass();
            chcVar21.getClass();
            chcVar22.getClass();
            chcVar23.getClass();
            chcVar24.getClass();
            chcVar25.getClass();
            chcVar26.getClass();
            chcVar27.getClass();
            chcVar28.getClass();
            chcVar29.getClass();
            chcVar30.getClass();
            chcVar31.getClass();
            chcVar32.getClass();
            rdd.N((arl) this.b, null, new axg(chcVar2, chcVar3, chcVar4, chcVar5, chcVar6, chcVar7, chcVar8, chcVar9, chcVar10, chcVar11, chcVar12, chcVar13, chcVar14, chcVar15, chcVar16, chcVar18, chcVar19, chcVar20, chcVar21, chcVar22, chcVar23, chcVar24, chcVar25, chcVar26, chcVar27, chcVar28, chcVar29, chcVar30, chcVar31, chcVar32), this.c, baoVar2, 0);
            baoVar2.p();
        }
        return ygi.a;
    }

    public kpp(boolean z, CompanionBarFragment companionBarFragment, Context context, int i) {
        this.d = i;
        this.a = z;
        this.c = companionBarFragment;
        this.b = context;
    }
}
