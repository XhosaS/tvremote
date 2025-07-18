package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mam extends mbn {
    public final boolean A;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final adoq f;
    public final boolean g;
    public final adlm h;
    public final int i;
    public final abvo j;
    public final String k;
    public final mbg l;
    public final mca m;
    public final adlu n;
    public final adnx o;
    public final adod p;
    public final adnq q;
    public final adon r;
    public final adlo s;
    public final adno t = null;
    public final String u;
    public final String v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public mam(String str, String str2, String str3, boolean z, boolean z2, adoq adoqVar, boolean z3, adlm adlmVar, int i, abvo abvoVar, String str4, mbg mbgVar, mca mcaVar, adlu adluVar, adnx adnxVar, adod adodVar, adnq adnqVar, adon adonVar, adlo adloVar, adno adnoVar, String str5, String str6, String str7, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = adoqVar;
        this.g = z3;
        this.h = adlmVar;
        this.i = i;
        this.j = abvoVar;
        this.k = str4;
        this.l = mbgVar;
        this.m = mcaVar;
        this.n = adluVar;
        this.o = adnxVar;
        this.p = adodVar;
        this.q = adnqVar;
        this.r = adonVar;
        this.s = adloVar;
        this.u = str5;
        this.v = str6;
        this.w = str7;
        this.x = z4;
        this.y = z5;
        this.z = z6;
        this.A = z7;
    }

    @Override // defpackage.mbn
    public final boolean A() {
        return this.A;
    }

    @Override // defpackage.mbn
    public final int a() {
        return this.i;
    }

    @Override // defpackage.mbn
    public final mbg b() {
        return this.l;
    }

    @Override // defpackage.mbn
    public final mca c() {
        return this.m;
    }

    @Override // defpackage.mbn
    public final abvo d() {
        return this.j;
    }

    @Override // defpackage.mbn
    public final adlm e() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mam.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.mbn
    public final adlo f() {
        return this.s;
    }

    @Override // defpackage.mbn
    public final adlu g() {
        return this.n;
    }

    @Override // defpackage.mbn
    public final adno h() {
        return null;
    }

    public final int hashCode() {
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        adoq adoqVar = this.f;
        int iB6 = 0;
        int iHashCode2 = ((((((((((((((((((((((((((((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (adoqVar == null ? 0 : adoqVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ 1237) * 1000003) ^ this.j.hashCode()) * 1000003;
        String str = this.k;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        mbg mbgVar = this.l;
        int iHashCode4 = (iHashCode3 ^ (mbgVar == null ? 0 : mbgVar.hashCode())) * 1000003;
        mca mcaVar = this.m;
        int iHashCode5 = (iHashCode4 ^ (mcaVar == null ? 0 : mcaVar.hashCode())) * 1000003;
        adlu adluVar = this.n;
        if (adluVar == null) {
            iB = 0;
        } else if ((adluVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(adluVar.getClass()).b(adluVar);
        } else {
            int iB7 = adluVar.memoizedHashCode;
            if (iB7 == 0) {
                iB7 = abza.a.a(adluVar.getClass()).b(adluVar);
                adluVar.memoizedHashCode = iB7;
            }
            iB = iB7;
        }
        int i = (iHashCode5 ^ iB) * 1000003;
        adnx adnxVar = this.o;
        if (adnxVar == null) {
            iB2 = 0;
        } else if ((adnxVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB2 = abza.a.a(adnxVar.getClass()).b(adnxVar);
        } else {
            int iB8 = adnxVar.memoizedHashCode;
            if (iB8 == 0) {
                iB8 = abza.a.a(adnxVar.getClass()).b(adnxVar);
                adnxVar.memoizedHashCode = iB8;
            }
            iB2 = iB8;
        }
        int i2 = (i ^ iB2) * 1000003;
        adod adodVar = this.p;
        if (adodVar == null) {
            iB3 = 0;
        } else if ((adodVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB3 = abza.a.a(adodVar.getClass()).b(adodVar);
        } else {
            int iB9 = adodVar.memoizedHashCode;
            if (iB9 == 0) {
                iB9 = abza.a.a(adodVar.getClass()).b(adodVar);
                adodVar.memoizedHashCode = iB9;
            }
            iB3 = iB9;
        }
        int i3 = (i2 ^ iB3) * 1000003;
        adnq adnqVar = this.q;
        if (adnqVar == null) {
            iB4 = 0;
        } else if ((adnqVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB4 = abza.a.a(adnqVar.getClass()).b(adnqVar);
        } else {
            int iB10 = adnqVar.memoizedHashCode;
            if (iB10 == 0) {
                iB10 = abza.a.a(adnqVar.getClass()).b(adnqVar);
                adnqVar.memoizedHashCode = iB10;
            }
            iB4 = iB10;
        }
        int i4 = (i3 ^ iB4) * 1000003;
        adon adonVar = this.r;
        if (adonVar == null) {
            iB5 = 0;
        } else if ((adonVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB5 = abza.a.a(adonVar.getClass()).b(adonVar);
        } else {
            int iB11 = adonVar.memoizedHashCode;
            if (iB11 == 0) {
                iB11 = abza.a.a(adonVar.getClass()).b(adonVar);
                adonVar.memoizedHashCode = iB11;
            }
            iB5 = iB11;
        }
        int i5 = (i4 ^ iB5) * 1000003;
        adlo adloVar = this.s;
        if (adloVar != null) {
            if ((adloVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                iB6 = abza.a.a(adloVar.getClass()).b(adloVar);
            } else {
                iB6 = adloVar.memoizedHashCode;
                if (iB6 == 0) {
                    iB6 = abza.a.a(adloVar.getClass()).b(adloVar);
                    adloVar.memoizedHashCode = iB6;
                }
            }
        }
        return ((((((((((((((((((((i5 ^ iB6) * (-721379959)) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.w.hashCode()) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ (true != this.A ? 1237 : 1231);
    }

    @Override // defpackage.mbn
    public final adnq i() {
        return this.q;
    }

    @Override // defpackage.mbn
    public final adnx j() {
        return this.o;
    }

    @Override // defpackage.mbn
    public final adod k() {
        return this.p;
    }

    @Override // defpackage.mbn
    public final adon l() {
        return this.r;
    }

    @Override // defpackage.mbn
    public final adoq m() {
        return this.f;
    }

    @Override // defpackage.mbn
    public final String n() {
        return this.c;
    }

    @Override // defpackage.mbn
    public final String o() {
        return this.u;
    }

    @Override // defpackage.mbn
    public final String p() {
        return this.k;
    }

    @Override // defpackage.mbn
    public final String q() {
        return this.w;
    }

    @Override // defpackage.mbn
    public final String r() {
        return this.b;
    }

    @Override // defpackage.mbn
    public final String s() {
        return this.a;
    }

    @Override // defpackage.mbn
    public final String t() {
        return this.v;
    }

    public final String toString() {
        abvo abvoVar = this.j;
        int i = this.h.m;
        String strValueOf = String.valueOf(this.f);
        String string = Integer.toString(i);
        String string2 = abvoVar.toString();
        String strValueOf2 = String.valueOf(this.l);
        String strValueOf3 = String.valueOf(this.m);
        String strValueOf4 = String.valueOf(this.n);
        String strValueOf5 = String.valueOf(this.o);
        String strValueOf6 = String.valueOf(this.p);
        String strValueOf7 = String.valueOf(this.q);
        String strValueOf8 = String.valueOf(this.r);
        String strValueOf9 = String.valueOf(this.s);
        StringBuilder sb = new StringBuilder("SodaParams{sodaResourcesDir=");
        sb.append(this.a);
        sb.append(", sodaCacheDir=");
        sb.append(this.b);
        sb.append(", hotwordModelPath=");
        sb.append(this.c);
        sb.append(", expectAsrAfterHotword=false, requireHotword=false, addHotwordBuffer=false, resetOnFinalResult=false, attachQueryAudio=false, uploadAudiosToServer=false, maskOffensiveWords=");
        sb.append(this.d);
        sb.append(", enableLongform=");
        sb.append(this.e);
        sb.append(", enableFormatting=");
        sb.append(strValueOf);
        sb.append(", hidePartialTrailingPunctuation=");
        sb.append(this.g);
        sb.append(", forceDisableOpenMic=false, forceDisableSpeakerVerification=false, applicationDomain=");
        sb.append(string);
        sb.append(", channelCount=");
        sb.append(this.i);
        sb.append(", boostRecognizerPriority=false, hotwordModel=");
        sb.append(string2);
        sb.append(", locale=");
        sb.append(this.k);
        sb.append(", sodaCallback=");
        sb.append(strValueOf2);
        sb.append(", sodaDataProvider=");
        sb.append(strValueOf3);
        sb.append(", clientInfo=");
        sb.append(strValueOf4);
        sb.append(", diarizationConfig=");
        sb.append(strValueOf5);
        sb.append(", langIdConfig=");
        sb.append(strValueOf6);
        sb.append(", audioDumpConfig=");
        sb.append(strValueOf7);
        sb.append(", multilangConfig=");
        sb.append(strValueOf8);
        sb.append(", audioOutputConfig=");
        sb.append(strValueOf9);
        String str = this.u;
        String str2 = this.v;
        String str3 = this.w;
        boolean z = this.x;
        boolean z2 = this.y;
        boolean z3 = this.z;
        boolean z4 = this.A;
        sb.append(", aiCoreConfig=null, languageModel=");
        sb.append(str);
        sb.append(", tisidModelPath=");
        sb.append(str2);
        sb.append(", tisidStandaloneRuntimePreferred=false, personalizedResourcesDir=");
        sb.append(str3);
        sb.append(", enableConcurrency=");
        sb.append(z);
        sb.append(", enablePerAppConcurrency=false, enablePartialAlignments=");
        sb.append(z2);
        sb.append(", enabledFasterAudioTranscription=false, applyMissingLastWordCheck=");
        sb.append(z3);
        sb.append(", useAsrProcessor=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.mbn
    public final boolean u() {
        return this.z;
    }

    @Override // defpackage.mbn
    public final boolean v() {
        return this.x;
    }

    @Override // defpackage.mbn
    public final boolean w() {
        return this.e;
    }

    @Override // defpackage.mbn
    public final boolean x() {
        return this.y;
    }

    @Override // defpackage.mbn
    public final boolean y() {
        return this.g;
    }

    @Override // defpackage.mbn
    public final boolean z() {
        return this.d;
    }

    @Override // defpackage.mbn
    public final void B() {
    }

    @Override // defpackage.mbn
    public final void C() {
    }

    @Override // defpackage.mbn
    public final void D() {
    }

    @Override // defpackage.mbn
    public final void E() {
    }

    @Override // defpackage.mbn
    public final void F() {
    }

    @Override // defpackage.mbn
    public final void G() {
    }

    @Override // defpackage.mbn
    public final void H() {
    }

    @Override // defpackage.mbn
    public final void I() {
    }

    @Override // defpackage.mbn
    public final void J() {
    }

    @Override // defpackage.mbn
    public final void K() {
    }

    @Override // defpackage.mbn
    public final void L() {
    }

    @Override // defpackage.mbn
    public final void M() {
    }
}
