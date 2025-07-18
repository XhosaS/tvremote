package com.google.android.apps.googletv.app.presentation.pages.aioverview;

import android.os.Bundle;
import defpackage.arl;
import defpackage.arm;
import defpackage.azd;
import defpackage.azg;
import defpackage.bao;
import defpackage.bck;
import defpackage.bcr;
import defpackage.bdi;
import defpackage.bhq;
import defpackage.fn;
import defpackage.ge;
import defpackage.jej;
import defpackage.jwq;
import defpackage.jxa;
import defpackage.jxs;
import defpackage.kdj;
import defpackage.kpo;
import defpackage.kpt;
import defpackage.kuw;
import defpackage.tug;
import defpackage.tui;
import defpackage.tvo;
import defpackage.yft;
import defpackage.ygi;
import defpackage.yjz;
import defpackage.ykl;
import defpackage.yks;
import defpackage.ylg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AiOverviewActivity extends jxs {
    public kuw a;
    public kdj b;
    private final yft d;
    public static final jwq Companion = new jwq();
    public static final int $stable = 8;
    private static final tui c = tui.l("com/google/android/apps/googletv/app/presentation/pages/aioverview/AiOverviewActivity");

    public static /* synthetic */ ygi $r8$lambda$hQqCoCjx7NvN5_yf59dYzBgwtWI(AiOverviewActivity aiOverviewActivity, long j, yjz yjzVar, int i, bao baoVar, int i2) {
        aiOverviewActivity.a(j, yjzVar, baoVar, bdi.n(i | 1));
        return ygi.a;
    }

    public AiOverviewActivity() {
        int i = ylg.a;
        this.d = new jej(new ykl(jxa.class), new bck(this, 2), this);
    }

    public static final /* synthetic */ jxa access$getViewModel(AiOverviewActivity aiOverviewActivity) {
        return (jxa) aiOverviewActivity.d.a();
    }

    public final void a(long j, yjz yjzVar, bao baoVar, int i) {
        int i2;
        yjzVar.getClass();
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-417911830);
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.H(this) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
        } else {
            long j2 = kpo.a;
            long jB = kpt.b(j, 6.0d, false);
            long jB2 = kpt.b(j, 84.0d, false);
            long jB3 = kpt.b(j, 96.0d, false);
            long j3 = kpo.a;
            long j4 = kpo.b;
            long j5 = kpo.c;
            long j6 = kpo.d;
            long j7 = kpo.e;
            arl arlVarD = arm.d(0L, j3, j4, 0L, jB, jB2, jB3, j7, j6, 0L, j5, -137724289);
            arl arlVarC = arm.c(0L, 0L, 0L, 0L, 0L, j3, j4, 0L, 0L, 0L, 0L, 0L, 0L, kpt.b(j, 6.0d, true), kpt.b(j, 84.0d, true), 0L, kpt.b(j, 96.0d, true), 0L, j7, j6, 0L, 0L, 0L, 0L, 0L, j5, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -137724289, 65535);
            kuw kuwVar = this.a;
            if (kuwVar == null) {
                yks.c("composeThemeProvider");
                kuwVar = null;
            }
            kuwVar.a(arlVarD, arlVarC, false, yjzVar, baoVarD, ((i2 << 6) & 7168) | 32768, 4);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(this, j, yjzVar, i, 6);
        }
    }

    @Override // defpackage.xcf, defpackage.by, defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((tug) c.b().h(tvo.a, "GTVm-AiOverview").j("com/google/android/apps/googletv/app/presentation/pages/aioverview/AiOverviewActivity", "onCreate", 33, "AiOverviewActivity.kt")).s("onCreate called");
        fn.a(this);
        ge.a(this, new bhq(-888372562, true, new azg(this, 7)));
    }

    @Override // android.support.v7.app.AppCompatActivity, defpackage.by, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ((tug) c.b().h(tvo.a, "GTVm-AiOverview").j("com/google/android/apps/googletv/app/presentation/pages/aioverview/AiOverviewActivity", "onDestroy", 56, "AiOverviewActivity.kt")).s("OnDestroy called");
    }
}
