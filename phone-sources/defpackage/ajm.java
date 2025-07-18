package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajm implements yjk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v83, types: [amg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v86, types: [amg, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        int i;
        bvc bvcVarJ;
        bmy bmyVar;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ajq ajqVar = (ajq) this.a;
                if (ajqVar.w()) {
                    ajqVar.D().p();
                } else {
                    ajqVar.o();
                }
                return true;
            case 1:
                Object obj = this.a;
                ykr.q(((bko) obj).F(), null, 0, new ajn((ajq) obj, (yih) null, 1, (byte[]) null), 3);
                return true;
            case 2:
                ajq ajqVar2 = (ajq) this.a;
                if (!ajqVar2.w()) {
                    ajqVar2.o();
                }
                ajqVar2.b.E(alh.c);
                return true;
            case 3:
                ajq ajqVar3 = (ajq) this.a;
                if (ajqVar3.k != null) {
                    ajqVar3.D().p();
                } else {
                    ajqVar3.C();
                }
                return ygi.a;
            case 4:
                ((ajq) this.a).b.E(alh.c);
                return ygi.a;
            case 5:
                akb akbVar = (akb) this.a;
                ahx ahxVarB = akbVar.a.b();
                ajc ajcVarF = akbVar.f();
                ira iraVar = new ira(null, null);
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                while (i2 < ahxVarB.a()) {
                    int iCodePointAt = Character.codePointAt(ahxVarB, i2);
                    if (iCodePointAt == 10) {
                        i = 32;
                    } else if (iCodePointAt == 13) {
                        i = 65279;
                        iCodePointAt = 13;
                    } else {
                        i = iCodePointAt;
                    }
                    int iCharCount = Character.charCount(iCodePointAt);
                    boolean z2 = z;
                    if (i != iCodePointAt) {
                        int iCharCount2 = Character.charCount(i);
                        int length = sb.length();
                        int length2 = sb.length() + iCharCount;
                        if (iCharCount2 < 0) {
                            wv.c(a.cf(iCharCount2, "Expected newLen to be ≥ 0, was "));
                        }
                        int iMin = Math.min(length, length2);
                        int iMax = Math.max(iMin, length2) - iMin;
                        if (iMax >= 2 || iMax != iCharCount2) {
                            int i3 = iraVar.b + 1;
                            if (i3 > aja.a((int[]) iraVar.a)) {
                                int iA = aja.a((int[]) iraVar.a);
                                int[] iArrCopyOf = Arrays.copyOf((int[]) iraVar.a, Math.max(i3 + i3, iA + iA) * 3);
                                iArrCopyOf.getClass();
                                iraVar.a = iArrCopyOf;
                            }
                            Object obj2 = iraVar.a;
                            int i4 = iraVar.b * 3;
                            int[] iArr = (int[]) obj2;
                            iArr[i4] = iMin;
                            iArr[i4 + 1] = iMax;
                            iArr[i4 + 2] = iCharCount2;
                            iraVar.b = i3;
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                    }
                    sb.appendCodePoint(i);
                    i2 += iCharCount;
                    z = z2;
                }
                CharSequence string = true != z ? ahxVarB : sb.toString();
                if (string == ahxVarB) {
                    return null;
                }
                long jO = hv.o(ahxVarB.d, iraVar, ajcVarF);
                chb chbVar = ahxVarB.e;
                return new ajz(new ahx(string, jO, chbVar != null ? new chb(hv.o(chbVar.b, iraVar, ajcVarF)) : null, null, null, 56), iraVar);
            case 6:
                akj akjVar = (akj) this.a;
                return (akjVar.c || akjVar.b.f() == akm.b) ? new bmx(hv.p(akjVar.a, akjVar.b, akjVar.f, akjVar.g())) : new bmx(9205357640488583168L);
            case 7:
                alg algVar = (alg) this.a;
                akb akbVar2 = algVar.a;
                if (!chb.g(akbVar2.e().d) ? algVar.g() == alh.c : algVar.g() == alh.b) {
                    if (algVar.c() == null && algVar.I() && (bvcVarJ = algVar.j()) != null) {
                        bmy bmyVarK = kv.K(bvcVarJ);
                        bmy bmyVarW = d.w(bvcVarJ.j(bmyVarK.f()), bmyVarK.e());
                        bvc bvcVarJ2 = algVar.j();
                        if (bvcVarJ2 == null) {
                            wv.b("textLayoutCoordinates should not be null.");
                            throw new yfs();
                        }
                        long j = akbVar2.e().d;
                        if (chb.g(j)) {
                            bmy bmyVarH = algVar.h();
                            bmyVar = d.w(bvcVarJ2.j(bmyVarH.f()), bmyVarH.e());
                        } else {
                            long j2 = bvcVarJ2.j(algVar.b(true));
                            long j3 = bvcVarJ2.j(algVar.b(false));
                            if (algVar.m.l() == null) {
                                bmyVar = bmy.a;
                            } else {
                                long j4 = bvcVarJ2.j((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r1.m(chb.e(j)).c) & 4294967295L)) & 4294967295L;
                                int iA2 = chb.a(j);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) j4);
                                long j5 = bvcVarJ2.j((Float.floatToRawIntBits(r1.m(iA2).c) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L;
                                int i5 = (int) (j3 >> 32);
                                int i6 = (int) (j2 >> 32);
                                bmyVar = new bmy(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, Float.intBitsToFloat((int) j5)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i5)), Math.max(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L))));
                            }
                        }
                        if (bmyVar.k(bmyVarW)) {
                            return bmyVar.g(bmyVarW);
                        }
                    }
                }
                return null;
            case 8:
                return ((alg) this.a).i();
            case 9:
                return ((alg) this.a).a.e();
            case 10:
                ((alg) this.a).u();
                return ygi.a;
            case 11:
                return Boolean.valueOf(!((alg) this.a).H());
            case 12:
                aid aidVar = ((alg) this.a).a.a;
                aidVar.a.b().c();
                ahw ahwVar = aidVar.a;
                ht.q(ahwVar, 0, ahwVar.a());
                aid.h(aidVar, true, 1);
                return ygi.a;
            case 13:
                yjk yjkVar = ((alg) this.a).h;
                if (yjkVar != null) {
                    yjkVar.a();
                }
                return ygi.a;
            case 14:
                return ((alo) this.a).d.b;
            case 15:
                alt altVar = (alt) this.a;
                altVar.l();
                altVar.n();
                return true;
            case 16:
                alv alvVar = (alv) this.a;
                alvVar.l();
                alvVar.m();
                return true;
            case 17:
                return Boolean.valueOf((9223372034707292159L & this.a.a()) != 9205357640488583168L);
            case 18:
                return Boolean.valueOf((9223372034707292159L & this.a.a()) != 9205357640488583168L);
            case 19:
                anm anmVar = (anm) this.a;
                Object objC = anmVar.c();
                if (objC != null) {
                    return objC;
                }
                float fA = anmVar.a();
                if (Float.isNaN(fA)) {
                    return anmVar.b();
                }
                Object objB = anmVar.b();
                anmVar.d();
                float fFloatValue = ((Number) anmVar.a.a()).floatValue();
                if (fA == Float.NaN || Float.isNaN(Float.NaN)) {
                    return objB;
                }
                if (fA > Float.NaN) {
                    if (fFloatValue <= 0.0f) {
                        throw null;
                    }
                    throw null;
                }
                if ((-fFloatValue) >= 0.0f) {
                    throw null;
                }
                throw null;
            default:
                anm anmVar2 = (anm) this.a;
                Object objC2 = anmVar2.c();
                if (objC2 != null) {
                    return objC2;
                }
                float fA2 = anmVar2.a();
                if (Float.isNaN(fA2)) {
                    return anmVar2.b();
                }
                Object objB2 = anmVar2.b();
                anmVar2.d();
                if (fA2 != Float.NaN) {
                    Float.isNaN(Float.NaN);
                }
                return objB2;
        }
    }
}
