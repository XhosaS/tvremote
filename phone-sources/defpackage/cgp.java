package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgp {
    public final boolean a = false;
    public final int b = 0;

    public cgp() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgp)) {
            return false;
        }
        cgp cgpVar = (cgp) obj;
        boolean z = cgpVar.a;
        int i = cgpVar.b;
        return a.r(0, 0);
    }

    public final int hashCode() {
        return a.q(false) * 31;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=false, emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public cgp(byte[] bArr) {
    }
}
