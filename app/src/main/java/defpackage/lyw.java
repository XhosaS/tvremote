package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyw extends lyx {
    public final byte[] a;

    public lyw(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null displayContextParams");
        }
        this.a = bArr;
    }

    @Override // defpackage.lyx
    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyx)) {
            return false;
        }
        lyx lyxVar = (lyx) obj;
        return Arrays.equals(this.a, lyxVar instanceof lyw ? ((lyw) lyxVar).a : lyxVar.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }

    public final String toString() {
        return "ConversationUiParams{displayContextParams=" + Arrays.toString(this.a) + "}";
    }
}
