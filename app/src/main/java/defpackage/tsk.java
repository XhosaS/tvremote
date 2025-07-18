package defpackage;

import com.google.common.collect.Lists;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsk extends twe {
    public final Optional A;
    public final Optional B;
    public final boolean C;
    public final boolean D;
    public final Optional E;
    public final Optional F;
    public final Optional G;
    public final yyk H;
    public final String I;
    public final Optional J;
    public final boolean K;
    public final Optional L;
    public final int M;
    public final int a;
    public final String b;
    public final yyk c;
    public final String d;
    public final String e;
    public final twc f;
    public final String g;
    public final Optional h;
    public final adlm i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final int m;
    public final Optional n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final Optional r;
    public final boolean s;
    public final boolean t;
    public final Optional u;
    public final Optional v;
    public final String w;
    public final yyk x;
    public final boolean y;
    public final Optional z;

    public tsk(int i, String str, yyk yykVar, String str2, String str3, twc twcVar, String str4, Optional optional, adlm adlmVar, int i2, boolean z, boolean z2, int i3, int i4, Optional optional2, boolean z3, boolean z4, boolean z5, Optional optional3, boolean z6, boolean z7, Optional optional4, Optional optional5, String str5, yyk yykVar2, boolean z8, Optional optional6, Optional optional7, Optional optional8, boolean z9, boolean z10, Optional optional9, Optional optional10, Optional optional11, yyk yykVar3, String str6, Optional optional12, boolean z11, Optional optional13) {
        this.a = i;
        this.b = str;
        this.c = yykVar;
        this.d = str2;
        this.e = str3;
        this.f = twcVar;
        this.g = str4;
        this.h = optional;
        this.i = adlmVar;
        this.M = i2;
        this.j = z;
        this.k = z2;
        this.l = i3;
        this.m = i4;
        this.n = optional2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = optional3;
        this.s = z6;
        this.t = z7;
        this.u = optional4;
        this.v = optional5;
        this.w = str5;
        this.x = yykVar2;
        this.y = z8;
        this.z = optional6;
        this.A = optional7;
        this.B = optional8;
        this.C = z9;
        this.D = z10;
        this.E = optional9;
        this.F = optional10;
        this.G = optional11;
        this.H = yykVar3;
        this.I = str6;
        this.J = optional12;
        this.K = z11;
        this.L = optional13;
    }

    @Override // defpackage.twe
    public final String A() {
        return this.d;
    }

    @Override // defpackage.twe
    public final boolean B() {
        return this.y;
    }

    @Override // defpackage.twe
    public final boolean C() {
        return this.K;
    }

    @Override // defpackage.twe
    public final boolean D() {
        return this.k;
    }

    @Override // defpackage.twe
    public final boolean E() {
        return this.s;
    }

    @Override // defpackage.twe
    public final boolean F() {
        return this.o;
    }

    @Override // defpackage.twe
    public final boolean G() {
        return this.t;
    }

    @Override // defpackage.twe
    public final boolean H() {
        return this.j;
    }

    @Override // defpackage.twe
    public final boolean I() {
        return this.q;
    }

    @Override // defpackage.twe
    public final boolean J() {
        return this.p;
    }

    @Override // defpackage.twe
    public final boolean K() {
        return this.D;
    }

    @Override // defpackage.twe
    public final boolean L() {
        return this.C;
    }

    @Override // defpackage.twe
    public final int M() {
        return this.M;
    }

    @Override // defpackage.twe
    public final int a() {
        return this.a;
    }

    @Override // defpackage.twe
    public final int b() {
        return this.l;
    }

    @Override // defpackage.twe
    public final int c() {
        return this.m;
    }

    @Override // defpackage.twe
    public final twc d() {
        return this.f;
    }

    @Override // defpackage.twe
    public final yyk e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twe) {
            twe tweVar = (twe) obj;
            if (this.a == tweVar.a() && this.b.equals(tweVar.v()) && Lists.d(this.c, tweVar.e()) && this.d.equals(tweVar.A()) && this.e.equals(tweVar.y()) && this.f.equals(tweVar.d()) && this.g.equals(tweVar.x()) && this.h.equals(tweVar.k()) && this.i.equals(tweVar.h()) && this.M == tweVar.M() && this.j == tweVar.H() && this.k == tweVar.D() && this.l == tweVar.b() && this.m == tweVar.c() && this.n.equals(tweVar.l())) {
                tweVar.Q();
                if (this.o == tweVar.F() && this.p == tweVar.J() && this.q == tweVar.I() && this.r.equals(tweVar.n()) && this.s == tweVar.E() && this.t == tweVar.G() && this.u.equals(tweVar.j()) && this.v.equals(tweVar.m()) && this.w.equals(tweVar.w()) && Lists.d(this.x, tweVar.f()) && this.y == tweVar.B() && this.z.equals(tweVar.p()) && this.A.equals(tweVar.q()) && this.B.equals(tweVar.i()) && this.C == tweVar.L() && this.D == tweVar.K() && this.E.equals(tweVar.o()) && this.F.equals(tweVar.s()) && this.G.equals(tweVar.u()) && Lists.d(this.H, tweVar.g()) && this.I.equals(tweVar.z()) && this.J.equals(tweVar.r())) {
                    tweVar.P();
                    if (this.K == tweVar.C()) {
                        tweVar.N();
                        tweVar.O();
                        if (this.L.equals(tweVar.t())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.twe
    public final yyk f() {
        return this.x;
    }

    @Override // defpackage.twe
    public final yyk g() {
        return this.H;
    }

    @Override // defpackage.twe
    public final adlm h() {
        return this.i;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
        boolean z = this.k;
        int iHashCode2 = this.n.hashCode();
        int i = true != z ? 1237 : 1231;
        int i2 = true != this.j ? 1237 : 1231;
        int i3 = (((((((((((iHashCode * 1000003) ^ this.M) * 1000003) ^ i2) * 1000003) ^ i) * 1000003) ^ this.l) * 1000003) ^ this.m) * 1000003) ^ iHashCode2;
        Optional optional = this.r;
        int iHashCode3 = (((((((((i3 * 1000003) ^ 1237) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ optional.hashCode();
        Optional optional2 = this.u;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode3 * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ optional2.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x.hashCode()) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ this.B.hashCode()) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F.hashCode()) * 1000003) ^ this.G.hashCode()) * 1000003) ^ this.H.hashCode()) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ 1237) * 1000003) ^ (true != this.K ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.L.hashCode();
    }

    @Override // defpackage.twe
    public final Optional i() {
        return this.B;
    }

    @Override // defpackage.twe
    public final Optional j() {
        return this.u;
    }

    @Override // defpackage.twe
    public final Optional k() {
        return this.h;
    }

    @Override // defpackage.twe
    public final Optional l() {
        return this.n;
    }

    @Override // defpackage.twe
    public final Optional m() {
        return this.v;
    }

    @Override // defpackage.twe
    public final Optional n() {
        return this.r;
    }

    @Override // defpackage.twe
    public final Optional o() {
        return this.E;
    }

    @Override // defpackage.twe
    public final Optional p() {
        return this.z;
    }

    @Override // defpackage.twe
    public final Optional q() {
        return this.A;
    }

    @Override // defpackage.twe
    public final Optional r() {
        return this.J;
    }

    @Override // defpackage.twe
    public final Optional s() {
        return this.F;
    }

    @Override // defpackage.twe
    public final Optional t() {
        return this.L;
    }

    public final String toString() {
        int i = this.M;
        Optional optional = this.n;
        int i2 = this.i.m;
        Optional optional2 = this.h;
        int i3 = this.f.f;
        String string = this.c.toString();
        String string2 = Integer.toString(i3);
        String strValueOf = String.valueOf(optional2);
        String string3 = Integer.toString(i2);
        String string4 = Integer.toString(i - 1);
        String strValueOf2 = String.valueOf(optional);
        String strValueOf3 = String.valueOf(this.r);
        String strValueOf4 = String.valueOf(this.u);
        String strValueOf5 = String.valueOf(this.v);
        String string5 = this.x.toString();
        String strValueOf6 = String.valueOf(this.z);
        String strValueOf7 = String.valueOf(this.A);
        String strValueOf8 = String.valueOf(this.B);
        String strValueOf9 = String.valueOf(this.E);
        String strValueOf10 = String.valueOf(this.F);
        String strValueOf11 = String.valueOf(this.G);
        String string6 = this.H.toString();
        String strValueOf12 = String.valueOf(this.J);
        String strValueOf13 = String.valueOf(this.L);
        StringBuilder sb = new StringBuilder("TranscriptionParams{maxResults=");
        sb.append(this.a);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", additionalLanguages=");
        sb.append(string);
        sb.append(", triggerApplicationId=");
        sb.append(this.d);
        sb.append(", overrideTriggerApplicationId=");
        sb.append(this.e);
        sb.append(", entrypoint=");
        sb.append(string2);
        sb.append(", overrideApplicationId=");
        sb.append(this.g);
        sb.append(", audioRecordingEncoding=");
        sb.append(strValueOf);
        sb.append(", applicationDomain=");
        sb.append(string3);
        sb.append(", recognizerMode=");
        sb.append(string4);
        sb.append(", preferOffline=");
        sb.append(this.j);
        sb.append(", enablePartialResults=");
        sb.append(this.k);
        int i4 = this.l;
        int i5 = this.m;
        boolean z = this.s;
        boolean z2 = this.t;
        String str = this.w;
        boolean z3 = this.y;
        boolean z4 = this.C;
        boolean z5 = this.D;
        String str2 = this.I;
        boolean z6 = this.K;
        boolean z7 = this.q;
        boolean z8 = this.p;
        boolean z9 = this.o;
        sb.append(", minSpeechLengthMs=");
        sb.append(i4);
        sb.append(", speechInputCompleteSilenceLengthMs=");
        sb.append(i5);
        sb.append(", audioSource=");
        sb.append(strValueOf2);
        sb.append(", muteMicForTalkBack=false, multiSegment=");
        sb.append(z9);
        sb.append(", requestSodaEvent=");
        sb.append(z8);
        sb.append(", profanityFilter=");
        sb.append(z7);
        sb.append(", enableFormatting=");
        sb.append(strValueOf3);
        sb.append(", hidePartialTrailingPunctuation=");
        sb.append(z);
        sb.append(", muteAudioBeeps=");
        sb.append(z2);
        sb.append(", attributionSource=");
        sb.append(strValueOf4);
        sb.append(", diarizationConfig=");
        sb.append(strValueOf5);
        sb.append(", languageModel=");
        sb.append(str);
        sb.append(", biasingStrings=");
        sb.append(string5);
        sb.append(", enableDeviceContextBiasing=");
        sb.append(z3);
        sb.append(", langIdConfig=");
        sb.append(strValueOf6);
        sb.append(", multilangConfig=");
        sb.append(strValueOf7);
        sb.append(", aiCoreConfig=");
        sb.append(strValueOf8);
        sb.append(", requestWordTiming=");
        sb.append(z4);
        sb.append(", requestWordConfidence=");
        sb.append(z5);
        sb.append(", hostAppId=");
        sb.append(strValueOf9);
        sb.append(", prebuiltBiasingConfig=");
        sb.append(strValueOf10);
        sb.append(", s3DataDonationRequest=");
        sb.append(strValueOf11);
        sb.append(", experimentIds=");
        sb.append(string6);
        sb.append(", s3SecondaryRouting=");
        sb.append(str2);
        sb.append(", onDeviceRecognitionContext=");
        sb.append(strValueOf12);
        sb.append(", enableReuseSodaInstance=false, enablePartialAlignments=");
        sb.append(z6);
        sb.append(", enableInCommunicationModeAndAec=false, enablePerAppConcurrency=false, s3AuthToken=");
        sb.append(strValueOf13);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.twe
    public final Optional u() {
        return this.G;
    }

    @Override // defpackage.twe
    public final String v() {
        return this.b;
    }

    @Override // defpackage.twe
    public final String w() {
        return this.w;
    }

    @Override // defpackage.twe
    public final String x() {
        return this.g;
    }

    @Override // defpackage.twe
    public final String y() {
        return this.e;
    }

    @Override // defpackage.twe
    public final String z() {
        return this.I;
    }

    @Override // defpackage.twe
    public final void N() {
    }

    @Override // defpackage.twe
    public final void O() {
    }

    @Override // defpackage.twe
    public final void P() {
    }

    @Override // defpackage.twe
    public final void Q() {
    }
}
