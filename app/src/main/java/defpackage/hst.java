package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hst {
    public static final hst a = new hst();
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/suggestion/ParseShowSuggestionsArgs");

    private hst() {
    }

    public final xqo a(byte[] bArr) {
        byte bByteValue;
        try {
            abxd abxdVarH = abxd.h(xqo.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    abxdVarH.cM(2, true != zL ? null : abxdVarH);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            return (xqo) abxdVarH;
        } catch (abxv e) {
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/results/suggestion/ParseShowSuggestionsArgs", "getShowSuggestionsArgsFromClientOpArgs", 16, "ParseShowSuggestionsArgs.kt")).u("Invalid ShowSuggestionsArgs. Cannot parse.");
            return null;
        }
    }
}
