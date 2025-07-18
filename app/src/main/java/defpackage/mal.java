package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mal extends mbm {
    private boolean A;
    private boolean B;
    public String a;
    public String b;
    public adoq c;
    public adlm d;
    public int e;
    public abvo f;
    public String g;
    public mbg h;
    public mca i;
    public adlu j;
    public adnx k;
    public adod l;
    public adnq m;
    public adon n;
    public adlo o;
    public adno p;
    public String q;
    public String r;
    public String s;
    public int t;
    private String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    @Override // defpackage.mbm
    public final mbn a() {
        String str;
        String str2;
        String str3;
        adlm adlmVar;
        abvo abvoVar;
        String str4;
        String str5;
        String str6;
        if (this.t == 1048575 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.u) != null && (adlmVar = this.d) != null && (abvoVar = this.f) != null && (str4 = this.q) != null && (str5 = this.r) != null && (str6 = this.s) != null) {
            return new mam(str, str2, str3, this.v, this.w, this.c, this.x, adlmVar, this.e, abvoVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, null, str4, str5, str6, this.y, this.z, this.A, this.B);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sodaResourcesDir");
        }
        if (this.b == null) {
            sb.append(" sodaCacheDir");
        }
        if (this.u == null) {
            sb.append(" hotwordModelPath");
        }
        if ((this.t & 1) == 0) {
            sb.append(" expectAsrAfterHotword");
        }
        if ((this.t & 2) == 0) {
            sb.append(" requireHotword");
        }
        if ((this.t & 4) == 0) {
            sb.append(" addHotwordBuffer");
        }
        if ((this.t & 8) == 0) {
            sb.append(" resetOnFinalResult");
        }
        if ((this.t & 16) == 0) {
            sb.append(" attachQueryAudio");
        }
        if ((this.t & 32) == 0) {
            sb.append(" uploadAudiosToServer");
        }
        if ((this.t & 64) == 0) {
            sb.append(" maskOffensiveWords");
        }
        if ((this.t & 128) == 0) {
            sb.append(" enableLongform");
        }
        if ((this.t & 256) == 0) {
            sb.append(" hidePartialTrailingPunctuation");
        }
        if ((this.t & 512) == 0) {
            sb.append(" forceDisableOpenMic");
        }
        if ((this.t & 1024) == 0) {
            sb.append(" forceDisableSpeakerVerification");
        }
        if (this.d == null) {
            sb.append(" applicationDomain");
        }
        if ((this.t & 2048) == 0) {
            sb.append(" channelCount");
        }
        if ((this.t & 4096) == 0) {
            sb.append(" boostRecognizerPriority");
        }
        if (this.f == null) {
            sb.append(" hotwordModel");
        }
        if (this.q == null) {
            sb.append(" languageModel");
        }
        if (this.r == null) {
            sb.append(" tisidModelPath");
        }
        if ((this.t & 8192) == 0) {
            sb.append(" tisidStandaloneRuntimePreferred");
        }
        if (this.s == null) {
            sb.append(" personalizedResourcesDir");
        }
        if ((this.t & 16384) == 0) {
            sb.append(" enableConcurrency");
        }
        if ((this.t & 32768) == 0) {
            sb.append(" enablePerAppConcurrency");
        }
        if ((this.t & 65536) == 0) {
            sb.append(" enablePartialAlignments");
        }
        if ((this.t & 131072) == 0) {
            sb.append(" enabledFasterAudioTranscription");
        }
        if ((this.t & 262144) == 0) {
            sb.append(" applyMissingLastWordCheck");
        }
        if ((this.t & 524288) == 0) {
            sb.append(" useAsrProcessor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.mbm
    public final yqt b() {
        String str = this.u;
        return str == null ? ypv.a : yqt.i(str);
    }

    @Override // defpackage.mbm
    public final void c(boolean z) {
        this.A = z;
        this.t |= 262144;
    }

    @Override // defpackage.mbm
    public final void d(boolean z) {
        this.y = z;
        this.t |= 16384;
    }

    @Override // defpackage.mbm
    public final void e(boolean z) {
        this.w = z;
        this.t |= 128;
    }

    @Override // defpackage.mbm
    public final void f(boolean z) {
        this.z = z;
        this.t |= 65536;
    }

    @Override // defpackage.mbm
    public final void g(boolean z) {
        this.x = z;
        this.t |= 256;
    }

    @Override // defpackage.mbm
    public final void h() {
        this.u = "";
    }

    @Override // defpackage.mbm
    public final void i(boolean z) {
        this.v = z;
        this.t |= 64;
    }

    @Override // defpackage.mbm
    public final void j(boolean z) {
        this.B = z;
        this.t |= 524288;
    }

    @Override // defpackage.mbm
    public final void k() {
        if ((this.t & 2) == 0) {
            throw new IllegalStateException("Property \"requireHotword\" has not been set");
        }
    }

    @Override // defpackage.mbm
    public final void l() {
        this.t |= 32768;
    }

    @Override // defpackage.mbm
    public final void m() {
        this.t |= 131072;
    }
}
