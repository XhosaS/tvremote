package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sze {
    public static final szc a = new szc();
    public final boolean b;
    public final eue c;

    public sze(eue eueVar, boolean z) {
        eueVar.getClass();
        this.c = eueVar;
        this.b = z;
    }

    public static final String a(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '@') {
                sb.append(cCharAt);
            }
        }
        return "@".concat(sb.toString());
    }
}
