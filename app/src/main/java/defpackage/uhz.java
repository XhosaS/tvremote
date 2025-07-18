package defpackage;

import j$.net.URLEncoder;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhz {
    static {
        adwb adwbVar = adwb.a;
        adwa adwaVar = new adwa();
        advp advpVar = advp.a;
        if ((adwaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adwaVar.y();
        }
        adwb adwbVar2 = (adwb) adwaVar.b;
        advpVar.getClass();
        adwbVar2.c = advpVar;
        adwbVar2.b = 1;
        adwa adwaVar2 = new adwa();
        advx advxVar = advx.a;
        if ((adwaVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adwaVar2.y();
        }
        adwb adwbVar3 = (adwb) adwaVar2.b;
        advxVar.getClass();
        adwbVar3.c = advxVar;
        adwbVar3.b = 2;
        adwa adwaVar3 = new adwa();
        advz advzVar = advz.a;
        if ((adwaVar3.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            adwaVar3.y();
        }
        adwb adwbVar4 = (adwb) adwaVar3.b;
        advzVar.getClass();
        adwbVar4.c = advzVar;
        adwbVar4.b = 3;
    }

    public static String a(adwd adwdVar) throws IOException {
        int i;
        String strConcat;
        String str;
        int i2 = yyk.e;
        yyf yyfVar = new yyf(4);
        for (adwb adwbVar : adwdVar.c) {
            int i3 = adwbVar.b;
            switch (i3) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                strConcat = "compress";
            } else if (i4 == 1) {
                advx advxVar = i3 == 2 ? (advx) adwbVar.c : advx.a;
                int i5 = advxVar.b;
                if (i5 == 1) {
                    strConcat = "encrypt(aes_gcm_key=" + b((String) advxVar.c) + ")";
                } else if (i5 == 2) {
                    strConcat = "encrypt(aes_gcm_hkdf_key=" + b((String) advxVar.c) + ")";
                } else {
                    strConcat = "encrypt";
                }
            } else if (i4 == 2) {
                advz advzVar = i3 == 3 ? (advz) adwbVar.c : advz.a;
                strConcat = advzVar.b == 1 ? "integrity(sha256=" + b((String) advzVar.c) + ")" : "integrity";
            } else if (i4 == 3) {
                adwf adwfVar = i3 == 4 ? (adwf) adwbVar.c : adwf.a;
                yqw.A(1 == (adwfVar.b & 1));
                strConcat = "zip(target=" + b(adwfVar.c) + ")";
            } else if (i4 == 4) {
                advt advtVar = i3 == 5 ? (advt) adwbVar.c : advt.a;
                if (advtVar.c.size() > 0) {
                    yyf yyfVar2 = new yyf(4);
                    for (advs advsVar : advtVar.c) {
                        yqw.A(1 == (advsVar.b & 1));
                        if ((advsVar.b & 2) != 0) {
                            yyfVar2.g(advsVar.c + "=" + b(advsVar.d));
                        } else {
                            yyfVar2.g(advsVar.c);
                        }
                    }
                    str = "(" + new yqn(",").c(yyfVar2.f()) + ")";
                } else {
                    str = "";
                }
                strConcat = String.valueOf(advtVar.b).concat(str);
            } else {
                if (i4 != 5) {
                    throw new IllegalArgumentException("No transform specified");
                }
                strConcat = "defrag";
            }
            yyfVar.g(strConcat);
        }
        return ugf.a(yyfVar.f());
    }

    private static final String b(String str) {
        try {
            return URLEncoder.encode(str, uga.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
