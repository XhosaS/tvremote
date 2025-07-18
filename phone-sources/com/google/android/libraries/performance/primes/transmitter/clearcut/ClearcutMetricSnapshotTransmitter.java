package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import defpackage.eik;
import defpackage.nsz;
import defpackage.rnb;
import defpackage.rvv;
import defpackage.rvw;
import defpackage.rwa;
import defpackage.rwc;
import defpackage.rwg;
import defpackage.sij;
import defpackage.ttm;
import defpackage.tug;
import defpackage.tui;
import defpackage.ufn;
import defpackage.ugk;
import defpackage.uhl;
import defpackage.uho;
import defpackage.uhp;
import defpackage.vub;
import defpackage.vvd;
import defpackage.zba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClearcutMetricSnapshotTransmitter implements rvw {
    public static final ttm a = sij.l(new eik(11));
    public volatile nsz b;
    public volatile nsz c;
    private volatile rwg d;
    private final ttm e = sij.l(new eik(10));
    private volatile uho f;

    @Override // defpackage.rvw
    public final uhp a(Context context, rvv rvvVar) {
        vvd vvdVar = rwa.j;
        rvvVar.i(vvdVar);
        sij.o(rvvVar.l.m((vub) vvdVar.c), "ClearcutMetricSnapshotTransmitter received a snapshot without the expected extension.");
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new rwg();
                }
            }
        }
        zba zbaVar = rvvVar.c;
        if (zbaVar == null) {
            zbaVar = zba.a;
        }
        zba zbaVarB = rwg.b(zbaVar);
        tui tuiVar = rnb.a;
        if (((tug) tuiVar.d()).I()) {
            int i = zbaVarB.b;
            String str = (16777216 & i) == 0 ? null : "primes stats";
            int i2 = i & 32;
            int i3 = i & 16;
            int i4 = i & 8;
            int i5 = i & 256;
            int i6 = i & 64;
            int i7 = i & 1024;
            int i8 = i & 128;
            int i9 = i & RecyclerView.ItemAnimator.FLAG_MOVED;
            if (i2 != 0) {
                str = "network metric";
            }
            if (i3 != 0) {
                str = "timer metric";
            }
            if (i4 != 0) {
                str = "memory metric";
            }
            if (i5 != 0) {
                str = "battery metric";
            }
            if (i6 != 0) {
                str = "crash metric";
            }
            if (i7 != 0) {
                str = "jank metric";
            }
            if (i8 != 0) {
                str = "package metric";
            }
            if (i9 != 0) {
                str = "trace";
            }
            tug tugVar = (tug) ((tug) tuiVar.d()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "logSystemHealthMetric", 219, "ClearcutMetricSnapshotTransmitter.java");
            if (str == null) {
                str = "unknown";
            }
            tugVar.B("Sending Primes %s: %s", str, zbaVarB);
        }
        if (((Boolean) this.e.get()).booleanValue()) {
            return uhl.a;
        }
        vvd vvdVar2 = rwa.j;
        rvvVar.i(vvdVar2);
        Object objK = rvvVar.l.k((vub) vvdVar2.c);
        if (objK == null) {
            objK = vvdVar2.b;
        } else {
            vvdVar2.c(objK);
        }
        rwa rwaVar = (rwa) objK;
        if (((tug) tuiVar.d()).I()) {
            ((tug) ((tug) tuiVar.d()).j("com/google/android/libraries/performance/primes/transmitter/clearcut/ClearcutMetricSnapshotTransmitter", "transmit", R.styleable.AppCompatTheme_windowActionModeOverlay, "ClearcutMetricSnapshotTransmitter.java")).v("%s", Base64.encodeToString(zbaVarB.h(), 2));
        }
        boolean z = rwaVar.h;
        boolean z2 = (zbaVarB.b & 64) != 0;
        uho uhoVar = this.f;
        if (uhoVar == null) {
            synchronized (this) {
                uhoVar = this.f;
                if (uhoVar == null) {
                    uhoVar = new uho();
                    this.f = uhoVar;
                }
            }
        }
        return ufn.j(uhoVar.b(context, z, !z2), new rwc(this, context, zbaVarB, rwaVar, 0), ugk.a);
    }
}
