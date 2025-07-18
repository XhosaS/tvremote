package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.WindowInsets;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class se {
    static int a(int i) {
        int iStatusBars;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i3 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i2 |= iStatusBars;
            }
        }
        return i2;
    }

    public static boolean aK(cwr cwrVar) {
        if (cwrVar != null) {
            return ((long) cwrVar.c) <= 0 && ((long) cwrVar.d) <= 0;
        }
        return true;
    }

    public static ActionMode.Callback b(ActionMode.Callback callback) {
        return (!(callback instanceof to) || Build.VERSION.SDK_INT < 26) ? callback : ((to) callback).a;
    }

    public static ActionMode.Callback c(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof to) || callback == null) ? callback : new to(callback, textView);
    }

    public static void d(TextView textView, int i) {
        qk.r(i);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(TextView textView, int i) {
        qk.r(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void f(TextView textView, int i) {
        qk.r(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void g(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            textView.setLineHeight(i, f);
        } else {
            f(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void h(zf zfVar, List list) {
        if (zfVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        if (list.contains(zfVar)) {
            throw new IllegalArgumentException("route descriptor already added");
        }
        list.add(zfVar);
    }

    public static void i(String str, Bundle bundle) {
        bundle.putString("clientPackageName", str);
    }

    public static long j(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List k(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : atr.a.d(healthStats.getTimers(i));
    }

    public static Map l(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static cwn m(String str) {
        clo cloVarO = cwn.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cwn cwnVar = (cwn) cloVarO.b;
        cwnVar.b |= 2;
        cwnVar.d = str;
        return (cwn) cloVarO.i();
    }

    public static cws n(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return p(null, healthStats.getTimer(i));
    }

    public static cws o(cws cwsVar, cws cwsVar2) {
        if (cwsVar == null || cwsVar2 == null) {
            return cwsVar;
        }
        int i = cwsVar.c - cwsVar2.c;
        long j = cwsVar.d - cwsVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        clo cloVarO = cws.a.o();
        if ((cwsVar.b & 4) != 0) {
            cwn cwnVar = cwsVar.e;
            if (cwnVar == null) {
                cwnVar = cwn.a;
            }
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cws cwsVar3 = (cws) cloVarO.b;
            cwnVar.getClass();
            cwsVar3.e = cwnVar;
            cwsVar3.b |= 4;
        }
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        cws cwsVar4 = (cws) cltVar;
        cwsVar4.b |= 1;
        cwsVar4.c = i;
        if (!cltVar.A()) {
            cloVarO.l();
        }
        cws cwsVar5 = (cws) cloVarO.b;
        cwsVar5.b |= 2;
        cwsVar5.d = j;
        return (cws) cloVarO.i();
    }

    public static cws p(String str, TimerStat timerStat) {
        clo cloVarO = cws.a.o();
        int count = timerStat.getCount();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        cws cwsVar = (cws) cloVarO.b;
        cwsVar.b |= 1;
        cwsVar.c = count;
        long time = timerStat.getTime();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        clt cltVar = cloVarO.b;
        cws cwsVar2 = (cws) cltVar;
        cwsVar2.b |= 2;
        cwsVar2.d = time;
        if (cwsVar2.c < 0) {
            if (!cltVar.A()) {
                cloVarO.l();
            }
            cws cwsVar3 = (cws) cloVarO.b;
            cwsVar3.b |= 1;
            cwsVar3.c = 0;
        }
        if (str != null) {
            cwn cwnVarM = m(str);
            if (!cloVarO.b.A()) {
                cloVarO.l();
            }
            cws cwsVar4 = (cws) cloVarO.b;
            cwnVarM.getClass();
            cwsVar4.e = cwnVarM;
            cwsVar4.b |= 4;
        }
        cws cwsVar5 = (cws) cloVarO.b;
        if (cwsVar5.c == 0 && cwsVar5.d == 0) {
            return null;
        }
        return (cws) cloVarO.i();
    }

    public static cwt q(cwt cwtVar, cwt cwtVar2) {
        cws cwsVar;
        cws cwsVar2;
        cws cwsVar3;
        cws cwsVar4;
        cws cwsVar5;
        cws cwsVar6;
        cws cwsVar7;
        cws cwsVar8;
        cws cwsVar9;
        cws cwsVar10;
        cws cwsVar11;
        cws cwsVar12;
        cws cwsVar13;
        cws cwsVar14;
        cws cwsVar15;
        cws cwsVar16;
        cws cwsVar17;
        cws cwsVar18;
        cws cwsVar19;
        cws cwsVar20;
        cws cwsVar21;
        cws cwsVar22;
        cws cwsVar23;
        cws cwsVar24;
        cws cwsVar25;
        cws cwsVar26;
        cws cwsVar27;
        cws cwsVar28;
        cws cwsVar29;
        cws cwsVar30;
        cws cwsVar31;
        cws cwsVar32;
        if (cwtVar != null && cwtVar2 != null) {
            clo cloVarO = cwt.a.o();
            if ((cwtVar.b & 1) != 0) {
                long j = cwtVar.d - cwtVar2.d;
                if (j != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar3 = (cwt) cloVarO.b;
                    cwtVar3.b |= 1;
                    cwtVar3.d = j;
                }
            }
            if ((cwtVar.b & 2) != 0) {
                long j2 = cwtVar.e - cwtVar2.e;
                if (j2 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar4 = (cwt) cloVarO.b;
                    cwtVar4.b |= 2;
                    cwtVar4.e = j2;
                }
            }
            if ((cwtVar.b & 4) != 0) {
                long j3 = cwtVar.f - cwtVar2.f;
                if (j3 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar5 = (cwt) cloVarO.b;
                    cwtVar5.b |= 4;
                    cwtVar5.f = j3;
                }
            }
            if ((cwtVar.b & 8) != 0) {
                long j4 = cwtVar.g - cwtVar2.g;
                if (j4 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar6 = (cwt) cloVarO.b;
                    cwtVar6.b |= 8;
                    cwtVar6.g = j4;
                }
            }
            atr atrVar = atr.a;
            cloVarO.G(atrVar.e(cwtVar.h, cwtVar2.h));
            cloVarO.H(atrVar.e(cwtVar.i, cwtVar2.i));
            cloVarO.I(atrVar.e(cwtVar.j, cwtVar2.j));
            cloVarO.F(atrVar.e(cwtVar.k, cwtVar2.k));
            cloVarO.E(atrVar.e(cwtVar.l, cwtVar2.l));
            cloVarO.A(atrVar.e(cwtVar.m, cwtVar2.m));
            if ((cwtVar.b & 16) != 0) {
                cwsVar = cwtVar.n;
                if (cwsVar == null) {
                    cwsVar = cws.a;
                }
            } else {
                cwsVar = null;
            }
            if ((cwtVar2.b & 16) != 0) {
                cwsVar2 = cwtVar2.n;
                if (cwsVar2 == null) {
                    cwsVar2 = cws.a;
                }
            } else {
                cwsVar2 = null;
            }
            cws cwsVarO = o(cwsVar, cwsVar2);
            if (cwsVarO != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar7 = (cwt) cloVarO.b;
                cwtVar7.n = cwsVarO;
                cwtVar7.b |= 16;
            }
            cloVarO.B(atrVar.e(cwtVar.o, cwtVar2.o));
            cloVarO.D(ato.a.e(cwtVar.q, cwtVar2.q));
            cloVarO.C(atn.a.e(cwtVar.r, cwtVar2.r));
            if ((cwtVar.b & 32) != 0) {
                long j5 = cwtVar.w - cwtVar2.w;
                if (j5 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar8 = (cwt) cloVarO.b;
                    cwtVar8.b |= 32;
                    cwtVar8.w = j5;
                }
            }
            if ((cwtVar.b & 64) != 0) {
                long j6 = cwtVar.x - cwtVar2.x;
                if (j6 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar9 = (cwt) cloVarO.b;
                    cwtVar9.b |= 64;
                    cwtVar9.x = j6;
                }
            }
            if ((cwtVar.b & 128) != 0) {
                long j7 = cwtVar.y - cwtVar2.y;
                if (j7 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar10 = (cwt) cloVarO.b;
                    cwtVar10.b |= 128;
                    cwtVar10.y = j7;
                }
            }
            if ((cwtVar.b & 256) != 0) {
                long j8 = cwtVar.z - cwtVar2.z;
                if (j8 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar11 = (cwt) cloVarO.b;
                    cwtVar11.b |= 256;
                    cwtVar11.z = j8;
                }
            }
            if ((cwtVar.b & 512) != 0) {
                long j9 = cwtVar.A - cwtVar2.A;
                if (j9 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar12 = (cwt) cloVarO.b;
                    cwtVar12.b |= 512;
                    cwtVar12.A = j9;
                }
            }
            if ((cwtVar.b & 1024) != 0) {
                long j10 = cwtVar.B - cwtVar2.B;
                if (j10 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar13 = (cwt) cloVarO.b;
                    cwtVar13.b |= 1024;
                    cwtVar13.B = j10;
                }
            }
            if ((cwtVar.b & 2048) != 0) {
                long j11 = cwtVar.C - cwtVar2.C;
                if (j11 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar14 = (cwt) cloVarO.b;
                    cwtVar14.b |= 2048;
                    cwtVar14.C = j11;
                }
            }
            if ((cwtVar.b & 4096) != 0) {
                long j12 = cwtVar.D - cwtVar2.D;
                if (j12 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar15 = (cwt) cloVarO.b;
                    cwtVar15.b |= 4096;
                    cwtVar15.D = j12;
                }
            }
            if ((cwtVar.b & 8192) != 0) {
                long j13 = cwtVar.E - cwtVar2.E;
                if (j13 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar16 = (cwt) cloVarO.b;
                    cwtVar16.b |= 8192;
                    cwtVar16.E = j13;
                }
            }
            if ((cwtVar.b & 16384) != 0) {
                long j14 = cwtVar.F - cwtVar2.F;
                if (j14 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar17 = (cwt) cloVarO.b;
                    cwtVar17.b |= 16384;
                    cwtVar17.F = j14;
                }
            }
            if ((cwtVar.b & 32768) != 0) {
                long j15 = cwtVar.G - cwtVar2.G;
                if (j15 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar18 = (cwt) cloVarO.b;
                    cwtVar18.b |= 32768;
                    cwtVar18.G = j15;
                }
            }
            if ((cwtVar.b & 65536) != 0) {
                long j16 = cwtVar.H - cwtVar2.H;
                if (j16 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar19 = (cwt) cloVarO.b;
                    cwtVar19.b |= 65536;
                    cwtVar19.H = j16;
                }
            }
            if ((cwtVar.b & 131072) != 0) {
                long j17 = cwtVar.I - cwtVar2.I;
                if (j17 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar20 = (cwt) cloVarO.b;
                    cwtVar20.b |= 131072;
                    cwtVar20.I = j17;
                }
            }
            if ((cwtVar.b & 262144) != 0) {
                long j18 = cwtVar.J - cwtVar2.J;
                if (j18 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar21 = (cwt) cloVarO.b;
                    cwtVar21.b |= 262144;
                    cwtVar21.J = j18;
                }
            }
            if ((cwtVar.b & 524288) != 0) {
                cwsVar3 = cwtVar.K;
                if (cwsVar3 == null) {
                    cwsVar3 = cws.a;
                }
            } else {
                cwsVar3 = null;
            }
            if ((cwtVar2.b & 524288) != 0) {
                cwsVar4 = cwtVar2.K;
                if (cwsVar4 == null) {
                    cwsVar4 = cws.a;
                }
            } else {
                cwsVar4 = null;
            }
            cws cwsVarO2 = o(cwsVar3, cwsVar4);
            if (cwsVarO2 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar22 = (cwt) cloVarO.b;
                cwtVar22.K = cwsVarO2;
                cwtVar22.b |= 524288;
            }
            if ((cwtVar.b & 1048576) != 0) {
                long j19 = cwtVar.L - cwtVar2.L;
                if (j19 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar23 = (cwt) cloVarO.b;
                    cwtVar23.b |= 1048576;
                    cwtVar23.L = j19;
                }
            }
            if ((cwtVar.b & 2097152) != 0) {
                cwsVar5 = cwtVar.M;
                if (cwsVar5 == null) {
                    cwsVar5 = cws.a;
                }
            } else {
                cwsVar5 = null;
            }
            if ((cwtVar2.b & 2097152) != 0) {
                cwsVar6 = cwtVar2.M;
                if (cwsVar6 == null) {
                    cwsVar6 = cws.a;
                }
            } else {
                cwsVar6 = null;
            }
            cws cwsVarO3 = o(cwsVar5, cwsVar6);
            if (cwsVarO3 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar24 = (cwt) cloVarO.b;
                cwtVar24.M = cwsVarO3;
                cwtVar24.b |= 2097152;
            }
            if ((cwtVar.b & 4194304) != 0) {
                cwsVar7 = cwtVar.N;
                if (cwsVar7 == null) {
                    cwsVar7 = cws.a;
                }
            } else {
                cwsVar7 = null;
            }
            if ((cwtVar2.b & 4194304) != 0) {
                cwsVar8 = cwtVar2.N;
                if (cwsVar8 == null) {
                    cwsVar8 = cws.a;
                }
            } else {
                cwsVar8 = null;
            }
            cws cwsVarO4 = o(cwsVar7, cwsVar8);
            if (cwsVarO4 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar25 = (cwt) cloVarO.b;
                cwtVar25.N = cwsVarO4;
                cwtVar25.b |= 4194304;
            }
            if ((cwtVar.b & 8388608) != 0) {
                cwsVar9 = cwtVar.O;
                if (cwsVar9 == null) {
                    cwsVar9 = cws.a;
                }
            } else {
                cwsVar9 = null;
            }
            if ((cwtVar2.b & 8388608) != 0) {
                cwsVar10 = cwtVar2.O;
                if (cwsVar10 == null) {
                    cwsVar10 = cws.a;
                }
            } else {
                cwsVar10 = null;
            }
            cws cwsVarO5 = o(cwsVar9, cwsVar10);
            if (cwsVarO5 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar26 = (cwt) cloVarO.b;
                cwtVar26.O = cwsVarO5;
                cwtVar26.b |= 8388608;
            }
            if ((cwtVar.b & 16777216) != 0) {
                cwsVar11 = cwtVar.P;
                if (cwsVar11 == null) {
                    cwsVar11 = cws.a;
                }
            } else {
                cwsVar11 = null;
            }
            if ((cwtVar2.b & 16777216) != 0) {
                cwsVar12 = cwtVar2.P;
                if (cwsVar12 == null) {
                    cwsVar12 = cws.a;
                }
            } else {
                cwsVar12 = null;
            }
            cws cwsVarO6 = o(cwsVar11, cwsVar12);
            if (cwsVarO6 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar27 = (cwt) cloVarO.b;
                cwtVar27.P = cwsVarO6;
                cwtVar27.b |= 16777216;
            }
            if ((cwtVar.b & 33554432) != 0) {
                cwsVar13 = cwtVar.Q;
                if (cwsVar13 == null) {
                    cwsVar13 = cws.a;
                }
            } else {
                cwsVar13 = null;
            }
            if ((cwtVar2.b & 33554432) != 0) {
                cwsVar14 = cwtVar2.Q;
                if (cwsVar14 == null) {
                    cwsVar14 = cws.a;
                }
            } else {
                cwsVar14 = null;
            }
            cws cwsVarO7 = o(cwsVar13, cwsVar14);
            if (cwsVarO7 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar28 = (cwt) cloVarO.b;
                cwtVar28.Q = cwsVarO7;
                cwtVar28.b |= 33554432;
            }
            if ((cwtVar.b & 67108864) != 0) {
                cwsVar15 = cwtVar.R;
                if (cwsVar15 == null) {
                    cwsVar15 = cws.a;
                }
            } else {
                cwsVar15 = null;
            }
            if ((cwtVar2.b & 67108864) != 0) {
                cwsVar16 = cwtVar2.R;
                if (cwsVar16 == null) {
                    cwsVar16 = cws.a;
                }
            } else {
                cwsVar16 = null;
            }
            cws cwsVarO8 = o(cwsVar15, cwsVar16);
            if (cwsVarO8 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar29 = (cwt) cloVarO.b;
                cwtVar29.R = cwsVarO8;
                cwtVar29.b |= 67108864;
            }
            if ((cwtVar.b & 134217728) != 0) {
                cwsVar17 = cwtVar.S;
                if (cwsVar17 == null) {
                    cwsVar17 = cws.a;
                }
            } else {
                cwsVar17 = null;
            }
            if ((cwtVar2.b & 134217728) != 0) {
                cwsVar18 = cwtVar2.S;
                if (cwsVar18 == null) {
                    cwsVar18 = cws.a;
                }
            } else {
                cwsVar18 = null;
            }
            cws cwsVarO9 = o(cwsVar17, cwsVar18);
            if (cwsVarO9 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar30 = (cwt) cloVarO.b;
                cwtVar30.S = cwsVarO9;
                cwtVar30.b |= 134217728;
            }
            if ((cwtVar.b & 268435456) != 0) {
                cwsVar19 = cwtVar.T;
                if (cwsVar19 == null) {
                    cwsVar19 = cws.a;
                }
            } else {
                cwsVar19 = null;
            }
            if ((cwtVar2.b & 268435456) != 0) {
                cwsVar20 = cwtVar2.T;
                if (cwsVar20 == null) {
                    cwsVar20 = cws.a;
                }
            } else {
                cwsVar20 = null;
            }
            cws cwsVarO10 = o(cwsVar19, cwsVar20);
            if (cwsVarO10 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar31 = (cwt) cloVarO.b;
                cwtVar31.T = cwsVarO10;
                cwtVar31.b |= 268435456;
            }
            if ((cwtVar.b & 536870912) != 0) {
                cwsVar21 = cwtVar.U;
                if (cwsVar21 == null) {
                    cwsVar21 = cws.a;
                }
            } else {
                cwsVar21 = null;
            }
            if ((cwtVar2.b & 536870912) != 0) {
                cwsVar22 = cwtVar2.U;
                if (cwsVar22 == null) {
                    cwsVar22 = cws.a;
                }
            } else {
                cwsVar22 = null;
            }
            cws cwsVarO11 = o(cwsVar21, cwsVar22);
            if (cwsVarO11 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar32 = (cwt) cloVarO.b;
                cwtVar32.U = cwsVarO11;
                cwtVar32.b |= 536870912;
            }
            if ((cwtVar.b & 1073741824) != 0) {
                cwsVar23 = cwtVar.V;
                if (cwsVar23 == null) {
                    cwsVar23 = cws.a;
                }
            } else {
                cwsVar23 = null;
            }
            if ((cwtVar2.b & 1073741824) != 0) {
                cwsVar24 = cwtVar2.V;
                if (cwsVar24 == null) {
                    cwsVar24 = cws.a;
                }
            } else {
                cwsVar24 = null;
            }
            cws cwsVarO12 = o(cwsVar23, cwsVar24);
            if (cwsVarO12 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar33 = (cwt) cloVarO.b;
                cwtVar33.V = cwsVarO12;
                cwtVar33.b |= 1073741824;
            }
            if ((cwtVar.b & Integer.MIN_VALUE) != 0) {
                cwsVar25 = cwtVar.W;
                if (cwsVar25 == null) {
                    cwsVar25 = cws.a;
                }
            } else {
                cwsVar25 = null;
            }
            if ((cwtVar2.b & Integer.MIN_VALUE) != 0) {
                cwsVar26 = cwtVar2.W;
                if (cwsVar26 == null) {
                    cwsVar26 = cws.a;
                }
            } else {
                cwsVar26 = null;
            }
            cws cwsVarO13 = o(cwsVar25, cwsVar26);
            if (cwsVarO13 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar34 = (cwt) cloVarO.b;
                cwtVar34.W = cwsVarO13;
                cwtVar34.b |= Integer.MIN_VALUE;
            }
            if ((cwtVar.c & 1) != 0) {
                cwsVar27 = cwtVar.X;
                if (cwsVar27 == null) {
                    cwsVar27 = cws.a;
                }
            } else {
                cwsVar27 = null;
            }
            if ((cwtVar2.c & 1) != 0) {
                cwsVar28 = cwtVar2.X;
                if (cwsVar28 == null) {
                    cwsVar28 = cws.a;
                }
            } else {
                cwsVar28 = null;
            }
            cws cwsVarO14 = o(cwsVar27, cwsVar28);
            if (cwsVarO14 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar35 = (cwt) cloVarO.b;
                cwtVar35.X = cwsVarO14;
                cwtVar35.c |= 1;
            }
            if ((cwtVar.c & 2) != 0) {
                cwsVar29 = cwtVar.Y;
                if (cwsVar29 == null) {
                    cwsVar29 = cws.a;
                }
            } else {
                cwsVar29 = null;
            }
            if ((cwtVar2.c & 2) != 0) {
                cwsVar30 = cwtVar2.Y;
                if (cwsVar30 == null) {
                    cwsVar30 = cws.a;
                }
            } else {
                cwsVar30 = null;
            }
            cws cwsVarO15 = o(cwsVar29, cwsVar30);
            if (cwsVarO15 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar36 = (cwt) cloVarO.b;
                cwtVar36.Y = cwsVarO15;
                cwtVar36.c |= 2;
            }
            if ((cwtVar.c & 4) != 0) {
                long j20 = cwtVar.Z - cwtVar2.Z;
                if (j20 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar37 = (cwt) cloVarO.b;
                    cwtVar37.c |= 4;
                    cwtVar37.Z = j20;
                }
            }
            if ((cwtVar.c & 8) != 0) {
                long j21 = cwtVar.aa - cwtVar2.aa;
                if (j21 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar38 = (cwt) cloVarO.b;
                    cwtVar38.c |= 8;
                    cwtVar38.aa = j21;
                }
            }
            if ((cwtVar.c & 16) != 0) {
                long j22 = cwtVar.ab - cwtVar2.ab;
                if (j22 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar39 = (cwt) cloVarO.b;
                    cwtVar39.c |= 16;
                    cwtVar39.ab = j22;
                }
            }
            if ((cwtVar.c & 32) != 0) {
                long j23 = cwtVar.ac - cwtVar2.ac;
                if (j23 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar40 = (cwt) cloVarO.b;
                    cwtVar40.c |= 32;
                    cwtVar40.ac = j23;
                }
            }
            if ((cwtVar.c & 64) != 0) {
                long j24 = cwtVar.ad - cwtVar2.ad;
                if (j24 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar41 = (cwt) cloVarO.b;
                    cwtVar41.c |= 64;
                    cwtVar41.ad = j24;
                }
            }
            if ((cwtVar.c & 128) != 0) {
                long j25 = cwtVar.ae - cwtVar2.ae;
                if (j25 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar42 = (cwt) cloVarO.b;
                    cwtVar42.c |= 128;
                    cwtVar42.ae = j25;
                }
            }
            if ((cwtVar.c & 256) != 0) {
                long j26 = cwtVar.af - cwtVar2.af;
                if (j26 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar43 = (cwt) cloVarO.b;
                    cwtVar43.c |= 256;
                    cwtVar43.af = j26;
                }
            }
            if ((cwtVar.c & 512) != 0) {
                long j27 = cwtVar.ag - cwtVar2.ag;
                if (j27 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar44 = (cwt) cloVarO.b;
                    cwtVar44.c |= 512;
                    cwtVar44.ag = j27;
                }
            }
            if ((cwtVar.c & 1024) != 0) {
                long j28 = cwtVar.ah - cwtVar2.ah;
                if (j28 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar45 = (cwt) cloVarO.b;
                    cwtVar45.c |= 1024;
                    cwtVar45.ah = j28;
                }
            }
            if ((cwtVar.c & 2048) != 0) {
                long j29 = cwtVar.ai - cwtVar2.ai;
                if (j29 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar46 = (cwt) cloVarO.b;
                    cwtVar46.c |= 2048;
                    cwtVar46.ai = j29;
                }
            }
            if ((cwtVar.c & 4096) != 0) {
                long j30 = cwtVar.aj - cwtVar2.aj;
                if (j30 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar47 = (cwt) cloVarO.b;
                    cwtVar47.c |= 4096;
                    cwtVar47.aj = j30;
                }
            }
            if ((cwtVar.c & 8192) != 0) {
                long j31 = cwtVar.ak - cwtVar2.ak;
                if (j31 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar48 = (cwt) cloVarO.b;
                    cwtVar48.c |= 8192;
                    cwtVar48.ak = j31;
                }
            }
            if ((cwtVar.c & 16384) != 0) {
                long j32 = cwtVar.al - cwtVar2.al;
                if (j32 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar49 = (cwt) cloVarO.b;
                    cwtVar49.c |= 16384;
                    cwtVar49.al = j32;
                }
            }
            if ((cwtVar.c & 32768) != 0) {
                long j33 = cwtVar.am - cwtVar2.am;
                if (j33 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar50 = (cwt) cloVarO.b;
                    cwtVar50.c = 32768 | cwtVar50.c;
                    cwtVar50.am = j33;
                }
            }
            if ((cwtVar.c & 65536) != 0) {
                long j34 = cwtVar.an - cwtVar2.an;
                if (j34 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar51 = (cwt) cloVarO.b;
                    cwtVar51.c |= 65536;
                    cwtVar51.an = j34;
                }
            }
            if ((cwtVar.c & 131072) != 0) {
                cwsVar31 = cwtVar.ao;
                if (cwsVar31 == null) {
                    cwsVar31 = cws.a;
                }
            } else {
                cwsVar31 = null;
            }
            if ((cwtVar2.c & 131072) != 0) {
                cwsVar32 = cwtVar2.ao;
                if (cwsVar32 == null) {
                    cwsVar32 = cws.a;
                }
            } else {
                cwsVar32 = null;
            }
            cws cwsVarO16 = o(cwsVar31, cwsVar32);
            if (cwsVarO16 != null) {
                if (!cloVarO.b.A()) {
                    cloVarO.l();
                }
                cwt cwtVar52 = (cwt) cloVarO.b;
                cwtVar52.ao = cwsVarO16;
                cwtVar52.c |= 131072;
            }
            if ((cwtVar.c & 262144) != 0) {
                long j35 = cwtVar.ap - cwtVar2.ap;
                if (j35 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar53 = (cwt) cloVarO.b;
                    cwtVar53.c |= 262144;
                    cwtVar53.ap = j35;
                }
            }
            if ((cwtVar.c & 524288) != 0) {
                long j36 = cwtVar.aq - cwtVar2.aq;
                if (j36 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar54 = (cwt) cloVarO.b;
                    cwtVar54.c |= 524288;
                    cwtVar54.aq = j36;
                }
            }
            if ((cwtVar.c & 1048576) != 0) {
                long j37 = cwtVar.ar - cwtVar2.ar;
                if (j37 != 0) {
                    if (!cloVarO.b.A()) {
                        cloVarO.l();
                    }
                    cwt cwtVar55 = (cwt) cloVarO.b;
                    cwtVar55.c |= 1048576;
                    cwtVar55.ar = j37;
                }
            }
            cwtVar = (cwt) cloVarO.i();
            if (u(cwtVar)) {
                return null;
            }
        }
        return cwtVar;
    }

    public static boolean r(cwo cwoVar) {
        if (cwoVar != null) {
            return cwoVar.c.size() == 0 && cwoVar.d.size() == 0;
        }
        return true;
    }

    public static boolean s(cwq cwqVar) {
        if (cwqVar != null) {
            return cwqVar.c <= 0 && cwqVar.d <= 0 && cwqVar.e <= 0 && cwqVar.f <= 0 && cwqVar.g <= 0 && cwqVar.h <= 0;
        }
        return true;
    }

    static boolean u(cwt cwtVar) {
        if (cwtVar != null) {
            return cwtVar.d <= 0 && cwtVar.e <= 0 && cwtVar.f <= 0 && cwtVar.g <= 0 && cwtVar.h.size() == 0 && cwtVar.i.size() == 0 && cwtVar.j.size() == 0 && cwtVar.k.size() == 0 && cwtVar.l.size() == 0 && cwtVar.m.size() == 0 && cwtVar.o.size() == 0 && cwtVar.p.size() == 0 && cwtVar.q.size() == 0 && cwtVar.r.size() == 0 && cwtVar.w <= 0 && cwtVar.x <= 0 && cwtVar.y <= 0 && cwtVar.z <= 0 && cwtVar.A <= 0 && cwtVar.B <= 0 && cwtVar.C <= 0 && cwtVar.D <= 0 && cwtVar.E <= 0 && cwtVar.F <= 0 && cwtVar.G <= 0 && cwtVar.H <= 0 && cwtVar.I <= 0 && cwtVar.J <= 0 && cwtVar.L <= 0 && cwtVar.Z <= 0 && cwtVar.aa <= 0 && cwtVar.ab <= 0 && cwtVar.ac <= 0 && cwtVar.ad <= 0 && cwtVar.ae <= 0 && cwtVar.af <= 0 && cwtVar.ag <= 0 && cwtVar.ah <= 0 && cwtVar.ai <= 0 && cwtVar.aj <= 0 && cwtVar.ak <= 0 && cwtVar.al <= 0 && cwtVar.am <= 0 && cwtVar.an <= 0 && cwtVar.ap <= 0 && cwtVar.aq <= 0 && cwtVar.ar <= 0;
        }
        return true;
    }
}
