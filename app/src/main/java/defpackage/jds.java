package defpackage;

import android.media.AudioManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jds {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/voice/libassistant/AssistantConfig");
    public static final udn b = new udn("");
    public static final boolean c = agvy.c(Build.MODEL, "JBL LINK BAR");
    public final boolean A;
    public final boolean B;
    public final int C;
    public final String D;
    public final String E;
    public final gxt F;
    public final AudioManager d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final int p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public jds(AudioManager audioManager, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i2, String str3, String str4, gxt gxtVar) {
        audioManager.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.d = audioManager;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = str2;
        this.p = i;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = z14;
        this.v = z15;
        this.w = z16;
        this.x = z17;
        this.y = z18;
        this.z = z19;
        this.A = z20;
        this.B = z21;
        this.C = i2;
        this.D = str3;
        this.E = str4;
        this.F = gxtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jds)) {
            return false;
        }
        jds jdsVar = (jds) obj;
        return agvy.c(this.d, jdsVar.d) && agvy.c(this.e, jdsVar.e) && this.f == jdsVar.f && this.g == jdsVar.g && this.h == jdsVar.h && this.i == jdsVar.i && this.j == jdsVar.j && this.k == jdsVar.k && this.l == jdsVar.l && this.m == jdsVar.m && this.n == jdsVar.n && agvy.c(this.o, jdsVar.o) && this.p == jdsVar.p && this.q == jdsVar.q && this.r == jdsVar.r && this.s == jdsVar.s && this.t == jdsVar.t && this.u == jdsVar.u && this.v == jdsVar.v && this.w == jdsVar.w && this.x == jdsVar.x && this.y == jdsVar.y && this.z == jdsVar.z && this.A == jdsVar.A && this.B == jdsVar.B && this.C == jdsVar.C && agvy.c(this.D, jdsVar.D) && agvy.c(this.E, jdsVar.E) && agvy.c(this.F, jdsVar.F);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.e.hashCode();
        String str = this.o;
        boolean z = this.n;
        boolean z2 = this.m;
        boolean z3 = this.l;
        boolean z4 = this.k;
        boolean z5 = this.j;
        boolean z6 = this.i;
        boolean z7 = this.h;
        int iA = (((((((((((((((((((iHashCode * 31) + jdr.a(this.f)) * 31) + jdr.a(this.g)) * 31) + jdr.a(z7)) * 31) + jdr.a(z6)) * 31) + jdr.a(z5)) * 31) + jdr.a(z4)) * 31) + jdr.a(z3)) * 31) + jdr.a(z2)) * 31) + jdr.a(z)) * 31) + str.hashCode();
        int i = this.p;
        boolean z8 = this.q;
        int i2 = ((iA * 31) + i) * 31;
        boolean z9 = this.r;
        int iA2 = (i2 + jdr.a(z8)) * 31;
        boolean z10 = this.s;
        int iA3 = (iA2 + jdr.a(z9)) * 31;
        boolean z11 = this.t;
        int iA4 = (iA3 + jdr.a(z10)) * 31;
        boolean z12 = this.u;
        int iA5 = (iA4 + jdr.a(z11)) * 31;
        boolean z13 = this.v;
        int iA6 = (iA5 + jdr.a(z12)) * 31;
        boolean z14 = this.w;
        int iA7 = (iA6 + jdr.a(z13)) * 31;
        boolean z15 = this.x;
        int iA8 = (iA7 + jdr.a(z14)) * 31;
        boolean z16 = this.y;
        int iA9 = (iA8 + jdr.a(z15)) * 31;
        boolean z17 = this.z;
        int iA10 = (iA9 + jdr.a(z16)) * 31;
        boolean z18 = this.A;
        int iA11 = (iA10 + jdr.a(z17)) * 31;
        boolean z19 = this.B;
        int iA12 = (iA11 + jdr.a(z18)) * 31;
        int i3 = this.C;
        return ((((((((iA12 + jdr.a(z19)) * 31) + i3) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssistantConfig(audioManager=");
        sb.append(this.d);
        sb.append(", castId=");
        sb.append(this.e);
        sb.append(", enableAbseilFloggerBridge=");
        sb.append(this.f);
        sb.append(", enableCppAudioFdReader=");
        sb.append(this.g);
        sb.append(", enableEraser=");
        sb.append(this.h);
        sb.append(", enableGiaLive=");
        sb.append(this.i);
        sb.append(", enableInfoLogging=");
        sb.append(this.j);
        sb.append(", enableOnDeviceNes=");
        sb.append(this.k);
        sb.append(", enableStreamingTts=");
        sb.append(this.l);
        sb.append(", enableTorus=");
        sb.append(this.m);
        sb.append(", fakeS3InTvtsModeAllowed=");
        sb.append(this.n);
        sb.append(", filesDir=");
        sb.append(this.o);
        sb.append(", framesToAppend=");
        sb.append(this.p);
        sb.append(", hotwordSupported=");
        sb.append(this.q);
        sb.append(", hotwordAcceptedAndToggled=");
        sb.append(this.r);
        sb.append(", isDspSupportedDevice=");
        sb.append(this.s);
        sb.append(", isExplicitHotwordStartRequired=");
        sb.append(this.t);
        sb.append(", isLowPowerHotwordEnabled=");
        sb.append(this.u);
        sb.append(", isAecProbeRequested=");
        sb.append(this.v);
        sb.append(", isNoDusi=");
        sb.append(this.w);
        sb.append(", langGeoOverrideDisabled=");
        sb.append(this.x);
        sb.append(", lazyLoadResources=");
        sb.append(this.y);
        sb.append(", moveFcmNotificationListenerToKatniss=");
        sb.append(this.z);
        gxt gxtVar = this.F;
        String str = this.E;
        String str2 = this.D;
        int i = this.C;
        boolean z = this.B;
        boolean z2 = this.A;
        sb.append(", routeToCurrentDevice=");
        sb.append(z2);
        sb.append(", skipLeadingZerosInAudioInput=");
        sb.append(z);
        sb.append(", sodaMaxCachedAudio=");
        sb.append(i);
        sb.append(", tvtsCustomS3Address=");
        sb.append(str2);
        sb.append(", userAgent=");
        sb.append(str);
        sb.append(", volumeManager=");
        sb.append(gxtVar);
        sb.append(")");
        return sb.toString();
    }
}
