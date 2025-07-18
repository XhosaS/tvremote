package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aak extends adg {
    public final long a;
    public final aae b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ bkc f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ long i;
    final /* synthetic */ aan j;
    final /* synthetic */ adc k;
    final /* synthetic */ bkh l;
    private final adc m;

    public aak(long j, boolean z, aae aaeVar, adc adcVar, int i, int i2, bkc bkcVar, bkh bkhVar, int i3, int i4, long j2, aan aanVar) {
        this.c = z;
        this.k = adcVar;
        this.d = i;
        this.e = i2;
        this.f = bkcVar;
        this.l = bkhVar;
        this.g = i3;
        this.h = i4;
        this.i = j2;
        this.j = aanVar;
        this.b = aaeVar;
        this.m = adcVar;
        this.a = clw.k(z ? clv.b(j) : Integer.MAX_VALUE, z ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : clv.a(j), 5);
    }

    public final aaj a(int i, long j) {
        aae aaeVar = this.b;
        Object objD = aaeVar.d(i);
        aaeVar.c(i);
        int i2 = this.d;
        List listE = e(this.m, i, j);
        int i3 = i == i2 + (-1) ? 0 : this.e;
        return new aaj(i, listE, this.c, this.f, this.l, this.k.n(), this.g, this.h, i3, this.i, objD, this.j.j, j);
    }

    @Override // defpackage.adg
    public final /* synthetic */ add b(int i, int i2, int i3, long j) {
        return a(i, j);
    }

    public final eph d() {
        return this.b.b;
    }
}
