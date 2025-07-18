package com.google.android.libraries.performance.primes.flogger;

import defpackage.abnu;
import defpackage.zft;
import defpackage.zgr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AbseilToFloggerLogSink {
    private final zft a = zgr.d(AbseilToFloggerLogSink.class.getName());

    AbseilToFloggerLogSink() {
    }

    public static String a(abnu abnuVar) {
        if ((abnuVar.b & 1) == 0) {
            return "Native";
        }
        int iLastIndexOf = abnuVar.c.lastIndexOf(47);
        String strSubstring = abnuVar.c;
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(iLastIndexOf + 1);
        }
        return "Native/".concat(String.valueOf(strSubstring));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        if (r9 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void sendLogEventToFlogger(int r8, int r9, java.nio.ByteBuffer r10, java.nio.ByteBuffer r11, boolean r12) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.flogger.AbseilToFloggerLogSink.sendLogEventToFlogger(int, int, java.nio.ByteBuffer, java.nio.ByteBuffer, boolean):void");
    }
}
