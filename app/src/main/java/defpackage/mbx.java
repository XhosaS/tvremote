package defpackage;

import android.os.Build;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbx {
    public static final zdy a = zdy.h("com/google/android/libraries/assistant/soda/SodaUtils");

    public static ados a(String str, String str2, adma admaVar) {
        adot adotVar = adot.a;
        ados adosVar = new ados();
        if ((adosVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVar.y();
        }
        adot adotVar2 = (adot) adosVar.b;
        adotVar2.b |= 64;
        adotVar2.g = str2;
        ador adorVar = ador.a;
        adoo adooVar = new adoo();
        if ((adooVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adooVar.y();
        }
        ador adorVar2 = (ador) adooVar.b;
        adorVar2.b |= 65536;
        adorVar2.f = str;
        if ((adosVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVar.y();
        }
        adot adotVar3 = (adot) adosVar.b;
        ador adorVar3 = (ador) adooVar.v();
        adorVar3.getClass();
        adotVar3.e = adorVar3;
        adotVar3.b |= 4;
        adns adnsVar = adns.a;
        adnr adnrVar = new adnr();
        adls adlsVar = adls.a;
        adlp adlpVar = new adlp();
        if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adlpVar.y();
        }
        adls adlsVar2 = (adls) adlpVar.b;
        adlsVar2.c = 1;
        adlsVar2.b |= 1;
        if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adlpVar.y();
        }
        adls adlsVar3 = (adls) adlpVar.b;
        adlsVar3.b |= 4;
        adlsVar3.e = 1;
        if ((adlpVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adlpVar.y();
        }
        adls adlsVar4 = (adls) adlpVar.b;
        adlsVar4.b |= 2;
        adlsVar4.d = 16000;
        if ((adnrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adnrVar.y();
        }
        adns adnsVar2 = (adns) adnrVar.b;
        adls adlsVar5 = (adls) adlpVar.v();
        adlsVar5.getClass();
        adnsVar2.c = adlsVar5;
        adnsVar2.b |= 1;
        if ((adosVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVar.y();
        }
        adot adotVar4 = (adot) adosVar.b;
        adns adnsVar3 = (adns) adnrVar.v();
        adnsVar3.getClass();
        adotVar4.c = adnsVar3;
        adotVar4.b |= 1;
        adlu adluVarB = b(admaVar);
        if ((adosVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adosVar.y();
        }
        adot adotVar5 = (adot) adosVar.b;
        adluVarB.getClass();
        adotVar5.i = adluVarB;
        adotVar5.b |= 512;
        return adosVar;
    }

    private static adlu b(adma admaVar) {
        try {
            TextUtils.isEmpty("");
        } catch (NoClassDefFoundError unused) {
        }
        adlu adluVar = adlu.a;
        adlt adltVar = new adlt();
        if ((adltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adltVar.y();
        }
        adlu adluVar2 = (adlu) adltVar.b;
        adluVar2.c = admaVar.K;
        adluVar2.b |= 1;
        if ((adltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adltVar.y();
        }
        adlu adluVar3 = (adlu) adltVar.b;
        adluVar3.b |= 64;
        adluVar3.i = "";
        if ((adltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adltVar.y();
        }
        adlu adluVar4 = (adlu) adltVar.b;
        adluVar4.b |= 16;
        adluVar4.g = "Android";
        try {
            String str = Build.MODEL;
            if ((adltVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                adltVar.y();
            }
            adlu adluVar5 = (adlu) adltVar.b;
            str.getClass();
            adluVar5.b |= 32;
            adluVar5.h = str;
        } catch (NoClassDefFoundError unused2) {
        }
        return (adlu) adltVar.v();
    }
}
