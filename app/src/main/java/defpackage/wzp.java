package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wzp extends AtomicInteger {
    public static final wzl a;
    public final wzp b;
    public final String c;
    public volatile wzm currentMetadata;
    public final long d;
    public final wwc e;
    public int f;
    public wzp g;
    public boolean h;
    public volatile long i;
    int j;

    static {
        wzl wzoVar;
        try {
            wzoVar = new wzn();
        } catch (Error | RuntimeException unused) {
            wzoVar = new wzo();
        }
        a = wzoVar;
    }

    public wzp(wzp wzpVar, String str, long j, wwc wwcVar) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = wzpVar.f < 0 ? wzpVar.b : wzpVar;
        this.c = str;
        this.f = -1;
        this.d = j;
        this.e = wwcVar;
    }

    final int a() {
        wzp wzpVar = this.b;
        if (wzpVar == null) {
            return -1;
        }
        return wzpVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final wwc b() {
        wzm wzmVarA = a.a(this);
        if (wzmVarA == null) {
            return wwb.a;
        }
        wwa wwaVarB = wwb.a.b();
        while (wzmVarA != null) {
            wwaVarB.a(wzmVarA.a, wzmVarA.b);
            wzmVarA = wzmVarA.c;
        }
        return ((wwc) wwaVarB).e();
    }

    final boolean c() {
        return this.i != 0;
    }

    public final wvv d(int i) {
        wvv wvvVar = wvv.a;
        wvt wvtVar = new wvt();
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        String str = this.c;
        wvv wvvVar2 = (wvv) wvtVar.b;
        str.getClass();
        wvvVar2.b |= 1;
        wvvVar2.c = str;
        int i2 = this.f;
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        wvv wvvVar3 = (wvv) wvtVar.b;
        wvvVar3.b |= 2;
        wvvVar3.d = i2;
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        wvv wvvVar4 = (wvv) wvtVar.b;
        wvvVar4.b |= 4;
        wvvVar4.e = i;
        int i3 = this.j;
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        wvv wvvVar5 = (wvv) wvtVar.b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        wvvVar5.i = i4;
        wvvVar5.b |= 512;
        boolean z = this.h;
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        wvv wvvVar6 = (wvv) wvtVar.b;
        wvvVar6.b |= 1024;
        wvvVar6.j = z;
        long j = this.d;
        if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            wvtVar.y();
        }
        wvv wvvVar7 = (wvv) wvtVar.b;
        wvvVar7.b |= 8;
        wvvVar7.f = j / 1000000;
        long j2 = this.i;
        if (j2 != 0) {
            yqw.L(true);
            long j3 = (4611686018427387903L & j2) / 1000000;
            if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                wvtVar.y();
            }
            wvv wvvVar8 = (wvv) wvtVar.b;
            wvvVar8.b |= 32;
            wvvVar8.g = j3;
            yqw.L(true);
            boolean z2 = (j2 & 4611686018427387904L) != 0;
            if ((wvtVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                wvtVar.y();
            }
            wvv wvvVar9 = (wvv) wvtVar.b;
            wvvVar9.b |= 256;
            wvvVar9.h = z2;
        }
        return (wvv) wvtVar.v();
    }

    public wzp(String str, wwc wwcVar, int i) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = null;
        this.c = str;
        this.f = 0;
        this.d = 0L;
        this.e = wwcVar;
        this.i = i != 2 ? Long.MIN_VALUE : 0L;
    }
}
