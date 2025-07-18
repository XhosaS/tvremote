package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsj extends twd {
    private boolean A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private yyk I;
    private boolean J;
    private boolean K;
    private boolean L;
    private yyk M;
    private boolean N;
    public String a;
    public String b;
    public String c;
    public String d;
    public Optional e;
    public Optional f;
    public Optional g;
    public Optional h;
    public Optional i;
    public String j;
    public Optional k;
    public Optional l;
    public Optional m;
    public Optional n;
    public Optional o;
    public Optional p;
    public String q;
    public Optional r;
    public Optional s;
    public int t;
    public int u;
    private int v;
    private yyk w;
    private twc x;
    private adlm y;
    private boolean z;

    public tsj() {
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
    }

    @Override // defpackage.twd
    public final int a() {
        if ((this.t & 1) != 0) {
            return this.v;
        }
        throw new IllegalStateException("Property \"maxResults\" has not been set");
    }

    @Override // defpackage.twd
    public final twe b() {
        String str;
        yyk yykVar;
        String str2;
        String str3;
        twc twcVar;
        String str4;
        adlm adlmVar;
        int i;
        String str5;
        yyk yykVar2;
        yyk yykVar3;
        String str6;
        if (this.t == 262143 && (str = this.a) != null && (yykVar = this.w) != null && (str2 = this.b) != null && (str3 = this.c) != null && (twcVar = this.x) != null && (str4 = this.d) != null && (adlmVar = this.y) != null && (i = this.u) != 0 && (str5 = this.j) != null && (yykVar2 = this.I) != null && (yykVar3 = this.M) != null && (str6 = this.q) != null) {
            return new tsk(this.v, str, yykVar, str2, str3, twcVar, str4, this.e, adlmVar, i, this.z, this.A, this.B, this.C, this.f, this.D, this.E, this.F, this.g, this.G, this.H, this.h, this.i, str5, yykVar2, this.J, this.k, this.l, this.m, this.K, this.L, this.n, this.o, this.p, yykVar3, str6, this.r, this.N, this.s);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.t & 1) == 0) {
            sb.append(" maxResults");
        }
        if (this.a == null) {
            sb.append(" language");
        }
        if (this.w == null) {
            sb.append(" additionalLanguages");
        }
        if (this.b == null) {
            sb.append(" triggerApplicationId");
        }
        if (this.c == null) {
            sb.append(" overrideTriggerApplicationId");
        }
        if (this.x == null) {
            sb.append(" entrypoint");
        }
        if (this.d == null) {
            sb.append(" overrideApplicationId");
        }
        if (this.y == null) {
            sb.append(" applicationDomain");
        }
        if (this.u == 0) {
            sb.append(" recognizerMode");
        }
        if ((this.t & 2) == 0) {
            sb.append(" preferOffline");
        }
        if ((this.t & 4) == 0) {
            sb.append(" enablePartialResults");
        }
        if ((this.t & 8) == 0) {
            sb.append(" minSpeechLengthMs");
        }
        if ((this.t & 16) == 0) {
            sb.append(" speechInputCompleteSilenceLengthMs");
        }
        if ((this.t & 32) == 0) {
            sb.append(" muteMicForTalkBack");
        }
        if ((this.t & 64) == 0) {
            sb.append(" multiSegment");
        }
        if ((this.t & 128) == 0) {
            sb.append(" requestSodaEvent");
        }
        if ((this.t & 256) == 0) {
            sb.append(" profanityFilter");
        }
        if ((this.t & 512) == 0) {
            sb.append(" hidePartialTrailingPunctuation");
        }
        if ((this.t & 1024) == 0) {
            sb.append(" muteAudioBeeps");
        }
        if (this.j == null) {
            sb.append(" languageModel");
        }
        if (this.I == null) {
            sb.append(" biasingStrings");
        }
        if ((this.t & 2048) == 0) {
            sb.append(" enableDeviceContextBiasing");
        }
        if ((this.t & 4096) == 0) {
            sb.append(" requestWordTiming");
        }
        if ((this.t & 8192) == 0) {
            sb.append(" requestWordConfidence");
        }
        if (this.M == null) {
            sb.append(" experimentIds");
        }
        if (this.q == null) {
            sb.append(" s3SecondaryRouting");
        }
        if ((this.t & 16384) == 0) {
            sb.append(" enableReuseSodaInstance");
        }
        if ((this.t & 32768) == 0) {
            sb.append(" enablePartialAlignments");
        }
        if ((this.t & 65536) == 0) {
            sb.append(" enableInCommunicationModeAndAec");
        }
        if ((this.t & 131072) == 0) {
            sb.append(" enablePerAppConcurrency");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.twd
    public final void c(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null additionalLanguages");
        }
        this.w = yykVar;
    }

    @Override // defpackage.twd
    public final void d(adlm adlmVar) {
        if (adlmVar == null) {
            throw new NullPointerException("Null applicationDomain");
        }
        this.y = adlmVar;
    }

    @Override // defpackage.twd
    public final void e(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null biasingStrings");
        }
        this.I = yykVar;
    }

    @Override // defpackage.twd
    public final void f(boolean z) {
        this.J = z;
        this.t |= 2048;
    }

    @Override // defpackage.twd
    public final void g(boolean z) {
        this.N = z;
        this.t |= 32768;
    }

    @Override // defpackage.twd
    public final void h(boolean z) {
        this.A = z;
        this.t |= 4;
    }

    @Override // defpackage.twd
    public final void i(twc twcVar) {
        if (twcVar == null) {
            throw new NullPointerException("Null entrypoint");
        }
        this.x = twcVar;
    }

    @Override // defpackage.twd
    public final void j(yyk yykVar) {
        if (yykVar == null) {
            throw new NullPointerException("Null experimentIds");
        }
        this.M = yykVar;
    }

    @Override // defpackage.twd
    public final void k(boolean z) {
        this.G = z;
        this.t |= 512;
    }

    @Override // defpackage.twd
    public final void l(int i) {
        this.v = i;
        this.t |= 1;
    }

    @Override // defpackage.twd
    public final void m(int i) {
        this.B = i;
        this.t |= 8;
    }

    @Override // defpackage.twd
    public final void n(boolean z) {
        this.D = z;
        this.t |= 64;
    }

    @Override // defpackage.twd
    public final void o(boolean z) {
        this.H = z;
        this.t |= 1024;
    }

    @Override // defpackage.twd
    public final void p(boolean z) {
        this.z = z;
        this.t |= 2;
    }

    @Override // defpackage.twd
    public final void q(boolean z) {
        this.F = z;
        this.t |= 256;
    }

    @Override // defpackage.twd
    public final void r(boolean z) {
        this.E = z;
        this.t |= 128;
    }

    @Override // defpackage.twd
    public final void s(boolean z) {
        this.L = z;
        this.t |= 8192;
    }

    @Override // defpackage.twd
    public final void t(boolean z) {
        this.K = z;
        this.t |= 4096;
    }

    @Override // defpackage.twd
    public final void u(int i) {
        this.C = i;
        this.t |= 16;
    }

    public tsj(twe tweVar) {
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.n = Optional.empty();
        this.o = Optional.empty();
        this.p = Optional.empty();
        this.r = Optional.empty();
        this.s = Optional.empty();
        tsk tskVar = (tsk) tweVar;
        this.v = tskVar.a;
        this.a = tskVar.b;
        this.w = tskVar.c;
        this.b = tskVar.d;
        this.c = tskVar.e;
        this.x = tskVar.f;
        this.d = tskVar.g;
        this.e = tskVar.h;
        this.y = tskVar.i;
        this.u = tskVar.M;
        this.z = tskVar.j;
        this.A = tskVar.k;
        this.B = tskVar.l;
        this.C = tskVar.m;
        this.f = tskVar.n;
        this.D = tskVar.o;
        this.E = tskVar.p;
        this.F = tskVar.q;
        this.g = tskVar.r;
        this.G = tskVar.s;
        this.H = tskVar.t;
        this.h = tskVar.u;
        this.i = tskVar.v;
        this.j = tskVar.w;
        this.I = tskVar.x;
        this.J = tskVar.y;
        this.k = tskVar.z;
        this.l = tskVar.A;
        this.m = tskVar.B;
        this.K = tskVar.C;
        this.L = tskVar.D;
        this.n = tskVar.E;
        this.o = tskVar.F;
        this.p = tskVar.G;
        this.M = tskVar.H;
        this.q = tskVar.I;
        this.r = tskVar.J;
        this.N = tskVar.K;
        this.s = tskVar.L;
        this.t = 262143;
    }
}
